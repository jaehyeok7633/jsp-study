//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.jsp.chap04.service;

import com.jsp.entity.Dancer;
import com.jsp.repository.DancerRepository;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ListService implements com.jsp.chap04.service.IDancerService {
    public ListService() {
    }

    public void execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
        List<Dancer> dancerList = DancerRepository.findAll();
        request.setAttribute("dl", dancerList);
    }
}
