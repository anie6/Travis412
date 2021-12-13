package travis_ci_tutorial_java;

import java.util.*;

import static org.junit.Assert.*;
import org.junit.*;

public class SimpleCalculatorTest {
	@Test
	public void testAdd() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.add(1, 1), 2);
	}
	public void testMinus() {
		SimpleCalculator mcalc = new SimpleCalculator();
		assertEquals(mcalc.minus(5, 3), 2);
	}
	public void testDivide() {
		SimpleCalculator dcalc = new SimpleCalculator();
		assertEquals(dcalc.divide(0, 6), 6);
	}
	public void testMultiple() {
		SimpleCalculator mcalc = new SimpleCalculator();
		assertEquals(mcalc.multi(6, 3), 18);
	}
}
