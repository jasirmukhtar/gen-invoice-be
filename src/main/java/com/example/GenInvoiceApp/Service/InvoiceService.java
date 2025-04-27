package com.example.GenInvoiceApp.Service;

import com.example.GenInvoiceApp.Converters.InvoiceConverter;
import com.example.GenInvoiceApp.DTO.InvoiceDTO;
import com.example.GenInvoiceApp.DTO.InvoiceRangeDTO;
import com.example.GenInvoiceApp.Models.InvoiceEntity;
import com.example.GenInvoiceApp.Repository.InvoiceRepository;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Data
@AllArgsConstructor
public class InvoiceService {

    private final InvoiceRepository invoiceRepository;

    public void saveInvoice(InvoiceDTO invoiceDTO) {
        InvoiceEntity newInvoice = InvoiceConverter.toEntity(invoiceDTO);
        invoiceRepository.save(newInvoice);

    }

    public List<InvoiceDTO> getInvoicesByDateRange(InvoiceRangeDTO invoiceRangeDTO) {
        List<InvoiceEntity> invoiceEntities = invoiceRepository.
                findByInvoiceDateBetween(invoiceRangeDTO.getFrom(),
                        invoiceRangeDTO.getTo());

        return invoiceEntities.stream().
                map(InvoiceConverter::toDTO)
                .collect(Collectors.toList());

    }
}
