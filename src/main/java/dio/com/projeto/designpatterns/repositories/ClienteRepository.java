package dio.com.projeto.designpatterns.repositories;

import dio.com.projeto.designpatterns.entities.Cliente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long> {

}