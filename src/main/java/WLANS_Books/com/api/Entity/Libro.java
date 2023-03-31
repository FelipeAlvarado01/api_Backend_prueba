package WLANS_Books.com.api.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "libros")

public class Libro{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id ;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "autor")
    private String autor;
    @Column(name = "editorial")
    private String editorial;
    @Column(name = "ano_de_publicacion")
    private int ano_de_publicacion;
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "pagina")
    private int pagina;
    @Column(name = "foto")
    private String foto;
    @Column(name = "categoria_id")
    private int categoria_id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }


    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getAno_de_publicacion() {
        return ano_de_publicacion;
    }

    public void setAno_de_publicacion(int ano_de_publicacion) {
        this.ano_de_publicacion = ano_de_publicacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPagina() {
        return pagina;
    }

    public void setPagina(int pagina) {
        this.pagina = pagina;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public int getCategoria_id() {
        return categoria_id;
    }

    public void setCategoria_id(int categoria_id) {
        this.categoria_id = categoria_id;
    }
}
