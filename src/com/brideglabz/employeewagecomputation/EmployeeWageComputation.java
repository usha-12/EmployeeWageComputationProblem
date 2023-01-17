package com.brideglabz.employeewagecomputation;
public class EmployeeWageComputation {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Problem");
        double empCheck = 0.0;
        int workingHours = 0;
        int dailyWage = 0;
        int empRatePerHr = 20;
        int isFullTime = 0;
        int isPartTime = 0;
        int monthlyWage = 0;
        int workingDays = 20;
        int days = 0;
        int totalWorkingHours = 0;
        int maxHours = 100;
        int maxDays = 20;
        int wage = 0;
        int totalWage = 0;



        //Start with Displaying Welcome to Employee Wage Computation Program on Master Branch
        System.out.println("Welcome to Employee Wage Computation Program!");



        //Calculate Wages till a condition of total working hours or days is reached for a month
        //Assume 100 hours and 20 days
        while (days < maxDays && totalWorkingHours < maxHours) {

            empCheck = Math.floor(Math.random()*10) % 3;
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

                case 2 :
                    workingHours = 0;
                    System.out.println("Employee is Absent");
                    System.out.println("Working hours of Employee are : " + workingHours);
                    break;

                default :
                    workingHours = 0;
                    break;

            }

            totalWorkingHours = totalWorkingHours + workingHours;

            if (totalWorkingHours > maxHours) {
                totalWorkingHours = totalWorkingHours - workingHours;
            }

            wage = workingHours * empRatePerHr;
            totalWage = totalWage + wage;
            days++;

        }

        System.out.println();
        System.out.println("Total number of Days worked : " + days);
        System.out.println("Total number of Hours worked : " + totalWorkingHours);
        System.out.println("Total Wage of Employee for the month : $" + totalWage);

    }

}

/*Calculate Wages till
a condition of total
working hours or
days is reached for
a month - Assume 100 hours and 20 days*/
