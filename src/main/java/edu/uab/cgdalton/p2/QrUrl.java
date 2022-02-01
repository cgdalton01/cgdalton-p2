/*
 * Author: Clayton Dalton <cgdalton>
 * Assignment:  qr.p2 - EE333 Spring 2022
 *
 */

package edu.uab.cgdalton.p2;

import java.util.regex.Pattern;

public class QrUrl extends QrRecord {
  private static long count = 1000000000;
    
  private String uid; // a unique ID (ten-digit String)
  private String description; // a one-line description
  private String url; // a valid url

  public QrUrl(String description, String url) {
    super(description, url);
    this.description = description;
    this.url = url;
    uid = "" + ++count;
  }

  public String getUid() {
    return uid;
  }

  /**
   * get the description of the object
   *
   * @return description
   */
  public String getDescription() {
    return description;
  }

  /**
   * get the text to use in the QR code creation if it is valid, null otherwise
   *
   * @return url text representation
   */
  public String getQrText() {
    return isValid() ? url : null;
  }

  /**
   * is the object valid
   *
   * @return true if valid otherwise false
   */
  public Boolean isValid() {

    // regular expression test does not like to be fed a null url
    if (url == null) {
      return false;
    }

    /*
     * Regular Expression Test is from https://www.geeksforgeeks.org/check-if-an-url-is-valid-or-not-using-regular-expression/
     */
    var p =
        Pattern.compile(
            "((http|https)://)(www.)?"
                + "[a-zA-Z0-9@:%._\\+~#?&//=]"
                + "{2,256}\\.[a-z]"
                + "{2,6}\\b([-a-zA-Z0-9@:%"
                + "._\\+~#?&//=]*)");
    var m = p.matcher(url);
    return m.matches();

    // ************************
    // Simpler solution
    // See if the java.net.URL class likes the URL
    // It likes too many things that are not right

    // try {
    //   var testing = new URL(url);
    // } catch (MalformedURLException e) {
    //   return false;
    // }

    // URLs can not contain spaces

    // return !url.contains(" ");

    // ************************
  }

  /**
   * Get a text representation of object consisting of description: url
   *
   * @return text representation
   */
  @Override
  public String toString() {
    return description + ": " + description;
  }

  /**
   * set (or change) the URL, it will affect the validity of the object
   *
   * @param url new url
   */
  public void setUrl(String url) {
    this.url = url;
  }
}
