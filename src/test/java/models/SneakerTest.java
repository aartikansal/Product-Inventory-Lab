package models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SneakerTest {
    @Test
    public void setNameTest(){
        //given(1)
        String expected  = "ADIDAS";
        //when(2)
        Sneaker testSneaker = new Sneaker();
        testSneaker.setName(expected);
        // then (3)
        Assertions.assertEquals(expected, testSneaker.getName());


    }

    @Test // (1)
    public void constructorTest(){

        // (2)
        int expectedId = 6;
        String expectedName = "Stan Smith";
        String expectedBrand = "Adidas";
        String expectedSport = "Tennnis";
        int expectedQty = 10;
        float expectedPrice = 80.00f;

        // (3)
        Sneaker testSneaker = new Sneaker(expectedId, expectedName, expectedBrand,
                expectedSport, expectedQty,expectedPrice);

        // (4)
        Assertions.assertEquals(expectedId, testSneaker.getId());
        Assertions.assertEquals(expectedName, testSneaker.getName());
        Assertions.assertEquals(expectedBrand, testSneaker.getBrand());
        Assertions.assertEquals(expectedSport, testSneaker.getSport());
        Assertions.assertEquals(expectedQty, testSneaker.getQty());
        Assertions.assertEquals(expectedPrice, testSneaker.getPrice());
    }
}
