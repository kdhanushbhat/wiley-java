package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.request.model.FlightBookingRequest;
import com.example.demo.response.model.FlightBookingAck;
import com.example.demo.service.FlightBookingService;

@RequestMapping(value = "/api/v1")
@RestController
public class TransactionController {
    @Autowired
    private FlightBookingService service;

    @PostMapping("/bookFlightTicket")
    public FlightBookingAck bookFlightTicket(@RequestBody FlightBookingRequest request) {
        return service.bookFlightTicket(request);
    }
}
