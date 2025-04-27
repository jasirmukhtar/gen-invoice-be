package com.example.GenInvoiceApp.Repository;

import com.example.GenInvoiceApp.Models.InvoiceEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface InvoiceRepository extends JpaRepository<InvoiceEntity, Long> {

}
