package jp.co.internous.wasabi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.co.internous.wasabi.model.domain.MstUser;
import jp.co.internous.wasabi.model.mapper.MstUserMapper;
import jp.co.internous.wasabi.model.session.LoginSession;

@Controller
@RequestMapping("/wasabi/mypage")
public class MyPageController {
	
	@Autowired
	MstUserMapper mstUserMapper;
	
	@Autowired
	LoginSession loginSession;
	
	@RequestMapping("/")
	public String index(Model m) {
		
		MstUser mstUser = mstUserMapper.findByUserNameAndPassword(loginSession.getUserName(),
																  loginSession.getPassword());
		
		m.addAttribute("userName", mstUser.getUserName());
		m.addAttribute("password", mstUser.getPassword());
		m.addAttribute("familyName", mstUser.getFamilyName());
		m.addAttribute("firstName", mstUser.getFirstName());
		m.addAttribute("familyNameKana", mstUser.getFamilyNameKana());
		m.addAttribute("firstNameKana", mstUser.getFirstNameKana());
		
		
		//* if文でモデルの中身を場合分け
		int gender = mstUser.getGender();
		if(gender == 0) {
			m.addAttribute("gender", "男性");
		} else {
			m.addAttribute("gender", "女性");
		}
			
		//* for文でパスワードを伏せて表示
		String viewPassword = mstUser.getPassword();
		String hiddenPassword = "";
		for (int i = 0; i < viewPassword.length(); i++) {
			hiddenPassword += '*';
		}
		m.addAttribute("password", hiddenPassword);
		
		m.addAttribute("loginSession", loginSession);
			
		return "my_page";
	}

}

