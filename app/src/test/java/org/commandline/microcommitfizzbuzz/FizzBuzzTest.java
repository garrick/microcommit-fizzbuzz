package org.commandline.microcommitfizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    @Test
    public void testConvertReturnsStringOneForIntegerOne(){
        //Arrange
        FizzBuzz unit = new FizzBuzz();
        //Act
        String result = unit.convert(1);
        //Assert
        assertEquals("1", result);
    }
}
