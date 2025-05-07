package praticaSpring.praticaSpring.TratamentoErro;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class excecaoDetalhes {

    private LocalDateTime timestamp;
    private int status;
    private String title;
    private String message;
    private String path;
    private String developerMessage;
}
