package com.rong.ssm.controller;

import com.rong.ssm.pojo.Item;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by GD14 on 2017/8/25.
 */
public class ItemController1 implements Controller{
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        List<Item> itemList=new ArrayList<Item>();

        Item item1=new Item();
        item1.setId(1);
        item1.setName(2);
        item1.setPrice(10);
        Item item2=new Item();
        item2.setId(1);
        item2.setName(2);
        item2.setPrice(3);
        itemList.add(item1);
        itemList.add(item2);
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("itemList",itemList);
        modelAndView.setViewName("/WEB-INF/jsp/item/itemsList.jsp");
        return modelAndView;
    }
}
