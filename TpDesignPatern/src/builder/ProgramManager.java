package builder;

public class ProgramManager {
    protected QueryBuilder builder;

    public ProgramManager(QueryBuilder builder) {
        this.builder = builder;
    }

    public Program build(String nomColonne, int limite, int min, int max) {
        builder.buildLimitQuery(limite);
        builder.buildSubstringQuery(nomColonne,min,max);
        return builder.result();
    }
}
