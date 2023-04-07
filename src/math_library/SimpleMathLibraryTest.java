package math_library;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SimpleMathLibraryTest {
    private SimpleMathLibrary simpleMathLibrary;

    @BeforeEach
    public void init(){
        simpleMathLibrary = new SimpleMathLibrary();
    }
    @Test
    public void addTest(){
        double expected = 3;
        double actual = simpleMathLibrary.add(1,2);
        System.out.print("add : ");
        if (expected == actual){
            System.out.println("OK");
        } else System.out.println("NOT OK");
    }
    @Test
    public void minusTest(){
        double expected = 3;
        double actual = simpleMathLibrary.minus(5,2);
        System.out.print("minus : ");
        if (expected == actual){
            System.out.println("OK");
        } else System.out.println("NOT OK");
    }
}
