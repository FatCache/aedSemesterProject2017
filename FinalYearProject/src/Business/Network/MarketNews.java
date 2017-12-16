/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Network;

import java.util.Date;

/**
 *
 * @author abdusamed
 */
public class MarketNews {
    private Date dateAnnounced;
    private String newsDetail;
    private String demandStatus;
    private String newsSubject;
    private Product product;
    

    public String getNewsSubject() {
        return newsSubject;
    }

    public void setNewsSubject(String newsSubject) {
        this.newsSubject = newsSubject;
    }
    
    

    public String getNewsDetail() {
        return newsDetail;
    }

    public void setNewsDetail(String newsDetail) {
        this.newsDetail = newsDetail;
    }

    public String getDemandStatus() {
        return demandStatus;
    }

    public void setDemandStatus(String demandStatus) {
        this.demandStatus = demandStatus;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Date getDateAnnounced() {
        return dateAnnounced;
    }

    public void setDateAnnounced(Date dateAnnounced) {
        this.dateAnnounced = dateAnnounced;
    }

    public String getNews() {
        return newsDetail;
    }

    public void setNews(String news) {
        this.newsDetail = news;
    }    
    
}
