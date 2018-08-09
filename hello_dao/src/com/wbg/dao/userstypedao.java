package com.wbg.dao;

import com.wbg.entity.userstype;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class userstypedao {
    public List<userstype> seleAll(){
        String sql="select * from userstype";
        List<userstype> list=new ArrayList<userstype>();
        ResultSet rs=DBUtil.executeQuery(sql);
        userstype us=null;
        try {
            while (rs.next()){
                us=new userstype(rs.getInt(1),rs.getString(2),rs.getString(3));
                 list.add(us);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            try {
                rs.close(); ;
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return list;
    }
}
