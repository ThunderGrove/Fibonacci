import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest{

    @Test
    void fibonacciTest(){
        Fibonacci fibonacciX = new Fibonacci();
        assertEquals(0,fibonacciX.fibonacci(0),"When X is 0 result must be 0");
        assertEquals(377,fibonacciX.fibonacci(15),"When X is 15 result must be 377");
        assertEquals(514229,fibonacciX.fibonacci(30),"When X is 30 result must be 514229");
        assertEquals(267914296,fibonacciX.fibonacci(43),"When X is 43 result must be 267914296");
        assertEquals(-1,fibonacciX.fibonacci(-10),"When X is below 0 or bigger than 32-bit result must be -1");
    }
}