package com.brideglabz.employeewagecomputation;
public class EmployeeWageComputation {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Problem");
        //Check Employee is Present or Absent
        double empCheck = Math.floor(Math.random()*10) % 2;
        if (empCheck == 1)
            System.out.println("Employee is Present");
        else
            System.out.println("Employee is Absent");

    }
    }
    /*Check Employee is
Present or Absent
- Use ((RANDOM)) for Attendance
Check*/
