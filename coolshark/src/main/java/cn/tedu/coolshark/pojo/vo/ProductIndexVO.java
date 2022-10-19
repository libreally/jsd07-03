package cn.tedu.coolshark.pojo.vo;

public class ProductIndexVO {
    private Integer id;
    private String title;
    private String url;
    private Double price;
    private Integer viewCount;
    private Integer saleCount;

    public ProductIndexVO() {
    }

    public ProductIndexVO(Integer id, String title, String url, Double price, Integer viewCount, Integer saleCount) {
        this.id = id;
        this.title = title;
        this.url = url;
        this.price = price;
        this.viewCount = viewCount;
        this.saleCount = saleCount;
    }

    @Override
    public String toString() {
        return "ProductIndexVO{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", url='" + url + '\'' +
                ", price=" + price +
                ", viewCount=" + viewCount +
                ", saleCount=" + saleCount +
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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getViewCount() {
        return viewCount;
    }

    public void setViewCount(Integer viewCount) {
        this.viewCount = viewCount;
    }

    public Integer getSaleCount() {
        return saleCount;
    }

    public void setSaleCount(Integer saleCount) {
        this.saleCount = saleCount;
    }
}
