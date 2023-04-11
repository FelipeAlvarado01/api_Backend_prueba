package WLANS_Books.com.api.Service;

import WLANS_Books.com.api.Entity.Compras;

import java.util.List;

public interface CompraService {


    public List<Compras> ConsultarCompras();

    public Compras CrearCompras(Compras compras);

    public Compras ModificarCompras(Compras compras);

    public Compras BuscarCompras(int id);

    public void EliminarCompras(int id);


}
