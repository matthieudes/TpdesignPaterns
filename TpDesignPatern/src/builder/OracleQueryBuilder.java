package builder;

public class OracleQueryBuilder extends QueryBuilder{

    public OracleQueryBuilder(){
        program = new OracleProgram();
    }
    @Override
    public void buildLimitQuery(int limite) {
        String query = "SELECT * FROM User WHERE ROWNUM <= "+ limite;
        program.addQuery(query);
    }

    @Override
    public void buildSubstringQuery(String nomColonne, int min, int max) {
        String query = "SELECT SUBSTR (\""+nomColonne+"\","+min+","+max+") AS \"SUBSTR\"";
        program.addQuery(query);
    }
}
