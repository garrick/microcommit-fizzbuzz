package org.commandline.microcommitfizzbuzz;

public class FizzBuzz {
    public String convert(int intValue) {
        if (intValue % 3 == 0) return "Fizz";
        return ""+intValue;
    }
}
