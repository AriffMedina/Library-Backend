package mx.edu.tecdesoftware.library_backend.persistence.crud;

import mx.edu.tecdesoftware.library_backend.persistence.entity.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface ClienteCrudRepository extends CrudRepository<Cliente, Integer> {
}
