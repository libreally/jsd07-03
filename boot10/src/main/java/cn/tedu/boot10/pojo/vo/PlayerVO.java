package cn.tedu.boot10.pojo.vo;

import cn.tedu.boot10.pojo.entity.Team;

public class PlayerVO {
    private Integer id;
    private String name;
    private Team team;

    public PlayerVO() {
    }

    public PlayerVO(Integer id, String name, Team team) {
        this.id = id;
        this.name = name;
        this.team = team;
    }

    @Override
    public String toString() {
        return "PlayerVO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", team=" + team +
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

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }
}
