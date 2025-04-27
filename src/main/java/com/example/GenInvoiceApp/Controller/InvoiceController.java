package com.example.GenInvoiceApp.Controller;

import com.example.GenInvoiceApp.DTO.InvoiceDTO;
import com.example.GenInvoiceApp.DTO.InvoiceRangeDTO;
import com.example.GenInvoiceApp.Service.InvoiceService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    @GetMapping
    public List<InvoiceDTO> getInvoiceByDateRange(@RequestBody InvoiceRangeDTO invoiceRangeDTO){

        return invoiceService.getInvoicesByDateRange(invoiceRangeDTO);


    }

}
