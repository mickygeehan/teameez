package web.services;

import web.model.Account;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface AccountService {
    Account createAccount(final Account account);
    List<Account> getAllAccounts();
    Account getAccountById(String id);
}
