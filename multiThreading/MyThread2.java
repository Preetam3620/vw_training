package multiThreading;

public class MyThread2 extends Thread {
	public void run() {
		for (int k = 1; k < 50; k++) {

			System.out.println(Thread.currentThread().getName() + " k:=" + k);

			try {

				Thread.sleep(1000);

			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
