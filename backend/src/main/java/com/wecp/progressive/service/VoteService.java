package com.wecp.progressive.service;

import com.wecp.progressive.entity.Vote;

import java.util.List;
import java.util.Map;

<<<<<<< HEAD
import org.springframework.http.ResponseEntity;

public interface VoteService {

    ResponseEntity<List<Vote>> getAllVotes();

    ResponseEntity<Integer> createVote(Vote vote);

    // Each key (k) represents a category (categories - “Team”, “Batsman”, “Bowler”, “All-rounder” and “Wicketkeeper”)
    // and each value (v) represents the total number of votes for that category.
    ResponseEntity<Map<String, Long>> getVotesCountOfAllCategories();

}
=======
public interface VoteService {

    List<Vote> getAllVotes();

    int createVote(Vote vote);

    // Each key (k) represents a category (categories - “Team”, “Batsman”, “Bowler”, “All-rounder” and “Wicketkeeper”)
    // and each value (v) represents the total number of votes for that category.
    Map<String, Long> getVotesCountOfAllCategories();

}
>>>>>>> 6d9f8fb4927edf91f75ad2579f6b8862474886c6
