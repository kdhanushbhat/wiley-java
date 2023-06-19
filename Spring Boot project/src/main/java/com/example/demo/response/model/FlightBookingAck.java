package com.example.demo.response.model;

import com.example.demo.model.PassengerInfo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FlightBookingAck {
    private String status;
    private double totalFare;
    private String pnrno;
    private PassengerInfo passengerInfo;
}
