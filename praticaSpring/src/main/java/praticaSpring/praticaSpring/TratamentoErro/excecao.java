package praticaSpring.praticaSpring.TratamentoErro;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class excecao extends RuntimeException{
    public excecao(String message) {
        super(message);
    }
}
