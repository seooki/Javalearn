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

	interface Moveable {
		void left();

		void right();

		void up();

		void down();
	}

	static class E implements Showable, Moveable {

		@Override
		public void show() {
			// TODO Auto-generated method stub

		}

		@Override
		public void hide() {
			// TODO Auto-generated method stub

		}

		@Override
		public void left() {
			// TODO Auto-generated method stub

		}

		@Override
		public void right() {
			// TODO Auto-generated method stub

		}

		@Override
		public void up() {
			// TODO Auto-generated method stub

		}

		@Override
		public void down() {
			// TODO Auto-generated method stub

		}

	}

	public static void main(String[] args) {
		A a = new A();

		A a1 = new AA();
		B b1 = new BB();

		Showable s1 = new E();
		Moveable m1 = new E();

		s1.show();
		s1.hide();

		m1.left();
		m1.right();
		m1.up();
		m1.down();

	}

}
