package com.balasamajam.controllers;

import com.balasamajam.models.*;
import com.balasamajam.services.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BalasamajamMemberController
{
    @Autowired
    private MemberService memberService;

    @PostMapping("/member")
    public ResponseEntity<String> fetchMember(@RequestBody RequestBaseModel<SearchMemberRequestModel> searchMemberRequestModel)
    {
        System.out.print("print " + searchMemberRequestModel.getData().getSearchText());
        return ResponseEntity.ok("done");
    }

    @PostMapping("/member/add")
    public ResponseEntity<ResponseBaseModel<MemberResponseModel>> addMember(@RequestBody RequestBaseModel<MemberRequestModel> memberRequestModel)
    {
        System.out.print("Add member request received");
        return ResponseEntity.status(HttpStatus.OK).body(memberService.addMember(memberRequestModel.getData()));
    }
}
