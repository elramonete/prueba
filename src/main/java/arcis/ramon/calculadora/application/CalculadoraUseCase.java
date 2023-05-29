package arcis.ramon.calculadora.application;

import arcis.ramon.calculadora.domain.dto.CalculadoraDto;
import arcis.ramon.calculadora.domain.ports.CalculadoraServicePort;

import arcis.ramon.calculadora.infrastructure.controller.TracerApiBean;
import io.corp.calculator.TracerAPI;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class CalculadoraUseCase implements CalculadoraServicePort {

  private final TracerApiBean tracerAPIBean;
  @Override
  public CalculadoraDto sum(int num1, int num2) {
    TracerAPI tracerAPI = tracerAPIBean.getTracerAPI();
    tracerAPI.trace("CalculadoraUseCase.sum");
    tracerAPI.trace(CalculadoraDto.builder().num1(num1).num2(num2).resultado(num1+num2).build());
    if(num1 == 0 && num2 == 0) {
      throw new RuntimeException("No se puede sumar 0 + 0");
    } else if(num1 == 0) {
      tracerAPI.trace("CalculadoraUseCase.subtract: num1 == 0");
      return CalculadoraDto.builder().num1(num1).num2(num2).resultado(num2).build();
    } else if(num2 == 0) {
      tracerAPI.trace("CalculadoraUseCase.subtract: num2 == 0");
      return CalculadoraDto.builder().num1(num1).num2(num2).resultado(num1).build();
    }
    return CalculadoraDto.builder().num1(num1).num2(num2).resultado(num1+num2).build();
  }


  @Override
  public CalculadoraDto subtract(int num1, int num2) {
    TracerAPI tracerAPI = tracerAPIBean.getTracerAPI();
    tracerAPI.trace("CalculadoraUseCase.subtract");
    tracerAPI.trace(CalculadoraDto.builder().num1(num1).num2(num2).resultado(num1-num2).build());
    if(num1 == 0 && num2 == 0) {
      throw new RuntimeException("No se puede restar 0 - 0");
    } else if(num1 == 0) {
      tracerAPI.trace("CalculadoraUseCase.subtract: num1 == 0");
      return CalculadoraDto.builder().num1(num1).num2(num2).resultado(-num2).build();
    } else if(num2 == 0) {
      tracerAPI.trace("CalculadoraUseCase.subtract: num2 == 0");
      return CalculadoraDto.builder().num1(num1).num2(num2).resultado(num1).build();
    }
    return CalculadoraDto.builder().num1(num1).num2(num2).resultado(num1-num2).build();
  }


}
