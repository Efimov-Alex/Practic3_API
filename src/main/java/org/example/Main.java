package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
@SpringBootApplication
public class Main {


    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}

// http://localhost:8082/employees/addEmployyer

// {"name":"a", "surname":"b","age":10, "phone_number":"12345"}

// http://localhost:8082/employees/getAllEmployer

// http://localhost:8082/addProduct

// {"name":"a","price":123}