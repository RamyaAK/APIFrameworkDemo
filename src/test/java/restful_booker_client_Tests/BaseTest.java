package restful_booker_client_Tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {

    @BeforeTest
    public void setup(){
        System.out.println("Welcome to our book store!");
    }

    @AfterTest
    public void close(){
        System.out.println("Thank you for visiting our store!");
    }
}
