

import java.util.Scanner;
public class DemoPabellonCirugia {
        Scanner sc = new Scanner(System.in);
        PabellonCirugia[]pabellones =  new PabellonCirugia[6];
    public static void main(String[] args) {
        DemoPabellonCirugia d = new DemoPabellonCirugia();
        d.procesa();
    }
    public void procesa() {

        for (int i = 0; i < pabellones.length; i++) {
            System.out.println("posicion " + (i + 1) + ":");
            System.out.println("ingrese numero pabellon");
            int numero = sc.nextInt();
            System.out.println("ingrese especialidad");
            String especialidad = sc.next();
            pabellones [i]= new PabellonCirugia(numero, especialidad );
        }
        for (int i = 0; i < pabellones.length ; i+=2) {
            pabellones[i].setEstado(Estado.OCUPADO);
        }
        for (int i = 0; i < pabellones.length; i++) {
            for (int j = i + 1; j < pabellones.length; j++) {

                if (pabellones[i].equals(pabellones[j])) {
                    System.out.println("Pabellones iguales en posiciones: " + i + " y " + j);
                }

            }
        }
    }
}

