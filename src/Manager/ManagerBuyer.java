package Manager;

import Entity.Buyer;

import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class ManagerBuyer{
    private final Scanner scanner = new Scanner(System.in);
    public Buyer createPokupatel(){
        Buyer pokupatel = new Buyer();
        System.out.print("Имя: ");
        pokupatel.setFirstname(scanner.nextLine());
        System.out.print("Фамилия: ");
        pokupatel.setLastname(scanner.nextLine());
        return pokupatel;
    }

    public void printListBuyers(Buyer[] pokupateli) {
        for (int i = 0; i < pokupateli.length; i++) {
            Buyer pokupatel = pokupateli[i];
            System.out.printf(i+1+".%s %s %s%n"
                    ,pokupatel.getFirstname()
                    ,pokupatel.getLastname()
            );
        }
    }
}