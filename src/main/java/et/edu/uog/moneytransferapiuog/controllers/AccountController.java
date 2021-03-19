package et.edu.uog.moneytransferapiuog.controllers;

import et.edu.uog.moneytransferapiuog.domains.Account;
import et.edu.uog.moneytransferapiuog.respositories.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 *
 * HTTP Methods:
 * GET
 * POST - save
 * PUT - update
 * DELETE
 *
 * @author Biniam Asnake
 */
@RestController
@RequestMapping("/api/account")
public class AccountController {

    @Autowired
    AccountRepository accountRepository;

    @GetMapping("/list")
    public Iterable<Account> getAllAccounts() {
        return accountRepository.findAll();
    }

    @PostMapping(value = "/create", produces = "application/json")
    public Account createAccount(@RequestBody Account account) {
        return accountRepository.save(account);
    }
}
