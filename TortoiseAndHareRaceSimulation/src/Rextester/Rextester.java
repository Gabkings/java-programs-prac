
package Rextester;
import java.util.*;
import java.lang.*;

class Rextester {

    private static char TRace[] = new char[100];
    private static char HRace[] = new char[100];
    private static int currT;
    private static int currH;
    private static int l;

    public Rextester() {
        l = TRace.length;
        for (int i = 0; i < l; i++) {
            TRace[i] = ' ';
            HRace[i] = ' ';
        }
        currT = 0;
        currH = 0;

    }

    public void displayProgress() {
        System.out.print("Tortoise progress:\n");
        for (int i = 0; i < l; i++) {
            System.out.print(TRace[i] + " ");
        }
        System.out.print("\n");
        System.out.print("Hare progress:\n");
        for (int j = 0; j < l; j++) {
            System.out.print(HRace[j] + " ");
        }
        System.out.print("\n");
    }

    public void winHareloseTortoise() {
        System.out.println("AND THE EPIC RACE IS OVER!!!\nAND IT SEEMS THE WINNER IS NONE OTHER THAN\n\nYESS!!!....THE HARE\n\n");
        System.out.println("Of course we all know the tortoise is a tough opponent\nBetter luck next time our good Mr.Tortoise!");
    }

    public void winTortoiseloseHare() {
        System.out.println("AND THE EPIC RACE IS OVER!!!\nAND IT SEEMS THE WINNER IS NONE OTHER THAN\n\nYESS!!!....THE TORTOISE");
        System.out.println("The hare has lost\nBetter luck next time our clever Mr.Hare!");
    }

    public void removeCharFromTrack() {
        TRace[currT] = ' ';
        HRace[currH] = ' ';
    }

    public void placeCharOnTrack() {
        TRace[currT] = 'T';
        HRace[currH] = 'H';
    }

    public void welcomeAudience() {
        System.out.println("Welcome ladies and gentlemen and variations thereupon!\nYou are about to witness the most famous race on this  planet");
        System.out.println("So brace yourself and sit tight\n\nLet no wailing babies or barking bosses distract you!");
        System.out.println("We have the humble tortoise on my right and the proud hare on my left");
        System.out.println("\nREADY..GET..SET...\nBANG!!\nAND THEY ARE GONE");
    }

    public static void main(String args[]) {
        Random rd = new Random();
        Rextester ob1 = new Rextester();
        ob1.welcomeAudience();
        int hMove = 0, tMove = 0, hareWin = 0, tortoiseWin = 0, h, t;
        ob1.placeCharOnTrack();
        while (hareWin == 0 || tortoiseWin == 0) {
            ob1.removeCharFromTrack();
            h = 1 + rd.nextInt(5);
            t = 1 + rd.nextInt(5);
            if (h == 1) {
                hMove = 0;
            }
            if (h == 2) {
                hMove = 5;
            }
            if (h == 3) {
                hMove = 8;
            }
            if (h == 4) {
                hMove = 3;
            }
            if (h == 5) {
                hMove = -5;
            }

            if (t == 1) {
                tMove = 1;
            }
            if (t == 2) {
                tMove = 4;
            }
            if (t == 3) {
                tMove = 3;
            }
            if (t == 4) {
                tMove = 2;
            }
            if (t == 5) {
                tMove = -1;
            }
            currT += tMove;
            currH += hMove;
            if (currT == 99) {
                tortoiseWin = 1;
                ob1.winTortoiseloseHare();
            } else if (currH == 99) {
                hareWin = 1;
                ob1.winHareloseTortoise();
            }

            ob1.placeCharOnTrack();
            System.out.println();
            ob1.displayProgress();

        }
    }
}
