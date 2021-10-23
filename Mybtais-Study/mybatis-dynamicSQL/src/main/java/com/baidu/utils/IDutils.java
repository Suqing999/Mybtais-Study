package com.baidu.utils;

import org.junit.Test;

import java.util.UUID;

@SuppressWarnings("all")
public class IDutils {

    public static String getId(){

        //return UUID.randomUUID().toString();//24cb5139-7a29-41bf-a0dd-b8f2de1eadec

        return UUID.randomUUID().toString().replaceAll("-","");
    }

    @Test
    public void test(){
        System.out.println(getId());
    }
}
