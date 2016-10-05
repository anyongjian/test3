package net.codejava.springmvc.appController;


import java.util.List;

import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import net.codejava.springmvc.webController.HomeController;
@Controller
@RequestMapping(value = "user")
public class UserController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	//获取用户姓名(get请求)
	@ResponseBody
	@RequestMapping(value = "getName/{name}",method = RequestMethod.GET,produces = "application/json;charset=UTF-8")
	public String getUserName(Model model,@PathVariable(value = "name") String name){
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("name", name);
		return jsonObject.toString();
	}
	
	//获取用户性别（post请求）
		@ResponseBody
		@RequestMapping(value = "getSex",method = RequestMethod.POST,produces = "application/json;charset=UTF-8")
		public String getUserSex(@RequestBody String msg){
			logger.warn("msg:"+msg);
			JSONObject jsonObject = new JSONObject(msg);
			logger.warn("sex:"+jsonObject.getString("sex"));
			jsonObject.put("method", "post");
			return jsonObject.toString();
		}
	
	@RequestMapping(value = "getIds",method = RequestMethod.GET)
	public String getIds(Model model,@RequestParam("id") List<String> id){
		//model.addAttribute("ids",id);
		logger.debug("id:"+id);
		System.out.println("system id:"+id);
		for(int i = 0;i<id.size();i++){
			logger.debug(id.get(i));
			//System.out.println(id[i]);
		}
		return "user/id";
	}
	
	
}
