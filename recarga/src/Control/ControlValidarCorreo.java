/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

/**
 *
 * @author Mauricio
 */
public class ControlValidarCorreo {
    
     public int validaremail(String TxtEmail) {
        try {
            String em[] = TxtEmail.split("@");
            if (em[1].compareTo("hotmail.com") == 0) {
                return 0;
            } else if (em[1].compareTo("hotmail.es") == 0) {
                return 0;
            } else if (em[1].compareTo("gmail.com") == 0) {
                return 0;
            } else if (em[1].compareTo("zoho.com") == 0) {
                return 0;
            } else if (em[1].compareTo("outlook.com") == 0) {
                return 0;
            } else if (em[1].compareTo("mail.com") == 0) {
                return 0;
            } else if (em[1].compareTo("yahoo.com") == 0) {
                return 0;
            } else if (em[1].compareTo("gmx.com") == 0) {
                return 0;
            } else if (em[1].compareTo("fastmail.com") == 0) {
                return 0;
            } else if (em[1].compareTo("hushmail.com") == 0) {
                return 0;
            } else if (em[1].compareTo("inbox.com") == 0) {
                return 0;
            } else if (em[1].compareTo("shortmail.com") == 0) {
                return 0;
            } else {
                return -1;
            }
        } catch (Exception e) {
            return -1;
        }

    }
}
