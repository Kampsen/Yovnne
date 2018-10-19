package com.yovnne.controller;

import com.yovnne.model.Account;
import com.yovnne.service.IAccountService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/customerTest")
public class CustomerTestController {

    private static Logger log = LoggerFactory.getLogger(CustomerTestController.class);

    @Resource
    private IAccountService accountService;

    // /customerTest/user?id=1
    @RequestMapping(value="/user",method = RequestMethod.GET)
    public String testUser(HttpServletRequest request, Model model){
        //test
        int testUserId = Integer.parseInt(request.getParameter("id"));

        System.out.println("CustomerTestController--userId:"+testUserId);
        Account user=null;
        if (testUserId==1) {

            user = this.accountService.getAccountById(testUserId);

            /*user = new Account();
            user.setId("1");
            user.setAccount("jack");
            user.setPassword("Java Web");*/
            log.debug(user.toString());
        }

        model.addAttribute("user", user);
        return "index";
    }
}
