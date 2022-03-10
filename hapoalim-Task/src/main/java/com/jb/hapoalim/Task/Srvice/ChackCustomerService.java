package com.jb.hapoalim.Task.Srvice;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ChackCustomerService {

   // private final ObjectMapper objectMapper=new ObjectMapper();

    public void checkCustomerJson(String json){

        /*ObjectMapper objectMapper = new ObjectMapper();

        URL url = new URL("file:data/car.json");

        Car car = objectMapper.readValue(url, Car.class);*/

    }


}
