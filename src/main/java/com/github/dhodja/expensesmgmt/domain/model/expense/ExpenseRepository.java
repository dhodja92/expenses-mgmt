package com.github.dhodja.expensesmgmt.domain.model.expense;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import java.math.BigDecimal;
import java.util.Optional;
import java.util.UUID;

public interface ExpenseRepository extends Repository<Expense, UUID> {

    Optional<Expense> findById(UUID id);

    @Query(value = """
            select cast(e.id as varchar) as id, e.cost, ec.slug, e.description
            from expense e
            join expense_category ec on e.expense_category_id = ec.id
            where e.id = :id
            """, nativeQuery = true)
    Optional<ExpenseProjection> findProjectionById(UUID id);

    Expense save(Expense expense);

    interface ExpenseProjection {

        UUID getId();

        BigDecimal getCost();

        String getExpenseCategorySlug();

        String getDescription();

    }

}
