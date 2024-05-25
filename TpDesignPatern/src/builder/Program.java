package builder;

import java.util.ArrayList;
import java.util.List;

public abstract class Program {
    protected List<String> content = new ArrayList<>();
    public abstract void addQuery(String query);
    public abstract void print();
}
