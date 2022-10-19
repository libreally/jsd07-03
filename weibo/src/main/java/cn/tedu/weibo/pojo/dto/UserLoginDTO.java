package cn.tedu.weibo.pojo.dto;

public class UserLoginDTO {
    private String username;
    private String password;
    private Boolean rem;

    public UserLoginDTO() {
    }

    public UserLoginDTO(String username, String password,Boolean rem) {
        this.username = username;
        this.password = password;
        this.rem=rem;
    }

    @Override
    public String toString() {
        return "UserLoginDTO{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", rem=" + rem +
                '}';
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getRem() {
        return rem;
    }

    public void setRem(Boolean rem) {
        this.rem = rem;
    }
}
