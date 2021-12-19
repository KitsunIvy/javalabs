package ru.mirea.labs910;

public abstract class Employee {
    private String name, surname, job;
    private double salary, incomeOne;
    private Company company;

    public Employee(String name, String surname, String job, double salary) {
        this.name = name;
        this.surname = surname;
        this.job = job;
        this.salary = salary;
        this.incomeOne = Randomizer.rand(115000, 140000);
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public Company getCompany() {
        return company;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getJob() {
        return job;
    }

    public double getSalary() {
        return salary;
    }

    public double getIncomeOne() {
        return incomeOne;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", subName='" + surname + '\'' +
                ", job='" + job + '\'' +
                ", salary=" + salary +
                ", incomeOne=" + incomeOne +
                ", company=" + company +
                '}';
    }
}
