package ru.mirea.labs910;

public class ErrorCatcher {
    public static boolean employeesCountException(Company company, int count) {
        boolean err = false;
        try {
            company.getEmployees().get(count - 1);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Incorrect count!");
            err = true;
        }
        return err;
    }
}
