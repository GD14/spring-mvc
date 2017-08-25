package com.rong.ssm.controller;

import com.rong.ssm.pojo.Item;
import org.springframework.web.HttpRequestHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by GD14 on 2017/8/25.
 */
public class ItemController2 implements HttpRequestHandler{
    public void handleRequest(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        List<Item> itemList=new ArrayList<Item>();

        Item item1=new Item();
        item1.setId(1);
        item1.setName(2);
        item1.setPrice(10);
        Item item2=new Item();
        item2.setId(1);
        item2.setName(3);
        item2.setPrice(3);
        itemList.add(item1);
        itemList.add(item2);


        request.setAttribute("itemList",itemList);
        request.getRequestDispatcher("/WEB-INF/jsp/item/itemsList.jsp").forward(request,response);
    }
}
