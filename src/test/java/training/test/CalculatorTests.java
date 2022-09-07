package training.test;

import trainingOopPirogov.calculator.Calculator;
import org.junit.jupiter.api.Test;

public class CalculatorTests {

    @Test
    public void NewTest() {
        Calculator calculator = new Calculator();

        int result = calculator.plus(1,4);

        assert result == 5;
    }

}
