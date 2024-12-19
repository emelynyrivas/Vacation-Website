package com.example.demo.bootstrap;

import com.example.demo.dao.CustomerRepository;
import com.example.demo.dao.DivisionRepository;
import com.example.demo.entities.Customer;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.Date;


@Component
public class BootStrapData {
    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private DivisionRepository divisionRepository;

    @PostConstruct
    public void loadInitialData() {

        if(customerRepository.count() == 1) {

            Customer hank = new Customer();
            hank.setFirstName("Hank");
            hank.setLastName("Hill");
            hank.setAddress("84 Rainey Street");
            hank.setPhone("214-133-2250");
            hank.setPostal_code("78712");
            hank.setDivision(divisionRepository.findAll().get(2));
            hank.setCreate_date(new Date());
            hank.setLast_update(new Date());


            Customer dale = new Customer();
            dale.setFirstName("Dale");
            dale.setLastName("Gribble");
            dale.setAddress("82 Rainey Street");
            dale.setPhone("214-903-9190");
            dale.setPostal_code("12193");
            dale.setDivision(divisionRepository.findAll().get(3));
            dale.setCreate_date(new Date());
            dale.setLast_update(new Date());


            Customer jeff = new Customer();
            jeff.setFirstName("Jeff");
            jeff.setLastName("Boomhauer");
            jeff.setAddress("73 Rainey Street");
            jeff.setPhone("214-369-1033");
            jeff.setPostal_code("90210");
            jeff.setDivision(divisionRepository.findAll().get(4));
            jeff.setCreate_date(new Date());
            jeff.setLast_update(new Date());


            Customer kahn = new Customer();
            kahn.setFirstName("Kahn");
            kahn.setLastName("Souphanousinphone");
            kahn.setAddress("86 Rainey Street");
            kahn.setPhone("214-722-8765");
            kahn.setPostal_code("52660");
            kahn.setDivision(divisionRepository.findAll().get(5));
            kahn.setCreate_date(new Date());
            kahn.setLast_update(new Date());


            Customer bill = new Customer();
            bill.setFirstName("Bill");
            bill.setLastName("Dauterive");
            bill.setAddress("122 Milton Street");
            bill.setPhone("214-9891-5511");
            bill.setPostal_code("19834");
            bill.setDivision(divisionRepository.findAll().get(6));
            bill.setCreate_date(new Date());
            bill.setLast_update(new Date());


            customerRepository.save(hank);
            customerRepository.save(jeff);
            customerRepository.save(dale);
            customerRepository.save(kahn);
            customerRepository.save(bill);


        }


    }
}