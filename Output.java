public class Output {

	void go () {
		
		int y = 7;

		for (int x = 1; x < 8; x++) {

			y++;

			if (x > 4) {
				System.out.print(++y + " ");
			}

			if (y > 14) {
				System.out.print(" x = " + x);
				break;
			}
		}
	}

	public static void main (String [] args) {

		Output out = new Output();
		out.go();
	}
}
