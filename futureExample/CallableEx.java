package futureExample;

import java.sql.SQLException;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

//ExecutorService (submit method), Callable interface, Future class
@SuppressWarnings("unused")
public class CallableEx {

	public static void main(String[] args) {

		// new Thread(new MyThread()).start();

		// ExecutorService ser = new ThreadPoolExecutor();

		// ExecutorService ser1 = Executors.newSingleThreadExecutor();
		ExecutorService ser1 = Executors.newFixedThreadPool(3);
		Callable<Integer> ob = new SumOfNumbers(100);

		Future<Integer> f = ser1.submit(ob);

		// f.cancel(false); //cancel the task if not started, if task started already
		// then do not cancel by interruption
		// f.cancel(true); //cancel the task if not started, if task started already
		// then cancel by interruption

		Callable<Boolean> ob1 = new IsPrime(19);

		Future<Boolean> f1 = ser1.submit(ob1);

		Runnable r = new MyThread();

		ser1.submit(r);

		while (!f.isDone()) {
			System.out.println("SumOfNumbers Task  is still not done...");
			try {
				Thread.sleep(200); // in actuality execute some code logic main thread
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		if (f.isDone() && !f.isCancelled()) {
			System.out.println("SumOfNumbers Task completed! Retrieving the result");

			try {
				System.out.println("SumOfNumbers Callable thread completed:returned value is:" + f.get());
				// f.get(20, TimeUnit.SECONDS);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} catch (ExecutionException e) {
				e.printStackTrace();
			}

		}

		while (!f1.isDone()) {
			System.out.println("IsPrime Task  is still not done...");
			try {
				Thread.sleep(200); // in actuality execute some code logic main thread
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if (f1.isDone() && !f1.isCancelled()) {
			System.out.println("IsPrime Task completed! Retrieving the result");

			try {
				System.out.println("IsPrime Callable thread completed:returned value is:" + f1.get());
				// f.get(20, TimeUnit.SECONDS);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} catch (ExecutionException e) {
				e.printStackTrace();
			}

		}

		ser1.shutdown();
	}

}

class MyThread implements Runnable {

	// overriding rule says that opverriden method cannot throw any new or wider
	// checked exception

	@Override
	public void run() // throws SQLException
	{
		System.out.println("inside Runnable:Current Thread:" + Thread.currentThread().getName());
		int add = 10 + 20;
		System.out.println(add);
		// return add;
		// throw new SQLException();

	}
}

class SumOfNumbers implements Callable<Integer> {
	private int n;

	SumOfNumbers(int n) {
		this.n = n;
	}
	// overriding rule says that opverriden method cannot throw any new or wider
	// checked exception

	@Override
	public Integer call() throws SQLException {

		int sum = 0;
		System.out.println("inside Callable:Current Thread:" + Thread.currentThread().getName());
		for (int i = 1; i < n; i++) {
			sum = sum + i;
		}

		return sum;

		// throw new SQLException();

	}
}

class IsPrime implements Callable<Boolean> {
	private int no;

	IsPrime(int n) {
		this.no = n;
	}

	public Boolean call() {

		if (no <= 0) {
			return false;
		} else if (no > 0 && no <= 2) {
			return true;
		} else {
			for (int i = 2; i < no; i++) {
				if (no % i == 0) {
					return false;
				}
			}
			return true;
		}

	}
}
