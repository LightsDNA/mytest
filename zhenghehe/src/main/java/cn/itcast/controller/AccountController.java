package cn.itcast.controller;

import cn.itcast.domain.Account;
import cn.itcast.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("/account")
@Controller
public class AccountController {
    @Autowired
    private AccountService accountService;
    @RequestMapping("/findAll")
    public String findAll(){
        System.out.println("表现层：查询所有");
        List<Account> list = accountService.findAll();
        for (Account account : list) {
            System.out.println(account);
        }
        return "list";
    }

    @RequestMapping("/save")
    public String saveAccount(Account account){
        System.out.println("表现层：保存");
        accountService.saveAccount(account);
        return "list";
    }
}
