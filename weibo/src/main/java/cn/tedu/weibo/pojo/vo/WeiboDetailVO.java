package cn.tedu.weibo.pojo.vo;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class WeiboDetailVO {
    private Integer id;
    private String content;
    private String url;
    @JsonFormat(pattern = "yyyy年MM月dd HH:mm:ss",timezone = "GMT+8")
    private Date created;//日期
    private String nickname;//作者昵称

    public WeiboDetailVO() {
    }

    public WeiboDetailVO(Integer id, String content, String url, Date created, String nickname) {
        this.id = id;
        this.content = content;
        this.url = url;
        this.created = created;
        this.nickname = nickname;
    }

    @Override
    public String toString() {
        return "WeiboDetailVO{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", url='" + url + '\'' +
                ", created=" + created +
                ", nickname='" + nickname + '\'' +
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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}
