package com.brideglabz.employeewagecomputation;
public class EmployeeWageComputation {
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;

    private final String companyName;
    private final int empRatePerHour;
    private final int numOfWorkingDays;
    private final int maxHoursInMonth;
    private int totalEmpWage;

    public EmployeeWageComputation(String companyName, int empRatePerHour, int numOfWorkingDays, int maxHoursInMonth) {
        this.companyName = companyName;
        this.empRatePerHour = empRatePerHour;
        this.numOfWorkingDays = numOfWorkingDays;
        this.maxHoursInMonth = maxHoursInMonth;
    }

    public static void main(String args[]) {
        EmployeeWageComputation google = new EmployeeWageComputation("Google", 50, 15, 200);
        EmployeeWageComputation amazon = new EmployeeWageComputation("Amazon", 80, 20, 120);
        EmployeeWageComputation netflix = new EmployeeWageComputation("Netflix", 90, 18, 220);

        google.computeEmpWage();
        System.out.println(google);
        amazon.computeEmpWage();
        System.out.println(amazon);
        netflix.computeEmpWage();
        System.out.println(netflix);
    }

    public void computeEmpWage() {
        int empHrs = 0;
        int empWage = 0;
        int totalWorkingDays = 0;
        int totalEmpHrs = 0;

        for (totalWorkingDays = 1; totalEmpHrs <= maxHoursInMonth && totalWorkingDays < numOfWorkingDays; totalWorkingDays++) {
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;

            switch (empCheck) {
                case IS_FULL_TIME :
                    empHrs = 8;
                    System.out.println("Employee is present Full time.");
                    break;

                case IS_PART_TIME :
                    empHrs = 4;
                    System.out.println("Employee is present Part time.");
                    break;

                default :
                    empHrs = 0;
                    System.out.println("Employee is absent.");
            }
            empWage = empHrs * empRatePerHour;
            totalEmpHrs += empHrs;
            //totalEmpWage += empWage;
            System.out.println("Day " + totalWorkingDays + "	Employee hours : " + empHrs +"	Wage $" + empWage);
        }
        totalEmpWage = totalEmpHrs * empRatePerHour;
        System.out.println();
    }

    @Override
    public String toString() {
        return " "+companyName+" company Employee Monthly Wage : $" + totalEmpWage+"\n\n";
    }
    }
/*Ability to save the Total
Wage for Each
Company - Note: You can Create
EmpWageBuilder for each
Company
- Use Instance Variable instead of
function parameters*/
