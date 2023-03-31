package WLANS_Books.com.api.Respository;

import WLANS_Books.com.api.Entity.Libro;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LibroRepo extends CrudRepository<Libro, Integer> {
    @Query(value = "SELECT * FROM libros l WHERE l.categoria_id=:categoria_id", nativeQuery = true )
           // "Select u from libros u where u.categoria_id=:idCategoria")
    List<Object> filtraCategoria(@Param("categoria_id") int idCategoria);

}
