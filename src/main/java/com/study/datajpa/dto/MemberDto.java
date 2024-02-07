package com.study.datajpa.dto;

import com.study.datajpa.entity.Member;
import lombok.Getter;

@Getter
public class MemberDto {

    private final Long id;
    private final String username;
    private final String teamName;

    public MemberDto(final Long id, final String username, final String teamName) {
        this.id = id;
        this.username = username;
        this.teamName = teamName;
    }

    public MemberDto(final Member member) {
        this.id = member.getId();
        this.username = member.getUsername();
        this.teamName = null;
    }
}
