package com.compass;

public class Employee {
    private String name;
    private double grossSalary;
    private double bonus;
    private double netSalary;

    Employee(String name, double salary) {
        this.name = name;
        this.grossSalary = salary;
        this.bonus = calculateBonus(salary);
        this.netSalary = this.grossSalary + this.bonus;
    }

    public double calculateBonus(double salary) {
        // Bonus 20%
        if (salary <= 1000)
            return salary * 0.2;

        // Bonus 10%
        if (salary < 2000)
            return salary * 0.1;

        // Desconto 10%
        return -salary * 0.1;
    }

    public boolean hasBonus() {
        return this.bonus > 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGrossSalary() {
        return grossSalary;
    }

    public void setGrossSalary(double grossSalary) {
        this.grossSalary = grossSalary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getNetSalary() {
        return netSalary;
    }

    public void setNetSalary(double netSalary) {
        this.netSalary = netSalary;
    }

}
