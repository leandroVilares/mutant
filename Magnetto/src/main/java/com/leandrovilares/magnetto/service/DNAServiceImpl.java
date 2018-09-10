package com.leandrovilares.magnetto.service;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;





@Service("dnaService")
public class DNAServiceImpl implements DNAService{
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	String dnaWords = new String();
	
	public  boolean isMutante(String[] dna) {
		Magnetto mag = new Magnetto();
		
		
	boolean isMutant = mag.verificarMutanteLouco(dna);
	 for(int i=0; i< dna.length -1 ; i++) {
		 dnaWords =   dnaWords+ " "+  dna[i];
	 }
	 
	jdbcTemplate.batchUpdate("INSERT INTO DNA(id,dna) VALUES (?,?)", new BatchPreparedStatementSetter(){
		  public void setValues(PreparedStatement ps, int i) throws SQLException {
			    ps.setInt(1,12);
	            ps.setString(2,dnaWords );
		  }

		@Override
		public int getBatchSize() {
			// TODO Auto-generated method stub
			return 0;
		}});
	            
	return isMutant;       
	        
	}
      
	
	
	}
	


