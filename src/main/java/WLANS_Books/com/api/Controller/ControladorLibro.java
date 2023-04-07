package WLANS_Books.com.api.Controller;

import WLANS_Books.com.api.Service.LibroServiceIMPL.LSIMPL;
import WLANS_Books.com.api.Entity.Libro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api")

public class ControladorLibro {

    @Autowired
    private LSIMPL Lsimpl;
//Se crea controlador metodo Get que trae todos los libros

    @GetMapping
    @RequestMapping(value = "libros",method = RequestMethod.GET)
    public ResponseEntity<?> ConsultarLibro(){
        List<Libro> listLibro=this.Lsimpl.ConsultarLibro();
        return ResponseEntity.ok(listLibro);
    }

    //Se crea controlador metodo POST que crea nuevo libro

    @PostMapping
    @RequestMapping(value = "/libros",method = RequestMethod.POST)
    public ResponseEntity<?>CrearLibro(@RequestBody Libro libro){
        Libro LibroCreada=this.Lsimpl.CrearLibro(libro);
        return ResponseEntity.status(HttpStatus.CREATED).body(LibroCreada);

    }

    //Se crea controlador metodo PUT para modificar persona
    @PutMapping
    @RequestMapping(value = "/libros",method = RequestMethod.PUT)
    public ResponseEntity<?>ModificarLibro(@RequestBody Libro libro){
        Libro libroModificado=this.Lsimpl.ModificarLibro(libro);
        return ResponseEntity.status(HttpStatus.CREATED).body(libroModificado);

    }

    // Se crea controlador para Buscar por id libro
    @GetMapping
    @RequestMapping(value = "/libros/{id}",method = RequestMethod.GET)
    public ResponseEntity<?>BuscarLibro(@PathVariable int id){
        Libro Libro=this.Lsimpl.BuscarLibro(id);
        return ResponseEntity.ok(Libro);

    }

    @DeleteMapping
    @RequestMapping(value = "/libros/{id}",method = RequestMethod.DELETE)
    public ResponseEntity<?>EliminarLibro(@PathVariable int id){
       this.Lsimpl.EliminarLibro(id);
        return ResponseEntity.ok().build();
    }

    // Se crea controlador para Buscar por id libro


    @GetMapping
    @RequestMapping(value = "filtrarCategoria/{idCategoria}",method = RequestMethod.GET)
    public   ResponseEntity<?> filtrarCategoria(@PathVariable int idCategoria ){
        //adactador lsimpl
        List<Libro>  listLibro = this.Lsimpl.filtrarCategoria(idCategoria);
        return ResponseEntity.ok(listLibro);

    }

}
