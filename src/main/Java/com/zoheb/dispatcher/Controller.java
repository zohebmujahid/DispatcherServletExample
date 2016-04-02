package com.zoheb.dispatcher;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by zoheb on 4/1/16.
 */
public class Controller extends AbstractController{
    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        ModelAndView model = new ModelAndView("WelcomePage");
        model.addObject("msg", "This is it !!");
        return model;
    }
}
