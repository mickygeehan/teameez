package controllers;

import model.Account;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController implements BaseAccountController {

    private static final Logger LOG = LoggerFactory.getLogger(AccountController.class);

    @PostMapping(path = "/accounts", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> createAccount(@RequestBody(required = true) final Account account) {
        LOG.info("createAccount() request: {}", account);
        return null;
    }
}
