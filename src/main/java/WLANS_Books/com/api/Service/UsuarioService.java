package WLANS_Books.com.api.Service;

import WLANS_Books.com.api.Entity.Libro;
import WLANS_Books.com.api.Entity.Usuario;

import java.util.List;

public interface UsuarioService {


    public List<Usuario> ConsultarUsuario();

    public Usuario CrearUsuario(Usuario usuario);

    public Usuario ModificarUsuario(Usuario usuario);

    public Usuario BuscarUsuario(int id);

    public void EliminarUsuario (int id);

    Usuario  filtrarCorreo(String correo);

    Usuario  filtrarTelefono(int telefono);

}
