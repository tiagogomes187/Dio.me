package br.dev.tiagogomes.dio.web.api.controller;

import br.dev.tiagogomes.dio.web.api.model.User;
import br.dev.tiagogomes.dio.web.api.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserRepository userRepository;

	@GetMapping
	public List<User> getUsers() {
		return userRepository.findAll();
	}

	@GetMapping("/{username}")
	public User getOne(@PathVariable("username") String username) {
		return userRepository.findByUsername(username);
	}

	@DeleteMapping("/{id}")
	public void deleteUser(@PathVariable("id") Integer id) {
		userRepository.deleteById(id);
	}

	@PostMapping()
	public void postUser(@RequestBody User user) {
		userRepository.save(user);
	}

	@PutMapping()
	public void updateUser(@RequestBody User user) {
		userRepository.save(user);
	}


}
