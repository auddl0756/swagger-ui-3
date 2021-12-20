package org.roon.club.repository;

import org.roon.club.domain.member.ClubMember;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClubMemberRepository extends JpaRepository<ClubMember,String> {
}
