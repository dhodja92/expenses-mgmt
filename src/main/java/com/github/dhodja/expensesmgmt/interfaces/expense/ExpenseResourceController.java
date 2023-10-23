package com.github.dhodja.expensesmgmt.interfaces.expense;

import com.github.dhodja.expensesmgmt.domain.model.expense.ExpenseRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.util.UUID;

@RestController(value = "/api/expenses")
class ExpenseResourceController {

    private final ExpenseRepository expenseRepository;

    ExpenseResourceController(ExpenseRepository expenseRepository) {
        this.expenseRepository = expenseRepository;
    }

    @GetMapping(path = "/{id}")
    ResponseEntity<ExpenseResource> getExpenseById(@PathVariable("id") UUID id) {
        ExpenseRepository.ExpenseProjection expense = this.expenseRepository.findProjectionById(id).orElseThrow(ExpenseNotFoundException::new);
        ExpenseResource resource = ExpenseResource.fromProjection(expense);
        return ResponseEntity.ok(resource);
    }

}
