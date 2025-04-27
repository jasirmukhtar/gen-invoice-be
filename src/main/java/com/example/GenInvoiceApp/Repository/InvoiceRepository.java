package com.example.GenInvoiceApp.Repository;

import com.example.GenInvoiceApp.Models.InvoiceEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;


@Repository
public interface InvoiceRepository extends JpaRepository<InvoiceEntity, Long> {

    List<InvoiceEntity> findByInvoiceDateBetween(LocalDateTime from, LocalDateTime to);

}
