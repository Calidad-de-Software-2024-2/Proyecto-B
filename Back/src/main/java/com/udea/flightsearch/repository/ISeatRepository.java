package com.udea.flightsearch.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.udea.flightsearch.model.Seat;

@Repository
public interface ISeatRepository extends JpaRepository<Seat, Long> {
}