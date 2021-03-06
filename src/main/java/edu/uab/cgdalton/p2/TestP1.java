/*
 * Author: Clayton Dalton <cgdalton>
 * Assignment:  qr.p2 - EE333 Spring 2022
 *
 */

package edu.uab.cgdalton.p2;

/**
 * Test Project P1 of EE333 Spring 2022
 */
public class TestP1 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    System.out.println("Clayton Dalton, cgdalton@uab.edu");  // change

    var uab = new QrUrl("UAB", "https://www.uab.edu");
    var error1 = new QrUrl("Error 1", null);
    var error2 = new QrUrl("Error 2", "");
    var error3 = new QrUrl("Error 3", "https://x /world");
    var error4 = new QrUrl("Error 4", "https://x.com/w o r l d");
    var ee333 = new QrUrl("EE333 Canvas", "https://uab.instructure.com/courses/1585540");

    checkout(uab, true);
    checkout(error1, false);
    checkout(error2, false);
    checkout(error3, false);
    checkout(error4, false);
    checkout(ee333, true);
  }

  /**
   * Helper to check out a QrUrl object
   */
  private static void checkout(QrUrl qrUrl, boolean valid) {
    System.out.println(qrUrl);

    System.out.println("uid: " + qrUrl.getUid());
    System.out.println("description: " + qrUrl.getDescription());
    System.out.println("url: " + qrUrl.getQrText());
    System.out.println("valid: " + qrUrl.isValid());

    if (qrUrl.isValid() != valid) {
      System.out.println(qrUrl.getDescription() + " was " + qrUrl.isValid() + " unexpectedly.");
    }
  }
}
