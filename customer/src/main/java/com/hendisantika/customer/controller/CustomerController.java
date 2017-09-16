package com.hendisantika.customer.controller;

import com.hendisantika.customer.CustomerApplication;
import com.hendisantika.customer.intercomm.AccountClient;
import com.hendisantika.customer.model.Account;
import com.hendisantika.customer.model.Customer;
import com.hendisantika.customer.model.CustomerType;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : customer
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 9/16/17
 * Time: 7:11 PM
 * To change this template use File | Settings | File Templates.
 */

@RestController
public class CustomerController {
//    @Autowired
    private AccountClient accountClient;

    protected Logger logger = Logger.getLogger(CustomerApplication.class.getName());

    private List<Customer> customers;

    public CustomerController() {
        customers = new ArrayList<>();
        customers.add(new Customer(1, "12345", "Hendi Santika", CustomerType.INDIVIDUAL));
        customers.add(new Customer(2, "12346", "Uzumaki Naruto", CustomerType.INDIVIDUAL));
        customers.add(new Customer(3, "12347", "Hatake Kakashi", CustomerType.INDIVIDUAL));
        customers.add(new Customer(4, "12348", "Uchiha Sasuke", CustomerType.INDIVIDUAL));
        customers.add(new Customer(5, "12349", "Sakura Haruno", CustomerType.INDIVIDUAL));
    }

    @RequestMapping("/customers/pesel/{pesel}")
    public Customer findByPesel(@PathVariable("pesel") String pesel) {
        logger.info(String.format("Customer.findByPesel(%s)", pesel));
        return customers.stream().filter(it -> it.getPesel().equals(pesel)).findFirst().get();
    }

    @RequestMapping("/customers")
    public List<Customer> findAll() {
        logger.info("Customer.findAll()");
        return customers;
    }

    @RequestMapping("/customers/{id}")
    public Customer findById(@PathVariable("id") Integer id) {
        logger.info(String.format("Customer.findById(%s)", id));
        Customer customer = customers.stream().filter(it -> it.getId().intValue()==id.intValue()).findFirst().get();
        List<Account> accounts =  accountClient.getAccounts(id);
        customer.setAccounts(accounts);
        return customer;
    }
}
