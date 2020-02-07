package test.java;

import main.java.Cat;
import org.testng.annotations.*;

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


    @Parameters({"login"})
    @Test()
    public void checkAgeSetter(String login){
        System.out.println(login);
        vasiliy.setAge(1);
        int actual = vasiliy.getAge();
        assertEquals(1, actual,
                String.format("Expected %d to be equal %d", 1, actual));
    }


    @DataProvider(name = "provider") //from testng documentation
    public Object[][] provider(){
        return new Object[][]{
                {0,1, "First"},
                {1,1, "Second"},
                {20,20, "Third"},
                {15,15, "Fifth"},
                {21,1, "Sixth" },
                {-15,1, "Seventh"}
        };
    }
}
