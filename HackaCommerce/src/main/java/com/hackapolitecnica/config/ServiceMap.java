package com.hackapolitecnica.config;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

@CrossOrigin(origins="*")
@RequestMapping(consumes = "application/json", produces = "application/json")
public interface ServiceMap {

}
