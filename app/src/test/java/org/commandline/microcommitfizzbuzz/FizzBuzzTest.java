package org.commandline.microcommitfizzbuzz;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    private FizzBuzz unit;
    @BeforeEach
    public void setUp() {
        //Arrange for all tests
        unit = new FizzBuzz();
    }

    @Test
    public void testConvertReturnsStringOneForIntegerOne(){
        //Act
        String result = unit.convert(1);
        //Assert
        assertEquals("1", result);
    }

    @Test
    public void testConvertReturnsStringTwoForIntegerTwo(){
        //Act
        String result = unit.convert(2);
        //Assert
        assertEquals("2", result);
    }

    @Test
    public void testConvertReturnsStringFizzForMultiplesOfThree(){
        //Act
        String result = unit.convert(3 * 2);
        //Assert
        assertEquals("Fizz", result);
    }

    @Test
    public void testConvertReturnsStringFizzForMultiplesOfThree(){
        //Act
        String result = unit.convert(5 );
        //Assert
        assertEquals("Buzz", result);
    }


}
