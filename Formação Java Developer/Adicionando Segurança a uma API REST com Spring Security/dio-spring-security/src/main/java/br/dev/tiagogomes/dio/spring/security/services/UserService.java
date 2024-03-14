package br.dev.tiagogomes.dio.spring.security.services;


import br.dev.tiagogomes.dio.spring.security.model.User;
import br.dev.tiagogomes.dio.spring.security.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	@Autowired
	private UserRepository repository;
	@Autowired
	private PasswordEncoder encoder;
	public void createUser(User user){
		String pass = user.getPassword();
		//criptografando antes de salvar no banco
		user.setPassword(encoder.encode(pass));
		repository.save(user);
	}
}