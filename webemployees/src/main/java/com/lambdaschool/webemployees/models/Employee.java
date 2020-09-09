package com.lambdaschool.webemployees.models;

import javax.persistence.*;


@Entity
@Table(name = "employees")

public class Employee
{

    @Id // primary key
    @GeneratedValue(strategy = GenerationType.AUTO)
    // only lowercase letters used for fields in Spring Framework
    private long empid;
    private String fname;
    private String lname;
    private double salary;

    public Employee(
            String fname,
            String lname,
            double salary)
    {
        this.fname = fname;
        this.lname = lname;
        this.salary = salary;
    }

    public Employee()
    {
        // jpa requires default constructor
    }

    public long getEmpid()
    {
        return empid;
    }

    public void setEmpid(long empid)
    {
        this.empid = empid;
    }

    public String getFname()
    {
        return fname;
    }

    public void setFname(String fname)
    {
        this.fname = fname;
    }

    public String getLname()
    {
        return lname;
    }

    public void setLname(String lname)
    {
        this.lname = lname;
    }

    public double getSalary()
    {
        return salary;
    }

    public void setSalary(double salary)
    {
        this.salary = salary;
    }

    @Override
    public String toString()
    {
        return "Employee{" +
                "empid=" + empid +
                ", fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", salary=" + salary +
                '}';
    }
}
