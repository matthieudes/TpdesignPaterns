package strategy;

import java.util.List;

public class User {
    public static void main(String[] args){
        RecruitmentView rv3 = new RecruitmentView(new KMeansPartitioning());
        rv3.print();
        RecruitmentView rv1 = new RecruitmentView(new LinearRegression());
        rv1.print();
        RecruitmentView rv2 = new RecruitmentView(new ClassificationTree());
        rv2.print();

    }
}
