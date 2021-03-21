package com.collectiongenerics.thiago.collections.sorting.comparatorandcomparable;

//Para poder comprar um objeto de acordo com alguma regra utilizamos o Comparable
// e depois sobrescrevemos o comparableTo
public class BookWithComparable implements Comparable<BookWithComparable>{

	private String authorName;
	private String tittle;
	private int numOfPages;

	public BookWithComparable() {
	}

	public BookWithComparable(String authorName, String tittle, int numOfPages) {

		this.authorName = authorName;
		this.tittle = tittle;
		this.numOfPages = numOfPages;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public String getTittle() {
		return tittle;
	}

	public void setTittle(String tittle) {
		this.tittle = tittle;
	}

	public int getNumOfPages() {
		return numOfPages;
	}

	public void setNumOfPages(int numOfPages) {
		this.numOfPages = numOfPages;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.authorName + " - " + this.numOfPages;
	}

	//Aqui podemos definir de acordo com o que vamos comparar os livros
	@Override
	public int compareTo(BookWithComparable o) {
		// TODO Auto-generated method stub
		return this.authorName.compareTo(o.authorName);
		
		//Para comprar integer:
		// return Integer.compare(this.numOfPages,o.numOfPages);
	}

}
