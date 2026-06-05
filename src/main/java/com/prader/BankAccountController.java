package com.prader;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

// do more research on undersranding how the request mapping function works
@RestController
@RequestMapping("api/v1/bank-account")
public class BankAccountController {

    @GetMapping
    public List<BankAccount> getAccounts(){
        return List.of(
                new BankAccount(
                        830.12,
                                1,
                                "Chadwick's moneyyyyy",
                2
                )
        );
    }

}
