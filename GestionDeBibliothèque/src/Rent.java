
public class Rent {
private int ID;
	private Book Book;
	private  User User;
	private String DatePret;
	private String DateFin;
	public Rent(int iD, Book book, User user, String datePret, String dateFin) {
		super();
		this.ID = iD;
		this.Book = book;
		this.User = user;
		this.DatePret = datePret;
		this.DateFin = dateFin;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public Book getBook() {
		return Book;
	}
	public void setBook(Book book) {
		Book = book;
	}
	public User getUser() {
		return User;
	}
	public void setUser(User user) {
		User = user;
	}
	public String getDatePret() {
		return DatePret;
	}
	public void setDatePret(String datePret) {
		DatePret = datePret;
	}
	public String getDateFin() {
		return DateFin;
	}
	public void setDateFin(String dateFin) {
		DateFin = dateFin;
	}
	@Override
	public String toString() {
		return "Rent [ID=" + ID + ", Book=" + Book + ", User=" + User + ", DatePret=" + DatePret + ", DateFin="
				+ DateFin + "]";
	}
	public void AfficherRent() {
		System.out.println(toString());}

	public Boolean VerifierRent(Rent rent1,Rent rent2) {
		Boolean verif = false;
		if (rent1.getUser().equals(rent2.getUser()) );

		verif = true;
		System.out.println("les deux prêt sont similaire");
		return verif;}
}
