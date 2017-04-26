package threads;

/* Basic example of a Thread generation by implementing the Runnable interface 
 * A thread is the smallest sequence of programmed instructions that can be managed independently by a scheduler
 * (that is typically part of the operating system).
 * A process may be made up of multiple threads that execute instruction concurrently.
 * A process is a program in execution.
*/

public class HelloRunnable implements Runnable {
	
	@Override
	public void run() {
		Thread t = Thread.currentThread();
		System.out.println("Hello World by " + t.getName());
	}

	public static void main(String[] args) {
		
		HelloRunnable r = new HelloRunnable();
		for(int i=0;i<10;i++)
		{
			Thread t = new Thread(r, "RunnableThread" +i);
			if(i==9)
			{
				t.setPriority(10);
			}
			t.start();
		}
	}
}
