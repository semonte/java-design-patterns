package org.designpatterns.builder;

import java.math.BigDecimal;

public class Employee {

    private String firstName;           // Required
    private String lastName;            // Required
    private BigDecimal salaryPerMonth;  // Required
    private String jobTitle;            // Optional

    private Employee(EmployeeBuilder employeeBuilder) {
        this.firstName = employeeBuilder.firstName;
        this.lastName = employeeBuilder.lastName;
        this.salaryPerMonth = employeeBuilder.salaryPerMonth;
        this.jobTitle = employeeBuilder.jobTitle;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public BigDecimal getSalaryPerMonth() {
        return salaryPerMonth;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public static class EmployeeBuilder {
        private String firstName;
        private String lastName;
        private BigDecimal salaryPerMonth;
        private String jobTitle;

        public EmployeeBuilder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public EmployeeBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public EmployeeBuilder salaryPerMonth(BigDecimal salaryPerMonth) {
            this.salaryPerMonth = salaryPerMonth;
            return this;
        }

        public EmployeeBuilder jobTitle(String jobTitle) {
            this.jobTitle = jobTitle;
            return this;
        }

        public Employee build() {

            Employee employee = new Employee(this);

            if (employee.getFirstName() == null) {
                throw new IllegalStateException("First name is null!");
            }

            if (employee.getLastName() == null) {
                throw new IllegalStateException("Last name is null!");
            }

            if (employee.getSalaryPerMonth() == null) {
                throw new IllegalStateException("Salary per month is null!");
            }

            return employee;
        }
    }
}
