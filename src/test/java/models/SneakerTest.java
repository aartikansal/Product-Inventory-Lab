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
        //Assertions.assertEquals(expected, testSneaker.getName());


    }
}
