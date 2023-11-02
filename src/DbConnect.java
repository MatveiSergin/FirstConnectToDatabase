import java.sql.*;
import java.util.HashMap;
import java.util.Map;

public class DbConnect {
    private final String url = "jdbc:postgresql://localhost/postgres?user=postgres&password=381381381Gg!";
    public Map<Integer, String[]> executeSelect(String select) {
        Map<Integer, String[]> obj = new HashMap<>();
        try {
            Connection conn = DriverManager.getConnection(url);
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(select);
            int columnCounter = 0;
            while (rs.next()) {
                obj.put(columnCounter, new String[]{rs.getString("revisionNumber"), rs.getString("type"), rs.getString("adress")});
                columnCounter += 1;
            }
            return obj;
        } catch (SQLException ex) {
            System.out.println("Cannot connect to DB: " + ex.getMessage());
            return Map.of();
        }
    }
}