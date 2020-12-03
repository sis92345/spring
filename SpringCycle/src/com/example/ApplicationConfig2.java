package com.example;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@Configuration
@ComponentScan(basePackages = {"com.example"})
public class ApplicationConfig2 {
	//Product가 ComponentScan해서 product들어온다.
}
