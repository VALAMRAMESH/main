package com.yash.sbrest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import com.yash.sbrest.model.User;
import com.yash.sbrest.service.UserService;

@RestController
@CrossOrigin(origins="http://localhost:64051")
@RequestMapping("/userapi")
public class UserController {
    @Autowired
    UserService usobj;
	
    @GetMapping(value="/getuserlist")
	public List<User> getAllUsers()
	{
		List<User> ulistdata= usobj.getAllusers();
		return ulistdata;
	}
    @PostMapping("/adduser")
    public void createUser(@RequestBody User objuser)
    {
    	User objuser2= usobj.createUserService(objuser);
    	System.out.println(objuser2.getUid());
    }
    @GetMapping("/deluser/{id}")
    public void delUserId(@PathVariable String id)
    {
    	usobj.delUserByid(Integer.parseInt(id));
    }
    @PostMapping("/updateUser")
    public String updateUserById(@RequestBody User objuser)
    {
    	User objuser2 =  usobj.UpdateUserById(objuser);
    	return  "data nupdated";
    }
}
