package dio.com.projeto.designpatterns.repositories;

import dio.com.projeto.designpatterns.entities.Endereco;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends CrudRepository<Endereco, String> {

}