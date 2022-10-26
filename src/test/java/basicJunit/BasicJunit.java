package basicJunit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BasicJunit {

    // BasicJunit

    @BeforeEach
    public void setup(){
        System.out.println("Setup");
    }

    @AfterEach
    public void cleanup(){
        System.out.println("Cleanup");
    }

    @Test
    public void verifySomething(){
        System.out.println("Test1");
    }

    @Test
    public void verifySomething2(){
        System.out.println("Test2");
    }

}
