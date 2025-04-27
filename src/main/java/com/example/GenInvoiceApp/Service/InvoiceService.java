package com.example.GenInvoiceApp.Service;

import com.example.GenInvoiceApp.Converters.InvoiceConverter;
import com.example.GenInvoiceApp.DTO.InvoiceDTO;
import com.example.GenInvoiceApp.Models.InvoiceEntity;
import com.example.GenInvoiceApp.Repository.InvoiceRepository;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@Data
@AllArgsConstructor
public class InvoiceService {

    private final InvoiceRepository invoiceRepository;

    public void  saveInvoice(InvoiceDTO invoiceDTO){
        InvoiceEntity newInvoice = InvoiceConverter.toEntity(invoiceDTO);
        invoiceRepository.save(newInvoice);

    }
}
