package praticaSpring.praticaSpring.Objeto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
public class Carro {
    private String nome;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
}
