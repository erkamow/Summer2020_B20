package day45_Constructor;

public class SalaryCalculator {
    /*
    2. Create class called SalaryCalculator
                instance variables:
                    hourlyRate, weeklyHours, stateTaxRate, fedralTaxRate
                add a constructor can initialize those fields
                instance methods:
                    salary(): returns the total salary as double  (hourlyRate * weeklyHours * 48)
                    stateTax(): retuns the total state tax as double ( salary * stateTaxRate)
                    federalTax(): retuns the total federal tax as double ( salary * fedralTaxRate)
                    salaryAftertax(): retuns the salary after tax as double ( salary - stateTax - federalTax)
                    toString(): returns the hourlyRate, weeklyHours and salary info as calculated by salary()

     */

    double hourlyRate;
    int weeklyHours;
    double stateTaxRate;
    double federalTaxRate;

    public SalaryCalculator (double hourlyRate,int weeklyHours,double stateTaxRate,double federalTaxRate){
        this.hourlyRate = hourlyRate;
        this.weeklyHours = weeklyHours;
        this.stateTaxRate = stateTaxRate;
        this.federalTaxRate = federalTaxRate;

    }
    public double salary (){
        return (hourlyRate*weeklyHours)*48;

    }
    public double getStateTaxRate(){
        return salary()*stateTaxRate;
    }
    public double getFederalTaxRate(){
        return salary()*federalTaxRate;
    }
    public double salaryAfterTax (){
        return salary()-stateTaxRate-federalTaxRate;
    }
    public String toString(){
        return "Hourly Rate: "+hourlyRate+"\nWeekly Hours: "+weeklyHours+"\nState Tax Rate: "+stateTaxRate+
                "\nFederal Tax Rate: "+federalTaxRate+"\nSalary: "+salary()+"\nState Tax Rate: %"
                +getStateTaxRate()+"\nFederal Tax Rate: %"+getFederalTaxRate()+"\nSalary After Taxes: $"+salaryAfterTax();
    }

}
