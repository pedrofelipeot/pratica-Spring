package praticaSpring.praticaSpring.Handler;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import praticaSpring.praticaSpring.TratamentoErro.excecao;
import praticaSpring.praticaSpring.TratamentoErro.excecaoDetalhes;

import java.time.LocalDateTime;
@ControllerAdvice
@RequiredArgsConstructor
public class HandlerGlobal {

    @Autowired
    private final HttpServletRequest servletRequest;

    @ExceptionHandler(excecao.class)
    public ResponseEntity<excecaoDetalhes> handler(excecao detalhes){
        return new ResponseEntity<>(excecaoDetalhes.builder()
                .timestamp(LocalDateTime.now())
                .status(HttpStatus.BAD_REQUEST.value())
                .title("Carro não encontrado")
                .message(detalhes.getMessage())
                .path(servletRequest.getRequestURI())
                .developerMessage(detalhes.getClass().getName()).build()
                , HttpStatus.BAD_REQUEST
                );
    }
}
