package cn.tedu.boot011.entity;

public class Emp {
    private String name;
    private double salary;
    private String job;

    public Emp() {
    }

    public Emp(String name, double salary, String job) {
        this.name = name;
        this.salary = salary;
        this.job = job;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", job='" + job + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}
