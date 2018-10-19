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
@RequestMapping("/sellerTest")
public class SellerTestController {
    private static Logger log = LoggerFactory.getLogger(SellerTestController.class);

    @Resource
    private IAccountService accountService;

    // /sellerTest/user?id=1
    @RequestMapping(value="/user",method = RequestMethod.GET)
    public String testUser(HttpServletRequest request, Model model){
        //test
        int testUserId = Integer.parseInt(request.getParameter("id"));

        System.out.println("SellerTestController--userId:"+testUserId);
        Account user=null;
        if (testUserId==2) {
            /*user = new Account();
            user.setId("1");
            user.setAccount("jackM");
            user.setPassword("Java Web");*/
            user = this.accountService.getAccountById(testUserId);
            log.debug(user.toString());
        }

        model.addAttribute("user", user);
        return "index";
    }
}
