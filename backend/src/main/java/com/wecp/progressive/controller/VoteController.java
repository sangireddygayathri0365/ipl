package com.wecp.progressive.controller;

import com.wecp.progressive.entity.Vote;
<<<<<<< HEAD
import com.wecp.progressive.service.VoteService;
import com.wecp.progressive.service.impl.VoteServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
=======
import org.springframework.http.ResponseEntity;
>>>>>>> 6d9f8fb4927edf91f75ad2579f6b8862474886c6

import java.util.List;
import java.util.Map;

<<<<<<< HEAD
 
@RestController
@RequestMapping("/vote")
public class VoteController {
 
    @Autowired
    private VoteServiceImpl voteService;
 
    @GetMapping
    public ResponseEntity<List<Vote>> getAllVotes() {
        return voteService.getAllVotes();
    }
 
    @PostMapping
    public ResponseEntity<Integer> createVote(@RequestBody Vote vote) {
        return voteService.createVote(vote);
    }
 
    @GetMapping("/count")
    public ResponseEntity<Map<String, Long>> getVotesCountOfAllCategories() {
        return voteService.getVotesCountOfAllCategories();
    }
}

=======
public class VoteController {

    public ResponseEntity<List<Vote>> getAllVotes() {
        return null;
    }

    public ResponseEntity<Integer> createVote(Vote vote) {
        return null;
    }

    // Each key (k) represents a category (categories - “Team”, “Batsman”, “Bowler”, “All-rounder” and “Wicketkeeper”)
    // and each value (v) represents the total number of votes for that category.
    public ResponseEntity<Map<String, Long>> getVotesCountOfAllCategories() {
        return null;
    }
}
>>>>>>> 6d9f8fb4927edf91f75ad2579f6b8862474886c6
