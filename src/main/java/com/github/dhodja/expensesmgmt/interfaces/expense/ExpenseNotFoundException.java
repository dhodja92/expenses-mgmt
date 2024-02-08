package com.github.dhodja.expensesmgmt.interfaces.expense;

import org.springframework.http.HttpStatus;
import org.springframework.web.client.HttpStatusCodeException;

final class ExpenseNotFoundException extends HttpStatusCodeException {

    ExpenseNotFoundException() {
        super(HttpStatus.NOT_FOUND, "Expense does not exist");
    }

}
