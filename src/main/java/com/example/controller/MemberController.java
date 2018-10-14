package com.example.controller;

import com.example.common.response.RestResult;
import com.example.domain.MemberDto;
import com.example.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author yangyang
 * @version 1.0
 * @date 2018/10/14 下午10:00
 * @description
 */
@RestController()
@RequestMapping("/member")
public class MemberController {

    @Autowired
    MemberService memberService;

    @RequestMapping("/queryAll")
    @ResponseBody
    public RestResult queryAllMember() {

        RestResult restResult = new RestResult();
        List<MemberDto> memberDtos = memberService.queryAll();
        restResult.success(memberDtos);
        return restResult;

    }


    @RequestMapping("/findById/{id}")
    @ResponseBody
    public RestResult findById(@PathVariable Integer id) {

        RestResult restResult = new RestResult();
        MemberDto memberDto = memberService.findById(id);
        restResult.success(memberDto);
        return restResult;

    }

    @RequestMapping("/insert")
    @ResponseBody
    public RestResult insert(@RequestBody MemberDto memberDto) {

        RestResult restResult = new RestResult();
        memberService.insert(memberDto);
        restResult.success();
        return restResult;

    }


    @RequestMapping("/update")
    @ResponseBody
    public RestResult update(@RequestBody MemberDto memberDto) {

        RestResult restResult = new RestResult();
        memberService.update(memberDto);
        restResult.success();
        return restResult;

    }


    @RequestMapping("/delete/{id}")
    @ResponseBody
    public RestResult delete(@PathVariable Integer id) {

        RestResult restResult = new RestResult();
        memberService.delete(id);
        restResult.success();
        return restResult;

    }

}
