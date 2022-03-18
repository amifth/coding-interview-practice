package coding_interview;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestFactorial {
    // Kompleksitas Linier O(N)
    public int FactorialCase(int value){
        int temp = 1;
        for (int i = value; i >=1 ; i--) {
            temp *= i;
        }
        return temp;
    }

    @Test
    void testFactorialCase(){
        Assertions.assertAll(
                () -> Assertions.assertEquals(FactorialCase(5),120)
        );
    }

    // if without temporary variable
    public int FactorialCase2(int value, int total){
        for (int i = value; i >=1 ; i--) {
            total *= i;
        }
        return total;
    }
}
