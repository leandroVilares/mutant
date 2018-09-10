package com.leandrovilares.magnetto;
 
import java.net.URI;

import org.springframework.web.client.RestTemplate;
 

public class MagnettoTest {
 
    public static final String REST_SERVICE_URI = "http://localhost:8080/SpringBootRestApi/api";
     
    /* GET */
     //“dna”:["ATGCGA","CAGTGC","TTATGT","AGAAGG","CCCCTA","TCACTG"] 
     
    
     
    /* POST */
    private static void verifyDNA() {
        System.out.println("Testing create User API----------");
        RestTemplate restTemplate = new RestTemplate();
        String[] dna = {"ATYCGA","CAGUGC","TTATUT","AGOGGG","CTACTA","TCAUTG"};
        URI uri = restTemplate.postForLocation(REST_SERVICE_URI+"/mutant/", dna, String.class);
        System.out.println("Location : "+uri.toASCIIString());
    }
 
   
 
   
 
   
 
    public static void main(String args[]){
        
    	verifyDNA();
       
    }
}