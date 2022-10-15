package cn.tedu.weibo.pojo.dto;

public class CommentDTO {
    private Integer weiboId;
    private String content;

    public CommentDTO() {
    }

    public CommentDTO(Integer weiboId, String content) {
        this.weiboId = weiboId;
        this.content = content;
    }

    @Override
    public String toString() {
        return "CommentDTO{" +
                "weiboId=" + weiboId +
                ", content='" + content + '\'' +
                '}';
    }

    public Integer getWeiboId() {
        return weiboId;
    }

    public void setWeiboId(Integer weiboId) {
        this.weiboId = weiboId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
