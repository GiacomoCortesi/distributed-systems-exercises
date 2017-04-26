package threads;

/* This simple program allows to see the randomness in the execution of threads. 
 * Note that each thread, by default, has the same priority (=5).
 * However, thread priorities cannot guarantee the order in which threads execute and it's very much 
 * platform dependent.
 */

public class CountThread implements Runnable{
	
	@Override
	public void run() {
		count();
	}
	
	public static void count() {
		Thread t = Thread.currentThread();
		for (int i = 0; i < 10; i++) {
			System.out.println(i + " " + t.getName());
		}
	}

	public static void main(String[] args) {
		CountThread r = new CountThread();
		Thread t1 = new Thread(r, "CountThread1");
		Thread t2 = new Thread(r, "CountThread2");
		t1.start();
		t2.start();
	}

}
