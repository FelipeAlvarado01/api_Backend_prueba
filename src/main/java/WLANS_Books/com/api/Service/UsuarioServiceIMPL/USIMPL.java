package WLANS_Books.com.api.Service.UsuarioServiceIMPL;

import WLANS_Books.com.api.Entity.Libro;
import WLANS_Books.com.api.Entity.Rol;
import WLANS_Books.com.api.Entity.Usuario;
import WLANS_Books.com.api.Respository.RolRepo;
import WLANS_Books.com.api.Respository.UsuarioRepo;
import WLANS_Books.com.api.Service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class USIMPL implements UsuarioService {


    @Autowired
    private UsuarioRepo repo;

    @Override
    public List<Usuario> ConsultarUsuario() {

        return (List<Usuario>) this.repo.findAll();
    }

    @Override
    public Usuario CrearUsuario(Usuario usuario) {
       usuario.setCorreo(usuario.getCorreo());
        return this.repo.save(usuario);
    }
    @Override
    public Usuario ModificarUsuario(Usuario usuario) {
        return this.repo.save(usuario);
    }

    @Override
    public Usuario BuscarUsuario(int id) {

        return this.repo.findById(id).get();
    }

    @Override
    public void EliminarUsuario(int id) {
        this.repo.deleteById(id);
    }

    @Override
    public Usuario  filtrarCorreo(String correo) {

        return repo.filtraCorreo( correo);
    }

    public Usuario  filtrarTelefono(String telefono) {

        return repo.filtraT(telefono);
    }

}