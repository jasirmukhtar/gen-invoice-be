package com.example.GenInvoiceApp.Repository;

import com.example.GenInvoiceApp.Models.InvoiceEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;


@Repository
public interface InvoiceRepository extends JpaRepository<InvoiceEntity, Long> {

    Page<InvoiceEntity> findByInvoiceDateBetween(LocalDateTime from, LocalDateTime to, Pageable pageable);

    @Query("""
   SELECT ie
   FROM InvoiceEntity ie
   WHERE CAST(ie.amount AS string) LIKE CONCAT('%', :search, '%')
      OR ie.firstName LIKE CONCAT('%', :search, '%')
      OR ie.lastName LIKE CONCAT('%', :search, '%')
""")
    List<InvoiceEntity> findInvoiceBySearch(
            @Param("search") String search);
}
