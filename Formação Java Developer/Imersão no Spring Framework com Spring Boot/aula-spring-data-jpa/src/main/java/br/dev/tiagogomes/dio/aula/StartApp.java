package br.dev.tiagogomes.dio.aula;

import br.dev.tiagogomes.dio.aula.model.User;
import br.dev.tiagogomes.dio.aula.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StartApp implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {

		List<User> users = userRepository.filtrarPorNome("Cíntia");

		for (User u : users) {
			System.out.println(u);
		}


//		User user = new User();
//		user.setName("Tiago");
//		user.setUsername("Gomes");
//		user.setPassword("dio123");
//
//		userRepository.save(user);

//		for (User u : userRepository.findAll()) {
//			System.out.println("\n\nUSUAŔIOS\n" + u);
//			System.out.println();
//		}
	}
}
