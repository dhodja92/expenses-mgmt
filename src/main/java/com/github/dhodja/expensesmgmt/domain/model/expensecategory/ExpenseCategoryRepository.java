package com.github.dhodja.expensesmgmt.domain.model.expensecategory;

import org.springframework.data.repository.Repository;
import java.util.Optional;
import java.util.UUID;

public interface ExpenseCategoryRepository extends Repository<ExpenseCategory, UUID> {

    Optional<ExpenseCategory> findById(UUID id);

}
