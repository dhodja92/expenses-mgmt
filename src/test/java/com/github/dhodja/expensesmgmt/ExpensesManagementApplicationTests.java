package com.github.dhodja.expensesmgmt;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@SpringBootTest
@Import(PostgresqlContainerConfiguration.class)
class ExpensesManagementApplicationTests {

    @Test
    void contextLoads() {
    }

}
