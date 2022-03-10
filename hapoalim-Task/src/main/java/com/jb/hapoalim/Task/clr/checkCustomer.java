package com.jb.hapoalim.Task.clr;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.jb.hapoalim.Task.models.Customer;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class checkCustomer implements CommandLineRunner {

    private final ObjectMapper objectMapper;


    /* https://jsoneditoronline.org/#left=local.kihihe */
    private String json="{\n" +
            "  \"firstName\":\"elad\",\n" +
            "  \"lastName\": \"avrahami\",\n" +
            "  \"age\": \"18\"\n" +
            "\n" +
            "}\n";



    @Override
    public void run(String... args) throws Exception {

        System.out.println(json);
        Customer customer= objectMapper.readValue(json, Customer.class);

        System.out.println(customer.getFirstName());




    }
}
