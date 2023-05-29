package arcis.ramon.calculadora.application;

import arcis.ramon.calculadora.domain.dto.CalculadoraDto;
import arcis.ramon.calculadora.domain.ports.CalculadoraServicePort;

import io.corp.calculator.TracerAPI;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class CalculadoraUseCase implements CalculadoraServicePort {


  @Override
  public CalculadoraDto sum(int num1, int num2) {
    TracerAPI tracerAPI = getTracerAPI();
    tracerAPI.trace("CalculadoraUseCase.sum");
    tracerAPI.trace(CalculadoraDto.builder().num1(num1).num2(num2).resultado(num1+num2).build());
    return CalculadoraDto.builder().num1(num1).num2(num2).resultado(num1+num2).build();
  }


  @Override
  public CalculadoraDto subtract(int num1, int num2) {
    TracerAPI tracerAPI = getTracerAPI();
    tracerAPI.trace("CalculadoraUseCase.subtract");
    tracerAPI.trace(CalculadoraDto.builder().num1(num1).num2(num2).resultado(num1-num2).build());
    return CalculadoraDto.builder().num1(num1).num2(num2).resultado(num1-num2).build();
  }

  private static TracerAPI getTracerAPI() {
    TracerAPI tracerAPI  = new TracerAPI() {
      @Override
      public <T> void trace(T result) {
        System.out.println(result);
      }
    };
    return tracerAPI;
  }

}
