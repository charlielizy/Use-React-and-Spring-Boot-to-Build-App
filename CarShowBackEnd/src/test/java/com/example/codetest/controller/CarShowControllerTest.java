/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.codetest.controller;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.List;
import java.util.Map;

import org.springframework.ui.Model;

import com.example.codetest.model.Car;


public class CarShowControllerTest {
    
    public CarShowControllerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

//    /**
//     * Test of getMessage method, of class CarShowController.
//     */
//    @Test
//    public void testGetMessage() {
//        System.out.println("getMessage");
//        CarShowController instance = new CarShowController();
//        Map<Car, List<String>> carMap = instance.getCarAndShows();
//        if (null==carMap) {
//        	System.out.println("Cannot access server and get right Json String. ");
//        	return ;
//        }
//	      for (Map.Entry entry:carMap.entrySet()){
//	
//	          Car car = (Car)entry.getKey();   
//	          System.out.println(car.getMake());
//	          System.out.println("           "+car.getModel());
//	
//				List<String> showNames = (List)entry.getValue();
//	          
//	          showNames.stream().forEach(s -> System.out.println("                          "+s));
//	          
//	      }
//        
//    }
    
}
