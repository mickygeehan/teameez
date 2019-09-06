package web.services;

import web.model.Account;
import org.springframework.stereotype.Component;

@Component
public interface AccountService {
    Account createAccount(final Account account);
}
