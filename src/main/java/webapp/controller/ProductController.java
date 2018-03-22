package webapp.controller;

import model.classes.jaxbgenerated.*;
import model.classes.jaxbgenerated.Date;
import webapp.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import webapp.service.ProductService;


import java.util.*;


@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping(value = "/{id}",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_XML_VALUE)
    public ResponseEntity<Listing> getProductById(@PathVariable("id") Integer id) {
        Product product = productService.findById(id);
        ObjectFactory objectFactory = new ObjectFactory();
        Listing listing = objectFactory.createListing();
        listing.setId(String.valueOf(product.getId()));
        Name name = new Name();
        name.setValue(product.getName());
        listing.getName().add(name);
        Address address = new Address();
        address.getContent().add(product.getAddressComponents());
        listing.getAddress().add(address);
        listing.setCountry(product.getAddressComponents().getCountry());
        listing.setLatitude(Float.valueOf(String.valueOf(product.getLatitude())));
        listing.setLongitude(Float.valueOf(String.valueOf(product.getLongitude())));
        Phone phone = new Phone();
        phone.setType(product.getPhone());
        listing.getPhone().add(phone);
        List<Object> images = new ArrayList<>();
        product.getImages().forEach(image -> {Image img = new Image();
            img.setType(image.getName());
            img.setUrl(image.getUrl());
            images.add(img);});
        Content content = new Content();
        content.setTextOrReviewOrImage(images);
        listing.setContent(content);
        Calendar now = Calendar.getInstance();
        long year = now.get(Calendar.YEAR);
        long month = now.get(Calendar.MONTH) + 1;
        long day = now.get(Calendar.DAY_OF_MONTH);
        Date date = new Date();
        date.setYear(year);
        date.setDay(day);
        date.setMonth(month);
        listing.setDate(date);
        return new ResponseEntity<Listing>(listing, HttpStatus.OK);
    }

}
