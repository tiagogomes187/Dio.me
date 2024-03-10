package br.dev.tiagogomes.dio.web.api.model;

import java.util.Objects;

public class User {

	private Integer id;
	private String login;
	private String password;

	public User() {
	}

	public User(String login, String password) {
		this.login = login;
		this.password = password;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof User user)) return false;
		return Objects.equals(getId(), user.getId()) && Objects.equals(getLogin(), user.getLogin()) && Objects.equals(getPassword(), user.getPassword());
	}

	@Override
	public int hashCode() {
		return Objects.hash(getId(), getLogin(), getPassword());
	}

	@Override
	public String toString() {
		return "User{" +
				"login='" + login + '\'' +
				", password='" + password + '\'' +
				'}';
	}
}
