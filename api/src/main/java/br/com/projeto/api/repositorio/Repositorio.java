// Pacote
package br.com.projeto.api.repositorio;

// Importações
import org.springframework.data.repository.CrudRepository;
import br.com.projeto.api.modelo.Cliente;

// Interface
public interface Repositorio extends CrudRepository<Cliente, Long>{}