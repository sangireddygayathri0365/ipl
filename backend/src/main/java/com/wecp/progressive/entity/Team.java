package com.wecp.progressive.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Team implements Comparable<Team>{
    private int teamId;
    private String teamName;
    private String location;
    private String ownerName;
    private int establishmentYear;
    @Override
    public int compareTo(Team o) {
            //  throw new UnsupportedOperationException("Unimplemented method 'compareTo'");
    return this.getTeamName().compareTo(o.getTeamName());
        }
}