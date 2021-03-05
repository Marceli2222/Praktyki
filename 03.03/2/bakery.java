package com.company;

public class bakery extends shop {


  protected String p1;
  protected String p2;
  protected String p3;
  protected String p4;



  public String getP1(){
    return p1;

  }
  public String getp2(){
    return p2;

  }
  public String getP3(){
    return p3;

  }
  public String getP4(){
    return p4;

  }



  public void setP1(String p1){
    this.p1 = p1;
  }

  public void setP2(String p2){
    this.p2 = p2;
  }

  public void setP3(String p3){
    this.p3 = p3;
  }

  public void setP4(String p4){
    this.p4 = p4;
  }

  @Override
  public String getInformation() {
    System.out.println( p1+"\n"+ p2+ "\n" + p3 +"\n"+ p4);
    return super.getInformation();
  }

}