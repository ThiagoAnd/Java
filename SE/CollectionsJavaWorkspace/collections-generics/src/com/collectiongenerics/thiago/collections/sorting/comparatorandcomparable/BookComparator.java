package com.collectiongenerics.thiago.collections.sorting.comparatorandcomparable;

import java.util.Comparator;
//É melhor separar os comportamentos, pesquisar pq Comparator é melhor que comparable
public class BookComparator implements Comparator<Book>{

	@Override
	public int compare(Book o1, Book o2) {
		// TODO Auto-generated method stub
		return Integer.compare(o1.getNumOfPages(), o2.getNumOfPages());
	}



}
