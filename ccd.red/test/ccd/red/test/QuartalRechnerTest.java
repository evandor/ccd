package ccd.red.test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.junit.Test;

import ccd.red.QuartalRechner;

public class QuartalRechnerTest {

    private DateFormat df = new SimpleDateFormat("dd.MM.yyyy");

    @Test
    public void getQuarter_withJanuar2017_gives_12017() throws ParseException {
        QuartalRechner quartalRechner = new QuartalRechner();
        String result = quartalRechner.getQuarter(df.parse("18.01.2017"));
        assertThat(result, is("1/2017"));
    }

    @Test
    public void getQuarter_withJune2017_gives_22017() throws ParseException {
        QuartalRechner quartalRechner = new QuartalRechner();
        String result = quartalRechner.getQuarter(df.parse("01.06.2017"));
        assertThat(result, is("2/2017"));
    }

    @Test
    public void getQuarter_withSeptember2017_gives_32017() throws ParseException {
        QuartalRechner quartalRechner = new QuartalRechner();
        String result = quartalRechner.getQuarter(df.parse("21.09.2017"));
        assertThat(result, is("3/2017"));
    }

    @Test
    public void getQuarter_withDezember2018_gives_42018() throws ParseException {
        QuartalRechner quartalRechner = new QuartalRechner();
        String result = quartalRechner.getQuarter(df.parse("31.12.2018"));
        assertThat(result, is("4/2018"));
    }

}
