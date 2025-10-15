package com.workshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.workshop.model.Team;

@Repository
public interface TeamRepository extends JpaRepository<Team,Long> {
}
