package com.ir.service.impl;

import com.ir.model.Offer;
import com.ir.dao.impl.OfferDaoImpl;
import com.ir.service.OfferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OfferServiceImpl implements OfferService {

    @Autowired
    private OfferDaoImpl offerDao;

    @Override
    public List<Offer> getAllOffers() {
        List<Offer> offers = new ArrayList<Offer>();
        return offers;
    }
}
