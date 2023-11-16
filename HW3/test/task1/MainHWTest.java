package HW3.test.task1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MainHWTest {
    /**
     * Òåñòèðóåì êîððåêòíîñòü ÷åòíîãî ÷èñëà
     * îæèäàåì ïîëó÷èòü îò ìåòîäà evenOddNumber - true
     */
    @Test
    void checkEvenNumber() {
        assertTrue(MainHW.evenOddNumber(4));
    }

    /**
     * Òåñòèðóåì êîððåêòíîñòü ÷åòíîãî ÷èñëà
     * îæèäàåì ïîëó÷èòü îò ìåòîäà evenOddNumber - false
     */
    @Test
    void checkOddNumber() {
        assertFalse(MainHW.evenOddNumber(3));
    }

    /**
     * Òåñòèðóåì êîððåêòíîñòü íàõîæäåíèÿ ÷èñëà â èíòåðâàëå (25;100)
     * îæèäàåì ïîëó÷èòü îò ìåòîäà numberInInterval - true
     */
    @Test
    void checkNumberInInterval() {
        assertTrue(MainHW.numberInInterval(25));
        assertTrue(MainHW.numberInInterval(100));
    }

    /**
     * Òåñòèðóåì êîððåêòíîñòü íàõîæäåíèÿ ÷èñëà â èíòåðâàëå (25;100)
     * îæèäàåì ïîëó÷èòü îò ìåòîäà numberInInterval - false
     */
    @Test
    void checkNumberNotInInterval() {
        assertFalse(MainHW.numberInInterval(24));
        assertFalse(MainHW.numberInInterval(101));
    }

}
