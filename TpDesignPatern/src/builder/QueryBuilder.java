package builder;

public abstract class QueryBuilder {
    protected Program program;

    public abstract void buildLimitQuery(int limite);
    public abstract void buildSubstringQuery(String nomColonne,int min, int max);
    public Program result(){
        return program;
    }
}
