package arcis.ramon.calculadora;

import arcis.ramon.calculadora.application.CalculadoraUseCase;
import arcis.ramon.calculadora.domain.dto.CalculadoraDto;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;

import org.mockito.junit.jupiter.MockitoExtension;


import static org.junit.jupiter.api.Assertions.assertEquals;



@ExtendWith(MockitoExtension.class)
class CalculadoraApplicationTests {

	@InjectMocks
	private CalculadoraUseCase calculadoraUseCase;


	//@Test
	void testSum() {

		CalculadoraDto expectedCalculadoraDto = CalculadoraDto.builder()
				.num1(4)
				.num2(2)
				.resultado(6)
				.build();

		CalculadoraDto result = calculadoraUseCase.sum(4, 2);
		assertEquals(expectedCalculadoraDto.getResultado(), result.getResultado());


	}

	//@Test
	void testRest() {

		CalculadoraDto expectedCalculadoraDto = CalculadoraDto.builder()
				.num1(4)
				.num2(2)
				.resultado(2)
				.build();

		CalculadoraDto result = calculadoraUseCase.subtract(4, 2);
		assertEquals(expectedCalculadoraDto.getResultado(), result.getResultado());


	}

}
