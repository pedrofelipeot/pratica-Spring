package praticaSpring.praticaSpring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import praticaSpring.praticaSpring.Objeto.Carro;

import java.util.List;


public interface CarroRepository extends JpaRepository<Carro, Integer> {
    List<Carro> findByNome(String nome);
}
