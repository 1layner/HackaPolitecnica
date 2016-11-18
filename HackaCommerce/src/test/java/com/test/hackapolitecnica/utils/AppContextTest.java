package com.test.hackapolitecnica.utils;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.hackapolitecnica.config.AppContext;

@Configuration
@Import(value={AppContext.class})
@ComponentScan(basePackages = {"com.test.hackapolitecnica"})
public class AppContextTest {

}
