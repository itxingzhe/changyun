package cn.changyun.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * IndexController: (请描述这个类).
 *
 * @author wangyibin
 * @date 2018/12/19 15:43
 * @see
 */
@RequestMapping("/index")
public class IndexController {

	public ModelAndView index(){
		return new ModelAndView("index");
	}



}
