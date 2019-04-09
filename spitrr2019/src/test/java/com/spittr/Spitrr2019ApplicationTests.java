package com.spittr;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.spittr.domain.Bankrecord;
import com.spittr.domain.Spitter;
import com.spittr.spitter.JpaBankRecordRepository;
import com.spittr.spitter.JpaSpitterRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Spitrr2019ApplicationTests {
@Resource
private JpaSpitterRepository spitterRepository;

@Resource 
private JpaBankRecordRepository bankRepository;
	
	@Test
	public void contextLoads() {
	}
	
	@Test
	public void testData() {
		/*Spitter spitter=new Spitter();
		spitter.setUsername("Jack");
		spitter.setPassword("japckspassword");
		spitter.setFirstName("jack");
		spitter.setLastName("bouar");
		spitter.setEmail("bouar@email.com");
		
		spitterRepository.save(spitter);
		assertEquals(3, spitterRepository.findById(3).get().getSpitterId());
		spitterRepository.findById(3);
		for(Spitter spitter2:spitterRepository.findAll()) {
			
			System.out.println(spitter2.getSpitterId()+"  : "+spitter2.getUsername());
				
		}*/

		double balance=0;
		for(Bankrecord record:bankRepository.findAllOrderByDate()) {
			balance=balance+record.getNumber();
			System.out.println(record.getId()+"  :   "+ record.getDate()+"   :  "+record.getNumber()+"  :   "+ balance);
		}
		
		
	}

}
