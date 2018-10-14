package com.example.service;

import com.example.domain.MemberDto;

import java.util.List;

/**
 * Created by yangyang on 2018/10/14.
 */
public interface MemberService {
    /**
     * 查询所有的会员
     *
     * @return
     */
    List<MemberDto> queryAll();

    /**
     * 根据ID查询会员
     *
     * @param id
     * @return
     */
    MemberDto findById(Integer id);

    /**
     * 插入会员实体
     *
     * @param memberDto
     * @return
     */
    Integer insert(MemberDto memberDto);


    /**
     * 插入会员实体
     *
     * @param memberDtos
     * @return
     */
    Integer insertList(List<MemberDto> memberDtos);

    /**
     * 修改会员实体
     *
     * @param memberDto
     * @return
     */
    Integer update(MemberDto memberDto);

    /**
     * 删除会员实体
     *
     * @param id
     * @return
     */
    Integer delete(Integer id);


}
