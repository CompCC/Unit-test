import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    public static void main(String[] args) {
// Проверка базового функционала с целыми числами:
        if (8 != Calculator.calculation(2, 6, '+')) {
            throw new AssertionError("Ошибка в методе");
        }
        if (0 != Calculator.calculation(2, 2, '-')) {
            throw new AssertionError("Ошибка в методе");
        }
        if (14 != Calculator.calculation(2, 7, '*')) {
            throw new AssertionError("Ошибка в методе");
        }
        if (2 != Calculator.calculation(100, 50, '/')) {
            throw new AssertionError("Ошибка в методе");
        }
// Случаи с неправильными аргументами
// аргумент operator типа char, должен вызывать исключение, если он получает не базовые символы (+-*/)
        try {
            Calculator.calculation(8, 4, '_');
        } catch (IllegalStateException e) {
            if (!e.getMessage().equals("Unexpected value operator: _")) {
                throw new AssertionError("Ошибка в методе");
            }
        }
    }
    @Test
    void evaluatesExpression(){
        Calculator calculator = new Calculator();
        assertThat(calculator.calculation(2,6,'+')).isEqualTo(8);
    }

//    @Test
//    void execeptedOperator(){
//        Calculator calculator = new Calculator();
//        assertThrows(()-> calculator.calculation(8,4,'_'))
//                .isIn
//    }
}
