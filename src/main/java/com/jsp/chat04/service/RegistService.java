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

public class RegistService implements com.jsp.chap04.service.IDancerService {
    public RegistService() {
    }

    public void execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
        request.setCharacterEncoding("UTF-8");
        String name = request.getParameter("name");
        String crewName = request.getParameter("crewName");
        String danceLevel = request.getParameter("danceLevel");
        String[] genresArray = request.getParameterValues("genres");
        DancerRepository.save(name, crewName, danceLevel, genresArray);
        List<Dancer> dancerList = DancerRepository.findAll();
        request.setAttribute("dl", dancerList);
    }
}
