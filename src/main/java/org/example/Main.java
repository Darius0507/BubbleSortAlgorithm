package org.example;


public class Main {
    static void main() {

        SalesRep guy1 = new SalesRep(10, 500);
        SalesRep guy2 = new SalesRep(7, 800);
        SalesRep guy3 = new SalesRep(1, 100);
        SalesRep guy4 = new SalesRep(10, 1000);

        SalesRep[] representatives = {guy1, guy2, guy3, guy4};

        BubbleSort bubbleSortAlgorithm = new BubbleSort();
        SalesRep [ ] sortedRepresentatives = bubbleSortAlgorithm.bubbleSort(representatives);

        System.out.println("The representatives sorted about revenue:");

        for (SalesRep guy : sortedRepresentatives){
            System.out.println(guy);
        }



    }
}