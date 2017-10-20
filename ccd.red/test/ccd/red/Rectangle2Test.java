package ccd.red;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class Rectangle2Test {

	@Test
	public void new_Rectangle_has_proper_area_and_perimeter() {
		Rectangle2 rectangle = new Rectangle2(10.0,5.0);
		assertThat(rectangle.getArea(),is(50.0));
		assertThat(rectangle.getPerimeter(), is(30.0));
	}

	@Test
	public void newRectangleWithDoubleAreaOf () {
	    Rectangle2 rectangle = new Rectangle2(1.0,1.0);
	    Rectangle2 newOne = rectangle.newWithDoubleArea();
	    assertThat(newOne.getArea(),is(rectangle.getArea() * 2));
	}
}
