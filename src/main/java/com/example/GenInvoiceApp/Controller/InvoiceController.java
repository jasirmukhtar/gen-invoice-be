package com.example.GenInvoiceApp.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/home")
public class InvoiceController {

    @GetMapping
    public String HelloWorld(){
        return "Hello World from BE";
    }

}
