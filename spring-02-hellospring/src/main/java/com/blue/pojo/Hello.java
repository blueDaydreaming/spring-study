package com.blue.pojo;

public class Hello {
    String idname;

    public String getIdname() {
        return idname;
    }

    public void setIdname(String idname) {
        this.idname = idname;
    }

    public void show() {
         System.out.println("Hello"+idname);;
    }
}
