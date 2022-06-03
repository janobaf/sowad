package interfazCliente;

import java.util.List;
import java.util.Optional;

import com.example.demo.Cliente;

public interface IClienteService {
    public List<Cliente> ListarCliente();
    public Optional<Cliente> ListarDNI(String dni);
    public void GuardarCliente(Cliente c);
    public void EliminarCliente(String dni);
    public void ModificarCliente(Cliente c,String dni);
    
    
}
