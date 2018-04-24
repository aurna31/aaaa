package controller;

import model.modClass;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@SessionScoped
@ManagedBean(name = "aurna")
public class conClass extends modClass {
    modClass md= new modClass();
    public conClass() {
    }

    public modClass getMd() {
        return md;
    }

    public void setMd(modClass md) {
        this.md = md;
    }


    public String isNext()
    {
        return "next";
    }
}
