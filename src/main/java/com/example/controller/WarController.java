package com.example.controller;

import org.springframework.http.MediaType;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("svc/v1/war")
public class WarController {

@RequestMapping(value="{warNumber}",produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
public int getContract(@PathVariable final int warNumber){
	return warNumber;
}
}
