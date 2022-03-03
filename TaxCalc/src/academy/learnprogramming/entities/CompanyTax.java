package academy.learnprogramming.entities;

public class CompanyTax extends Tax{

    private Integer employeeNumber;

    public CompanyTax(String name, double annualIncome, Integer employeeNumber) {
        super(name, annualIncome);
        this.employeeNumber = employeeNumber;

    }

    public int getEmployeeNumber(){
        return employeeNumber;
    }

    public void setEmployeeNumber(int employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    @Override
    public double TaxCalculate() {
        double collect;

        if(getEmployeeNumber()<10){
            collect = getAnnualIncome()*0.16;
        }else{
            collect = getAnnualIncome()*0.14;
        }
        return collect;
    }
}
