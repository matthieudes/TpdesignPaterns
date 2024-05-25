package builder;

public class MySQLQueryBuilder extends QueryBuilder{
    public MySQLQueryBuilder(){
        program = new MySQLProgram();
    }
    @Override
    public void buildLimitQuery(int limite) {
        String query = "SELECT * FROM User LIMIT "+ limite;
        program.addQuery(query);
    }

    @Override
    public void buildSubstringQuery(String nomColonne, int min, int max) {
        String query = "SELECT SUBSTRING (\""+nomColonne+"\","+min+","+max+") AS SUBSTR";
        program.addQuery(query);
    }
}
