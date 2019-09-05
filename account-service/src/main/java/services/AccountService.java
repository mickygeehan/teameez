package services;

import model.Account;
import org.springframework.stereotype.Component;

@Component
public interface AccountService {
    Account createAccount(final Account account);
}
