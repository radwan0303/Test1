package com.example.demo.member;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class MemberService {


        private final MemberRepo memberRepo;

        public List<MemberModel> findAll() {return memberRepo.findAll();}

        public MemberModel save(MemberModel memberModel) {
            return memberRepo.save(memberModel);
        }
        public MemberModel delete(Long id){
            memberRepo.deleteById(id);
            return null;
        }

        public MemberModel update(MemberModel membeModel, Long id){
            MemberModel existingMember = memberRepo.findById(id)
                    .orElseThrow(() -> new RuntimeException("Member not found" + id));
            existingMember.setFirstName(membeModel.getFirstName());
            existingMember.setLastName(membeModel.getLastName());
            existingMember.setStreet(membeModel.getStreet());
            existingMember.setCity(membeModel.getCity());
            existingMember.setZip(membeModel.getZip());
            existingMember.setApproved(membeModel.getApproved());
            existingMember.setRanking(membeModel.getRanking());
            return memberRepo.save(existingMember);
        }
    }
