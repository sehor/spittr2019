package com.spittr.spitter;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.spittr.domain.Bankrecord;

public interface JpaBankRecordRepository extends JpaRepository<Bankrecord, Integer>{

	@Query("from Bankrecord as b order by b.date")
	List<Bankrecord> findAllOrderByDate();
}
