package com.example.spring.postgres.controller;

import com.example.spring.postgres.dao.TicketDao;
import com.example.spring.postgres.model.Ticket;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class TicketController {
    private final TicketDao ticketDao;

    @PostMapping("/book-tickets")
    public String bookTicket(@RequestBody List<Ticket> tickets) {
        ticketDao.saveAll(tickets);
        return "Ticket successfully booked";
    }

    @GetMapping("/get-tickets")
    public List<Ticket> getTickets() {

        return (List<Ticket>) ticketDao.findAll();
    }
}
