package test;

import static main.Task02.delta;
import static main.Task02.numberOfElementsGiven;
import static org.junit.jupiter.api.Assertions.assertEquals;

import main.Task02;
import org.junit.jupiter.api.Test;

public class MainTest {

    @Test
    void testNumberOfElementsGive(){
        assertEquals(1, numberOfElementsGiven(0));
    }

    @Test
    void testDelt(){
        assertEquals(-3, delta(1,1,1));
    }
}









