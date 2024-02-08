package com.github.dhodja.expensesmgmt.domain.model.expense;

import com.github.dhodja.expensesmgmt.domain.model.expensecategory.ExpenseCategory;
import com.github.dhodja.expensesmgmt.domain.model.shared.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.math.BigDecimal;
import java.util.Objects;
import java.util.UUID;

@Entity
@Table(name = "expense")
public class Expense extends BaseEntity {

    @Column(name = "cost")
    private BigDecimal cost;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "expense_category_id")
    private ExpenseCategory expenseCategory;

    public Expense(BigDecimal cost, ExpenseCategory expenseCategory) {
        super(UUID.randomUUID());
        Objects.requireNonNull(cost, "cost must not be null");
        Objects.requireNonNull(expenseCategory, "expenseCategory must not be null");
        this.cost = cost;
        this.expenseCategory = expenseCategory;
    }

    public BigDecimal getCost() {
        return this.cost;
    }

    public ExpenseCategory getExpenseCategory() {
        return this.expenseCategory;
    }

}
