import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalculadorTest {

    //Caso 1: 2 numeros positivos

    @Test
    public void testSum_PositiveNumbers_ShouldReturnCorrectSum() {
        // Arrange
        Calculador calculador = new Calculador();
        int numeroA = 10;
        int numeroB = 5;

        // Act
        int resultado = calculador.sumar(numeroA, numeroB);

        // Assert
        assertEquals(15, resultado, "10 + 5 deberia ser 15");
    }
    @Test
    public void testRest_PositiveNumbers_ShouldReturnCorrectRest() {
        //Arrange
        Calculador calculador = new Calculador();
        int numeroA = 10;
        int numeroB = 5;

        //Act
        int resultado = calculador.restar(numeroA, numeroB);

        //Assert
        assertEquals(5, resultado, "10 - 5 debería ser 5");
    }
    @Test
    public void testMult_PositiveNumbers_ShouldReturnCorrectMult(){
        //Arrange
        Calculador calculador = new Calculador();
        int numeroA = 10;
        int numeroB = 5;

        //Act
        int resultado = calculador.multiplicacion(numeroA, numeroB);

        //Assert
        assertEquals(50, resultado, "10 * 5 debería ser 50");
    }
    @Test
    public void testDiv_PositiveNumbers_ShouldReturnCorrectDiv(){
        //Arrange
        Calculador calculador = new Calculador();
        int numeroA = 10;
        int numeroB = 5;

        //Act
        double resultado = calculador.division(numeroA, numeroB);

        //Assert
        assertEquals(2, resultado, "10 / 5 debería ser 2");
    }

    //Caso 2:  2 numeros con signos opuestos

    @Test
    public void testSum_PositiveAndNegativeNumber_ShouldReturnCorrectSum() {
        // Arrange
        Calculador calculador = new Calculador();
        int numeroA = -10;
        int numeroB = 5;

        // Act
        int resultado = calculador.sumar(numeroA, numeroB);

        // Assert
        assertEquals(-5, resultado, "-10 + 5 deberia ser -5");
    }
    @Test
    public void testRest_PositiveAndNegativeNumber_ShouldReturnCorrectRest(){
        //Arrange
        Calculador calculador = new Calculador();
        int numeroA = -10;
        int numeroB = 5;

        //Act
        int resultado = calculador.restar(numeroA, numeroB);

        //Assert
        assertEquals(-15, resultado, "-10 - 5 debería ser -15");
    }
    @Test
    public void testMult_PositiveAndNegativeNumber_ShouldReturnCorrectMult(){
        //Arrange
        Calculador calculador = new Calculador();
        int numeroA = -10;
        int numeroB = 5;

        //Act
        int resultado = calculador.multiplicacion(numeroA, numeroB);

        //Assert
        assertEquals(-50, resultado, "-10 * 5 debería ser -50");
    }
    @Test
    public void testDiv_PositiveAndNegativeNumber_ShouldReturnCorrectDiv(){
        //Arrange
        Calculador calculador = new Calculador();
        int numeroA = -10;
        int numeroB = 5;

        //Act
        double resultado = calculador.division(numeroA, numeroB);

        //Assert
        assertEquals(-2, resultado, "-10 / 5 debería ser -2");
    }

    //Caso 3: 2 números negativos

    @Test
    public void testSum_NegativeNumbers_ShouldReturnCorrectSum() {
        // Arrange
        Calculador calculador = new Calculador();
        int numeroA = -10;
        int numeroB = -5;

        // Act
        int resultado = calculador.sumar(numeroA, numeroB);

        // Assert
        assertEquals(-15, resultado, "(-10) + (-5) deberia ser -15");
    }
    @Test
    public void testRest_NegativeNumbers_ShouldReturnCorrectRest() {
        //Arrange
        Calculador calculador = new Calculador();
        int numeroA = -10;
        int numeroB = -5;

        //Act
        int resultado = calculador.restar(numeroA, numeroB);

        //Assert
        assertEquals(-5, resultado, "(-10) - (-5) debería ser -5");
    }
    @Test
    public void testMult_NegativeNumbers_ShouldReturnCorrectMult(){
        //Arrange
        Calculador calculador = new Calculador();
        int numeroA = -10;
        int numeroB = -5;

        //Act
        int resultado = calculador.multiplicacion(numeroA, numeroB);

        //Assert
        assertEquals(50, resultado, "(-10) * (-5) debería ser 50");
    }
    @Test
    public void testDiv_NegativeNumbers_ShouldReturnCorrectDiv(){
        //Arrange
        Calculador calculador = new Calculador();
        int numeroA = -10;
        int numeroB = -5;

        //Act
        double resultado = calculador.division(numeroA, numeroB);

        //Assert
        assertEquals(2, resultado, "(-10)/(-5) debería ser 2");
    }
}
