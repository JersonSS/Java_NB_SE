package Laboratorio;

public class Reto 
{
    public static void main(String[] args) 
    {
        //RETO: Dos jugadores tiene un dado cada uno, deciden jugar donde el que saque el mayor número
        //le dara S/1 al otro, el jugador A tiene S/15  el jugador B tiene S/23. Jugar hasta que uno de
        //los dos se quede sin dinero o hasta el juego #100, lo que suceda primero, Hacer una App que simule
        //dicho juego. (tiempo 20min.)
        
            int jugador_A = 15;
            int jugador_B = 23;
            int cont = 1;
            int win_a = 0;
            int win_b = 0;

            int min = 1;
            int max = 6;

            while (cont <= 100 && jugador_A > 0 && jugador_B > 0) {
                int dado_A = (int)((max - min + 1) * Math.random() + min);
                int dado_B = (int)((max - min + 1) * Math.random() + min);

                if (dado_A > dado_B) {
                    jugador_A += 1;
                    jugador_B -= 1;
                    win_a++;
                } else if (dado_B > dado_A) {
                    jugador_B += 1; 
                    jugador_A -= 1;
                    win_b++;
                }

                cont++;
            }

        System.out.println("El jugador A gano: " + win_a + " veces");
        System.out.println("El jugador B gano: " + win_b + " veces");
        System.out.println("Dinero final de jugador A: S/" + jugador_A);
        System.out.println("Dinero final de jugador B: S/" + jugador_B);

        if (jugador_A == 0) {
            System.out.println("El jugador A se quedó sin dinero. ¡Jugador B gana el juego!");
        } else if (jugador_B == 0) {
            System.out.println("El jugador B se quedó sin dinero. ¡Jugador A gana el juego!");
        } else {
            System.out.println("Se alcanzaron los 100 juegos.");
        }
    }
}
