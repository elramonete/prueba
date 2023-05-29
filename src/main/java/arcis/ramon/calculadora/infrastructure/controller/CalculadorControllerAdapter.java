package arcis.ramon.calculadora.infrastructure.controller;

import arcis.ramon.calculadora.domain.dto.CalculadoraDto;
import arcis.ramon.calculadora.domain.ports.CalculadoraServicePort;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;



@AllArgsConstructor
@RestController
public class CalculadorControllerAdapter implements CalculadorApi {

  private CalculadoraServicePort port;

  @Override
  public ResponseEntity<CalculadoraDto> sum(int num1, int num2) {
    CalculadoraDto calculadoraDto = port.sum(num1, num2);
    return ResponseEntity.ok(calculadoraDto);
  }

  @Override
  public ResponseEntity<CalculadoraDto> subtract(int num1, int num2) {
    CalculadoraDto calculadoraDto = port.subtract(num1, num2);
    return ResponseEntity.ok(calculadoraDto);
  }


}
