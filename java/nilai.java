import java.util.Scanner;
import javax.script.ScriptContext;

public class Main {
    public static void main(String[] args) {
        Scanner sc = newScanner(System.in);
        System.out.println("Masukkan niali tugas");
        double tugas = scnextDouble();
        System.out.println("Masukkan nilai UTS:");
        double uts = scnextDouble();
        System.out.println("Masukkan nilai UAS:");
        double uas = scnextDouble();

        double nilaiAkhir = (0.3 * tugas) + (0.3 * uts) + (0.4 * uas);
        
        System.out.println("Nilai Akhir = " + nilaiAkhir);
        if (nilaiAkhir > = 60)
            System.out.println("Status:LULUS");
        elsa
            System.out.println("Status: TIDAK LULUS");
    }
}
