/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10116058.latihan19.saldo;

public class PBO210116058Latihan19Saldo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double saldoAwal = 2500000;
        double bunga = 0.15;

        int bulan = 0;

        while (bulan <= 5) {
            bulan = bulan + 1;
            saldoAwal = saldoAwal * bunga + saldoAwal;
            System.out.println("Saldo di bulan ke-" + bulan + " Rp"
                    + saldoAwal);

        }
    }

} static void main(String[] args) {
        // TODO code application logic here
    }
    
}
