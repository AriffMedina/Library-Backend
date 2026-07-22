package mx.edu.tecdesoftware.library_backend.persistence.mapper;

import mx.edu.tecdesoftware.library_backend.domain.Client;
import mx.edu.tecdesoftware.library_backend.persistence.entity.Cliente;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ClientMapper {

    @Mappings({
            @Mapping(source = "nombre", target = "name"),
            @Mapping(source = "correo", target = "email")
    })
    Client toClient(Cliente cliente);

    List<Client> toClients(List<Cliente> clientes);

    @InheritInverseConfiguration
    @Mapping(target = "prestamos", ignore = true)
    Cliente toCliente(Client client);
}