package jUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddString{

    @Test
    public void test() {
        jUnitFunctions2 junit = new jUnitFunctions2();
        String result = junit.addStrings("Hello", "World");
        assertEquals("HelloWorld", result);
    }

}