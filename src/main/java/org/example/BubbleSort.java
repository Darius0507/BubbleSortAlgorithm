package org.example;

public class BubbleSort {

    public  SalesRep [] bubbleSort(SalesRep[ ] representatives){

        for (int i=0; i< representatives.length-1; i++){
            for (int j=0; j< representatives.length-1 ;j++){


                if (representatives[j].getRevenue() < representatives[j+1].getRevenue()){
                    SalesRep rep = representatives[j];
                    representatives[j] = representatives[j+1];
                    representatives[j+1] = rep;
                }
            }
        }
        return representatives;


    }
}
