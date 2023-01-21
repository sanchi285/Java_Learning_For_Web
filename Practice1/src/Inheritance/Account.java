package Inheritance;

public class Account {

    private String accNo;
    private String userName;
    private String userAddress;
    private String dob;
    private String phone;


    public Account(String an, String un,String ua, String dob, String phone){
        accNo = an;
        userName = un;
        userAddress=ua;
        this.dob=dob;
        this.phone = phone;
    }

    public void setAccNo(String val){accNo = val;}
    public void setName(String val){userName = val;}
    public void setUserAddress(String val){userAddress = val;}
    public void setDob(String val){dob = val;}
    public void setPhone(String val){phone = val;}


}

