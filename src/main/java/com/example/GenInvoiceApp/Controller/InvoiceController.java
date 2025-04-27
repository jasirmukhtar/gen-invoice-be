package com.example.GenInvoiceApp.Controller;

import com.example.GenInvoiceApp.DTO.InvoiceDTO;
import com.example.GenInvoiceApp.Service.InvoiceService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("api/invoice")
@AllArgsConstructor
public class InvoiceController {

    private final InvoiceService invoiceService;

    @PostMapping
    public String saveInvoice(@RequestBody InvoiceDTO invoiceDTO){
        invoiceService.saveInvoice(invoiceDTO);
        return "Saved Invoice";

    }

}
