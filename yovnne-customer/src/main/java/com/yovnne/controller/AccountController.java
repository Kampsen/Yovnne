package com.yovnne.controller;


import com.yovnne.model.Account;
import com.yovnne.service.IAccountService;
import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.Map;

@Controller
@RequestMapping("/account")     // yovnne/account
public class AccountController {

    private static Logger log = LoggerFactory.getLogger(AccountController.class);

    @Resource
    private IAccountService accountService;

    // /account/test?id=1
    @RequestMapping(value="/test",method = RequestMethod.GET)
    public String test(HttpServletRequest request, Model model){
        int userId = Integer.parseInt(request.getParameter("id"));
        System.out.println("AccountController--userId:"+userId);
        Account user=null;
        if (userId==1) {
            user = new Account();
            user.setId("1");
            user.setAccount("java");
            user.setPassword("javaweb");
            log.debug(user.toString());
        }
        //System.out.println(System.getProperty("user.dir"));
        model.addAttribute("user", user);
        return "index";
    }
    // /account/showUser?id=1
    @RequestMapping(value="/showUser",method=RequestMethod.GET)
    public String toIndex(HttpServletRequest request,Model model){
        int userId = Integer.parseInt(request.getParameter("id"));
        System.out.println("userId:"+userId);
        Account user = this.accountService.getAccountById(userId);
        log.debug(user.toString());
        model.addAttribute("user", user);
        return "showUser";
    }

    // /account/showUser2?id=1
    @RequestMapping(value="/showUser2",method=RequestMethod.GET)
    public String toIndex2(@RequestParam("id") String id, Model model){
        int userId = Integer.parseInt(id);
        System.out.println("userId:"+userId);
        Account user = this.accountService.getAccountById(userId);
        log.debug(user.toString());
        model.addAttribute("user", user);
        return "showUser";
    }


    // /account/showUser3/{id}
    @RequestMapping(value="/showUser3/{id}",method=RequestMethod.GET)
    public String toIndex3(@PathVariable("id")String id, Map<String, Object> model){
        int userId = Integer.parseInt(id);
        System.out.println("userId:"+userId);
        Account user = this.accountService.getAccountById(userId);
        log.debug(user.toString());
        model.put("user", user);
        return "showUser";
    }

    // /account/{id}
    @RequestMapping(value="/{id}",method=RequestMethod.GET)
    public @ResponseBody
    Account getUserInJson(@PathVariable String id, Map<String, Object> model){
        int userId = Integer.parseInt(id);
        System.out.println("userId:"+userId);
        Account user = this.accountService.getAccountById(userId);
        log.info(user.toString());
        return user;
    }

    // /account/{id}
    @RequestMapping(value="/jsontype/{id}",method=RequestMethod.GET)
    public ResponseEntity<Account> getUserInJson2(@PathVariable String id, Map<String, Object> model){
        int userId = Integer.parseInt(id);
        System.out.println("userId:"+userId);
        Account user = this.accountService.getAccountById(userId);
        log.info(user.toString());
        return new ResponseEntity<Account>(user, HttpStatus.OK);
    }

    //文件上传、  account/upload
    @RequestMapping(value="/upload")
    public String showUploadPage(){
        return "user_admin/file";
    }
    //account/doupload
    @RequestMapping(value="/doUpload",method=RequestMethod.POST)
    public String doUploadFile(@RequestParam("file") MultipartFile file) throws IOException {
        if (!file.isEmpty()) {
            log.info("Process file:{}",file.getOriginalFilename());
        }
        FileUtils.copyInputStreamToFile(file.getInputStream(), new File("E:\\",System.currentTimeMillis()+file.getOriginalFilename()));
        return "success";
    }
}
