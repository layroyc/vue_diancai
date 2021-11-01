package com.xiexin.bean;

import java.io.Serializable;

/**
 * person
 * @author 
 */
public class Person implements Serializable {
    private Integer personId;

    private String personName;

    private Integer personSal;

    private Integer personMoney;

    private String personPic;

    private static final long serialVersionUID = 1L;

    public Integer getPersonId() {
        return personId;
    }

    public void setPersonId(Integer personId) {
        this.personId = personId;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public Integer getPersonSal() {
        return personSal;
    }

    public void setPersonSal(Integer personSal) {
        this.personSal = personSal;
    }

    public Integer getPersonMoney() {
        return personMoney;
    }

    public void setPersonMoney(Integer personMoney) {
        this.personMoney = personMoney;
    }

    public String getPersonPic() {
        return personPic;
    }

    public void setPersonPic(String personPic) {
        this.personPic = personPic;
    }
}