package WLANS_Books.com.api.Service;

import WLANS_Books.com.api.Entity.Categoria;


import java.util.List;

public interface CategoriaService {


    public List<Categoria> ConsultarCategoria();

    public Categoria CrearCategoria(Categoria categoria);

    public Categoria ModificarCategoria(Categoria categoria);

    public Categoria BuscarCategoria(int id);

    public void EliminarCategoria(int id);

}
