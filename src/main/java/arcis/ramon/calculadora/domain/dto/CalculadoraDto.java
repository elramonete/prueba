package arcis.ramon.calculadora.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CalculadoraDto {

        private int num1;
        private int num2;
        private int resultado;
}
