/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mizanthecoder;

import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.TagSupport;

/**
 *
 * @author mohdm
 */
public class DateTimeTag extends TagSupport {

    @Override
    public int doStartTag() throws JspException {
        DateFormat df = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.MEDIUM);
        try {
            pageContext.getOut().write(df.format(new Date()));

        } catch (IOException e) {
            throw new JspTagException(e.getMessage());

        }
        return SKIP_BODY;
    }

}
