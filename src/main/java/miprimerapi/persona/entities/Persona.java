package miprimerapi.persona.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "persona")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Persona extends Base {
    private String nombre;
    private String apellido;
    private Integer dni;
}
