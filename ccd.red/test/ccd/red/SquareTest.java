package ccd.red;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class SquareTest {

	@Test
	public void new_Square_has_proper_area_and_perimeter() {
		Square square = new Square();
		square.setSide(12.0);
		assertThat(square.getArea(),is(144.0));
		assertThat(square.getPerimeter(), is(48.0));
	}
	
	// set Width
}
