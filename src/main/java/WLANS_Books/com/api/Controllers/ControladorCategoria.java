package WLANS_Books.com.api.Controllers;

import WLANS_Books.com.api.Entity.Categoria;
import WLANS_Books.com.api.Service.CategoriaServiceIMPL.CSIMPL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@RestController
@CrossOrigin(origins = "*",allowedHeaders = "*")
@RequestMapping("api")

public class    ControladorCategoria
{
    @Autowired
    private CSIMPL csimpl;

    @GetMapping
    @RequestMapping(value = "/categorias",method = RequestMethod.GET)
    public ResponseEntity<?>ConsultarCategoria(){
        List<Categoria>listCategoria=this.csimpl.ConsultarCategoria();
        return ResponseEntity.ok(listCategoria);

    }

    @PostMapping
    @RequestMapping(value = "/categorias",method = RequestMethod.POST)
    public ResponseEntity<?>CrearCategoria(@RequestBody Categoria categoria){
       Categoria CategoriaCreada=this.csimpl.CrearCategoria(categoria);
        return ResponseEntity.status(HttpStatus.CREATED).body(CategoriaCreada);

    }


    //Se crea controlador metodo PUT para modificar Categoria
    @PutMapping
    @RequestMapping(value = "/categorias",method = RequestMethod.PUT)
    public ResponseEntity<?>ModificarCategoria(@RequestBody Categoria categoria){
        Categoria CategoriaModificado=this.csimpl.ModificarCategoria(categoria);
        return ResponseEntity.status(HttpStatus.CREATED).body(CategoriaModificado);
    }

    // Se crea controlador para Buscar por id categoria
    @GetMapping
    @RequestMapping(value = "/categorias/{id}",method = RequestMethod.GET)

        public ResponseEntity<?>BuscarCategoria(@PathVariable int id){
        Categoria Categoria=this.csimpl.BuscarCategoria(id);
        return ResponseEntity.ok(Categoria);

    }
    // Se crea controlador para Eliminar por id categoria
    @DeleteMapping
    @RequestMapping(value = "/categorias/{id}",method = RequestMethod.DELETE)
    public ResponseEntity<?>EliminarCategoria(@PathVariable int id)

    {
        Map<String, Object> response= new HashMap<>();
        try {
            this.csimpl.EliminarCategoria(id);
            response.put("Mensaje","Se elimino Categoria con id".concat(String.valueOf(id)).concat("Con exito"));

        }catch (DataAccessException e){
            response.put("Mensaje","Ocurrio un error al eliminar Categoria con id".concat(String.valueOf(id)));
            response.put("Error",e.getMostSpecificCause().getMessage());
            return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        };
        return new ResponseEntity<Map<String, Object>>(response, HttpStatus.OK);
    }


}
