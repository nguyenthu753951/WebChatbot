package com.family.controller;
import com.family.dto.GioHangItem;
import com.family.dto.Menu;
import com.family.repository.MenuRepository;
import com.family.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;


@Controller
public class HomeController {

    @Autowired
    MenuRepository menuRepository;

    @Autowired
    HttpSession httpSession;

    @RequestMapping(value = {"","/", "/home/index", "/index"}, method = RequestMethod.GET)
    public ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView("index");
        List<Menu> menuList = menuRepository.findAll();
        modelAndView.addObject("menuList", menuList);

        List<GioHangItem> gioHang = (List<GioHangItem>) httpSession.getAttribute("gioHang");
        if (gioHang == null) {
            gioHang = new ArrayList<>();
        }
        modelAndView.addObject("giohang",gioHang);

        return modelAndView;
    }
 
}