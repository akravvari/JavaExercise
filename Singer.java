
public class Singer {
	private String name;
	private int id;
	static int counter=0;
	
	public Singer(String name) {
		this.name=name;
		this.id=counter;
		counter++;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setId(int id) {
		this.id=id;
	}
	public int getId() {
		return id;
	}
	
	public String toString() {
		return "Singer [name=" +this.name+ ", id=" +this.id+ "]";
	}
	

}
