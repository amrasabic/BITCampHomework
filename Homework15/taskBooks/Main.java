package taskBooks;

public class Main {

	public static void main(String[] args) {
		// declaration of different books
		Books b1 = new Books("The Lord of the Rings - The Fellowship of the Ring", 1954 , "High fantasy", true);
		Books b2 = new Books("The Lord of the Rings - The Two Towers", 1954 , "High fantasy", true);
		Books b3 = new Books("The Lord of the Rings - The Return of the King", 1954 , "High fantasy", true);
		Books b4 = new Books("7. Harry Potter and the Deathly Hallows", 2007, "Fantasy", false);
		Books b5 = new Books("3. Harry Potter and the Prisoner of Azkaban", 2007, "Fantasy", false);
		Books b6 = new Books("Of love and lust", 1957, "Philosophy", true);
		// arrays of books with same author
		Books[] booksT = {b1, b2, b3};
		Books[] booksJKR = {b4, b5};
		Books[] booksTR = {b6};
		// declaration of authors
		Author a1 = new Author("J. R. R. Tolkien", 1916,  booksT);
		Author a2 = new Author("J. K. Rowling", 1965, booksJKR);
		Author a3 = new Author("Theodor Reik", 1888, booksTR);
		// array of authors
		Author[] authors = {a1, a2, a3};
		// calls out for methods and prints result
		System.out.println("Number of bestselling books in this database: " + countBestsellingBooks(a1));
		System.out.println("Number of written books: " + getNumberOfWrittenBooks(a3, 1800, 1996));
		System.out.println("Author with most bestsellers in this database: " + getAuthorWithMostBestsellers(authors));
		
	}
	/**
	 * Count bestselling books
	 * <p>
	 * Count bestselling books from the author
	 * @param a - author
	 * @return - number of books the bestselling books
	 */
	public static int countBestsellingBooks(Author a){
		
		int counter = 0;
		// for loop within authors books
		for(int i = 0; i < a.book.length; i++){
			// if it's a bestseller counter++
			if(a.book[i].isBestSeller == true){
				counter++;
			}
		}
		return counter;
		
	}
	/**
	 * Number of written books by author in year range
	 * <p>
	 * Calculates number of written books by author in year range.
	 * @param a - author
	 * @param year1 - lower year
	 * @param year2 - higher year
	 * @return - number of books
	 */
	public static int getNumberOfWrittenBooks(Author a, int year1, int year2){
	
		int counter = 0;
		// for loop within authors books
		for(int i = 0; i < a.book.length; i++){
			// if book is in range counter++
			if(a.book[i].year >= year1 && a.book[i].year <= year2){
				counter++;
			}
		}
		return counter;
		
	}
	/**
	 * Which author has most bestsellers?
	 * <p>
	 * For array of authors calculates who has the most bestsellers.
	 * @param authors - array of authors
	 * @return - author from array who has the most bestsellers
	 */
	public static Author getAuthorWithMostBestsellers(Author[] authors){
		
		int counter = 0;
		// record 'most bestseller' in this var
		int getTheMostB = 0;
		// for loop within range of authors
		for(int i = 0; i < authors.length; i++){
			//reset counter
			counter = 0;
			// for loop within range of books
			for(int  j = 0; j < authors[i].book.length; j++){
				// if it's a bestseller for author[i] counter++
				if(authors[i].book[j].isBestSeller == true){
					counter++;
				} 
			} 
			// if counter is larger then previous 'most bestseller' overwrite it
			if(getTheMostB < counter){
				getTheMostB = counter;
			}
		}
		// for loop within range of authors
		for(int i = 0; i < authors.length; i++){
			//reset counter
			counter = 0;
			// for loop within range of books
			for(int  j = 0; j < authors[i].book.length; j++){
				// if it's a bestseller for author[i] counter++
				if(authors[i].book[j].isBestSeller == true){
					counter++;
				} 
			} 
			// if counter is same as 'most bestseller' return author
			if(getTheMostB == counter){
				return authors[i];
			}
		}
		
		return null;
		
	}
}
