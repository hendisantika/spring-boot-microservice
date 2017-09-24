package com.hendisantika.account.api;

import com.hendisantika.account.model.Account;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 * Project : account
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 9/15/17
 * Time: 7:58 AM
 * To change this template use File | Settings | File Templates.
 */

@RestController
public class AccountController {

    @RequestMapping("/{id}")
    public Account findAccountById(@PathVariable("id") Integer id) {
        return new Account(id, 1, "123456789", 1234);
    }

    @RequestMapping("/customer/{customerId}")
    public Account findAccountByCustomerId(@PathVariable("customerId") Integer customerId) {
        return new Account(1, customerId, "123456789", 1234);
    }

    @RequestMapping("/")
    public Account findAccount() {
        return new Account(1, 1, "123456789", 1234);
    }
}
