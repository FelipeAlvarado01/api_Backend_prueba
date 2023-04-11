package WLANS_Books.com.api.Service.DetalleComprasIMPL;

import WLANS_Books.com.api.Entity.Compras;
import WLANS_Books.com.api.Entity.DetalleCompras;
import WLANS_Books.com.api.Respository.CompraRepo;
import WLANS_Books.com.api.Respository.DetalleComprasRepo;
import WLANS_Books.com.api.Service.DetalleComprasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DCIMPL implements DetalleComprasService {

    @Autowired
    private DetalleComprasRepo repo;

    @Override
    public List<DetalleCompras> ConsultarDetalleCompras() {

        return (List<DetalleCompras>) this.repo.findAll();
    }

    @Override
    public DetalleCompras CrearDetalleCompras(DetalleCompras detalleCompras) {
        detalleCompras.setPrecio_unitario(detalleCompras.getPrecio_unitario());
        return this.repo.save(detalleCompras);
    }

    @Override
    public DetalleCompras ModificarDetalleCompras(DetalleCompras detalleCompras) {

        return this.repo.save(detalleCompras);
    }

    @Override
    public DetalleCompras BuscarDetalleCompras(int id) {

        return this.repo.findById(id).get();
    }

    @Override
    public void EliminarDetalleCompras(int id) {
        this.repo.deleteById(id);

    }
}
