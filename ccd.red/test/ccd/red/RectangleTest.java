package ccd.red;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class RectangleTest {

	@Test
	public void new_Rectangle_has_proper_area_and_perimeter() {
		Rectangle rectangle = new Rectangle();
		rectangle.setHeight(10.0);
		rectangle.setWidth(5.0);
		assertThat(rectangle.getArea(),is(50.0));
		assertThat(rectangle.getPerimeter(), is(30.0));
	}
}
