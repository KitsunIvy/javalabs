package ru.mirea.labs910;

public class Manager extends Employee implements EmployeePosition {
    public Manager(String name, String subName, String jobTitle, double salary) {
        super(name, subName, jobTitle, salary);
    }

    @Override
    public String getJobTitle() {
        return this.getJob();
    }

    @Override
    public double calcSalary() {
        return this.getSalary() + this.getIncomeOne() * 0.05;
    }


}
