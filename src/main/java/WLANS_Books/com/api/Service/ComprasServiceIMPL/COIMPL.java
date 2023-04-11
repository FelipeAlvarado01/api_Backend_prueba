package WLANS_Books.com.api.Service.ComprasServiceIMPL;

import WLANS_Books.com.api.Entity.Compras;
import WLANS_Books.com.api.Respository.CompraRepo;
import WLANS_Books.com.api.Service.CompraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class COIMPL implements CompraService {
    @Autowired
    private CompraRepo repo;

    @Override
    public List<Compras> ConsultarCompras() {
        return (List<Compras>)
                this.repo.findAll();
    }

    @Override
    public Compras CrearCompras(Compras compras) {
        compras.setUsuario_id(compras.getUsuario_id());
        return this.repo.save(compras);
    }

    @Override
    public Compras ModificarCompras(Compras compras) {
        return this.repo.save(compras);
    }

    @Override
    public Compras BuscarCompras(int id) {

        return this.repo.findById(id).get();
    }

    @Override
    public void EliminarCompras(int id) {
        this.repo.deleteById(id);

    }



}
