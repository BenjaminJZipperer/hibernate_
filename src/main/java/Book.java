import javax.persistence.Entity;
import javax.persistence.*;


@Entity
public class Book 
{
	@Id
	private int id ;
	public String name;
	public String author;
	public int getBid() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getAuthor() {
		return author;
	}
	public void setBid(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void ObjectToString()
	{
	
		System.out.println("Get the hibernate entry: "+this.name + " with book id "+
			this.id);
		System.out.println("Close Operation");
	}
}
