package ccd.red;

public class StringExample {

	private static final int MAX = 5;

	public static void main(String[] args) {
		for(int i = Integer.valueOf(args[0]); i < MAX; i++) {
			String val = "this is iteration " + i + " of " + MAX;
			System.out.println(val);
		}
	}
}
