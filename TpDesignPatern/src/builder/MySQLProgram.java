package builder;

public class MySQLProgram extends Program{
    @Override
    public void addQuery(String query) {
        if (query.startsWith("SELECT")){
            content.add(query);
        }
    }

    @Override
    public void print() {
        System.out.println("\ud83d\udcbb MySQL Program");
        content.stream().forEach(s -> System.out.println(s));
    }
}
