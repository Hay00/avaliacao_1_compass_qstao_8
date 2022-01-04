package com.compass;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();

        System.out.print("Informe o número de funcionários: ");
        int numEmployees = getValidIntInput();
        String name;
        int salary;
        try {
            for (int j = 0; j < numEmployees; j++) {
                System.out.println("Funcionário [" + (j + 1) + "]");
                System.out.print("Nome:");
                name = input.nextLine();
                System.out.print("Salário: ");
                salary = getValidIntInput();
                employees.add(new Employee(name, salary));
                System.out.println();
            }
        } catch (Exception e) {
            System.err.println("erro");
        }

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("\nLista de funcionários e seus dados:");

        for (Employee employee : employees) {
            System.out.println("Funcionário: " + employee.getName());
            System.out.println("Salário: " + employee.getGrossSalary());
            if (employee.hasBonus())
                System.out.println("Bonus: " + employee.getBonus());
            else
                System.out.println("Desconto: " + Math.abs(employee.getBonus()));
            System.out.println("Salário Liquido: " + employee.getNetSalary());
            System.out.println();
        }
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

    }

    /**
     * Retorna um valor inteiro válido do Scanner
     *
     * @return inteiro válido do input
     */
    public static int getValidIntInput() {
        try {
            while (!input.hasNextInt()) {
                System.out.println("Valor inválido, digite novamente");
                input.nextLine();
            }
            int value = input.nextInt();
            input.nextLine();
            return value;
        } catch (Exception exception) {
            input.nextLine();
            return 0;
        }
    }
}
