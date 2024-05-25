package builder;

public class OracleProgram extends Program{
    @Override
    public void addQuery(String query) {
        if (query.startsWith("SELECT")){
            content.add(query);
        }
    }

    @Override
    public void print() {
        System.out.println("\ud83d\udcbb Oracle Program");
        content.stream().forEach(s -> System.out.println(s));
    }
}
