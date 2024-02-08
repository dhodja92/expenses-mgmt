package com.github.dhodja.expensesmgmt.domain.model.expense;

import com.github.dhodja.expensesmgmt.PostgresqlContainerConfiguration;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.Import;
import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThat;

@Import(PostgresqlContainerConfiguration.class)
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@DataJpaTest
class ExpenseRepositoryTests {

    @Autowired
    private ExpenseRepository repository;

    @Test
    void findProjectionById_givenNonExistingExpense_ShouldReturnEmptyOptional() {
        assertThat(this.repository.findProjectionById(UUID.randomUUID()).isEmpty());
    }

}
