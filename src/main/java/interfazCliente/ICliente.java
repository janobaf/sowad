package interfazCliente;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Cliente;

@Repository
public interface ICliente extends CrudRepository<Cliente , String>{
      
}
