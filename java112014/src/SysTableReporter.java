import java.sql.*;

public class SysTableReporter {
	public static void main (String[] args) {
		String data = "jdbc:derby:derbyDB;create=true";
		try (
				Connection conn = DriverManager.getConnection(data, "user1", "USER1");
				Statement st = conn.createStatement()) {
			
			Class.forName("org.apache.derby.jdbc.EmbeddedDriver").newInstance();
			
			ResultSet rec = st.executeQuery(
					"select * " + "from SYS.SYSTABLES " + "order by TABLENAME");
			while(rec.next()) {
				System.out.println("TABLEID:\t" + rec.getString(1));
				System.out.println("TABLENAME:\t" + rec.getString(2));
				System.out.println("TABLETYPE:\t" + rec.getString(3));
				System.out.println("SCHEMAID:\t" + rec.getString(4));
				System.out.println();
			}st.close();
		} catch (SQLException s) {
			System.out.println("SQL Error: " + s.toString() + " " + s.getErrorCode() + " " + s.getSQLState());
		} catch (Exception e) {
			System.out.println("Error: " + e.toString() + e.getMessage());
			}
		}
	}
