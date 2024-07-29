package org.variables_and_methods.currencyExchange.currency;

abstract  public class Currency {
    private double kursNBU;
    private double marga = 1.1;

    public Currency(double kursNBU) {
        this.kursNBU = kursNBU;
        setMarga(marga);
    }

    public double getKursNBU() {
        return kursNBU;
    }

    public void setKursNBU(double kursNBU) {
        this.kursNBU = kursNBU;
    }

    public double getMarga() {
        return marga;
    }

    public void setMarga(double marga) {
        if (this instanceof IsCurrency) {
            if (((IsCurrency) this).isFreeConverted() == true) {
               this.marga = marga;
                System.out.println(getCurrencyName() + " is free converted. Marga was not changed");
            } else {
                this.marga = marga * 1.1;
                System.out.println(getCurrencyName() + " is  not free converted currency");
                System.out.println("So marga changed. Current marga is " + this.marga);
            }
        }
        else {
            this.marga = marga * 1.2;
            System.out.println(getCurrencyName() + " is NOT real currency");
            System.out.println("So marga changed. Current marga is " + this.marga);
        }

    }

    public double getKursSell (){
        return kursNBU * marga;
    }

    public double getKursBuy(){
        return  kursNBU/marga;
    }
    abstract public String getCurrencyName ();

    public double exchangeGrnToCurrency(int numberOfGrn){
        double tempResult = numberOfGrn / getKursSell();
        System.out.println(String.format("For %s GRN you get %s %s by kurs %s (marga = %s) ",
                numberOfGrn, tempResult, getCurrencyName(), getKursSell(), marga));
        return  tempResult;

    }

    public  double exchangeCurrencytoGRN(int numberOfCurrency){
        double tempResult = numberOfCurrency * getKursBuy();
        System.out.println(String.format("For %s %s Currency you get %s GRN by kurs %s (marga = %s) ",
                numberOfCurrency,getCurrencyName(), tempResult, getKursBuy(), marga));
        return  tempResult;
    }
}
