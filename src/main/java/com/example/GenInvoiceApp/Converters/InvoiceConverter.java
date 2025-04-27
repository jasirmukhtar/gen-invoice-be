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

    public static InvoiceDTO toDTO(InvoiceEntity invoice){

        return InvoiceDTO.builder().
                firstName(invoice.getFirstName()).
                lastName(invoice.getLastName()).
                invoiceDate(invoice.getInvoiceDate()).
                amount(invoice.getAmount()).
                build();
    }
}
