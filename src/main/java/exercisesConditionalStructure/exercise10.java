/*
Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
 */

package exercisesConditionalStructure;

import java.util.Scanner;

public class exercise10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int initialHour = sc.nextInt();
        int finalHour = sc.nextInt();
        int duration;

        if (initialHour > finalHour){
            duration = 24 - (initialHour - finalHour);
            System.out.println("O JOGO DUROU " + duration + " HORA(S)");
        } else if (initialHour < finalHour) {
            duration = finalHour - initialHour;
            System.out.println("O JOGO DUROU " + duration + " HORA(S)");
        } else {
            System.out.println("O JOGO DUROU 24 HORA(S)");
        }

        sc.close();
    }
}
