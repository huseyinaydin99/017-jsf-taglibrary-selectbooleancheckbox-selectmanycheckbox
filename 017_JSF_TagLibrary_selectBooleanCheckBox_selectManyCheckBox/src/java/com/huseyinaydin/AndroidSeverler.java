/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.huseyinaydin;

import java.util.Arrays;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author husey
 */
@ManagedBean
@RequestScoped
public class AndroidSeverler {

    /**
     * Creates a new instance of AndroidSeverler
     */
    private String[] androidSeverler;
    
    public AndroidSeverler() {
        
    }

    public String[] getAndroidSeverler() {
        return androidSeverler;
    }

    public void setAndroidSeverler(String[] androidSeverler) {
        this.androidSeverler = androidSeverler;
        for(int i = 0; i<androidSeverler.length; i++){
            System.out.println(androidSeverler[i]);
        }
    }
    
    public String[] getAndroidSeverlerIsimler(){
        androidSeverler = new String[4];
        androidSeverler[0] = "Hüseyin";
        androidSeverler[1] = "Semih";
        androidSeverler[2] = "Mehmet";
        androidSeverler[3] = "Elbistan";
        
        for(int i = 0; i<androidSeverler.length; i++){
            System.out.println(androidSeverler[i]);
        }
        return androidSeverler;
    }
    
    public String getAndroidSeverlerSonuc(){
        for(int i = 0; i<androidSeverler.length; i++){
            System.out.println(androidSeverler[i]);
        }
        return Arrays.toString(androidSeverler);
    }
}
