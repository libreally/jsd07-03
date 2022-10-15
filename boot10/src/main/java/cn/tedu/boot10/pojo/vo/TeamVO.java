package cn.tedu.boot10.pojo.vo;

import cn.tedu.boot10.pojo.entity.Player;

import java.util.List;

public class TeamVO {
    private Integer id;
    private String name;
    private String loc;
    private List<Player> playerList;

    public TeamVO() {
    }

    public TeamVO(Integer id, String name, String loc, List<Player> playerList) {
        this.id = id;
        this.name = name;
        this.loc = loc;
        this.playerList = playerList;
    }

    @Override
    public String toString() {
        return "TeamVO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", loc='" + loc + '\'' +
                ", playerList=" + playerList +
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

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    public List<Player> getPlayerList() {
        return playerList;
    }

    public void setPlayerList(List<Player> playerList) {
        this.playerList = playerList;
    }
}
