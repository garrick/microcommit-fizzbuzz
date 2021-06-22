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
    public void testConvertReturnsStringVersionOfNonFizzBuzzNumber(){
        //Act
        String result = unit.convert(1);
        //Assert
        assertEquals("1", result);
    }

    @Test
    public void testConvertReturnsStringFizzForMultiplesOfThree(){
        //Act
        String result = unit.convert(3 * 2);
        //Assert
        assertEquals("Fizz", result);
    }

    @Test
    public void testConvertReturnsStringBuzzForMultiplesOfFive(){
        //Act
        String result = unit.convert(5 * 2 );
        //Assert
        assertEquals("Buzz", result);
    }

    @Test
    public void testConvertReturnsStringFizzBuzzForMultiplesOfThreeAndFive(){
        //Act
        String result = unit.convert(3 * 5 * 2);
        //Assert
        assertEquals("FizzBuzz", result);
    }

}
