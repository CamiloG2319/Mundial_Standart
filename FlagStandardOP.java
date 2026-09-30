import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FlagStandardOP{

    // Cada carácter del CSV ('1'..'9') corresponde a una posición (0..8) de este arreglo
    static final String[] COLORES = {
        ConsoleColors.YELLOW_BACKGROUND,  // '1'
        ConsoleColors.ORANGE_BACKGROUND,  // '2'
        ConsoleColors.RED_BACKGROUND,     // '3'
        ConsoleColors.PURPLE_BACKGROUND,  // '4'
        ConsoleColors.BLUE_BACKGROUND,    // '5'
        ConsoleColors.GREEN_BACKGROUND,   // '6'
        ConsoleColors.WHITE_BACKGROUND,   // '7'
        ConsoleColors.BLACK_BACKGROUND,   // '8'
        ConsoleColors.BROWN_BACKGROUND    // '9'
    };

    // Pinta una bandera de 10 filas que empieza en filaInicio (numeración desde 1, como en el CSV)
    static void pintarBandera(char[][] matriz, int filaInicio) {
        System.out.println("--------------------------------");
        for (int fila = filaInicio - 1; fila < filaInicio + 9; fila++) {
            for (int columna = 0; columna < matriz[fila].length; columna++) {
                char c = matriz[fila][columna];
                if (c >= '1' && c <= '9') {
                    System.out.print(COLORES[c - '1'] + "   ");
                }
                System.out.print(ConsoleColors.RESET);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        /* ---------- Matriz de configuración: carga el CSV ---------- */
        char[][] matriz = new char[480][15];

        BufferedReader archivo = new BufferedReader(
            new FileReader("recursos/Flags.csv")
        );

        String linea;
        int fila = 0;

        while ((linea = archivo.readLine()) != null && fila < matriz.length) {
            String[] columnas = linea.split(";");
            for (int columna = 0; columna < columnas.length; columna++) {
                matriz[fila][columna] = columnas[columna].charAt(0);
            }
            fila++;
        }
        archivo.close();

        /* ---------- Países y fila donde empieza cada bandera ---------- */
        String[] paises = {
            "Inglaterra", "España", "Francia", "Cabo Verde", "Arabia Saudita",
            "Corea del Sur", "Congo RD", "Ecuador", "Estados Unidos", "Argentina",
            "Brasil", "Canadá", "Costa de Marfil", "Jordania", "Alemania",
            "Japón", "Colombia", "Bélgica", "Turquía", "Sudáfrica",
            "Chequia", "Suiza", "Portugal", "Egipto", "Paraguay",
            "Escocia", "Haití", "Argelia", "México", "Marruecos",
            "Austria", "Noruega", "Bosnia y Herzegovina", "Túnez", "Croacia",
            "Países Bajos", "Uruguay", "Qatar", "Australia", "Nueva Zelanda",
            "Senegal", "Ghana", "Panamá", "Irak", "Suecia",
            "Curazao", "Irán", "Uzbekistán"
        };

        // Índice = número de país - 1. Valor = fila del CSV donde empieza la bandera.
        // 0 significa "todavía sin asignar".
        int[] inicioFila = new int[paises.length];
         
            inicioFila[0]  = 61; // 1. Inglaterra
            inicioFila[0]  = 61;// 2. España
            inicioFila[0]  = 61;// 3. Francia
            inicioFila[0]  = 61;// 4. Cabo Verde
            inicioFila[0]  = 61;// 5. Arabia Saudita
            inicioFila[0]  = 61;// 6. Corea del Sur
            inicioFila[0]  = 61; // 7. Congo RD
            inicioFila[0]  = 61; // 8. Ecuador
            inicioFila[0]  = 61; // 9. Estados Unidos
            inicioFila[0]  = 61; // 10. Argentina
            inicioFila[0]  = 61; // 11. Brasil
            inicioFila[0]  = 61; // 12. Canadá
            inicioFila[0]  = 61; // 13. Costa de Marfil
            inicioFila[0]  = 61; // 14. Jordania
            inicioFila[0]  = 61; // 15. Alemania
            inicioFila[0]  = 61;  // 16. Japón
            inicioFila[0]  = 61; // 17. Colombia
            inicioFila[0]  = 61; // 18. Bélgica
            inicioFila[0]  = 61; // 19. Turquía
            inicioFila[0]  = 61; // 20. Sudáfrica
            inicioFila[0]  = 61; // 21. Chequia
            inicioFila[21] = 221; // 22. Suiza
            inicioFila[22] = 241; // 23. Portugal
            inicioFila[23] = 231; // 24. Egipto
            inicioFila[24] = 211; // 25. Paraguay
            inicioFila[25] = 201; // 26. Escocia
            inicioFila[26] = 251; // 27. Haití
            inicioFila[27] = 261; // 28. Argelia
            inicioFila[0]  = 61; // 29. México
            inicioFila[0]  = 61; // 30. Marruecos
            inicioFila[0]  = 61; // 31. Austria
            inicioFila[0]  = 61; // 32. Noruega
            inicioFila[0]  = 61; // 33. Bosnia y Herzegovina
            inicioFila[0]  = 61; // 34. Túnez
            inicioFila[0]  = 61; // 35. Croacia
            inicioFila[0]  = 61; // 36. Países Bajos
            inicioFila[0]  = 61; // 37. Uruguay
            inicioFila[0]  = 61; // 38. Qatar
            inicioFila[0]  = 61; // 39. Australia
            inicioFila[0]  = 61; // 40. Nueva Zelanda
            inicioFila[0]  = 61; // 41. Senegal
            inicioFila[0]  = 61; // 42. Ghana
            inicioFila[0]  = 61; // 43. Panamá
            inicioFila[0]  = 61; // 44. Irak
            inicioFila[0]  = 61; // 45. Suecia
            inicioFila[0]  = 61;  // 46. Curazao
            inicioFila[0]  = 61;  // 47. Irán
            inicioFila[0]  = 61;  // 48. Uzbekistán             

            
        /* ---------- Menú ---------- */
        System.out.println("+------+---------------------------+");
        System.out.println("| Num  | País                      |");
        System.out.println("+------+---------------------------+");
        for (int i = 0; i < paises.length; i++) {
            System.out.println("| " + (i + 1) + "\t| " + paises[i]);
        }
        System.out.println("+------+---------------------------+");

        /* ---------- Control de errores ---------- */
        int flag = 0;
        while (flag < 1 || flag > paises.length) {
            System.out.print("Ingresa un número de país (1-" + paises.length + "): ");
            try {
                flag = sc.nextInt();
                if (flag < 1 || flag > paises.length) {
                    System.out.println("Inválido: debe estar entre 1 y " + paises.length);
                }
            } catch (Exception e) {
                System.out.println("Inválido: ingresa un número");
                sc.nextLine(); // limpia el buffer
                flag = 0;
            }
        }

        /* ---------- Dibujar la bandera ---------- */
        if (inicioFila[flag - 1] == 0) {
            System.out.println("Todavía no hay bandera cargada para " + paises[flag - 1]);
        } else {
            pintarBandera(matriz, inicioFila[flag - 1]);
        }

        sc.close();
    }
}