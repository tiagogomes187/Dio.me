package br.dev.tiagogomes.dio.gof.repositories;

import br.dev.tiagogomes.dio.gof.model.Cliente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long> {

}