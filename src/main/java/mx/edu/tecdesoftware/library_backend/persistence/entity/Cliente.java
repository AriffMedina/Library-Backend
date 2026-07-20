
package mx.edu.tecdesoftware.library_backend.persistence.entity;

import jakarta.persistence.*;
import mx.edu.tecdesoftware.library_backend.persistence.entity.Prestamo;

import java.util.List;

@Entity
@Table(name = "clientes")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "correo", unique = true)
    private String correo;

    // Relación inversa: Un cliente puede tener muchos préstamos históricos
    @OneToMany(mappedBy = "cliente")
    private List<Prestamo> prestamos;

    public Cliente() {}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public List<Prestamo> getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(List<Prestamo> prestamos) {
        this.prestamos = prestamos;
    }
}