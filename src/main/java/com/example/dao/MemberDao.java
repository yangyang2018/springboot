package com.example.dao;

import com.example.domain.MemberDto;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author yangyang
 * @version 1.0
 * @date 2018/10/14 上午9:45
 * @description
 */
public interface MemberDao {

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
    MemberDto findById(@Param("id") Integer id);

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
    Integer insertList(@Param("items") List<MemberDto> memberDtos);

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
    Integer delete(@Param("id") Integer id);


}
