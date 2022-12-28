package pluralsight.opeClosePrinciple.after.hr;

import pluralsight.singleResposibilityPrinciple.after.hr.personnel.Employee;

public interface TaxCalculator {
    double calculate(Employee employee);
}
