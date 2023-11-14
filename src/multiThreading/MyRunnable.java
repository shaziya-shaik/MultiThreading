package multiThreading;

public class MyRunnable implements Runnable{
	static Thread mt;
	public void run() {
	for(int i=0;i<5;i++) {
	//	Thread.yield();
		System.out.println("run method");
		}
	}

}
