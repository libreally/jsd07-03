package cn.tedu.boot10.pojo.entity;

public class Team {
    private Integer id;
    private String name;
    private String loc;

    public Team() {
    }

    public Team(Integer id, String name, String loc) {
        this.id = id;
        this.name = name;
        this.loc = loc;
    }

    @Override
    public String toString() {
        return "Team{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", loc=" + loc +
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

    public  String getLoc() {
        return loc;
    }

    public void setLoc( String loc) {
        this.loc = loc;
    }
}
