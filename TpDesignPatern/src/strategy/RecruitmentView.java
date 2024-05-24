package strategy;


import java.util.Arrays;
import java.util.List;

public class RecruitmentView {
    private List<Data> datas ;

    public RecruitmentView(List<String> datas) {
        this.datas = Arrays.asList(new Data("Text", "CV 1"),
                new Data("PDF", "CV 2"));
    }
}
