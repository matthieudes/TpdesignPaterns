package strategy;

import java.util.List;

public class LinearRegression  implements DataProcessing{
    @Override
    public void print(List<Data> datas) {
        System.out.println("Application de l'agorithme de regression linéaire sur les données");
        System.out.println("["+ datas.get(0).getContent()+","+datas.get(4).getContent()+ "]");
    }
}
