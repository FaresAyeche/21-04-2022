import java.util.ArrayList;
public class Library {
	private int id ;
	private String name;
	private String address;
    private int numTel;
    ArrayList<Book> list = new ArrayList<Book>();
    ArrayList<Rent> list1  = new ArrayList<Rent>();
	private Library(int id, String name, String address, int numTel, ArrayList<Book> list) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.numTel = numTel;
		this.list = list;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getNumTel() {
		return numTel;
	}
	public void setNumTel(int numTel) {
		this.numTel = numTel;
	}

	  
   
}
