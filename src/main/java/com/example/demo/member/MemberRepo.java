package com.example.demo.member;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepo extends JpaRepository<MemberModel, Long> {
}
