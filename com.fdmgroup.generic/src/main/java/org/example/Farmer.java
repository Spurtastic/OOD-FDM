package org.example;

import java.util.ArrayList;

public class Farmer <T>{

    private ArrayList<T> produce = new ArrayList<T>();

    public T getProduce(int index){
        return produce.get(index);
    }

    public void addProduce(T produce){
        this.produce.add(produce);
    }

    public void printAllProduce(){
        for(T produce : produce){
            System.out.println(produce);
        }
    }
}
