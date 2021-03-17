package programming;

import java.util.stream.IntStream;

public class FP08Threads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Runnable runnable = new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				for (int i = 0; i < 10000; i++) {

					System.out.println(Thread.currentThread().getId() + " : " + i+" ---- Thread declarada normalmente");

				}
			}
		};

		// Modo funcional
		Runnable runnableFunctional = () -> {
			
			IntStream.range(0, 10000).forEach(i -> System.out.println(Thread.currentThread().getId()+" : "+i+" ---- Thread Funcional"));
			
		};

	

		Thread thread1 = new Thread(runnable);
		thread1.start();

		Thread thread2 = new Thread(runnableFunctional);
		thread2.start();

	}

}
