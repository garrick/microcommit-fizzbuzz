package org.commandline.microcommitfizzbuzz;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    private FizzBuzz unit;
    @BeforeEach
    public void setUp() {
        unit = new FizzBuzz();
    }

    @Test
    public void testConvertReturnsStringOneForIntegerOne(){
        //Arrange
        FizzBuzz unit = new FizzBuzz();
        //Act
        String result = unit.convert(1);
        //Assert
        assertEquals("1", result);
    }

    @Test
    public void testConvertReturnsStringTwoForIntegerTwo(){
        //Arrange
        FizzBuzz unit = new FizzBuzz();
        //Act
        String result = unit.convert(2);
        //Assert
        assertEquals("2", result);
    }

    @Test
    public void testConvertReturnsStringFizzForIntegerThree(){
        //Arrange
        FizzBuzz unit = new FizzBuzz();
        //Act
        String result = unit.convert(3);
        //Assert
        assertEquals("Fizz", result);
    }
}
