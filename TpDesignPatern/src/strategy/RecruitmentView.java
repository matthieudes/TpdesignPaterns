package strategy;


import java.util.Arrays;
import java.util.List;

public class RecruitmentView {
    protected List<Data> datas ;
    protected DataProcessing processing;

    public RecruitmentView(DataProcessing processing) {
        this.datas = Arrays.asList(new Data("Text", "CV 1 technicien informatique \ud83d\udc77"),
                new Data("PDF", "CV 2 ingénieur études et développement \ud83d\udc68\u200d\ud83d\udcbb"),
                new Data("Word", "CV 3 testeur logiciel \ud83d\udc68\u200d\ud83c\udfed"),
                new Data("PDF", "CV 4 chercheur en biologie \ud83d\udc68\u200d\ud83d\udd2c"),
                new Data("Text", "CV 5 Responsable d'application \ud83d\udc68\u200d\ud83d\udcbc"));
        this.processing= processing;
    }
    public void print(){
        this.processing.print(this.datas);
    }
}
