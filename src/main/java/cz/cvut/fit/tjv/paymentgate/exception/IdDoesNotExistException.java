package cz.cvut.fit.tjv.paymentgate.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class IdDoesNotExistException extends ResponseStatusException {

    public IdDoesNotExistException() {
        super(HttpStatus.NOT_FOUND, "Id that you provided doesn't exist in the database");
    }
}
