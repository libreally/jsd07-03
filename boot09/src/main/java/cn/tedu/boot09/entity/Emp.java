package cn.tedu.boot09.entity;

public class Emp {
    private Integer id;
    private String name;
    private Integer salary;
    private String job;
    private Integer managerId;

    public Emp() {
    }

    public Emp(Integer id, String name, Integer salary, String job, Integer managerId) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.job = job;
        this.managerId = managerId;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", job='" + job + '\'' +
                ", managerId=" + managerId +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Integer getManagerId() {
        return managerId;
    }

    public void setManagerId(Integer managerId) {
        this.managerId = managerId;
    }
}

