package essential.concurrency.synchronization;

public class Snippet implements Runnable{
	volatile int num = 0;

	public void run() {
		Thread t = Thread.currentThread();
		String name = t.getName();
		if (name.equals("Thread1")) {
			num = 10;
		} else {
			System.out.println("value of num is :" + num);
		}

	}

	public static void main(String args[]) throws InterruptedException {
		Runnable r = new Snippet();
		Runnable r1 = new Snippet();
		Thread t1 = new Thread(r);
		t1.setName("Thread1");
		t1.start();

		Thread.sleep(1000);

		Thread t2 = new Thread(r1);
		t2.setName("Thread2");
		t2.start();
	}
}