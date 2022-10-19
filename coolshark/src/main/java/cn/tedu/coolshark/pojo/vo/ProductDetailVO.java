package cn.tedu.coolshark.pojo.vo;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class ProductDetailVO {
    private Integer id;
    private String title;
    private String url;
    private Double price;
    private Double oldPrice;
    private Integer saleCount;
    private Integer viewCount; //浏览量
    @JsonFormat(timezone = "GTM+8",pattern = "yyyy-MM-dd hh:mm:ss")
    private Date created;  //发布时间   导包Java.util

    public ProductDetailVO() {
    }

    public ProductDetailVO(Integer id, String title, String url, Double price, Double oldPrice, Integer saleCount, Integer viewCount, Date created) {
        this.id = id;
        this.title = title;
        this.url = url;
        this.price = price;
        this.oldPrice = oldPrice;
        this.saleCount = saleCount;
        this.viewCount = viewCount;
        this.created = created;
    }

    @Override
    public String toString() {
        return "ProductDetailVO{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", url='" + url + '\'' +
                ", price=" + price +
                ", oldPrice=" + oldPrice +
                ", saleCount=" + saleCount +
                ", viewCount=" + viewCount +
                ", created=" + created +
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

    public Double getOldPrice() {
        return oldPrice;
    }

    public void setOldPrice(Double oldPrice) {
        this.oldPrice = oldPrice;
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

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }
}
