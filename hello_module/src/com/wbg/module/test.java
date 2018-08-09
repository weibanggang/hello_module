package com.wbg.module;

import com.wbg.dao.userstypedao;
import com.wbg.entity.userstype;

import java.util.List;

public class test {
    public static void main(String[] args) {
        userstypedao dao=new userstypedao();
        List<userstype> list=dao.seleAll();
        for(userstype u:list){
            System.out.println(u);
        }
    }
}
