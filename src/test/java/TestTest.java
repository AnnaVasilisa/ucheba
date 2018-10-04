import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class TestTest {
    @Test
    public void whenWeAddOnePlusOne() {
        Calculator calculator = new Calculator(); //переменная calculator типа калькулятор = выделили память
        int expected = 2;
        int result = calculator.sum(1, 1); //обращаемся к методу сум в классе калькулятор
        assertThat(result, is(expected)); // метод сравнения assertThat - сравниваем ожидаемый и результат
                                            // is - действительно ли результат соответствует ожиданию
    }

    @Test
    public void whenWeTakeOneMinusOne() {
        Calculator calculator = new Calculator();
        int expected = 0;
        int result = calculator.sub(1, 1);
        assertThat(result, is(expected));
    }

    @Test
    public void whenWeMultiplyOneByOne() {
        Calculator calculator = new Calculator();
        int expected = 1;
        int result = calculator.mult(1, 1);
        assertThat(result, is(expected));
    }

    @Test
    public void whenWeDivideSixOnTwo() {
        Calculator calculator = new Calculator();
        int expected = 3;
        int result = calculator.div(6, 2);
        assertThat(result, is(expected));
    }

}
