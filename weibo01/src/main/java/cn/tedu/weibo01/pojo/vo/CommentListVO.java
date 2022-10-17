package cn.tedu.weibo01.pojo.vo;

public class CommentListVO {
    private Integer id;
    private String content;
    private Integer weiboId;
    private Integer userId;

    public CommentListVO() {
    }

    public CommentListVO(Integer id,String content, Integer weiboId, Integer userId) {
        this.id=id;
        this.content = content;
        this.weiboId = weiboId;
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "CommentListVO{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", weiboId=" + weiboId +
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

    public Integer getWeiboId() {
        return weiboId;
    }

    public void setWeiboId(Integer weiboId) {
        this.weiboId = weiboId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}
