// Pacote
package br.com.projeto.api.controle;

// Importações
import br.com.projeto.api.modelo.Cliente;
import br.com.projeto.api.repositorio.Repositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

// Estrutura da classe
@RestController
@CrossOrigin(origins = "*")
public class Controle {

    @Autowired
    private Repositorio acao;


    // Método responsável pela rota de cadastro
    @PostMapping("/")
    public Cliente cadastrar(@RequestBody Cliente c){
        return acao.save(c);
    }

    // Método responsável pela rota de listagem
    @GetMapping("/")
    public Iterable<Cliente> selecionar(){
        return acao.findAll();
    }

    // Método responsável pela rota de edição
    @PutMapping("/")
    public Cliente editar(@RequestBody Cliente c){
        return acao.save(c);
    }

    // Método responsável pela rota de remoção
    @DeleteMapping("/{codigo}")
    public void remover(@PathVariable long codigo){
        acao.deleteById(codigo);
    }

}