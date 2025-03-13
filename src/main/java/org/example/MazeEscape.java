import java.util.Scanner;

// Eccezione personalizzata per movimenti fuori dai limiti
class OutOfBoundsException extends Exception {
    public OutOfBoundsException(String message) {
        super(message);
    }
}

// Eccezione personalizzata per collisione con muri
class WallCollisionException extends Exception {
    public WallCollisionException(String message) {
        super(message);
    }
}

public class MazeEscape {
    // Dichiarazione della matrice del labirinto
    private static final char[][] LABIRINTO = {
        { 'P', '.', '#', '.', '.' },
        { '#', '.', '#', '.', '#' },
        { '.', '.', '.', '#', '.' },
        { '#', '#', '.', '.', '.' },
        { '#', '.', '#', '#', 'E' }
    };

    // Coordinate iniziali del giocatore
    private static int playerX = 0;
    private static int playerY = 0;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean escaped = false;

        System.out.println("Benvenuto in Maze Escape! Trova l'uscita ('E').");

        while (!escaped) {
            printMaze();
            System.out.print("Muoviti (W = su, A = sinistra, S = giù, D = destra): ");
            char move = scanner.next().toUpperCase().charAt(0);

            try {
                // Chiamare il metodo per muovere il giocatore
                // Verificare se ha raggiunto l'uscita e terminare il gioco
            } catch (OutOfBoundsException | WallCollisionException e) {
                // Stampare il messaggio di errore dell'eccezione
            }
        }

        scanner.close();
    }

    /**
     * Metodo per spostare il giocatore all'interno del labirinto
     * Deve controllare:
     * - Se il movimento è fuori dai limiti → lancia OutOfBoundsException
     * - Se il movimento porta su un muro ('#') → lancia WallCollisionException
     * - Se il movimento è valido, aggiornare la posizione
     */
    private static void movePlayer(char direction) throws OutOfBoundsException, WallCollisionException {
        // Dichiarare nuove variabili per la posizione dopo il movimento
        
        // Switch-case per aggiornare le nuove coordinate in base alla direzione
        
        // Controllare se il movimento è fuori dalla matrice e lanciare OutOfBoundsException
        
        // Controllare se il movimento porta su un muro e lanciare WallCollisionException
        
        // Aggiornare la matrice con la nuova posizione del giocatore
    }

    /**
     * Metodo per stampare il labirinto attuale
     */
    private static void printMaze() {
        // Stampare la matrice riga per riga
    }
}
