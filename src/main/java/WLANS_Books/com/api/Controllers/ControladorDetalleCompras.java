package WLANS_Books.com.api.Controllers;

import WLANS_Books.com.api.Entity.DetalleCompras;
import WLANS_Books.com.api.Service.DetalleComprasIMPL.DCIMPL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api")
public class ControladorDetalleCompras {

    @Autowired
    private DCIMPL dcimpl;


    @GetMapping
    @RequestMapping(value = "/detalleCompras",method = RequestMethod.GET)
    public ResponseEntity<?> ConsultarDetalleCompras(){
        List<DetalleCompras> listDetalleCompras=this.dcimpl.ConsultarDetalleCompras();
        return ResponseEntity.ok(listDetalleCompras);
    }

    @PostMapping
    @RequestMapping(value = "/detalleCompras",method = RequestMethod.POST)
    public ResponseEntity<?> CrearDetalleCompras(@RequestBody  DetalleCompras detalleCompras){
        DetalleCompras DetalleComprasCreado=this.dcimpl.CrearDetalleCompras(detalleCompras);
        return ResponseEntity.status(HttpStatus.CREATED).body(detalleCompras);
    }

    @PutMapping
    @RequestMapping(value = "/detalleCompras",method = RequestMethod.PUT)
    public ResponseEntity<?>ModificarDetalleCompras(@RequestBody DetalleCompras detalleCompras){
        DetalleCompras DetalleComprasModificado=this.dcimpl.ModificarDetalleCompras(detalleCompras);
        return ResponseEntity.status(HttpStatus.CREATED).body(detalleCompras);
    }

    @GetMapping
    @RequestMapping(value = "/detalleCompras/{id}",method = RequestMethod.GET)

    public ResponseEntity<?>BuscarCompras(@PathVariable int id){
        DetalleCompras DetalleCompras=this.dcimpl.BuscarDetalleCompras(id);
        return ResponseEntity.ok(DetalleCompras);

    }

    @DeleteMapping
    @RequestMapping(value = "compras/{id}",method = RequestMethod.DELETE)
    public ResponseEntity<?>EliminarCompras(@PathVariable int id){
        this.dcimpl.EliminarDetalleCompras(id);
        return ResponseEntity.ok().build();
    }


}
