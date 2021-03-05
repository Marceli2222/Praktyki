package com.company;

public class shop {
  protected  String adress ;
    protected String size ;

    public String getInformation(){
        return "adress "+ adress + " size " +size;
    }

public String getAdress(){
return adress;

}

    public String getSize(){
        return size;

    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
