package com.wecp.progressive.repository;

<<<<<<< HEAD
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.wecp.progressive.entity.Vote;
@Repository
public interface VoteRepository extends JpaRepository<Vote,Long>{
    @Query("SELECT v.category AS category, COUNT(v) AS totalVotes FROM Vote v GROUP BY v.category")
    List<Object[]> countVotesByCategory();
 
@Query("DELETE FROM Vote v WHERE v.team.id = :teamId")
    void deleteByTeamId(int teamId);
 
@Query("DELETE FROM Vote v WHERE v.cricketer.id = :cricketerId")
    void deleteByCricketerId(int cricketerId);
=======

public interface VoteRepository {
>>>>>>> 6d9f8fb4927edf91f75ad2579f6b8862474886c6
}
