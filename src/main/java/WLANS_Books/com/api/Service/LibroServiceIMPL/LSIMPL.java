package WLANS_Books.com.api.Service.LibroServiceIMPL;

import WLANS_Books.com.api.Entity.Libro;
import WLANS_Books.com.api.Respository.LibroRepo;
import WLANS_Books.com.api.Service.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public  class LSIMPL implements LibroService {

    @Autowired
    private LibroRepo repo;


    @Override
    public List<Libro> ConsultarLibro() {
        return (List<Libro>) this.repo.findAll();
    }

    @Override
    public Libro CrearLibro(Libro libro) {
        libro.setNombre(libro.getNombre());
        return this.repo.save(libro);
    }

    @Override
    public Libro ModificarLibro(Libro libro) {

        return this.repo.save(libro);
    }


    @Override
    public Libro BuscarLibro(int id) {
        return this.repo.findById(id).get();
    }

    @Override
    public void EliminarLibro(int id) {
        this.repo.deleteById(id);
    }


    @Override
    public Object filtrarCategoria(int idCategoria) {

        return repo.filtraCategoria( idCategoria);
    }
}
