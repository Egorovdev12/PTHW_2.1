import org.junit.jupiter.api.Assertions;

class IntsCalculatorTest {

    @org.junit.jupiter.api.Test
    void sum() {
        final int expected = 10;
        final int arg1 = 7;
        final int arg2 = 3;
        var sut = new IntsCalculator();

        final var result = sut.sum(arg1, arg2);

        Assertions.assertEquals(expected, result);
    }

    @org.junit.jupiter.api.Test
    void mult() {
        final int expected = 21;
        final int arg1 = 7;
        final int arg2 = 3;
        var sut = new IntsCalculator();

        final var result = sut.mult(arg1, arg2);

        Assertions.assertEquals(expected, result);
    }

    @org.junit.jupiter.api.Test
    void pow() {
        final int expected = 343;
        final int arg1 = 7;
        final int arg2 = 3;
        var sut = new IntsCalculator();

        final var result = sut.pow(arg1, arg2);

        Assertions.assertEquals(expected, result);
    }
}