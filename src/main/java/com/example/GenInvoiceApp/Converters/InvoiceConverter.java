package com.example.GenInvoiceApp.Converters;

import com.example.GenInvoiceApp.DTO.InvoiceDTO;
import com.example.GenInvoiceApp.Models.InvoiceEntity;

public class InvoiceConverter {

    public static InvoiceEntity toEntity(InvoiceDTO invoiceDTO){

       return InvoiceEntity.builder().
                firstName(invoiceDTO.getFirstName()).
                lastName(invoiceDTO.getLastName()).
                invoiceDate(invoiceDTO.getInvoiceDate()).
                amount(invoiceDTO.getAmount()).
                build();

    }
}
