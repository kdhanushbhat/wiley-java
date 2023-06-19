package com.example.demo.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.PassengerInfo;
import com.example.demo.model.PaymentInfo;
import com.example.demo.repository.PassengerInfoRepo;
import com.example.demo.repository.PaymentInfoRepo;
import com.example.demo.request.model.FlightBookingRequest;
import com.example.demo.response.model.FlightBookingAck;
import com.example.demo.util.PaymentUtil;

import jakarta.transaction.Transactional;

@Service
public class FlightBookingService {
    @Autowired
    private PassengerInfoRepo passengerRepo;
    @Autowired
    private PaymentInfoRepo payRepo;

    @Transactional
    public FlightBookingAck bookFlightTicket(FlightBookingRequest request) {
        PassengerInfo passengerInfo = request.getPassengerInfo();

        passengerInfo = passengerRepo.save(passengerInfo);

        PaymentInfo paymentInfo = request.getPaymentInfo();
        PaymentUtil.validateCreditlimit(paymentInfo.getAccountNo(),
                passengerInfo.getFare());
        paymentInfo.setPassengerId(passengerInfo.getPId());
        paymentInfo.setAmount(passengerInfo.getFare());
        payRepo.save(paymentInfo);
        return new FlightBookingAck("SUCCESS", passengerInfo.getFare(), UUID.randomUUID().toString().split("-")[0],
                passengerInfo);
    }
}
