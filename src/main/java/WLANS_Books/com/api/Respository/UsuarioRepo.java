package WLANS_Books.com.api.Respository;


import WLANS_Books.com.api.Entity.Libro;
import WLANS_Books.com.api.Entity.Usuario;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UsuarioRepo extends CrudRepository<Usuario, Integer> {


    @Query(value = "SELECT * FROM Usuario l WHERE l.correo=:correo", nativeQuery = true )
    Usuario filtraCorreo(@Param("correo") String correo);

    @Query(value = "SELECT * FROM Usuario l WHERE l.telefono=:telefono", nativeQuery = true )
    Usuario filtraT(@Param("telefono") String telefono);



}

