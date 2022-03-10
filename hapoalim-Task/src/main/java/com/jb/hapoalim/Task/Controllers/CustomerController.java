package com.jb.hapoalim.Task.Controllers;



import com.jb.hapoalim.Task.Srvice.ChackCustomerService;
import com.jb.hapoalim.Task.models.Customer;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/customer")
public class CustomerController {

   // private final ChackCustomerService chackCustomerService;


    @PostMapping("/checkCustomer")
    public ResponseEntity<String> checkCustomer(@Valid @RequestBody Customer customerDto)  {

        return new ResponseEntity<String>("SUCCESS", HttpStatus.CREATED);

    }


/*
    @PostMapping("addCustomer") //http://localhost:8080/coupons/addCustomer
    @ResponseStatus(code = HttpStatus.CREATED)
    public  void createCustomer(@RequestBody Customer customer) throws Exception{
        try {


        }
    }
*/


}
