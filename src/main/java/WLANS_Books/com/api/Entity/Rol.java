package WLANS_Books.com.api.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "rol")

public class Rol {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id ;
    @Column(name = "nombre_rol")
    private String nombre_rol;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre_rol() {
        return nombre_rol;
    }

    public void setNombre_rol(String nombre_rol) {
        this.nombre_rol= nombre_rol;
    }
}
