package cn.tedu.boot07.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class Weibo {
    private Integer id;
    private String content;
    private String url;
    //日期格式 yyyy-MM-dd HH:mm:ss
    //日期格式 yyyy/MM/dd HH:mm:ss
    //日期格式 yyyy年MM月dd HH:mm:ss
    //时区 timezone = "GMT+8"
    @JsonFormat(pattern = "yyyy年MM月dd HH:mm:ss",timezone = "GMT+8")
    private Date created;//日期

    public Weibo() {
    }

    public Weibo(Integer id, String content, String url, Date created) {
        this.id = id;
        this.content = content;
        this.url = url;
        this.created = created;
    }

    @Override
    public String toString() {
        return "Weibo{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", url='" + url + '\'' +
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
}
