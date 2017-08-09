package com.example.controller;


import com.example.dao.CarDAO;
import com.example.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import static org.springframework.http.MediaType.APPLICATION_XML_VALUE;
import static org.springframework.http.MediaType.TEXT_PLAIN_VALUE;

@RestController
public class CarResourceController {

    @Autowired
    CarDAO carDAO;

    /*@RequestMapping(value="car", produces = TEXT_PLAIN_VALUE, method = RequestMethod.GET)
    public String readCarAsPlainTextString() {
        return "vin-100, model-Q7, make-Audi, price-780000000.00, qty-10";
    }

    @RequestMapping(value="car", produces = APPLICATION_XML_VALUE, method = RequestMethod.GET)
    public String readCarAsXMLString() {
        return "<car><vin>100</vin><model>Q7</model><make>Audi</make><price>780000000.00</price><qty>10</qty></car>";
    }

    @RequestMapping(value="car", produces = APPLICATION_JSON_VALUE, method = RequestMethod.GET)
    public String readCarAsJSONString() {
        return "{\"vin\":100, \"model\":\"Q7\", \"make\":\"Audi\", \"price\":780000000.00, \"qty\":10}";
    }
*/
    @RequestMapping(value="car", produces = TEXT_PLAIN_VALUE, method = RequestMethod.GET)
    public Car readCarAsPlainText() {
        Car car = carDAO.readByVin(1000);
        return car;
    }

    @RequestMapping(value="car", produces = APPLICATION_XML_VALUE, method = RequestMethod.GET)
    public Car readCarAsXML() {
        Car car = carDAO.readByVin(1000);
        return car;
    }

    @RequestMapping(value="car", produces = APPLICATION_JSON_VALUE, method = RequestMethod.GET)
    public Car readCarAsJSON() {
        Car car = carDAO.readByVin(1000);
        return car;
    }

//    dynamic url
    @RequestMapping(value="car/{vin}", produces = APPLICATION_JSON_VALUE, method = RequestMethod.GET)
    public Car readCarAsJSONByVin(@PathVariable Integer vin) {
        Car car = carDAO.readByVin(vin);
        return car;
    }

//    save new entry
    @RequestMapping(value="add", consumes = APPLICATION_JSON_VALUE, produces = APPLICATION_JSON_VALUE, method = RequestMethod.POST)
    public Car addNewEntry(@RequestBody Car car) {
        System.out.println("HIIIIIII");
        System.out.println(car);
        int value = carDAO.save(car);
        return car;
//        return "Car with id: " + value + " added succesfully";
    }

    @RequestMapping(value="update/{vin}", consumes = APPLICATION_JSON_VALUE, produces = TEXT_PLAIN_VALUE, method = RequestMethod.PUT)
    public String updateCar(@RequestBody Car car, @PathVariable Integer vin) {
        int value = carDAO.update(vin, car);
        return "Car with id: " + value + " updated succesfully";
    }

    @RequestMapping(value="delete/{vin}", produces = TEXT_PLAIN_VALUE, method = RequestMethod.DELETE)
    public String deleteCar(@PathVariable Integer vin) {
        carDAO.delete(vin);
        return "Car with id: " + vin + " deleted succesfully";
    }

    @RequestMapping(value="cars", produces = APPLICATION_JSON_VALUE, method = RequestMethod.GET)
    public Collection<Car> showAllCars() {
        return carDAO.selectAll();
    }

}
