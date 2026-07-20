package mx.edu.tecdesoftware.library_backend.persistence.crud;

import mx.edu.tecdesoftware.library_backend.persistence.entity.Prestamo;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PrestamoCrudRepository extends CrudRepository<Prestamo, Integer> {
    // Query Method automático: SELECT * FROM prestamos WHERE cliente_id = ?
    List<Prestamo> findByClienteId(Integer clienteId);
}
