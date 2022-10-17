package cn.tedu.weibo01.pojo.vo;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

/**
 * 列表页面 谁说了什么
 */
public class WeiboListVO {
    private Integer id;
    private String content;
    private String nickname;
    @JsonFormat(pattern = "yyyy年MM月dd HH:mm:ss",timezone = "GMT+8")
    private Date created;

    public WeiboListVO() {
    }

    public WeiboListVO(Integer id, String content, String nickname, Date created) {
        this.id = id;
        this.content = content;
        this.nickname = nickname;
        this.created = created;
    }

    @Override
    public String toString() {
        return "WeiboListVO{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", nickname='" + nickname + '\'' +
                ", created=" + created +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }
}
