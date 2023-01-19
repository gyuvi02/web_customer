package org.gyula.dao;

import org.gyula.entity.Customer;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerDAO {

    public List<Customer> getCustomers();
}
