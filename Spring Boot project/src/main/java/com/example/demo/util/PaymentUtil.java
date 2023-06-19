package com.example.demo.util;

import java.util.HashMap;
import java.util.Map;

import com.example.demo.exception.InsufficientAmountException;

public class PaymentUtil {
    private static Map<String, Double> paymentMap = new HashMap<>();
    static {
        paymentMap.put("ac_1", 9000.0);
        paymentMap.put("ac_2", 12000.0);
        paymentMap.put("ac_3", 6000.0);
        paymentMap.put("ac_4", 4000.0);

    }

    public static boolean validateCreditlimit(String accNo, double paidAmount) {
        if (paidAmount > paymentMap.get(accNo)) {
            throw new InsufficientAmountException("Insufficient Balance...!");
        } else {
            return true;
        }
    }
}