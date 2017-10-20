package ccd.red;

public class StringExample {

    private static final int MAX = 5;

    public static void main(String[] args) {
        String aValue = "3";

        new StringBuilder("this is iteration ").append(aValue).append(" of ").append(MAX).toString();


        String val = "this is iteration " + aValue + " of " + MAX;

        //s"this is iteration ${aValue} of ${MAX}"
    }
}
