package org.roon.club.repository;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.roon.club.domain.member.ClubMember;
import org.roon.club.domain.member.ClubMemberRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class ClubMemberRepositoryTest {
    @Autowired
    private ClubMemberRepository clubMemberRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;



//    @Test
//    public void addDummies() {
//        IntStream.rangeClosed(1, 100).forEach(i -> {
//            ClubMember member = ClubMember.builder()
//                    .id("id" + i)
//                    .name("name" + i)
//                    .password(passwordEncoder.encode("1234"))
//                    .build();
//
//            if (i < 30) {
//                member.addMemberRole(ClubMemberRole.USER);
//            } else if (i < 60) {
//                member.addMemberRole(ClubMemberRole.MANAGER);
//            } else {
//                member.addMemberRole(ClubMemberRole.ADMIN);
//            }
//
//            clubMemberRepository.save(member);
//        });
//    }


}