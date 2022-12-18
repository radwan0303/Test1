package com.example.demo.member;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@CrossOrigin
@RequestMapping("/api/v1/member")

public class MemberController {

    private final MemberService memberService;

    @GetMapping
    private List<MemberModel> findAll() {return memberService.findAll();}

    @PostMapping
    public MemberModel save(@RequestBody MemberModel memberModel ) { return memberService.save(memberModel);}

    @DeleteMapping("/{id}")
    public MemberModel delete(@PathVariable Long id) { return memberService.delete(id);}

    @PatchMapping("/{id}")
    public MemberModel update(@RequestBody MemberModel memberModel, @PathVariable Long id) {
        return memberService.update(memberModel, id);
    }



}
