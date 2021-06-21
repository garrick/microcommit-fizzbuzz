package org.commandline.microcommitfizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.fail;

public class FizzBuzzTest {

    @Test
    public void testClassRecognizedAndMethodFailsBuildIntentionally(){
        fail("We should fail!");
    }
}
