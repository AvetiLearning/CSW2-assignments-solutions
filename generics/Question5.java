
import java.util.*;

class Book{
	private int id;
	private String name;
	private int quantity;
	public Book(int id, String name, int quantity) {
		this.id = id;
		this.name = name;
		this.quantity = quantity;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
	
	
}


public class Question5 {

	public static void main(String[] args) {
		
		Book b1 = new Book(12, "Harry Potter", 2);
		Book b2 = new Book(4, "DSA", 5);
		Map<Integer, Book> books = new HashMap<Integer, Book>();
		books.put(1, b1);
		books.put(2, b2);
		System.out.println(books.containsValue(b1));
		books.remove(2);

	}

}