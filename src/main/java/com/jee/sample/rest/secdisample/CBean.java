/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jee.sample.rest.secdisample;

import java.io.Serializable;
import javax.enterprise.context.Dependent;

/**
 *
 * @author Jeeva
 */
@Dependent
public class CBean implements Serializable {

    public void test() {
        System.out.println("Inside cbean");
    }
}
