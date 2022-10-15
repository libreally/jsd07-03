package cn.tedu.weibo.pojo.dto;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class WeiboDTO {
    private String content;
    private String url;


    public WeiboDTO() {
    }

    public WeiboDTO(String content, String url ) {
        this.content = content;
        this.url = url;

    }

    @Override
    public String toString() {
        return "WeiboDTO{" +
                "content='" + content + '\'' +
                ", url='" + url + '\'' +
                '}';
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

}
