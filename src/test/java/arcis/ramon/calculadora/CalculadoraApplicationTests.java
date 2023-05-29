package arcis.ramon.calculadora;

import arcis.ramon.calculadora.application.CalculadoraUseCase;
import arcis.ramon.calculadora.domain.dto.CalculadoraDto;
import arcis.ramon.calculadora.domain.ports.CalculadoraServicePort;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;


@ExtendWith(MockitoExtension.class)
class CalculadoraApplicationTests {

	@InjectMocks
	private CalculadoraUseCase calculadoraUseCase;


	@Test
	void testSum() {

		CalculadoraDto expectedCalculadoraDto = CalculadoraDto.builder()
				.num1(4)
				.num2(2)
				.resultado(6)
				.build();

		CalculadoraDto result = calculadoraUseCase.sum(4, 2);
		assertEquals(expectedCalculadoraDto.getResultado(), result.getResultado());


	}

	@Test
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
