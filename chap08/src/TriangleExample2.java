
public class TriangleExample2 {

	static class Show {
		boolean test(int i, int j) {
			return i >= j;
		}
	}

	static class Triangel1 extends Show {

		@Override
		boolean test(int i, int j) {
			return i >= j;
		}

	}

	static class Triangel2 extends Show {

		@Override
		boolean test(int i, int j) {
			return i >= j;
		}

	}

	static void drawShape(Show s) {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (s.isDraw(i, j)) {
					System.out.print('*');
				} else {
					System.out.print(' ');
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Show s = new Show();
		drawShape(s);
	}

}
