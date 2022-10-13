package cn.tedu.boot10.pojo.entity;

public class Player {
    private Integer id;
    private String name;
    private Integer teamId;

    public Player() {
    }

    public Player(Integer id, String name, Integer teamId) {
        this.id = id;
        this.name = name;
        this.teamId = teamId;
    }

    @Override
    public String toString() {
        return "Player{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", teamId=" + teamId +
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

    public Integer getTeamId() {
        return teamId;
    }

    public void setTeamId(Integer teamId) {
        this.teamId = teamId;
    }
}

