package miprimerapi.persona.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "autor")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Autor extends Base {
    private String nombre;
    private String apellido;

    @Column(length = 1500)
    private String biografia;
}
