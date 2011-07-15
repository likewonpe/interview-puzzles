package coding;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class IntegerFinderTest {

	@Test
	public void returnLargestWhenMaxIntIsInMiddleOfArray() {
		int[] intArray = { 0, 151, 6, 85, 43, 781, 13, 1, 85 };
		int expected = 781;

		IntegerFinder integerFinder = new IntegerFinder();

		assertEquals(expected, integerFinder.findLargest(intArray));

	}
	
	@Test
	public void returnLargestWhenMaxIntIsAtBeginningOfArray() {
		int[] intArray = { 1024, 151, 6, 85, 43, 781, 13, 1, 85 };
		int expected = 1024;

		IntegerFinder integerFinder = new IntegerFinder();

		assertEquals(expected, integerFinder.findLargest(intArray));
	}
	
}
