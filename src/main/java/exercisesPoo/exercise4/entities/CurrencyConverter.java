package exercisesPoo.exercise4.entities;

public class CurrencyConverter {

    public double dollarPrice;
    public double dollarQtd;
    public double taxIof = 0.06;

    public CurrencyConverter(double dollarPrice, double dollarQtd){
        this.dollarPrice = dollarPrice;
        this.dollarQtd = dollarQtd;
    }

    public double calculateAmountInReais(){
        return dollarPrice * dollarQtd * (1 + taxIof);
    }

}


