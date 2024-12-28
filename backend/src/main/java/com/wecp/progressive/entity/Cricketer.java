package com.wecp.progressive.entity;

import java.util.Comparator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cricketer implements Comparable<Cricketer> {
    private int cricketerId;
    private int teamId;
    private String cricketerName;
    private int age;
    private String nationality;
    private int experience;
    private String role;
    private int totalRuns;
    private int totalWickets;
    @Override
    public int compareTo(Cricketer o) {
       return Comparator.comparingInt(Cricketer :: getExperience).compare(this, o);   }
}