package com.collectiongenerics.thiago.collections.sorting.comparatorandcomparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Utilizando o comparable interface e o Comparator class para custom objects
//JAVA não sabe por qual regra queremos ordenar, então fazemos isso com o comparable e Comparator
//Primeira solução é adicionar o implements Comparable<Book> na classe livro
public class SortingComparableComparatorInterface {
	
	public static void main(String[] args) {
		
		//USING COMPARABLE INTERFACE
		
		List<BookWithComparable> books = new ArrayList<>();

		books.add(new BookWithComparable("Albert Camus", "Titulo 1", 223));
		books.add(new BookWithComparable("Zed Camus", "Titulo 2", 33));
		books.add(new BookWithComparable("Heidegger", "Being and time", 891));
		books.add(new BookWithComparable("Michio Kaku", "Quantuum physics", 34));
		
		//Depois de adicionar o Comparable interface na classe books, vc pode usar o sort, que ele vai comparar
		//de acordo com as regras que estão la.
		Collections.sort(books);
		
		System.out.println(books);
		
		//USING COMPARATOR INTERFACE
		
		List<Book> books2 = new ArrayList<>();

		books2.add(new Book("Albert Camus", "Titulo 1", 223));
		books2.add(new Book("Zed Camus", "Titulo 2", 33));
		books2.add(new Book("Heidegger", "Being and time", 891));
		books2.add(new Book("Michio Kaku", "Quantuum physics", 34));
		
		//Não sera possivel usar o sort pois não tem o comparable interface, mas vc pode fazer o seguinte:
		
		Collections.sort(books2, new BookComparator().reversed());
		
		System.out.println(books2);
		
		
	}

}
