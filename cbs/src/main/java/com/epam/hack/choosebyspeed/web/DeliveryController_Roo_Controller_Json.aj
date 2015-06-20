// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.epam.hack.choosebyspeed.web;

import com.epam.hack.choosebyspeed.domain.Customer;
import com.epam.hack.choosebyspeed.domain.Delivery;
import com.epam.hack.choosebyspeed.web.DeliveryController;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

privileged aspect DeliveryController_Roo_Controller_Json {
    
    @RequestMapping(params = "find=ByCustomer", headers = "Accept=application/json")
    @ResponseBody
    public ResponseEntity<String> DeliveryController.jsonFindDeliverysByCustomer(@RequestParam("customer") Customer customer) {
        HttpHeaders headers = new HttpHeaders();
        try {
            headers.add("Content-Type", "application/json; charset=utf-8");
            return new ResponseEntity<String>(Delivery.toJsonArray(Delivery.findDeliverysByCustomer(customer).getResultList()), headers, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<String>("{\"ERROR\":"+e.getMessage()+"\"}", headers, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    
}
