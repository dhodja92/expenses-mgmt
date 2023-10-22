package com.github.dhodja.expensesmgmt.domain.model.expensecategory;

import com.github.dhodja.expensesmgmt.domain.model.shared.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "expense_category")
public class ExpenseCategory extends BaseEntity {

    @Column(name = "slug")
    private String slug;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    public ExpenseCategory(String slug, String title) {
        this.slug = slug;
        this.title = title;
    }

    public String getSlug() {
        return this.slug;
    }

    public String getTitle() {
        return this.title;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
