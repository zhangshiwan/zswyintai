package yintai.test.zsw;



import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.alibaba.fastjson.JSONObject;


@Controller
public class OneController{
	private static Log log = LogFactory.getLog(OneController.class);
	
	
//	@RequestMapping(value="/user/login", method=RequestMethod.GET)
//	@ResponseBody
//	public ResponseDTO login(HttpServletRequest req,HttpServletResponse resp,HttpSession httpSession){
//		resp.setHeader("Access-Control-Allow-Origin", "*");
//		ResponseDTO responseDTO = new ResponseDTO();
//		try {
//			String username = req.getParameter("username");
//			String password = req.getParameter("password");
//			username = java.net.URLDecoder.decode(username,"UTF-8");
//			User user = userMapper.selectByLogin(username, password);
//			if( user != null){
//				httpSession.setAttribute(Contants.LOGIN_USER_NAME, user);
//				responseDTO.putData("info", user);
//			}
//			else{
//				responseDTO.fail("用户名或密码错误");
//			}
//			return responseDTO;
//		} catch (Exception e) {
//			log.error("", e);
//		}
//		return responseDTO;
//	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
