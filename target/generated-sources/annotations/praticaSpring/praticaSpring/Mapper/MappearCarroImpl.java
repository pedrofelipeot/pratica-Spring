package praticaSpring.praticaSpring.Mapper;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import praticaSpring.praticaSpring.DTO.PostDTO;
import praticaSpring.praticaSpring.DTO.PutDTO;
import praticaSpring.praticaSpring.Objeto.Carro;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-04-25T15:56:00-0300",
    comments = "version: 1.6.3, compiler: javac, environment: Java 21.0.6 (Eclipse Adoptium)"
)
@Component
public class MappearCarroImpl extends MappearCarro {

    @Override
    public Carro toCarro(PostDTO postDTO) {
        if ( postDTO == null ) {
            return null;
        }

        Carro.CarroBuilder carro = Carro.builder();

        carro.nome( postDTO.getNome() );

        return carro.build();
    }

    @Override
    public Carro toCarro(PutDTO putDTO) {
        if ( putDTO == null ) {
            return null;
        }

        Carro.CarroBuilder carro = Carro.builder();

        carro.nome( putDTO.getNome() );
        carro.id( putDTO.getId() );

        return carro.build();
    }
}
