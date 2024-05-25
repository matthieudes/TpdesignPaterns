package strategy;

import java.util.List;

public class ClassificationTree implements DataProcessing{
    @Override
    public void print(List<Data> datas) {
        System.out.println("Application de l'agorithme des arbres de classification sur les données");
        System.out.print("[" );
        for (Data d:datas){
            if (d.getFormat().equals("PDF")){
                System.out.print(d.getContent());
            }
        }
        System.out.print("]");
        System.out.println(" ");
    }
}
