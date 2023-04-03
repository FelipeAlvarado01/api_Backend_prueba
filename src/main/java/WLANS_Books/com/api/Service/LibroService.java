package WLANS_Books.com.api.Service;

import WLANS_Books.com.api.Entity.Libro;
import WLANS_Books.com.api.Respository.LibroRepo;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import java.util.List;

public interface LibroService {

    public List<Libro> ConsultarLibro();

    public Libro CrearLibro(Libro libro);

    public Libro ModificarLibro(Libro libro);

    public Libro BuscarLibro(int id);

    public void EliminarLibro(int id);

    List<Libro>  filtrarCategoria(int idCategoria);



}













