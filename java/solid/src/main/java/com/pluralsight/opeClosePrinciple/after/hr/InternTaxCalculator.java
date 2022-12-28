package pluralsight.opeClosePrinciple.after.hr;


import pluralsight.singleResposibilityPrinciple.after.hr.personnel.Employee;

public class InternTaxCalculator implements TaxCalculator {
    private final int INCOME_TAX_PERCENTAGE = 16;

    public double calculate(Employee employee) {
        int monthlyIncome = employee.getMonthlyIncome();
        if (monthlyIncome < 350) {
            return 0;
        } else {
            return (monthlyIncome * INCOME_TAX_PERCENTAGE) / 100;
        }
    }
}
