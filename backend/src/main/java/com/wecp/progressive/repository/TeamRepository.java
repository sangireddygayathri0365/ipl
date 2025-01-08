package com.wecp.progressive.repository;
<<<<<<< HEAD
 
import com.wecp.progressive.entity.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
 
@Repository
public interface TeamRepository extends JpaRepository<Team, Integer> {
 
    Team findByTeamId(int teamId);
    Team findByTeamName(String teamName);
=======

import org.springframework.data.jpa.repository.JpaRepository;

import com.wecp.progressive.entity.Team;

public interface TeamRepository extends JpaRepository<Team, Integer> {
>>>>>>> 6d9f8fb4927edf91f75ad2579f6b8862474886c6
}