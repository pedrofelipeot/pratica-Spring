package praticaSpring.praticaSpring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import praticaSpring.praticaSpring.Objeto.Carro;



public interface CarroRepository extends JpaRepository<Carro , Integer> {
}
