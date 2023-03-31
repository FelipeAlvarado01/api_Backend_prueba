package WLANS_Books.com.api.Service;

import WLANS_Books.com.api.Entity.Rol;


import java.util.List;

public interface RolService {

    public List<Rol> ConsultarRol();

    public Rol CrearRol(Rol rol);

    public Rol ModificarRol(Rol rol);

    public Rol BuscarRol(int id);

    public void EliminarRol(int id);
}
