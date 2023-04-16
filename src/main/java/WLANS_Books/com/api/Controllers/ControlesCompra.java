package WLANS_Books.com.api.Controllers;


import WLANS_Books.com.api.Entity.Compras;
import WLANS_Books.com.api.Service.ComprasServiceIMPL.COIMPL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api")

public class ControlesCompra {

    @Autowired
    private COIMPL coimpl;

    @GetMapping
    @RequestMapping(value = "/compras",method = RequestMethod.GET)
    public ResponseEntity<?> ConsultarCompras(){
        List<Compras> listCompras=this.coimpl.ConsultarCompras();
        return ResponseEntity.ok(listCompras);
    }

    @PostMapping
    @RequestMapping(value = "/compras",method = RequestMethod.POST)
    public ResponseEntity<?>CrearCompras(@RequestBody Compras compras){
        Compras ComprasCreado=this.coimpl.CrearCompras(compras);
        return ResponseEntity.status(HttpStatus.CREATED).body(ComprasCreado);
    }
    @PutMapping
    @RequestMapping(value = "/compras",method = RequestMethod.PUT)
    public ResponseEntity<?>ModificarCompras(@RequestBody Compras compras){
        Compras ComprasModificado=this.coimpl.ModificarCompras(compras);
        return ResponseEntity.status(HttpStatus.CREATED).body(ComprasModificado);
    }

    @GetMapping
    @RequestMapping(value = "/compras/{id}",method = RequestMethod.GET)

    public ResponseEntity<?>BuscarCompras(@PathVariable int id){
        Compras Compras=this.coimpl.BuscarCompras(id);
        return ResponseEntity.ok(Compras);

    }

    /*@DeleteMapping
    @RequestMapping(value = "compras/{id}",method = RequestMethod.DELETE)
    public ResponseEntity<?>EliminarCompras(@PathVariable int id){
        this.coimpl.EliminarCompras(id);
        return ResponseEntity.ok().build();
    }*/


}
