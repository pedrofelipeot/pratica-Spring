package praticaSpring.praticaSpring.Service;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import praticaSpring.praticaSpring.DTO.PostDTO;
import praticaSpring.praticaSpring.DTO.PutDTO;
import praticaSpring.praticaSpring.Mapper.MappearCarro;
import praticaSpring.praticaSpring.Objeto.Carro;
import praticaSpring.praticaSpring.repository.CarroRepository;

import java.util.List;

@RequiredArgsConstructor
@Service
public class Servico {
    private final MappearCarro mappearCarro;
    private final CarroRepository carroRepository;

    public List<Carro> ListarTudo() {
        return carroRepository.findAll();
    }

    public List<Carro> ListarNomes(String nome) {
        return carroRepository.findByNome(nome);
    }

    public Carro BuscarPorId(int id) {
        return carroRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.BAD_REQUEST, "Carro não encontrado"));
    }

    public Carro addCarro(PostDTO postDTO) {
        Carro carro = mappearCarro.toCarro(postDTO);
        return carroRepository.save(carro);
    }

    public void delete(int id) {
        carroRepository.delete(BuscarPorId(id));
    }

    public Carro Update(PutDTO putDTO) {
        Carro carro = mappearCarro.toCarro(putDTO);
        return carroRepository.save(carro);
    }

}


