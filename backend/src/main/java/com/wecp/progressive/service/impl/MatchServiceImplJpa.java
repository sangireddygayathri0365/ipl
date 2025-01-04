package com.wecp.progressive.service.impl;

import com.wecp.progressive.entity.Match;
import com.wecp.progressive.repository.MatchRepository;
import com.wecp.progressive.service.MatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

@Service
public class MatchServiceImplJpa implements MatchService {

    private MatchRepository matchRepository;

    @Autowired
    public MatchServiceImplJpa(MatchRepository matchRepository) {
        this.matchRepository = matchRepository;
    }

    @Override
    public List<Match> getAllMatches() throws SQLException {
        return List.of();
    }

    @Override
    public Match getMatchById(int matchId) throws SQLException {
        return null;
    }

    @Override
    public Integer addMatch(Match match) throws SQLException {
        return -1;
    }

    @Override
    public void updateMatch(Match match) throws SQLException {

    }

    @Override
    public void deleteMatch(int matchId) throws SQLException {

    }

    @Override
    public List<Match> getAllMatchesByStatus(String status) {
        return null;
    }
}