package one.digitalinovation.desafiofinaldio.service;
import one.digitalinovation.desafiofinaldio.model.Cliente;
/**
 * @author WellRL
 */


public interface ClienteService {
Iterable<Cliente> buscarTodos();
Cliente buscarPorId(Long id);
void inserir(Cliente cliente);
void atualizar(Long id, Cliente cliente);
void deletar(Long id);
}
