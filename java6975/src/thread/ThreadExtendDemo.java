package thread;


class A  implements Runnable{
	
	public void run() {
		System.out.println("Thread A Started");
		
		for(int i=0;i<=10;i++) {
			System.out.println("The value of I :" +i);
		}
		System.out.println("Thread A Exit");
	}
	
}

class B implements Runnable{
	public void run() {
		System.out.println("Thread B Started");
		
		for(int j=0;j<=10;j++) {
			try {
				Thread.sleep(2000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("The value of J :" +j);
		}
		System.out.println("Thread B Exit");
	}
	
	
}

class C implements Runnable{
	public void run() {
		System.out.println("Thread C Started");
		
		for(int k=0;k<=10;k++) {
			System.out.println("The value of K :" +k);
		}
		System.out.println("Thread C Exit");
	}
	
	
}
public class ThreadExtendDemo {

	public static void main(String[] args) {
		
		
A obj = new A();
B obj1 = new B();
C obj2 = new C();

Thread t1 = new Thread (obj);
Thread t2 = new Thread (obj1);
Thread t3 = new Thread (obj2);

t1.setName("A");
t2.setName("B");
t3.setName("C");

t1.getName();
t2.getName();
t3.getName();

t1.start();
t2.start();
t3.start();


	}

}
