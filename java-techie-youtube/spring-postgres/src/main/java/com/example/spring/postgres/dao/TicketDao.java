package com.example.spring.postgres.dao;

import com.example.spring.postgres.model.Ticket;
import org.springframework.data.repository.CrudRepository;

public interface TicketDao extends CrudRepository<Ticket, Integer> {
}
