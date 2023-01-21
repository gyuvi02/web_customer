package org.gyula.controller;

import org.gyula.dao.CustomerDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerDAO customerDAO;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String listCustomers(Model model) throws Exception {
        model.addAttribute(customerDAO.getCustomers());

        return "list-customers";
    }
}
