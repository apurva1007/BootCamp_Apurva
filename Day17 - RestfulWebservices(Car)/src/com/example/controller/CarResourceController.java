package com.example.controller;


import com.example.dao.CarDAO;
import com.example.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import static org.springframework.http.MediaType.APPLICATION_XML_VALUE;
import static org.springframework.http.MediaType.TEXT_PLAIN_VALUE;

@RestController
public class CarResourceController {

    @Autowired
    CarDAO carDAO;

    @RequestMapping(value="car", produces = TEXT_PLAIN_VALUE, method = RequestMethod.GET)
    public String readCar() {
//        return "vin-100, model-Q7, make-Audi, price-780000000.00, qty-10";
        Car car = carDAO.readByVin(1000);
        return car.toString();

    }

    @RequestMapping(value="car", produces = APPLICATION_XML_VALUE, method = RequestMethod.GET)
    public Car readCarAsXML() {
//        return "<car><vin>100</vin><model>Q7</model><make>Audi</make><price>780000000.00</price><qty>10</qty></car>";
        Car car = carDAO.readByVin(1000);
        return car;
    }

    @RequestMapping(value="car", produces = APPLICATION_JSON_VALUE, method = RequestMethod.GET)
    public Car readCarAsJSON() {
//        return "{\"vin\":100, \"model\":\"Q7\", \"make\":\"Audi\", \"price\":780000000.00, \"qty\":10}";
        Car car = carDAO.readByVin(1000);
        return car;
    }
}
