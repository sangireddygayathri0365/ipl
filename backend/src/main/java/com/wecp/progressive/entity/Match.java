package com.wecp.progressive.entity;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Match {
    private int matchId;
    private int firstTeamId;
    private int secondTeamId;
    private Date matchDate;
    private String venue;
    private String result;
    private String status;
    private int winnerTeamId;
}