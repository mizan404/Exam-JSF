/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mizanthecoder;

import java.io.IOException;
import java.io.StringWriter;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import org.apache.jasper.el.JspELException;

/**
 *
 * @author mohdm
 */
public class CustomTagTwo extends SimpleTagSupport {

    StringWriter sw = new StringWriter();

    @Override
    public void doTag()throws JspException, IOException {
        getJspBody().invoke(sw);
        getJspContext().getOut().println(sw.toString());
    }
}
