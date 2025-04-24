package praticaSpring.praticaSpring.Controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import praticaSpring.praticaSpring.DTO.PostDTO;
import praticaSpring.praticaSpring.DTO.PutDTO;
import praticaSpring.praticaSpring.Objeto.Carro;
import praticaSpring.praticaSpring.Service.Servico;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("carros")
public class Controller {

    private final Servico carroService;

    @GetMapping
    public ResponseEntity <List<Carro>> list(){
        return ResponseEntity.ok(carroService.ListarTudo());
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Carro> CarroId(@PathVariable int id){
        return ResponseEntity.ok(carroService.BuscarPorId(id));
    }
    @PostMapping
    public ResponseEntity<Carro> addCarro(@RequestBody PostDTO postDTO){
        return ResponseEntity.status(HttpStatus.CREATED).body(carroService.addCarro(postDTO));
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Void> deletar(@PathVariable int id){
        carroService.delete(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    @PutMapping
    public ResponseEntity<Carro> atualizar(@RequestBody PutDTO putDTO){
        return ResponseEntity.status(HttpStatus.OK).body(carroService.Update(putDTO));
    }

}
