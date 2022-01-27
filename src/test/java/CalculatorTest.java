import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @org.junit.jupiter.api.Test
    public void sum() {
        assertEquals(11,Calculator.sum(2,9));
    }

    @org.junit.jupiter.api.Test
    public void difference() {
        assertEquals(0,Calculator.difference(2,2));
    }

    @org.junit.jupiter.api.Test
    public void product() {
        assertEquals(6,Calculator.product(3,2));
    }
}