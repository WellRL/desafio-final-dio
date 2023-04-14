package one.digitalinovation.desafiofinaldio.model;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
/**
 * @author WellRL
 */
@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long>{

}
