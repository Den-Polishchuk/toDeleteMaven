import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class TestSimple {
    Cat vasiliy;

    @BeforeClass
    public void someMethod(){
        System.out.println("313546584=========================");
    }

    @BeforeMethod
    public void setUp(){
        vasiliy = new Cat("Vasiliy");
    }

    @Test
    public void checkAgeSetter(){
        vasiliy.setAge(-100);
        int expected = 1;
        int actual = vasiliy.getAge();
        assertEquals(expected, actual,
                String.format("Expected %d to be equal %d", expected, actual));
    }

    @Test
    public void checkAgeSetter2(){
        vasiliy.setAge(15);
        int expected = 15;
        int actual = vasiliy.getAge();
        assertTrue(expected == actual,
                String.format("Expected %d to be equal %d", expected, actual));
    }
}
