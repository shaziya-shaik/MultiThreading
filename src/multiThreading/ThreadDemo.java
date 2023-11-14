package multiThreading;

public class ThreadDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//MyThread t=new MyThread();
		MyRunnable r=new MyRunnable();
		Thread t=new Thread(r);
		t.start();
		t.join();
		System.out.println(Thread.currentThread().getPriority());
		for(int i=0;i<5;i++) {
			
			System.out.println("main method");
			}
	}


}
