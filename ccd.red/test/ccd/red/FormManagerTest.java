package ccd.red;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

public class FormManagerTest {

	private Rectangle2 r1;
	private Rectangle2 r2;
	private FormManager sar;

	@Before
	public void setUp() {
		r1 = new Rectangle2(1, 3);
		r2 = new Rectangle2(3, 2);
		sar = new FormManager(Arrays.asList(r1,r2));
	}

	@Test
	public void testSumOfAreas() {
		assertThat(sar.sumUpArea(), is(9.0));
	}

	@Test
	public void testSumOfPerimeter() {
		assertThat(sar.sumUpPerimeter(), is(18.0));
	}

	@Test
	public void testIncreaseAreaBy100Percent() {
		Double doubleAllAreas = sar.doubleAllAreas();
		assertThat(doubleAllAreas, is(18.0));
	}

    @Test
    public void testIncreaseAreaBy200Percent() {
        Double doubleAllAreas = sar.doubleAllAreas();
        assertThat(doubleAllAreas, is(18.0));
    }

}
