package com.cj.future.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cj.future.entity.Data;

public interface DataRepository extends JpaRepository<Data, Integer> {

}
