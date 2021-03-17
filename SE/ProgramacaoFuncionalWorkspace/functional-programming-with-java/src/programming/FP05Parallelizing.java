package programming;

import java.util.stream.LongStream;

public class FP05Parallelizing {

	public static void main(String[] args) {

		long time = System.currentTimeMillis();

		//System.out.println(LongStream.range(0, 1000000000).sum());
		
		//Usando parallel, ele utiliza o poder do processamento em paralelo do seu pc
		//Java divide a stream em varias partes e executa em multiplas partes e combina no final,0
		System.out.println(LongStream.range(0, 1000000000).parallel().sum());

		// Verificar quanto tempo durou o Stream em milisegundos
		System.out.println(System.currentTimeMillis() - time);

	}

}
