package academy.learnprogramming.entities;

public class PersonalTax extends Tax {

    private Double healthSpending;

    public PersonalTax(String name, double annualIncome, Double healthSpending) {
        super(name, annualIncome);
        this.healthSpending = healthSpending;
    }

    public double getHealthSpending() {
        return healthSpending;
    }

    public void setHealthSpending(double healthSpending) {
        this.healthSpending = healthSpending;
    }

    @Override
    public double TaxCalculate() {
        double basicTax;
        if (getAnnualIncome() < 20000) {
            basicTax = getAnnualIncome() * 0.15;
        } else {
            basicTax= getAnnualIncome() * 0.25;
        }
        basicTax -= getHealthSpending() * 0.5;
        if (basicTax < 0.0) {
            return 0.0;
        }

        return basicTax;
    }
}
