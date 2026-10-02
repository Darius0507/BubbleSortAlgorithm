package org.example;

public class SalesRep {
    private int NrOfSales;
    private double QuotaPerSale;


    public SalesRep(int nrOfSales, double quotaPerSale) {
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
