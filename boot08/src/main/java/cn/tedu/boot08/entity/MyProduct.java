package cn.tedu.boot08.entity;

public class MyProduct {
    private Integer id;
    private String title;
    private Integer saleCount;
    private Integer viewCount;

    public MyProduct() {
    }

    public MyProduct(Integer id, String title, Integer saleCount, Integer viewCount) {
        this.id = id;
        this.title = title;
        this.saleCount = saleCount;
        this.viewCount = viewCount;
    }

    @Override
    public String toString() {
        return "MyProduct{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", saleCount=" + saleCount +
                ", viewCount=" + viewCount +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getSaleCount() {
        return saleCount;
    }

    public void setSaleCount(Integer saleCount) {
        this.saleCount = saleCount;
    }

    public Integer getViewCount() {
        return viewCount;
    }

    public void setViewCount(Integer viewCount) {
        this.viewCount = viewCount;
    }
}
