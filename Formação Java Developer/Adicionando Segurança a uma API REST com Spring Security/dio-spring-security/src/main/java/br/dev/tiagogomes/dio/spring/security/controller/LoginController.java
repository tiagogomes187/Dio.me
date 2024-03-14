package br.dev.tiagogomes.dio.spring.security.controller;

import br.dev.tiagogomes.dio.spring.security.dtos.LoginDTO;
import br.dev.tiagogomes.dio.spring.security.dtos.SessaoDTO;
import br.dev.tiagogomes.dio.spring.security.model.User;
import br.dev.tiagogomes.dio.spring.security.repositories.UserRepository;
import br.dev.tiagogomes.dio.spring.security.security.JWTCreator;
import br.dev.tiagogomes.dio.spring.security.security.JWTObject;
import br.dev.tiagogomes.dio.spring.security.security.SecurityConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class LoginController {
	@Autowired
	private PasswordEncoder encoder;
	@Autowired
	private SecurityConfig securityConfig;
	@Autowired
	private UserRepository repository;

	@PostMapping("/login")
	public SessaoDTO logar(@RequestBody LoginDTO login) {
		User user = repository.findByUsername(login.getUsername());
		if (user != null) {
			boolean passwordOk = encoder.matches(login.getPassword(), user.getPassword());
			if (!passwordOk) {
				throw new RuntimeException("Senha inválida para o login: " + login.getUsername());
			}
			//Estamos enviando um objeto Sessão para retornar mais informações do usuário
			SessaoDTO sessao = new SessaoDTO();
			sessao.setLogin(user.getUsername());

			JWTObject jwtObject = new JWTObject();
			jwtObject.setIssuedAt(new Date(System.currentTimeMillis()));
			jwtObject.setExpiration((new Date(System.currentTimeMillis() + SecurityConfig.EXPIRATION)));
			jwtObject.setRoles(user.getRoles());
			sessao.setToken(JWTCreator.create(SecurityConfig.PREFIX, SecurityConfig.KEY, jwtObject));
			return sessao;
		} else {
			throw new RuntimeException("Erro ao tentar fazer login");
		}
	}
}