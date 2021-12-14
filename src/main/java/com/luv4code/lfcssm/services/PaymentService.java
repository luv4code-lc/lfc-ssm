package com.luv4code.lfcssm.services;

import com.luv4code.lfcssm.domain.Payment;
import com.luv4code.lfcssm.domain.PaymentEvent;
import com.luv4code.lfcssm.domain.PaymentState;
import org.springframework.statemachine.StateMachine;

public interface PaymentService {
    Payment newPayment(Payment payment);

    StateMachine<PaymentState, PaymentEvent> preAuth(Long paymentId);

    StateMachine<PaymentState, PaymentEvent> authorizePayment(Long paymentId);

    StateMachine<PaymentState, PaymentEvent> declineAuth(Long paymentId);
}
