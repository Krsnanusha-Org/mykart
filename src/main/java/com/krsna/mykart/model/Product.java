package com.krsna.mykart.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_product")
public class Product {

	
    public static final String CURRENCY = "EUR";
    
    @Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "product_generator")
	@SequenceGenerator(name="product_generator", sequenceName = "prod_seq", allocationSize=1)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @ManyToMany
    @JoinTable(name = "tbl_product_category", joinColumns = @JoinColumn(name = "productid"), inverseJoinColumns = @JoinColumn(name = "categoryid"))
    private Set<Category> categories;

    @Column(name = "price", nullable = false)
    private double price;

    @ManyToOne
    @JoinColumn(name = "userid", nullable = false, updatable = false)
    private User user;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Category> getCategories() {
        return categories;
    }

    public void setCategories(Set<Category> categories) {
        this.categories = categories;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}
