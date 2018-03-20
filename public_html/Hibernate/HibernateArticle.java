package net.codejava.hibernate;
 
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
 
@Entity
@Table(name = "ARTICLE")
public class Article {
    private long id;
    private String title;
    private String description;
    private String keywords;
    private String content;
 
    public Article() {
    }
 
    public Article(String title, String description, String keywords,
            String content) {
        this.title = title;
        this.description = description;
        this.keywords = keywords;
        this.content = content;
    }
 
    @Id
    @GeneratedValue
    @Column(name = "ARTICLE_ID")
    public long getId() {
        return id;
    }
 
    // other getters and setters...
}