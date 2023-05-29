package arcis.ramon.calculadora.infrastructure.controller;

import io.corp.calculator.TracerAPI;
import org.springframework.stereotype.Component;

@Component
public class TracerApiBean {

  public TracerAPI getTracerAPI() {
      TracerAPI tracerAPI  = new TracerAPI() {
      @Override
      public <T> void trace(T result) {
        System.out.println(result);
      }
    };
    return tracerAPI;
  }
}
