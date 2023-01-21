package com.brideglabz.employeewagecomputation;

public interface IComputeEmpWage {
    public void addCompany(String companyName, int empRatePerHour, int numOfWorkingDays, int maxHoursInMonth);
    public void computeEmpWage();
    public int getTotalEmpWage(String company);

}