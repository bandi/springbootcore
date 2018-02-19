package com.ir.service.impl;

import com.ir.dto.OfferDto;
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
    public List<OfferDto> getAllOffers() {
        List<OfferDto> offers = new ArrayList();
        OfferDto offerDto = new OfferDto();
        offerDto.setId(1L);
        offerDto.setContent("sampleContent1");
        offerDto.setTitle("sample1");
        OfferDto offerDto1 = new OfferDto();
        offerDto1.setId(2L);
        offerDto1.setContent("sampleContent2");
        offerDto1.setTitle("sample2");
        offers.add(offerDto);
        offers.add(offerDto1);
        return offers;
    }
}
