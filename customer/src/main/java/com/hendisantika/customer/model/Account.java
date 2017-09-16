package com.hendisantika.customer.model;

/**
 * Created by IntelliJ IDEA.
 * Project : customer
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 9/16/17
 * Time: 7:03 PM
 * To change this template use File | Settings | File Templates.
 */

public class Account {
    private Integer id;
    private String number;

    public Account() {

    }

    public Account(Integer id, String number) {
        super();
        this.id = id;
        this.number = number;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
