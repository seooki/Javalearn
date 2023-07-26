import java.util.TimerTask;

public class InterfaceExample {

	static class A {

		class AA {

		}

		int num;
		static int count;

		static {

		}

		public A() {

		}

		void show() {

		}

		static int getCount() {
			return count;
		}
	}

	// 추상클래스
	static abstract class B {
		static int count = 0;
		int num;

		public B() {

		}

		static int getCount() {
			return count;
		}

		abstract void hide(); // 추상메소드
	}

	static class AA extends A {

	}

	static class BB extends B {
		@Override
		void hide() {

		}
	}

	static class Task extends TimerTask {

		@Override
		public void run() {

		}
	}

	static abstract class D {
		abstract void show();

		abstract void hide();
	}

	static class DD extends D {

		@Override
		void show() {
			// TODO Auto-generated method stub

		}

		@Override
		void hide() {
			// TODO Auto-generated method stub

		}

	}

	interface Showable {
		void show();

		void hide();
	}

	public static void main(String[] args) {
		A a = new A();

	}

}
