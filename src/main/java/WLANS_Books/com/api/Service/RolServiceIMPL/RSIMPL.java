package WLANS_Books.com.api.Service.RolServiceIMPL;

import WLANS_Books.com.api.Entity.Rol;
import WLANS_Books.com.api.Respository.RolRepo;
import WLANS_Books.com.api.Service.RolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RSIMPL implements RolService {

    @Autowired
    private RolRepo repo;

    @Override
    public List<Rol> ConsultarRol() {
        return (List<Rol>) this.repo.findAll();
    }

    @Override
    public Rol CrearRol(Rol rol) {
        rol.setNombre_rol(rol.getNombre_rol());
        return this.repo.save(rol);
    }
    @Override
    public Rol ModificarRol(Rol rol) {
        return this.repo.save(rol);
    }

    @Override
    public Rol BuscarRol(int id) {

        return this.repo.findById(id).get();
    }

    @Override
    public void EliminarRol(int id) {
        this.repo.deleteById(id);
    }



}
