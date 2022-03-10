package com.jb.hapoalim.Task;

import com.jb.hapoalim.Task.Art.Util;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HapoalimTaskApplication {

	public static void main(String[] args) {
		SpringApplication.run(HapoalimTaskApplication.class, args);
		System.out.println(Util.START_SPRING);
	}

}
