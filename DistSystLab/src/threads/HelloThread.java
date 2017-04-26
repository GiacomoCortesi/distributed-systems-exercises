package threads;

/* Basic example of a Thread generation by means of the Thread class 
 * A thread is the smallest sequence of programmed instructions that can be managed independently by a scheduler
 * (that is typically part of the operating system).
 * A process may be made up of multiple threads that execute instruction concurrently.
 * A process is a program in execution.
*/

public class HelloThread extends Thread{
	@Override
	public void run() {
		Thread t = Thread.currentThread();
		System.out.println("Hello World by " + t.getName());
	}
	
	public static void main(String[] args) {
		for(int i=0;i<10;i++){
			HelloThread t = new HelloThread();
			t.start();
		}

	}
}
