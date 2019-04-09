package com.spittr.spitter;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spittr.domain.Spitter;

public interface JpaSpitterRepository extends JpaRepository<Spitter, Integer> {

}
