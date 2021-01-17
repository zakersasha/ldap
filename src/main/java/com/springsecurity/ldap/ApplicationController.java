package com.springsecurity.ldap;

import com.springsecurity.ldap.domain.Vcard;
import com.springsecurity.ldap.repo.VcardRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class ApplicationController {

    private final VcardRepo vcardRepo;

    @Autowired
    public ApplicationController(VcardRepo vcardRepo) {
        this.vcardRepo = vcardRepo;
    }

    @GetMapping("/")
    public String index() {
        return "Авторизация прошла успешно!";
    }


    @GetMapping("/vcard_info")
    public List<Vcard> list() {
        return vcardRepo.findAll();
    }

    @GetMapping("/vcard_info/{login}")
    public Vcard getByLogin(@PathVariable("login") Vcard vcard) {
        return vcard;
    }
}