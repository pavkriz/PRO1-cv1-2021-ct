package cz.uhk.pro1.cv1;

import javax.sound.midi.SysexMessage;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        for (int i = 6; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }

        }

        int ar[] = {1, 8, 2, 6, 10, 8};
        String intNeedleStr = JOptionPane.showInputDialog("Zadej hledane cislo");
        int intNeedle = Integer.parseInt(intNeedleStr);
        for(int i = 0; i < ar.length; i++) {
            System.out.println("i="+i);
            if(ar[i] == intNeedle){
                System.out.println("Found: i=" + i);
                break;
            }
        }

        int y = 10; // | 10 |

        String arStr[] = {"Jan", "Sabina", "Robin", "Eva", "Eliška"};
        String needle = JOptionPane.showInputDialog("Zadej hledane jmeno");
        // | *-> |     | i: 10, j:20 |
        System.out.println("Hledam "+needle);
        for(int i = 0; i < arStr.length;++i)
        {
            if(arStr[i].equals(needle)) {
                System.out.println("Found str i="+ i);
            }
        }
    }
}
