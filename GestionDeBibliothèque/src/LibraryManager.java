



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LibraryManager {

	public static void main(String[] args) {
		
		lireEnBase();
	sauverEnBase(2, "ffffff", "hhhhhhhhh", 5, "ppppp");
	}

	
	public static void lireEnBase() {


		// Information d'accès à la base de données
		String url = "jdbc:mysql://localhost/biblio";
		String login = "root";
		String passwd = "";
		Connection cn =null;
		Statement st =null;
		ResultSet rs =null;
		
		try {

			// Etape 1 : Chargement du driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			// Etape 2 : récupération de la connexion
			cn = DriverManager.getConnection(url, login, passwd);

			// Etape 3 : Création d'un statement
			st = cn.createStatement();

			String sql = "SELECT * FROM book";

			// Etape 4 : exécution requête
			rs = st.executeQuery(sql);

			// Si récup données alors étapes 5 (parcours Resultset)

			while (rs.next()) {
				int a= rs.getInt("Book_ID");
				String b= rs.getString("title");
				String c=rs.getString("author");
				String d=rs.getString("editor");
				int e=rs.getInt("pageNB");
				String f=rs.getString("summary");
				Book book=new Book(a,b,c,d,e,f);
				book.AfficherBook();
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
			// Etape 6 : libérer ressources de la mémoire.
				cn.close();
				st.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	



public static void sauverEnBase(int Book_ID,String title,  String editor, int pageNb,String summary) {

			// Information d'accès à la base de données
			String url = "jdbc:mysql://localhost/biblio";
			String login = "root";
			String passwd = "";
			Connection cn =null;
			Statement st =null;

			try {

				// Etape 1 : Chargement du driver
				Class.forName("com.mysql.cj.jdbc.Driver");

				// Etape 2 : récupération de la connexion
				cn = DriverManager.getConnection(url, login, passwd);

				// Etape 3 : Création d'un statement
				st = cn.createStatement();

				//String sql = "INSERT INTO `book` (`title`) VALUES ('"+title + "')";
				String sql = ("INSERT INTO book (Book_ID, title, author, editor, pageNb, summary) VALUES ("+Book_ID+", '"+title+"', '"+editor+"', "+pageNb+", '"+summary+"' )");
				// Etape 4 : exécution requête
				st.executeUpdate(sql);

				// Si récup données alors étapes 5 (parcours Resultset)

			} catch (SQLException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO: handle exception
				e.printStackTrace();
			} finally {
				try {
				// Etape 6 : libérer ressources de la mémoire.
					cn.close();
					st.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	
	
	
	}


