package edu.fpt.group4.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.fpt.group4.entity.UserEntity;

/**
 * Class Controller của chức năng Login
 * 
 * @author LeDN
 *
 */
@Controller
@RequestMapping(value = "/LoginController")
public class LoginController {

	/**
	 * Method khởi tạo trang login.jsp
	 * 
	 * @param mm
	 * @return login.jsp
	 */
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(ModelMap mm) {
		mm.put("userEntity", new UserEntity());
		return "frontendLogin"; // Gọi frontendLogin trong file tiles.xml
	}

	/**
	 * Method đăng nhập
	 * 
	 * @param userEntity
	 * @param mm
	 * @param session
	 * @return homepage.jsp nếu đăng nhập thành công
	 * @return login.jsp nếu đăng nhập không thành công
	 */
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(
			@ModelAttribute(value = "userEntity") UserEntity userEntity,
			ModelMap mm, HttpSession session) {
		if (userEntity.getUsername().equals("admin")
				&& userEntity.getPassword().equals("123")) {
			session.setAttribute("username", userEntity.getUsername());
			return "frontendHomepage"; // Gọi frontendHomepage trong file
										// tiles.xml
		} else {
			mm.put("message", "Tên tài khoản hoặc mật khẩu không đúng.");
			return "frontendLogin"; // Gọi frontendLogin trong file tiles.xml
		}
	}

	/**
	 * Method đăng xuất
	 * 
	 * @param session
	 * @return login.jsp
	 */
	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(HttpSession session) {
		session.removeAttribute("username");
		return "redirect:login.fpt";
	}

}
