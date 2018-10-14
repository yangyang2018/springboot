package com.example.service.impl;

import com.example.dao.MemberDao;
import com.example.domain.MemberDto;
import com.example.service.MemberService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author yangyang
 * @version 1.0
 * @date 2018/10/14 上午9:57
 * @description
 */

@Service("memberService")
public class MemberServiceImpl implements MemberService {

    @Resource
    private MemberDao memberDao;

    @Override
    public List<MemberDto> queryAll() {
        return memberDao.queryAll();
    }

    @Override
    public MemberDto findById(Integer id) {
        return memberDao.findById(id);
    }

    @Override
    public Integer insert(MemberDto memberDto) {
        return memberDao.insert(memberDto);
    }

    @Override
    public Integer insertList(List<MemberDto> memberDtos) {
        return memberDao.insertList(memberDtos);
    }

    @Override
    public Integer update(MemberDto memberDto) {
        return memberDao.update(memberDto);
    }

    @Override
    public Integer delete(Integer id) {
        return memberDao.delete(id);
    }
}
