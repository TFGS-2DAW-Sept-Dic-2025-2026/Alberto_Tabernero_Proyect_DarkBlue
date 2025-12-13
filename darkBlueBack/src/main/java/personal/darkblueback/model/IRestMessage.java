package personal.darkblueback.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class IRestMessage {
    private int codigo;
    private String mensaje;
    private Object datos;

}
