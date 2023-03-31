package WLANS_Books.com.api.Controller;


import WLANS_Books.com.api.Service.RolServiceIMPL.RSIMPL;
import WLANS_Books.com.api.Entity.Rol;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api")

public class ControladorRol {

 @Autowired
   private RSIMPL rsimpl;

     @GetMapping
    @RequestMapping(value = "ConsultarRol",method = RequestMethod.GET)
    public ResponseEntity<?> ConsultarRol(){
        List<Rol> listRol=this.rsimpl.ConsultarRol();
        return ResponseEntity.ok(listRol);
    }
    @PostMapping
    @RequestMapping(value = "CrearRol",method = RequestMethod.POST)
    public ResponseEntity<?>CrearRol(@RequestBody Rol rol){
       Rol RolCreado=this.rsimpl.CrearRol(rol);
        return ResponseEntity.status(HttpStatus.CREATED).body(RolCreado);
   }

   @PutMapping
   @RequestMapping(value = "ModificarRol",method = RequestMethod.PUT)
    public ResponseEntity<?>ModificarRol(@RequestBody Rol rol){
        Rol RolModificado=this.rsimpl.ModificarRol(rol);
        return ResponseEntity.status(HttpStatus.CREATED).body(RolModificado);
}

   @GetMapping
    @RequestMapping(value = "BuscarRol/{id}",method = RequestMethod.GET)

   public ResponseEntity<?>BuscarRol(@PathVariable int id){
      Rol Rol=this.rsimpl.BuscarRol(id);
        return ResponseEntity.ok(Rol);

    }

    @DeleteMapping
    @RequestMapping(value = "EliminarRol/{id}",method = RequestMethod.DELETE)
    public ResponseEntity<?>EliminarRol(@PathVariable int id){
        this.rsimpl.EliminarRol(id);
        return ResponseEntity.ok().build();
    }

}