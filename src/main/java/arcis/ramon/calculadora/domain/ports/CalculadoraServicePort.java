package arcis.ramon.calculadora.domain.ports;

import arcis.ramon.calculadora.domain.dto.CalculadoraDto;

public interface CalculadoraServicePort {

  CalculadoraDto sum(int num1, int num2);

  CalculadoraDto subtract(int num1, int num2);
}
