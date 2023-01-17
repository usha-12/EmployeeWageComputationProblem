package com.brideglabz.employeewagecomputation;
public class EmployeeWageComputation {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Problem");
        double empCheck = Math.floor(Math.random()*10) % 2;
        int workingHours = 0;
        int dailyWage = 0;
        int empRatePerHr = 20;
        int isFullTime = 0;
        int isPartTime = 0;
        //Solving using switch case
        switch ((int)(empCheck)) {

            case 1 :
                isFullTime = 1;
                workingHours = 8;
                System.out.println("Employee is working Full Time");
                System.out.println("Working hours of Employee are : " + workingHours);
                break;

            case 0 :
                isPartTime = 0;
                workingHours = 8;
                System.out.println("Employee is working Part Time");
                System.out.println("Working hours of Employee are : " + workingHours);

                break;

            default :
                workingHours = 0;
                break;

        }
    }
    }
    /*Solving using
Switch Case
Statement*/
