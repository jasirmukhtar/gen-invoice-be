package com.example.GenInvoiceApp.Service;

import com.example.GenInvoiceApp.Converters.InvoiceConverter;
import com.example.GenInvoiceApp.DTO.InvoiceDTO;
import com.example.GenInvoiceApp.DTO.InvoiceRangeDTO;
import com.example.GenInvoiceApp.Models.InvoiceEntity;
import com.example.GenInvoiceApp.Repository.InvoiceRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
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

    public Page<InvoiceDTO> getInvoicesByDateRange(InvoiceRangeDTO invoiceRangeDTO, Pageable pageable) {

        Page<InvoiceEntity> invoiceEntities = invoiceRepository.
                findByInvoiceDateBetween(invoiceRangeDTO.getFrom(), invoiceRangeDTO.getTo(),pageable);
        return invoiceEntities.map(InvoiceConverter::toDTO);
    }

    public List<InvoiceDTO> getInvoiceBySearch(String search) {

        List<InvoiceEntity> invoiceEntities = invoiceRepository.findInvoiceBySearch(search);
        return invoiceEntities.stream().map(InvoiceConverter::toDTO).collect(Collectors.toList());
    }
}