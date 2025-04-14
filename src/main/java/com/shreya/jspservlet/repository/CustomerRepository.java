package com.shreya.jspservlet.repository;

import com.shreya.jspservlet.model.Customer;

import java.sql.Connection;

public class CustomerRepository {

    public boolean insertCustomer(Customer customer){
        String query = "Insert into customer (id , name , city , mobileNo , age ) values (? , ? , ? , ? , ?)";

        //try (Connection connection = new C)
    }

}
