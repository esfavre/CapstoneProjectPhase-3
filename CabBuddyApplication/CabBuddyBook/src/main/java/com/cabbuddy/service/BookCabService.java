package com.cabbuddy.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cabbuddy.entity.BookCab;
import com.cabbuddy.repository.BookCabRepository;

@Service
public class BookCabService {
	@Autowired
	BookCabRepository bookCabRepository;
	
	public String storeCabBooking(BookCab booking) {
		Optional<BookCab> result = bookCabRepository.findById(booking.getBookId());
		if (result.isPresent()) {
			return "Book ID already exists";
		} else {
			bookCabRepository.save(booking);
			return "Cab Booking Saved";
		}
	}
	
	public List<BookCab> findAllCabBookings() {
		
		return bookCabRepository.findAll();
	}
	
	public String updateCabBooking(BookCab booking) {
		Optional<BookCab> result = bookCabRepository.findById(booking.getBookId());
		if (result.isPresent()) {
			
			return "Book ID does not exist";
		} else {
			bookCabRepository.save(booking);
			return "Cab Booking Saved";
		}
	}
	
	public String cancelBooking(int bookId) {
		Optional<BookCab> result = bookCabRepository.findById(bookId);
		if (result.isPresent()) {
			bookCabRepository.deleteById(bookId);
			return "Booking Canceled Successfully";
		} else {
			return "Cab Booking does not exist";
		}
	}
}
