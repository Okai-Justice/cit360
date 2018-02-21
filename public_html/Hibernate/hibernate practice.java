package net.codejava.hibernate;
 
import java.util.Set;
 
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;
 
@Entity
@Table(name = "Inventory")
public class Inventory {
 
    private long id;
    private String name;
 
    private Set<Article> articles;
 
    public Inventory() {
    }
 
    public Inventory(String name) {
        this.name = name;
    }
 
    @Id
    @GeneratedValue
    @Column(name = "Inventory_ID")
    public long getId() {
        return id;
    }
 
    @OneToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "Inventory_ARTICLE",
            joinColumns = @JoinColumn(name = "Inventory_ID"),
            inverseJoinColumns = @JoinColumn(name = "ARTICLE_ID")
    )
 
 
}