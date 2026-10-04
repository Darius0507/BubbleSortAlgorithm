package org.example;

public class SalesRep {
    private final int NrOfSales;
    private final double QuotaPerSale;


    public SalesRep(int nrOfSales, double quotaPerSale) {
        if (nrOfSales < 0){
            System.out.println("Can`t be negativ sale!");
            throw new IllegalArgumentException("Can´t be negative sale!");
        }
        NrOfSales = nrOfSales;
        QuotaPerSale = quotaPerSale;
    }

    public double getRevenue(){

        double revenue = QuotaPerSale * NrOfSales;
        return revenue;
    }

    @Override
    public String toString() {
        return "SalesRep{" +
                "NrOfSales=" + NrOfSales +
                ", QuotaPerSale=" + QuotaPerSale +
                '}';
    }
}
