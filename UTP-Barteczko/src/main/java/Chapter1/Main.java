package Chapter1;

import javax.swing.*;

import static Chapter1.Main.Pora.Zima;
import static Chapter1.PoraRoku.*;
public class Main {

    //Enumeracje
    enum Pora {Zima, Wiosna, Lato, Jesien}

    public static String opisz(Pora p){
        int nr = p.ordinal() + 1;
        String txt = p + " (ma numer " + nr + ")";
        switch (p) {
            case Zima -> {return txt + " - pada śnieg.";}
            case Wiosna -> {return txt + " - kwitnie bez.";}
            case Lato -> {return txt + " - jest ciepło.";}
            case Jesien -> {return txt + " - pada deszcz";}
        }
        return "To niemożliwe";
    }


    public static void main(String[] args) {

        //Enumeracje
        /*
        String nazwa = JOptionPane.showInputDialog("Podaj porę roku:");
        try{
        Pora p = Pora.valueOf(nazwa);
        JOptionPane.showMessageDialog(null, opisz(p));
        }catch (IllegalArgumentException exception){
            //poniższe odwołanie wymaga importu statycznego
            Pora wrt = Zima;
            System.out.println("Coś nie tak spróbuj jeszcze raz");
        }
         */
        String nazwa = JOptionPane.showInputDialog("Podaj porę roku:");
        PoraRoku p = valueOf(nazwa.toUpperCase());
        System.out.println(p + " trwa miesięcy " + p.getLiczbaMiesiecy() + ", " + p.getOpis());
        System.out.println(JESIEŃ + " i " + ZIMA + " trwają miesięcy " + (JESIEŃ.getLiczbaMiesiecy()+ ZIMA.getLiczbaMiesiecy()));


    }





}
