# TAREA
## 1) Escribir pruebas para las demás operaciones: Siguiendo el ejemplo dado, deben escribir pruebas unitarias para los otros métodos en la clase Calculator, asegurándose de cubrir casos de prueba variados, incluidos los casos límite como la división por cero.
En este caso debemos llamar a las demás operaciones como resta, multiplicación y división.
    
    //Caso 1: 2 numeros positivos
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
        assertEquals(5, resultado, "10 * 5 debería ser 50");
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

## 2) Pruebas para casos negativos: Además de los casos de éxito,deben escribir pruebas para manejar casos negativos, por ejemplo, capturando excepciones esperadas.
 Crearemos test que llamen a numeros negativos:


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

## 3)Cobertura de casos de Prueba: Las pruebas deben cubrir una gama de casos de entrada, incluidos casos límite y negativos.
Igual que en el caso 2 hemos cubierto casos negativos, para detectar correctamente las 4 operaciones.

## ./gradlew test

<===========--> 85% EXECUTING [129ms]

Deprecated Gradle features were used in this build, making it incompatible with Gradle 9.0.

You can use '--warning-mode all' to show the individual deprecation warnings and determine if they come from your own scripts or plugins.

For more on this, please refer to https://docs.gradle.org/8.5/userguide/command_line_interface.html#sec:command_line_warnings in the Gradle documentation.

BUILD SUCCESSFUL in 887ms
3 actionable tasks: 1 executed, 2 up-to-date

![Test Succesful](C:\Users\Alumno\Desktop\PracticaCalificada1\CalculadorProject\imagen.PNG)