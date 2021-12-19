package ru.mirea.labs910;

public class Operator extends Employee implements EmployeePosition {
    public Operator(String name, String subName, String job, double salary) {
        super(name, subName, job, salary);
    }

    @Override
    public String getJobTitle() {
        return this.getJob();
    }

    @Override
    public double calcSalary() {
        return this.getSalary();
    }
}
