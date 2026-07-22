package mx.edu.tecdesoftware.library_backend.persistence.mapper;

import mx.edu.tecdesoftware.library_backend.domain.Book;
import mx.edu.tecdesoftware.library_backend.persistence.entity.Libro;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {LoanMapper.class})
public interface BookMapper {

    @Mappings({
            @Mapping(source = "titulo", target = "title"),
            @Mapping(source = "autor", target = "author"),
            @Mapping(source = "prestamos", target = "loans")
    })
    Book toBook(Libro libro);

    List<Book> toBooks(List<Libro> libros);

    @InheritInverseConfiguration
    Libro toLibro(Book book);
}