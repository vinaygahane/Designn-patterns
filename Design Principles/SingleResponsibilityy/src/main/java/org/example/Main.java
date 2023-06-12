package org.example;

public class Main {
    public static void main(String[] args) throws Exception {
        Employee employee = new Employee("abc",101);
        
        //finance Team
        CalculateSalary sc = new CalculateSalary();
        sc.calculateSalary(employee);

        //HR team
        EmployeeHiring eh = new EmployeeHiring();
        eh.hireEmploy(employee);

        //management team
        EmployeeEvaluator evaluator = new EmployeeEvaluator();
        evaluator.evaluateEmploy(employee);
    }
}
