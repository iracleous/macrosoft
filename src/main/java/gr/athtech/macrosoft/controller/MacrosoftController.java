package gr.athtech.macrosoft.controller;


import gr.athtech.macrosoft.model.Customer;
import gr.athtech.macrosoft.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
public class MacrosoftController {
    @Autowired
    private CustomerRepository customerRepository;

        @GetMapping("/create")
    public Customer showACustomer (){
            Customer customer = new Customer();
            customer.setName("Ioannis");
            customer.setAge(30);
            customer.setEmail("ioannis@email.com");
            customer.setRegistrationDate(new Date());

            customerRepository.save(customer);

            return customer;

        }

    @GetMapping("/all")
    public List<Customer> getAllCustomers (){
      return  customerRepository.findAll();

    }



}
