/*
 * Author: Clayton Dalton <cgdalton>
 * Assignment:  qr.p2 - EE333 Spring 2022
 *
 */

package edu.uab.cgdalton.p2;

public class WapLister {

  public static void main(String[] args) {
    QrWap[] wapLister = new QrWap[5];
    wapLister[0] = new QrWap("Conference Room Guest", "CONFROOM", "WPA/WPA2", "someSecret01", false);
    wapLister[1] = new QrWap("Auditorium Guest", "AUDITORIUM", "WEP", "someSecret02", false);
    wapLister[2] = new QrWap("Staff Access", "STAFF", "WPA/WPA2", "veryVerySecret", true);
    wapLister[3] = new QrWap("General Public", "FreeWIFI", "no encryption", "", false);
    wapLister[4] = new QrWap("Fake", "Fake", "BadType", "silly", true);

    for (QrWap index : wapLister){
        System.out.println(index.getQrText());
      }
    }
}


