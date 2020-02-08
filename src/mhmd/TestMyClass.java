package mhmd;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.*;
import org.junit.Assert.*;
import org.junit.jupiter.api.Test;

class TestMyClass {

	@Test
	public void testPrint() throws Exception{
		assertEquals("Hellooo World !!!",MyClass.print());
	}

}
