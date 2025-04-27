package com.example.GenInvoiceApp.DTO;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Builder
@Data
public class InvoiceDTO {

    private LocalDateTime invoiceDate;
    private String firstName;
    private String lastName;
    private Integer amount;
}
