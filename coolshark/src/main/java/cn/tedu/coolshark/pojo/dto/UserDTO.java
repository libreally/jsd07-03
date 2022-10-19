package cn.tedu.coolshark.pojo.dto;

public class UserDTO {
    private String username;
    private String password;
    private Boolean rem;

    public UserDTO() {
    }

    public UserDTO(String username, String password,Boolean rem) {
        this.username = username;
        this.password = password;
        this.rem=rem;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", rem=" + rem +
                '}';
    }

    public Boolean getRem() {
        return rem;
    }

    public void setRem(Boolean rem) {
        this.rem = rem;
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
}

