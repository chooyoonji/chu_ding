package com.chu.test.control;

import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

//id랑 pw 불러오기 위해 
import com.chu.test.bean.LoginBean;

@Controller
@RequestMapping("/ex02")
public class ControllerExample02 {
	// 다중 경로 설정하는 방법 path 또는 value 둘 다 사용 가능
	@RequestMapping(path = { "/abc1", "/abc2" })
	public void controllerExam02() {
		System.out.println("controllerExam02 실행");
	}


	@RequestMapping(path = "/abc3", params = "keyword=title")
	// params 에 값을 보냄, 안쓰는게 나음
	public String controllerExam03() {
		System.out.println("controllerExam03 실행");
		// return 일 경우에는 기존 경로 신경 X
		return "abc3";
	}

	@RequestMapping("/result")
	public String ControllerEx01(HttpServletRequest httpServletRequest, Model model) {
		String id = httpServletRequest.getParameter("id");
		String pw = httpServletRequest.getParameter("pw");
		// 날아 오는 이름은 name, 페이지 꾸미는 부분은 id

		model.addAttribute("id", id);
		model.addAttribute("pw", pw);

		return "ex02/result";
	}

	@RequestMapping("/result1")
	public String ControllerEx02(@RequestParam("id") String id, @RequestParam("pw") String pw, Model model) {

		model.addAttribute("id", id);
		model.addAttribute("pw", pw);
		return "ex02/result";
	}

	@RequestMapping(value = "/result2", method = RequestMethod.POST)
	public ModelAndView controllerEx03(@RequestParam HashMap<String, String> map) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("id", map.get("id"));
		mav.addObject("pw", map.get("pw"));

		mav.setViewName("/ex02/result");
		return mav;
	}

	@RequestMapping("/result3")
	// 기존에 model을 썼다면, 이번엔 modelmap
	// 사용 용법에 따라 model 또는 modelmap 선택해서 사용하기
	public String ControllerEx04(@RequestParam("id") String id, @RequestParam("pw") String pw, ModelMap modelmap) {

		modelmap.addAttribute("id", id);
		modelmap.addAttribute("pw", pw);
		return "ex02/result";
	}

	// LoginBean 객체를 이용한 방식
	@RequestMapping("/result4")
	public String ControllerEx05(@ModelAttribute LoginBean login, Model model) {
		model.addAttribute("login", login);

		return "ex02/result";
	}
}
