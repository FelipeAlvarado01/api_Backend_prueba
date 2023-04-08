package WLANS_Books.com.api.Controller;

import WLANS_Books.com.api.Entity.Libro;
import WLANS_Books.com.api.Entity.Usuario;
import WLANS_Books.com.api.Service.UsuarioServiceIMPL.USIMPL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api")
public class ControladorUsuario {

    @Autowired
    private USIMPL usimpl;


    @GetMapping
    @RequestMapping(value = "ConsultarUsuario", method = RequestMethod.GET)
    public ResponseEntity<?> ConsultarUsuario() {
        List<Usuario> listUsuario = this.usimpl.ConsultarUsuario();
        return ResponseEntity.ok(listUsuario);

    }

    @PostMapping
    @RequestMapping(value = "CrearUsuario", method = RequestMethod.POST)
    public ResponseEntity<?> CrearUsuario(@RequestBody Usuario usuario) {
        Usuario usuarioCreado = this.usimpl.CrearUsuario(usuario);
        return ResponseEntity.status(HttpStatus.CREATED).body(usuarioCreado);

    }

    @PutMapping
    @RequestMapping(value = "ModificarUsuario", method = RequestMethod.PUT)
    public ResponseEntity<?> ModificarUsuario(@RequestBody Usuario usuario) {
        Usuario UsuarioModificado = this.usimpl.ModificarUsuario(usuario);
        return ResponseEntity.status(HttpStatus.CREATED).body(UsuarioModificado);
    }

    @GetMapping
    @RequestMapping(value = "BuscarUsuario/{id}", method = RequestMethod.GET)

    public ResponseEntity<?> BuscarUsuario(@PathVariable int id) {
        Usuario Usuario = this.usimpl.BuscarUsuario(id);
        return ResponseEntity.ok(Usuario);
    }

    @DeleteMapping
    @RequestMapping(value = "EliminarUsuario/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<?> EliminarUsuario(@PathVariable int id) {
        this.usimpl.EliminarUsuario(id);
        return ResponseEntity.ok().build();
    }


    @GetMapping
    @RequestMapping(value = "filtrarCorreo/{correo}", method = RequestMethod.GET)
    public ResponseEntity<?> filtrarCorreo(@PathVariable String correo) {
        System.out.print(correo);
        Usuario listUsuario = this.usimpl.filtrarCorreo(correo);
        return ResponseEntity.ok(listUsuario);
    }

    @GetMapping
    @RequestMapping(value = "filtrarTelefono/{telefono}",method = RequestMethod.GET)
    public ResponseEntity<?> filtrarTelefono(@PathVariable String telefono ){

        Usuario listUsuario = this.usimpl.filtrarTelefono(telefono);
        return ResponseEntity.ok(listUsuario);
    }
}