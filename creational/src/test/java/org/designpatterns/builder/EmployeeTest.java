package org.designpatterns.builder;

import org.junit.Test;

import java.math.BigDecimal;

import static junit.framework.Assert.assertEquals;

public class EmployeeTest {

    @Test
    public void thatEmployeeIsCreated() {
        Employee employee = new Employee.EmployeeBuilder()
                .firstName("John")
                .lastName("Doe")
                .jobTitle("Developer")
                .salaryPerMonth(new BigDecimal("1000.00"))
                .build();

        assertEquals("John", employee.getFirstName());
        assertEquals("Doe", employee.getLastName());
        assertEquals("Developer", employee.getJobTitle());
        assertEquals(new BigDecimal("1000.00"), employee.getSalaryPerMonth());
    }
}