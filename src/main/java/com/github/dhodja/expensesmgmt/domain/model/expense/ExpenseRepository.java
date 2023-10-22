package com.github.dhodja.expensesmgmt.domain.model.expense;

import org.springframework.data.repository.Repository;
import java.util.Optional;
import java.util.UUID;

public interface ExpenseRepository extends Repository<Expense, UUID> {

    Optional<Expense> findById(UUID id);

    Expense save(Expense expense);

}
