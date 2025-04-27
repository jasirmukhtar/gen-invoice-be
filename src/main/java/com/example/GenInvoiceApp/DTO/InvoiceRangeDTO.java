package com.example.GenInvoiceApp.DTO;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class InvoiceRangeDTO {
    private LocalDateTime from;
    private LocalDateTime to;
}
