package thread;


class D extends Thread {

	public void run() {
		System.out.println("Thread A Started");

		for (int i = 0; i <= 10; i++) {
			System.out.println("The value of I :" + i);
		}
		System.out.println("Thread A Exit");
	}

}

class E extends Thread {
	public void run() {
		System.out.println("Thread B Started");

		for (int j = 0; j <= 10; j++) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("The value of J :" + j);
		}
		System.out.println("Thread B Exit");
	}

}

class F extends Thread {
	public void run() {
		System.out.println("Thread C Started");

		for (int k = 0; k <= 10; k++) {
			System.out.println("The value of K :" + k);
		}
		System.out.println("Thread C Exit");
	}

}

public class ThreadPriority {

	public static void main(String[] args) {

		D obj = new D();
		E obj1 = new E();
		F obj2 = new F();

		obj2.setPriority(Thread.MAX_PRIORITY);
		obj1.setPriority(Thread.MIN_PRIORITY);
		obj.setPriority(Thread.MIN_PRIORITY);

		obj.start();
		obj1.start();
		obj2.start();

	}

}
