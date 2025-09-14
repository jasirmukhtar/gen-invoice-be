package com.example.GenInvoiceApp.Controller;

import com.example.GenInvoiceApp.DTO.InvoiceDTO;
import com.example.GenInvoiceApp.DTO.InvoiceRangeDTO;
import com.example.GenInvoiceApp.Service.InvoiceService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/invoice")
@RequiredArgsConstructor
public class InvoiceController {

    private final InvoiceService invoiceService;


    @PostMapping
    public String saveInvoice(@RequestBody InvoiceDTO invoiceDTO){
        invoiceService.saveInvoice(invoiceDTO);
        return "Saved Invoice";
    }
    @GetMapping
    public Page<InvoiceDTO> getInvoiceByDateRange(@RequestBody InvoiceRangeDTO invoiceRangeDTO,
                                                  @PageableDefault(page = 0, size = 20)Pageable pageable){

        return invoiceService.getInvoicesByDateRange(invoiceRangeDTO, pageable);
    }
}
