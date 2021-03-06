package com.neusoft.domain;

public class AccountUser extends Account
{
    private String username;
    private String adrress;

    public String getUsername()
    {
        return username;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }

    public String getAdrress()
    {
        return adrress;
    }

    public void setAdrress(String adrress)
    {
        this.adrress = adrress;
    }

    @Override
    public String toString()
    {
        return super.toString() + "AccountUser{" +
                "username='" + username + '\'' +
                ", adrress='" + adrress + '\'' +
                '}';
    }
}
