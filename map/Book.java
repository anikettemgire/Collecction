package map;

public class Book {
	int id;
	String name,autor,publisher;
	int quantiy;
	public Book(int id,String name,String autor,String publisher,int quantiy) {
		this.id=id;
		this.name=name;
		this.autor=autor;
		this.publisher=publisher;
		this.quantiy=quantiy;
		
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", autor=" + autor + ", publisher=" + publisher + ", quantiy="
				+ quantiy + "]";
	}

}
