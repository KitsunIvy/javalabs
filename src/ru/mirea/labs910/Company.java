package ru.mirea.labs910;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Company {
    private ArrayList<Employee> employees = new ArrayList<>();
    private double income = 0;

    public void hire(Employee employee) {
        employee.setCompany(this);
        this.employees.add(employee);
        this.income += employee.getIncomeOne();
    }

    public void hireAll(ArrayList<Employee> employees) {
        this.employees.addAll(employees);
        employees.forEach((s) -> this.income += s.getIncomeOne());
    }

    public void fire(int index) {
        this.employees.remove(index);
        this.income -= this.employees.get(index).getIncomeOne();
    }

    public void fireCount(int count) {
        if (!ErrorCatcher.employeesCountException(this, count)) {
            for (int i = 0; i < count; i++) {
                fire(i);
            }
        }
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public double getIncome() {
        return this.income;
    }

    List getLowestSalaryStaff(int count){
        if (!ErrorCatcher.employeesCountException(this, count)) {
            return this.getEmployees().stream().sorted(Comparator.comparing(Employee::getSalary))
                    .limit(count).collect(Collectors.toList());
        } else {
            return null;
        }
    }

    List getTopSalaryStaff(int count){
        if (!ErrorCatcher.employeesCountException(this, count)) {
            return this.getEmployees().stream().sorted(Comparator.comparing(Employee::getSalary).reversed())
                    .limit(count).collect(Collectors.toList());
        } else {
            return null;
        }
    }
}
