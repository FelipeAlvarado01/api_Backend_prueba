package WLANS_Books.com.api.Service;

import WLANS_Books.com.api.Entity.DetalleCompras;

import java.util.List;

public interface DetalleComprasService {


    public List<DetalleCompras> ConsultarDetalleCompras();

    public DetalleCompras CrearDetalleCompras(DetalleCompras detalleCompras);

    public DetalleCompras ModificarDetalleCompras(DetalleCompras detalleCompras);

    public DetalleCompras BuscarDetalleCompras(int id);

    public void EliminarDetalleCompras(int id);


}
