/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mizanthecoder;

import java.io.IOException;
import java.io.StringWriter;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

/**
 *
 * @author mohdm
 */
public class CustomTagThree extends SimpleTagSupport {

    private String message;

    public void setMessage(String message) {
        this.message = message;
    }
    StringWriter sw = new StringWriter();

    @Override
    public void doTag()
            throws JspException, IOException {
        if (message != null) {
//        Use message from attribute
            JspWriter out = getJspContext().getOut();
            out.println(message);

        } else {
//        Use message from the body
            getJspBody().invoke(sw);
            getJspContext().getOut().println(sw.toString());
        }
    }
}
