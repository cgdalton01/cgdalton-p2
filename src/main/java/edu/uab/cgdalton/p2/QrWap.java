/*
 * Author: Clayton Dalton <cgdalton>
 * Assignment:  qr.p2 - EE333 Spring 2022
 *
 */

package edu.uab.cgdalton.p2;

public class QrWap extends QrRecord {
String description;
private String ssid;
private String networkType;
private String password;
private Boolean isHidden;
private Boolean isValid;

public QrWap(String description, String ssid, String networkType, String password, boolean isHidden)
{
    super(description, "");
    this.description = description;
    this.ssid = ssid;
    this.networkType = networkType;
    this.password = password;
    this.isHidden = isHidden;
}
    @Override
public String getDescription(){
    return description;
}
public String getSsid()
{
    return ssid;
}
public String getPassword(){
    return password;
}
public String getNetworkType(){
    return networkType;
}
@Override
public String getQrText(){
    if (isValid = true)
        return "WIFI:"
            + "S:"
            + ssid
            + ";"
            + "T:"
            + networkType
            + ";"
            + "P:"
            + password
            + ";"
            + "H:"
            + isHidden
            + ";";
    else
        return "";
}
public Boolean isHidden(){
    return isHidden;
}

@Override
public Boolean isValid()
{ 
    if (("".equals(description)) || (description == null))
    {
        isValid = false;
        return isValid;
    }
    else if (("".equals(ssid)) || (ssid == null))
    {
        isValid = false;
        return isValid;
    }  
    else if (("".equals(networkType)) || (networkType == null))
    {
        isValid = false;
        return isValid;
    }
    else if (("".equals(password)) || (password == null))
    {
        isValid = false;
        return isValid;
    }
    else if (("".equals(isHidden)) || (isHidden == null))
    {
        isValid = false;
        return isValid;
    }
    else
    {
        isValid = true;
        return isValid;
    }
}
@Override
public String toString(){
    return "QrWap: " + description;
}
@Override
public void setDescription(String description){
    this.description = description;
}
public void setSsid(String ssid){
    this.ssid = ssid;
}
public void setPassword(String password){
    this.password = password;
}
public void setNetworkType(String networkType){
    this.networkType = networkType;
}
public void setHidden(Boolean isHidden){
    this.isHidden = isHidden;
}
}
