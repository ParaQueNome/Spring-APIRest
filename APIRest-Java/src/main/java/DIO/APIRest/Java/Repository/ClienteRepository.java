package DIO.APIRest.Java.Repository;
// Interface que implementa o Repositorio de CRUD do banco de dados
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long> 
{

    
}
