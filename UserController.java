package jp.co.internous.wasabi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import jp.co.internous.wasabi.model.domain.MstUser;
import jp.co.internous.wasabi.model.form.UserForm;
import jp.co.internous.wasabi.model.mapper.MstUserMapper;
import jp.co.internous.wasabi.model.session.LoginSession;

@Controller
@RequestMapping("/wasabi/user")
public class UserController {
	
	@Autowired
	private MstUserMapper mstUserMapper;
	
	@Autowired
	private LoginSession loginSession;
	
	@RequestMapping("/")
	public String index(Model m) {
		m.addAttribute("loginSession", loginSession);
		
		return "register_user";
	}
	
	//* ユーザー名重複確認
	@RequestMapping("/duplicatedUserName")
	@ResponseBody
	public String duplicatedUserName(@RequestBody UserForm f) {
		MstUser mstUser = mstUserMapper.findByUserName(f.getUserName());
		
		if(mstUser != null) {
			String check = mstUser.getUserName();
			return check;
		} else{
			return "";
		}
	}
	
	//*　新規ユーザー登録完了
	@RequestMapping("/register")
	@ResponseBody
	public String register(@RequestBody UserForm f) {
		
		MstUser mstUser = new MstUser();
		mstUser.setUserName(f.getUserName());
		mstUser.setPassword(f.getPassword());
		mstUser.setFamilyName(f.getFamilyName());
		mstUser.setFirstName(f.getFirstName());
		mstUser.setFamilyNameKana(f.getFamilyNameKana());
		mstUser.setFirstNameKana(f.getFirstNameKana());
		mstUser.setGender(f.getGender());
		mstUserMapper.insert(mstUser);
				
		return "1";
						
	}
		
}
