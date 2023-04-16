package WLANS_Books.com.api.Entity;


import jakarta.persistence.*;

@Entity
@Table(name = "detalle_compra")

public class DetalleCompras {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "cantidad")
    private int cantidad;

    @Column(name = "compras_id")
    private int compras_id;

    @Column(name = "libros_id")
    private int libros_id;

    public int getLibros_id() {
        return libros_id;
    }

    public void setLibros_id(int libros_id) {
        this.libros_id = libros_id;
    }

    @Column(name = "precio_unitario")
    private int precio_unitario;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getCompras_id() {
        return compras_id;
    }

    public void setCompras_id(int compras_id) {
        this.compras_id = compras_id;
    }

    public int getPrecio_unitario() {
        return precio_unitario;
    }

    public  void setPrecio_unitario(int precio_unitario) {
        this.precio_unitario = precio_unitario;

        }
    }

