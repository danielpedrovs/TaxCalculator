package academy.learnprogramming;

import academy.learnprogramming.entities.CompanyTax;
import academy.learnprogramming.entities.PersonalTax;
import academy.learnprogramming.entities.Tax;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Tax> list = new ArrayList<>();

        System.out.print("Enter the number of tax payers:");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("Tax payer #" + i + " data");
            System.out.print("Individual or Company? (i/c)");
            char ch = sc.next().charAt(0);
            if (ch == 'i') {
                System.out.print("Name:");
                String name = sc.next();
                System.out.print("Annual Income: ");
                double annualIncome = sc.nextDouble();
                System.out.print("Health Spending: ");
                double healthSpending = sc.nextDouble();
                list.add(new PersonalTax(name, annualIncome, healthSpending));
            } else {
                System.out.print("Name:");
                String name = sc.next();
                System.out.print("Annual Income: ");
                double annualIncome = sc.nextDouble();
                System.out.print("Employee Number: ");
                int employeeNumber = sc.nextInt();
                list.add(new CompanyTax(name, annualIncome, employeeNumber));
            }
        }

        System.out.println();
        System.out.println("TAXES PAID:");
        for (Tax tax : list){
            System.out.println(tax.getName() + ": $" +String.format("%.2f",tax.TaxCalculate()));
        }

        System.out.println();
        double sum = 0.0;
        for(Tax tax : list){
            sum += tax.TaxCalculate();
        }
        System.out.println( "TOTAL: $" + String.format("%.2f" ,sum));

sc.close();
        }



    }

