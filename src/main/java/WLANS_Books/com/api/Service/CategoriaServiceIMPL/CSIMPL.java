package WLANS_Books.com.api.Service.CategoriaServiceIMPL;

import WLANS_Books.com.api.Entity.Categoria;
import WLANS_Books.com.api.Respository.CategoriaRepo;
import WLANS_Books.com.api.Service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CSIMPL implements CategoriaService {

    @Autowired
    private CategoriaRepo repo;

    @Override
    public List<Categoria> ConsultarCategoria() {
        return (List<Categoria>) this.repo.findAll();
    }

    @Override
    public Categoria CrearCategoria(Categoria categoria) {
         categoria.setNombre_categoria(categoria.getNombre_categoria());
         return this.repo.save(categoria);
    }

    @Override
    public Categoria ModificarCategoria(Categoria categoria) {

        return this.repo.save(categoria);
    }

    @Override
    public Categoria BuscarCategoria(int id) {

        return this.repo.findById(id).get();
    }

    @Override
    public void EliminarCategoria(int id) {
        this.repo.deleteById(id);

    }


}
