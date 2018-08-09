package com.wbg.service;


import com.wbg.dao.userstypedao;
import com.wbg.entity.userstype;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/userstype")
public class userstypeservice extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        userstypedao dao=new userstypedao();
        List<userstype> list=dao.seleAll();
        for(userstype u:list){
            System.out.println(u);
        }
    }
}
