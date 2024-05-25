package strategy;

import java.util.List;

public class KMeansPartitioning implements DataProcessing{
    @Override
    public void print(List<Data> datas) {
        System.out.println("Application de l'agorithme de partitionnement en Kmoyennes sur les données");
        System.out.print("[" );
        for (Data d:datas){
            if (d.getContent().contains("informatique")){
                System.out.print(d.getContent());
            }
        }
        System.out.print("]");
        System.out.println(" ");
    }
}
