package com.luv4code.lfcssm.repository;

import com.luv4code.lfcssm.domain.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
}
