package com.onlineOrder.service;


import com.onlineOrder.dao.CustomerDao;
import com.onlineOrder.entity.Cart;
import com.onlineOrder.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;


@Service
public class CustomerService {


    private CustomerDao customerDao;
    private PasswordEncoder passwordEncoder;




    @Autowired
    public CustomerService(CustomerDao customerDao, PasswordEncoder passwordEncoder) {
        this.customerDao = customerDao;
        this.passwordEncoder = passwordEncoder;
    }


    public void signUp(Customer customer) {
        Cart cart = new Cart();
        customer.setCart(cart);
        customer.setEnabled(true);
        customer.setPassword(passwordEncoder.encode(customer.getPassword()));
        customerDao.signUp(customer);
    }


    public Customer getCustomer(String email) {
        return customerDao.getCustomer(email);
    }


}
