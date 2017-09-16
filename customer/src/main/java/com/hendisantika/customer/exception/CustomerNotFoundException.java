package com.hendisantika.customer.exception;

/**
 * Created by IntelliJ IDEA.
 * Project : customer
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 9/16/17
 * Time: 7:07 PM
 * To change this template use File | Settings | File Templates.
 */
public class CustomerNotFoundException extends Exception {
    private static final long serialVersionUID = 1L;

    public CustomerNotFoundException(String pesel) {
        super("No such customer: " + pesel);
    }
}
