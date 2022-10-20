package cn.tedu.weibo.pojo.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class Weibo {
    private Integer id;
    private String content;
    private String url;
    @JsonFormat(pattern = "yyyy年MM月dd HH:mm:ss",timezone = "GMT+8")
    private Date created;//日期
    private Integer userId;//作者id

    public Weibo() {
    }

    public Weibo(Integer id, String content, String url, Date created, Integer userId) {
        this.id = id;
        this.content = content;
        this.url = url;
        this.created = created;
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "weibo{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", url='" + url + '\'' +
                ", created=" + created +
                ", userId=" + userId +
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

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}
