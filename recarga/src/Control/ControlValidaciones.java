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
public class ControlValidaciones {
    
    
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
//     public String password(String PASSWORD){
//         GUILogin GL=new GUILogin();
//         int aux; 
//        if ((PASSWORD.length()) >= 8 && (PASSWORD.length()) <= 16) {
//                if (this.debil(PASSWORD) == -1) {
//                    GL.Jlbmensaje.setForeground(Color.red);
//                    GL.Jlbmensaje.setText("debil");
//
//                } else if (this.normal(PASSWORD) == -1) {
//                    GL.Jlbmensaje.setForeground(Color.yellow);
//                    GL.Jlbmensaje.setText("normal");
//                } else if (this.fuerte(PASSWORD) == -1) {
//                    GL.Jlbmensaje.setForeground(Color.GREEN);
//                    GL.Jlbmensaje.setText("fuerte");
//                } else {
//                    JOptionPane.showMessageDialog(null, "Pasword invalido");                    
//                    aux = -1;
//
//                }
//         }else{JOptionPane.showMessageDialog(null, "Pasword Minimo 8 y maximo 16 caracteres");}
//        return PASSWORD;
//     }

         public int comparacion(String pass, int n1, int n2) {
        int cont = 0;
        for (int i = 0; i < pass.length(); i++) {

            for (int j = n1; j < n2; j++) {
                if (pass.charAt(i) == (char) j) {

                    cont++;
                }
            }
        }

        return cont;
    }
         
         public int letrasmayus(String pass) {

        int com = this.comparacion(pass, 65, 90);

        return com;

    }

    public int letrasnum(String pass) {
        int com = this.comparacion(pass, 47, 58);

        return com;

    }

    public int letrasmin(String pass) {
        int com = this.comparacion(pass, 97, 122);

        return com;

    }

    public int carac(String pass) {
        int comf;
        int com1 = this.comparacion(pass, 32, 47);
        int com2 = this.comparacion(pass, 58, 64);
        int com3 = this.comparacion(pass, 91, 96);
        int com4 = this.comparacion(pass, 123, 126);
        comf = com1 + com2 + com3 + com4;

        return comf;

    }
     public int debil(String pass) {

        if (this.letrasmayus(pass.toUpperCase()) == pass.length() || this.letrasnum(pass) == pass.length()) {
            return -1;
        }
        return 0;
    }

    public int normal(String pass) {

        int nor = this.letrasmayus(pass.toUpperCase()) + this.letrasnum(pass);
        if (nor == pass.length()) {
            return -1;
        }
        return 0;
    }

    public int fuerte(String pass) {

        if (this.letrasmayus(pass) >= 2 && this.letrasmin(pass) >= 2 && this.letrasnum(pass) >= 1 && this.carac(pass) >= 1) {
            return -1;
        }
        return 0;
    }
}
