package cn.tedu.coolshark.pojo.vo;

public class UserVO {
    private Integer id;
    private String password;
    private String nickname;

    public UserVO() {
    }

    public UserVO(Integer id, String password, String nickname) {
        this.id = id;
        this.password = password;
        this.nickname = nickname;
    }

    @Override
    public String toString() {
        return "UserVO{" +
                "id=" + id +
                ", password='" + password + '\'' +
                ", nickname='" + nickname + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}
