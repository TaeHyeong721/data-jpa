package com.study.datajpa.dto;

import lombok.Getter;

@Getter
public class MemberDto {

    private Long id;
    private String username;
    private String teamName;

    public MemberDto(final Long id, final String username, final String teamName) {
        this.id = id;
        this.username = username;
        this.teamName = teamName;
    }
}
