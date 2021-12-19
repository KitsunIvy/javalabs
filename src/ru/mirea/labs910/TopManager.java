package ru.mirea.labs910;

public class TopManager extends Employee implements EmployeePosition {
    public TopManager(String name, String subName, String jobTitle, double salary) {
        super(name, subName, jobTitle, salary);
    }

    @Override
    public String getJobTitle() {
        return this.getJob();
    }

    @Override
    public double calcSalary() {
        double bonusSalary = 0;
        double sum;

        sum = this.getCompany().getEmployees().stream()
                .filter(i -> i.getJob().equals("Manager") || i.getJob().equals("Operator"))
                .mapToDouble(Employee::getSalary).sum();

        if (sum > 10000000) {
            bonusSalary = 1.5 * this.getSalary();
        }

        return this.getSalary() + bonusSalary;
    }
}
