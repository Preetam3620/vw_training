package multiThreading;

public class MyThread1 extends Thread {
	public void run() {
		for (int i = 1; i < 50; i++) {

			System.out.println(Thread.currentThread().getName() + " i:=" + i);

			try {

				Thread.sleep(5000);

			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}
}
