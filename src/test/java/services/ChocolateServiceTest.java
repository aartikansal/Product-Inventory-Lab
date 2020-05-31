package services;

import models.Chocolate;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ChocolateServiceTest {

    @Test
    public void createTest(){

        // (1)
        String expectedName = "Twist";
        String expectedBrand = "Cadburys";
        int expectedQty = 100;
        float expectedPrice = 9.00f;

        // (2)
        ChocolateService ChocolateService= new ChocolateService();
        Chocolate testChocolate = ChocolateService.create(expectedName, expectedBrand,
                  expectedQty, expectedPrice);

        // (3)
        int actualId = testChocolate.getId();
        String actualName = testChocolate.getName();
        String actualBrand = testChocolate.getBrand();
        int actualQty = testChocolate.getQty();
        float actualPrice = testChocolate.getPrice();

        // (4)
        Assertions.assertEquals(Integer.class.getName(), new Integer(actualId).getClass().getName());
        Assertions.assertEquals(expectedName, actualName);
        Assertions.assertEquals(expectedBrand, actualBrand);
        Assertions.assertEquals(expectedQty, actualQty);
        Assertions.assertEquals(expectedPrice, actualPrice);

    }
}
