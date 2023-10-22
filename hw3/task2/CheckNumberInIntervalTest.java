package task2;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CheckNumberInIntervalTest {
    CheckNumberInInterval checkNumber;

    @BeforeEach
    void setUp(){
        checkNumber = new CheckNumberInInterval();
    }
    @BeforeAll
    public static void initAll(){
        System.out.printf("Начало тестирования");
    }
    
    @AfterAll
    public static void tearDownAll(){
        System.out.printf("Окончание тестирования.");
    }

    @Test
    @DisplayName("Проверка числа из заданного интервала")
    void checkEven(){
        assertEquals(true, checkNumber.checkIsInInterval(54));
    }

    @Test
    @DisplayName("Проверка числа не из заданного интервала")
    void checkOdd(){
        assertEquals(false, checkNumber.checkIsInInterval(132));
    }
}
