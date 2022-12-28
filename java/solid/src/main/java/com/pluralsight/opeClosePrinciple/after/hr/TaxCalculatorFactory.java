package pluralsight.opeClosePrinciple.after.hr;


import pluralsight.singleResposibilityPrinciple.after.hr.personnel.Employee;
import pluralsight.singleResposibilityPrinciple.after.hr.personnel.FullTimeEmployee;
import pluralsight.singleResposibilityPrinciple.after.hr.personnel.Intern;
import pluralsight.singleResposibilityPrinciple.after.hr.personnel.PartTimeEmployee;

public class TaxCalculatorFactory {
    public static TaxCalculator create(Employee employee) {
        if (employee instanceof FullTimeEmployee) {
            return new FullTimeTaxCalculator();
        }

        if (employee instanceof PartTimeEmployee) {
            return new PartTimeTaxCalculator();
        }

        if (employee instanceof Intern) {
            return new InternTaxCalculator();
        }

        throw new RuntimeException("Invalid employee type");
    }
}
