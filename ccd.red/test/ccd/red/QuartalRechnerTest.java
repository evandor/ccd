package ccd.red;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.junit.Before;
import org.junit.Test;

public class QuartalRechnerTest {

	private QuartalRechner quartalRechner;
	
	private DateFormat df = new SimpleDateFormat("dd.MM.yyyy");

	@Before
	public void setUp() {
		quartalRechner = new QuartalRechner();
	}
	
	@Test
	public void ersterTest() throws ParseException {
		String quarter = quartalRechner.getQuarter(df.parse("31.03.2000"));
		assertThat(quarter,is("1/2000"));
		//assertTrue(quarter.equals("hi"));
	}

}
