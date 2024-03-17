package br.dev.tiagogomes.dio.gof.repositories;

import br.dev.tiagogomes.dio.gof.model.Endereco;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends CrudRepository<Endereco, String> {

}