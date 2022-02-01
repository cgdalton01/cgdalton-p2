/*
 * Author: Clayton Dalton <cgdalton>
 * Assignment:  qr.p2 - EE333 Spring 2022
 *
 */

package edu.uab.cgdalton.p2;

/**
 *
 * @author cgdal
 */
public class QrRecord {
  private static long count = 1000000000;

  private String uid; // a unique ID (ten-digit String)
  private String description; // a one-line description
  private String url; // a valid url

    public QrRecord(String description, String url) {
    this.description = description;
    this.url = url;
    uid = "" + ++count;
    }
    
public String getUid() {
    return uid;
  }

public String getDescription() {
    return description;
  }

public String getQrText() {
    return isValid() ? url : null;
  }

public Boolean isValid() {

    // regular expression test does not like to be fed a null url
    if (url == null) {
      return false;
    }
    else
      return true;
}
public void setDescription(String description) {
    this.description = description;
  }
}
