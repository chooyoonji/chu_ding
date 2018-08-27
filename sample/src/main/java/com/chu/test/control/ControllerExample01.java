package com.chu.test.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/ex01")
// 가장 상단의 값이 되는 매핑은 미리 앞에 적어주고 들어가는 방식 선호
public class ControllerExample01 {
	@RequestMapping(value = "/view1")
	public String ControlEx01() {
		System.out.println("ControlEx01 실행");
		return "abc";
	}

	@RequestMapping(value = "/view1", method = RequestMethod.GET)
	// 지정하지 않을 경우, 둘 다가능
	public String ControlEx02() {
		System.out.println("ControlEx02 실행");
		return "abc2";
	}
}
