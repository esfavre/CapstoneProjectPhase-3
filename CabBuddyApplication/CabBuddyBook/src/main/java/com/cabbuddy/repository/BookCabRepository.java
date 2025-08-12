package com.cabbuddy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cabbuddy.entity.BookCab;

@Repository
public interface BookCabRepository extends JpaRepository<BookCab, Integer>{

}
