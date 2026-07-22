package mx.edu.tecdesoftware.library_backend.persistence.mapper;

import mx.edu.tecdesoftware.library_backend.domain.Loan;
import mx.edu.tecdesoftware.library_backend.persistence.entity.Prestamo;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface LoanMapper {

    @Mappings({
            @Mapping(source = "fechaPrestamo", target = "loanDate"),
            @Mapping(source = "fechaDevolucion", target = "returnDate"),
            @Mapping(source = "libro.id", target = "bookId"),
            @Mapping(source = "cliente.id", target = "clientId")
    })
    Loan toLoan(Prestamo prestamo);

    List<Loan> toLoans(List<Prestamo> prestamos);

    @Mappings({
            @Mapping(source = "loanDate", target = "fechaPrestamo"),
            @Mapping(source = "returnDate", target = "fechaDevolucion"),
            @Mapping(target = "libro", ignore = true),
            @Mapping(target = "cliente", ignore = true)
    })
    Prestamo toPrestamo(Loan loan);

    List<Prestamo> toPrestamos(List<Loan> loans);
}