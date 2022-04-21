
public class Book {
	
	
private int id ;
private String title;
private String author;
private String editor;
private int pageNB;
private String summary;
Book(int id, String title, String author, String editor, int pageNB, String summary) {
	super();
	this.id = id;
	this.title = title;
	this.author = author;
	this.editor = editor;
	this.pageNB = pageNB;
	this.summary = summary;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public String getEditor() {
	return editor;
}
public void setEditor(String editor) {
	this.editor = editor;
}
public int getPageNB() {
	return pageNB;
}
public void setPageNB(int pageNB) {
	this.pageNB = pageNB;
}
public String getSummary() {
	return summary;
}
public void setSummary(String summary) {
	this.summary = summary;
}
@Override
public String toString() {
	return "Book [id=" + id + ", title=" + title + ", author=" + author + ", editor=" + editor + ", pageNB=" + pageNB
			+ ", summary=" + summary + "]";
}
public void AfficherBook() {
	System.out.println(toString());}






public Boolean VerifierBook(Book Book1,Book Book2) {
Boolean verif = false;
if (Book1.getTitle().equals(Book2.getTitle()) & Book1.getAuthor().equals(Book2.getAuthor()) & Book1.getEditor().equals(Book2.getEditor()) & Book1.getSummary().equals(Book2.getSummary()));

verif = true;
System.out.println("les deux livre sont similaire");
return verif;}


}
