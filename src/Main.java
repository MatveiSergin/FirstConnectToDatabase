import java.util.Map;

public class Main {
    public static void main(String[] args) {
        DbConnect dbConnect = new DbConnect();
        String select = """
                select *
                from audit_department
                """;
        Map<Integer, String[]> obj = dbConnect.executeSelect(select);

        System.out.println("+-------------------+-------------+--------------------+");
        System.out.println("| Ревизионный номер | Тип изделия | Адрес расположения |");
        for (String[] row : obj.values()) {
            System.out.printf("| %-17s | %-11s | %-18s |\n", row[0], row[1], row[2]);
        }
        System.out.println("+-------------------+-------------+--------------------+");
    }
}
