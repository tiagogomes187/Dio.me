package br.dev.tiagogomes.dio.domain.repository;

import br.dev.tiagogomes.dio.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
