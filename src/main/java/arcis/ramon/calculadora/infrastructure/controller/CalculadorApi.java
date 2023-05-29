package arcis.ramon.calculadora.infrastructure.controller;

import arcis.ramon.calculadora.domain.dto.CalculadoraDto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Tag(name = "calcular", description = "Operaciones Aritmeticas")
public interface CalculadorApi {

  @Operation(summary = "Obtener la suma de dos valores")
  @ApiResponse(responseCode = "200", description = "encontrado", content = @Content(schema = @Schema(implementation = CalculadoraDto.class)))
  @ApiResponse(responseCode = "404", description = "no encontrado")
  @GetMapping("/sum")
  ResponseEntity<CalculadoraDto> sum(@RequestParam(required = true,defaultValue = "1") int num1, @RequestParam(required = true,defaultValue = "1") int num2);

  @Operation(summary = "Obtener la resta de dos valores")
  @ApiResponse(responseCode = "200", description = "encontrado", content = @Content(schema = @Schema(implementation = CalculadoraDto.class)))
  @ApiResponse(responseCode = "404", description = "no encontrado")
  @GetMapping("/subtract")
  ResponseEntity<CalculadoraDto> subtract(@RequestParam(required = true,defaultValue = "1")int num1, @RequestParam(required = true,defaultValue = "1") int num2);


}

