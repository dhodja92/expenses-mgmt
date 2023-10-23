package com.github.dhodja.expensesmgmt.interfaces.expense;

import com.github.dhodja.expensesmgmt.domain.model.expense.ExpenseRepository;
import java.math.BigDecimal;
import java.util.UUID;

record ExpenseResource(UUID id, BigDecimal cost, String expenseCategorySlug, String description) {

    static ExpenseResource fromProjection(ExpenseRepository.ExpenseProjection expenseProjection) {
        return new ExpenseResource(expenseProjection.getId(), expenseProjection.getCost(),
                expenseProjection.getExpenseCategorySlug(), expenseProjection.getDescription());
    }

}
