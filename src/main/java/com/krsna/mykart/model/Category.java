package com.krsna.mykart.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_category")
public class Category {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cat_generator")
	@SequenceGenerator(name="cat_generator", sequenceName = "cat_seq", allocationSize=1)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @ManyToOne
    @JoinColumn(name = "parentid")
    private Category parent;

    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "categories")
    private Set<Product> products;

    @OneToMany(mappedBy = "parent")
    private Set<Category> childCategories;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category getParent() {
        return parent;
    }

    public void setParent(Category parent) {
        this.parent = parent;
    }

    public Set<Product> getProducts() {
        return products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }

    public Set<Category> getChildCategories() {
        return childCategories;
    }

    public void setChildCategories(Set<Category> childCategories) {
        this.childCategories = childCategories;
    }

}