package WLANS_Books.com.api.Service;

import WLANS_Books.com.api.Entity.Categoria;
import WLANS_Books.com.api.Entity.Compras;


import java.util.List;

public interface CategoriaService {


    public List<Categoria> ConsultarCategoria();

    public Categoria CrearCategoria(Categoria categoria);

    public Categoria ModificarCategoria(Categoria categoria);

    public Categoria BuscarCategoria(int id);

     void EliminarCategoria(int id);


    List<Compras> ConsultarCompras();

    Compras CrearCompras(Compras compras);

    Categoria ModificarCompras(Compras compras);

    Compras BuscarCompras(int id);

    void EliminarCompras(int id);
}
