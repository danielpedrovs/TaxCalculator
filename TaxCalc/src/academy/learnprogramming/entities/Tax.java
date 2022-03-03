package academy.learnprogramming.entities;

public abstract class Tax {


    private String name;
    private double AnnualIncome;

    public Tax(){

    }
    public Tax(String name, double annualIncome) {
        this.name = name;
        AnnualIncome = annualIncome;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAnnualIncome() {
        return AnnualIncome;
    }

    public void setAnnualIncome(double annualIncome) {
        AnnualIncome = annualIncome;
    }

    public abstract double TaxCalculate();
}
