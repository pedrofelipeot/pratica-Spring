package praticaSpring.praticaSpring.Mapper;

import org.mapstruct.Mapper;
import praticaSpring.praticaSpring.DTO.PostDTO;
import praticaSpring.praticaSpring.DTO.PutDTO;
import praticaSpring.praticaSpring.Objeto.Carro;

@Mapper(componentModel = "Spring")
public abstract class MappearCarro {

    public abstract Carro toCarro(PostDTO postDTO);

    public abstract Carro toCarro(PutDTO putDTO);
}
