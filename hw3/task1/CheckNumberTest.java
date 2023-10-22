package task1;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class CheckNumberTest {
    CheckNumber checkNumber;
    
    @BeforeEach
    void setUp(){
        checkNumber = new CheckNumber();
    }

    @BeforeAll
    public static void initAll(){
        System.out.printf("Начало тестирования.");
    }

    @AfterAll
    public static void tearDownAll(){
        System.out.printf("Окончание тестирования.");
    }

    @Test
    @DisplayName("Проверка честности")
    void checkEven(){
        assertEquals(true, checkNumber.evenOddNumber(2));
    }

    @Test
    void checkOdd(){
        assertEquals(false, checkNumber.evenOddNumber(3));
    }
}
