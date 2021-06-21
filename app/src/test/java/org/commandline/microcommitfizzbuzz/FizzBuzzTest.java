package org.commandline.microcommitfizzbuzz;

import org.junit.jupiter.api.Test;

public class FizzBuzzTest {

    @Test
    public void testConvertReturnsStringOneForIntegerOne(){
        //Arrange
        FizzBuzz unit = new FizzBuzz();
        //Act
        String result = unit.convert(1);
    }
}
