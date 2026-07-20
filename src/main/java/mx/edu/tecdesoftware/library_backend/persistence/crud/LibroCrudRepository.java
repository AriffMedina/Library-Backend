package mx.edu.tecdesoftware.library_backend.persistence.crud;

import mx.edu.tecdesoftware.library_backend.persistence.entity.Libro;
import org.springframework.data.repository.CrudRepository;

public interface LibroCrudRepository extends CrudRepository<Libro, Integer> {
}
