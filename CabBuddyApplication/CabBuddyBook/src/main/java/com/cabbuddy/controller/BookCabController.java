package com.cabbuddy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cabbuddy.service.BookCabService;

@RestController
@RequestMapping("cabbuddy")
public class BookCabController {
	
	@Autowired
	BookCabService bookCabService;
	
	@GetMapping(value = "home")
	public String welcome() {
		return "welcome";
	}
	
	@GetMapping(value = "bookcab")
	public String bookCab() {
		return "book cab now";
	}
	
	@GetMapping(value = "allbookings")
	public String listAllBookings() {
		return "list of all cab bookings";
	}
	
	@GetMapping(value = "update")
	public String updateBooking() {
		return "update cab booking here";
	}
	
	@GetMapping(value = "cancel")
	public String cancelBooking() {
		return "cancel cab booking";
	}
}
