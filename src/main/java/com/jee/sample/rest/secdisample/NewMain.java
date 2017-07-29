/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jee.sample.rest.secdisample;

/**
 *
 * @author Jeeva
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new NewMain();
    }

    public NewMain() {
        CDIContext context = CDIContext.INSTANCE;
        CBean cbean = context.getBean(CBean.class);
        cbean.test();
    }

}
