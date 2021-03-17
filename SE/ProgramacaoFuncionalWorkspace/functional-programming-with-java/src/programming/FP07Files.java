package programming;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class FP07Files {
	
	public static void main (String[] args) throws IOException {
		
		//Para manipular arquivos, é mais facil usando programação funcional com Java
		//Files.lines(Paths.get("file.txt")).forEach(System.out::println);
		//Para transformar uma string em varias strings utiliza o flatMap
		//Files.lines(Paths.get("file.txt")).map(x -> x.split(" ")).flatMap(Arrays::stream).forEach(System.out::println);
		//Files.lines(Paths.get("file.txt")).filter(s -> s.contains("will")).forEach(System.out::println);
		
//		Files.lines(Paths.get("file.txt")).map(x -> x.split(" ")).flatMap(Arrays::stream)
//		.distinct()
//		.sorted()
//		.forEach(System.out::println);
		
		//Files.list retorna uma stream, e get "." retorna todos os arquivos que estão na raiz do projeto(acima do SRC)
		Files.list(Paths.get("."))
		.filter(Files::isDirectory)
		.forEach(System.out::println);
	}
	
	
}
