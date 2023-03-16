/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.UserModel;

import com.mycompany.HelperClasses.AdminDto;
import com.mycompany.HelperClasses.FirstClassDto;
import com.mycompany.HelperClasses.UpdateNewsDTo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author root
 */
public interface Queries {
    public int insertAdmin(AdminDto dto);
    public String validateLadminName(AdminDto dto);
    public String validateFadminName(AdminDto dto);
    public String validatePassword(AdminDto dto);
    public  int updatePassword(AdminDto dto);
    public ArrayList<UpdateNewsDTo> upadtenews(UpdateNewsDTo dto);
    public List<FirstClassDto>getStudentDetails() ;
    public int deleteStudent(AdminDto dto);

        
    
    
    
}
