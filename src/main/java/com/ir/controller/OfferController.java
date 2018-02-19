package com.ir.controller;

import com.ir.dto.OfferDto;
import com.ir.service.OfferService;
import org.apache.log4j.Appender;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.List;

@RestController
public class OfferController {
    /**
     * // Offer Api
     app.get('/offercat/getAll',(req,res)=>offerCtrl.getCategory(req,res));
     app.get('/offers/getAll' , (req,res)=>offerCtrl.getResources(req,res));
     //app.get('/offers/getAll' , (req,res)=>OfferCallbackCtrl.getResources(req,res));
     app.get('/offers/get' , (req,res)=>offerCtrl.getResource(req,res));
     app.get('/offers/surveys' , (req,res)=>offerCtrl.getbysurveys(req,res));
     app.get('/offers/getnet' , (req,res)=>offerCtrl.getNet(req,res));
     app.get('/offers/top' , (req,res)=>offerCtrl.getTopResources(req,res));
     app.post('/postback/save' , (req,res)=>offerCtrl.postback(req,res));
     */

    //private static Logger LOGGER = Logger.getLogger(OfferController.class);
    private static final Logger LOGGER = LogManager.getLogger(OfferController.class);

    @Autowired
    private OfferService offerService;


    @RequestMapping(value = "/getOffers",method = RequestMethod.GET)
    public ResponseEntity<Collection<OfferDto>> getResources() {
        List<OfferDto> offers = offerService.getAllOffers();
        Appender appender = LOGGER.getAppender("ConsoleAppender");

        LOGGER.addAppender(appender);
        LOGGER.info("the controller is hit");
        LOGGER.debug("the controller is hit");
        return new ResponseEntity(offers, HttpStatus.OK);
    }

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String getHello(){
        return "Hello";
    }
}
