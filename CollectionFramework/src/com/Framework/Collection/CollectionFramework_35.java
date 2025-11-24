package com.Framework.Collection;

import java.util.Scanner;
import java.util.TreeSet;
import java.util.Comparator;

class Employee2 {
    String eid;
    String ename;
    int esal;
    String eaddr;

    public Employee2(String eid, String ename, int esal, String eaddr) {
        this.eid = eid;
        this.ename = ename;
        this.esal = esal;
        this.eaddr = eaddr;
    }

    @Override
    public String toString() {
        return "Employee Id: " + eid + "\tEmployee Name: " + ename + "\tEmployee Salary: " + esal +
                "\tEmployee Address: " + eaddr + "\n";
    }
}

class MyComp implements Comparator<Employee2> {
    private int sortingKey;

    public MyComp(int sortingKey) {
        this.sortingKey = sortingKey;
    }

    @Override
    public int compare(Employee2 e1, Employee2 e2) {
        int val = 0;
        switch (sortingKey) {
            case 1:
                val = e1.eid.compareTo(e2.eid);
                break;
            case 2:
                val = e1.ename.compareTo(e2.ename);
                break;
            case 3:
                val = Integer.compare(e1.esal, e2.esal);
                break;
            case 4:
                val = e1.eaddr.compareTo(e2.eaddr);
                break;
        }
        return val;
    }
}

public class CollectionFramework_35 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Employee2 e1 = new Employee2("E-111", "Adkham", 10000, "Mitan");
            Employee2 e2 = new Employee2("E-222", "Murod", 7000, "Jush");
            Employee2 e3 = new Employee2("E-333", "Odil", 8000, "Xorazim");
            Employee2 e4 = new Employee2("E-444", "Nur", 6000, "Navoiy");
            Employee2 e5 = new Employee2("E-555", "Zoxid", 7500, "Termiz");

            TreeSet<Employee2> ts = new TreeSet<>(new MyComp(1)); // Use initial sorting key of 1

            while (true) {
                System.out.println("Options for Sorting Employee");
                System.out.println("--------------------");
                System.out.println("1. Sorting by Employee ID");
                System.out.println("2. Sorting by Employee Name");
                System.out.println("3. Sorting by Employee Salary");
                System.out.println("4. Sorting by Employee Address");
                System.out.println("5. EXIT");
                System.out.print("Enter your option number: ");
                int option = sc.nextInt();

                switch (option) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                        ts.clear(); // Clear the TreeSet before adding elements with a new sorting key
                        ts = new TreeSet<>(new MyComp(option)); // Create a new TreeSet with the updated sorting key
                        ts.add(e1);
                        ts.add(e2);
                        ts.add(e3);
                        ts.add(e4);
                        ts.add(e5);
                        System.out.println(ts);
                        break;
                    case 5:
                        System.out.println("******* Thank You For using. Visit again! *******\n");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid Input Provided");
                        continue;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
