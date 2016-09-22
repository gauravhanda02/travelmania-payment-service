package com.mnfalcons.travelmania.service;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/*******************************************************************************
 * ${FILE_NAME}
 * <p/>
 * Copyright 2015 Ameriprise Financial, Inc. All rights reserved.
 * Proprietary and Confidential. Use is subject to license terms.
 * <p/>
 * Created on : 9/19/2016
 * Author(s)  : ghanda1
 ******************************************************************************/

@RestController
public class PaymentService {
    public PaymentService() {
        System.out.println("Inside FlightService");
    }

    @RequestMapping(value = "/payments", method = RequestMethod.GET)
    public String getPaymentOptions()
    {
        return "Response from Payment";
    }

    @RequestMapping(value = "/payments/{id}", method = RequestMethod.GET)
    public String getPaymentOptions(@PathVariable("id") String paymentId) {
        return "Response from Payment " + paymentId;
    }


}
