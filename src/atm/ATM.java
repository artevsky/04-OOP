package atm;

import java.util.Scanner;

public class ATM {

    private int c20;
    private int c50;
    private int c100;
    int balance = c100 * 100 + c50 * 50 + c20 * 20;


    Scanner scan = new Scanner(System.in);

    public ATM(int c20, int c50, int c100) {
        this.c20 = c20;
        this.c50 = c50;
        this.c100 = c100;
    }

    public void mainMenu() {
        int balance = c100 * 100 + c50 * 50 + c20 * 20;
        System.out.println("Остаток в банкомате:\n**** " + c100 + " по 100 ***\n**** " + c50 + " по 050 ***\n*** " + c20 + " по 020 ***\nОбщая сумма: " + balance);
        System.out.println("Введите 'внесение', чтобы добавить денег\n" + "Введите 'снятие', чтобы снять деньги\n" + "Введите 'выход', чтобы выйти из ATM: ");
        String action = scan.next();
        if (action.equals("внесение")) {
            addCash();
            mainMenu();
        } else if (action.equals("снятие")) {
            wdCash();
            mainMenu();
        } else if (action.equals("выход")) {
            System.exit(0);
        } else {
            System.out.println("Комманда не коректна, повторите ввод\n");
            mainMenu();
        }
    }

    public void addCash() {
        c20 += 1;
        c50 += 1;
        c100 += 1;
    }

    public void wdCash() {
        System.out.println("Введите желамую сумму: ");
        int cash = scan.nextInt();
        int balance = c100 * 100 + c50 * 50 + c20 * 20;

        if (cash > balance) {
            System.out.println("Недостаточно средств в банкомате\n");
            return;
        }
        for (int i = 0; i <= c20; i++) {
            for (int j = 0; j <= c50; j++) {
                for (int k = 0; k <= c100; k++) {
                    if (cash == i * 20 + j * 50 + k * 100) {
                        System.out.print("Выдано:\n " + k + " номиналом 100\n " + j + " номиналом 50\n " + i + " номиналом 20\n");
                        c100 -= k;
                        c50 -= j;
                        c20 -= i;
                        return;
                    }
                    if (i == c20 && j == c50 && k == c100) {
                        System.out.print("В данный момент невозможно выдать такую сумму\n");
                        return;
                    }
                }
//        } else if ((cash < balance) && (soten <= c100)) {
//            c100 -= cash / 100;
//            c50 -= (cash % 100) / 50;
//            c20 -= (cash%50)/20;
////            System.out.println("Недостаточно средств в банкомате\n");
////            System.out.println("Недостаточно средств в банкомате\n");

            }
        }
    }
}

