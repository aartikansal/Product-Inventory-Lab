package models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ChocolateTest {
    @Test
    public void setNameTest(){
        //given(1)
        String expected  = "Twist";
        //when(2)
        Chocolate testChocolate = new Chocolate();
        testChocolate.setName(expected);
        // then (3)
        Assertions.assertEquals(expected, testChocolate.getName());


    }

    @Test // (1)
    public void constructorTest(){

        // (2)
        int expectedId = 6;
        String expectedName = "Twist";
        String expectedBrand = "Cadburys";
        int expectedQty = 100;
        float expectedPrice = 9.00f;

        // (3)
        Chocolate testChocolate = new Chocolate(expectedId, expectedName, expectedBrand,
                expectedQty,expectedPrice);

        // (4)
        Assertions.assertEquals(expectedId, testChocolate.getId());
        Assertions.assertEquals(expectedName, testChocolate.getName());
        Assertions.assertEquals(expectedBrand, testChocolate.getBrand());
        Assertions.assertEquals(expectedQty, testChocolate.getQty());
        Assertions.assertEquals(expectedPrice, testChocolate.getPrice());
    }
}
