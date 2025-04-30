package Principal;

import Controller.ControllerJugador;
import Model.Jugador;
import Utils.Leer;
import Vista.Menu;

public class Principal {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        ControllerJugador ca;
        int opcion,jugadores,filas,columnas,contador=0;
        String nombrePlayer;
        Jugador bingoWinner = null;
        Jugador lineWinner;
        boolean lineWinned = false;
        boolean isBingo = false;

        // 1. Imprimimos bienvenida
        Menu.printWelcome();

        // 2. Pedimos datos del juego
        System.out.println("Introduzca el numero de jugadores maximos: ");
        jugadores = Leer.datoInt();
        while(jugadores<=0) {
        	if(contador>0) {
        		System.out.println("No se va a romper no insistas porfa, el programa sufre :(");
        	}
        	System.out.println("Valor inválido, introduzca otro porfavor:");
        	jugadores = Leer.datoInt();
        	contador++;
        	
        	
        }
       contador = 0;
        System.out.println("Introduzca el numero de filas del carton: ");
        filas = Leer.datoInt();
        while(filas<=0) {
        	if(contador>0) {
        		System.out.println("No se va a romper no insistas porfa, el programa sufre :(");
        	}
        	System.out.println("Valor inválido, introduzca otro porfavor:");
        	filas = Leer.datoInt();
        	contador++;
        	
        	
        }
        contador = 0;
        System.out.println("Introduzca el numero de columnas del carton: ");
        columnas = Leer.datoInt();
        while(columnas<=0) {
        	if(contador>0) {
        		System.out.println("No se va a romper no insistas porfa, el programa sufre :(");
        	}
        	System.out.println("Valor inválido, introduzca otro porfavor:");
        	columnas = Leer.datoInt();
        	contador++;
        	
        	
        }

        // 3. Inicializamos controllers
        ca = new ControllerJugador(jugadores, filas, columnas);

        do {
            // 4. Imprimimos menu y preguntamos por opcion
            Menu.printOptionMenu();
            opcion = Leer.datoInt();

            switch (opcion) {
                case 1:

                    // Si hay suficnentes jugadores, jugamos
                    if (ca.enoughPlayers()) {

                        while (!isBingo) {
                            Jugador[] players = ca.playRound();
                            for (Jugador jugador : players) {
                                if (jugador != null) {
                                    jugador.printCarton();
                                }
                            }
                            lineWinner = ca.findLinePlayer();
                            bingoWinner = ca.findBingoPlayer();
                            if (lineWinner != null && !lineWinned) {
                                Menu.printLineWinner(lineWinner);
                                lineWinned = true;
                            }

                            if (bingoWinner != null) {
                                isBingo = true;
                            } else {
                                System.out.println("...Pulse ENTER para continuar");
                                Leer.dato();
                            }

                        }

                        Menu.printBingoWinner(bingoWinner);

                    } else { // Si no hay suficientes jugadores mostramos un mensaje
                        System.out.println("No hay suficientes jugadores. Por favor cree alguno.");
                    }

                    break;
                case 2:
                    // Pedimos nombre de jugador nuevo e intentamos crearlo
                    System.out.println("Introduzca nombre del jugador nuevo: ");
                    nombrePlayer = Leer.dato();
                    Jugador newPlayer = ca.createPlayer(nombrePlayer);

                    //  Si al crear el jugador no hay mas espacio, devolveremos un nulo que usaremos aqui
                    if (newPlayer != null) {
                        System.out.println("Jugador " + nombrePlayer + " creado correctamente.");
                    } else {
                        System.out.println("No se permite la creacion de mas jugadores.");
                    }
                    break;

                case 3:
                    Menu.exit();
                    break;
            }
        } while (opcion != 3 && !isBingo);
        
        Menu.printWinnerText();
    }
}
