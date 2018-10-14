package com.example.service;

import com.example.domain.MemberDto;
import org.apache.commons.lang3.RandomUtils;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MemberServiceTests {

	@Resource
	private MemberService memberService;




	public void testQueryAll(){

		List<MemberDto> memberDtos = memberService.queryAll();

		if (!CollectionUtils.isEmpty(memberDtos)) {

			for (MemberDto dto : memberDtos) {

				System.out.println(dto );
			}
		}

	}

//	@Test
	public void testInsert(){
		MemberDto memberDto = new MemberDto();
		memberDto.setUsername("zhangyang");
		memberDto.setPassword("123");
		memberDto.setSex(1);
		memberDto.setDesc("a sex woman");
		Integer result = memberService.insert(memberDto);

		Assert.assertEquals(result,new Integer(1));


	}

//	@Test
	public void testBatchInsert(){
		List<MemberDto> list = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			MemberDto memberDto = new MemberDto();
			memberDto.setUsername("zhangyang"+i);
			memberDto.setPassword("123"+i);
			memberDto.setSex(RandomUtils.nextInt(0,2));
			memberDto.setDesc("a sex woman"+i);
			list.add(memberDto);
		}

		Integer result = memberService.insertList(list);

		Assert.assertEquals(result,new Integer(1));


	}

//	@Test
	public void testUpdate(){
		MemberDto memberDto = new MemberDto();
		memberDto.setId(6);
		memberDto.setUsername("zhangyang");
		memberDto.setPassword("123");
		memberDto.setSex(1);
		memberDto.setDesc("a sex man");
		Integer result = memberService.update(memberDto);

		Assert.assertEquals(result,new Integer(1));


	}



//	@Test
	public void testDelete(){
		Integer result = memberService.delete(5);

		Assert.assertEquals(result,new Integer(1));


	}


	@Test
	public void testFindById(){
		MemberDto m = memberService.findById(1);

		System.out.println(m);


	}




}
