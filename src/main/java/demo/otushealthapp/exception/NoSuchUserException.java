package demo.otushealthapp.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(reason = "There is no such user", code = HttpStatus.BAD_REQUEST)
public class NoSuchUserException extends RuntimeException {
}
