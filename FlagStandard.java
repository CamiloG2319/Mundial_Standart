
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FlagStandard {
    public static void main(String[] args) throws IOException {

    Scanner sc = new Scanner(System.in);
    

/*                                                                                                                                                                                                                                                                                                                 
▄▄▄▄ ▄▄▄▄ ▄▄▄▄ ▄▄▄▄ ▄▄▄▄ ▄▄▄▄ ▄▄▄▄ ▄▄▄▄ ▄▄▄▄ ▄▄▄▄ ▄▄▄▄ ▄▄▄▄ ▄▄▄▄ ▄▄▄▄ ▄▄▄▄ ▄▄▄▄ ▄▄▄▄ ▄▄▄▄ ▄▄▄▄ ▄▄▄▄ ▄▄▄▄ ▄▄▄▄ ▄▄▄▄ ▄▄▄▄ 
████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████                                                   
*/ 
/*
___  ___      _        _       _____              __ _       
|  \/  |     | |      (_)     /  __ \            / _(_)      
| .  . | __ _| |_ _ __ _ ____ | /  \/ ___  _ __ | |_ _  __ _ 
| |\/| |/ _` | __| '__| |_  / | |    / _ \| '_ \|  _| |/ _` |
| |  | | (_| | |_| |  | |/ /  | \__/\ (_) | | | | | | | (_| |
\_|  |_/\__,_|\__|_|  |_/___|  \____/\___/|_| |_|_| |_|\__, |
                                                        __/ |
                                                       |___/ 

Configuramos la matriz para que tome datos del archivo csv basándonos en el repositorio
de Xaca
*/


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

    fila++; //Lo que se logra con esto es que la matriz que estaba vacía, quede llena justo con los datos del CSV
}

/*                                                                                                                                                                                                                                                                                                                 
▄▄▄▄ ▄▄▄▄ ▄▄▄▄ ▄▄▄▄ ▄▄▄▄ ▄▄▄▄ ▄▄▄▄ ▄▄▄▄ ▄▄▄▄ ▄▄▄▄ ▄▄▄▄ ▄▄▄▄ ▄▄▄▄ ▄▄▄▄ ▄▄▄▄ ▄▄▄▄ ▄▄▄▄ ▄▄▄▄ ▄▄▄▄ ▄▄▄▄ ▄▄▄▄ ▄▄▄▄ ▄▄▄▄ ▄▄▄▄ 
████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████                                                   
*/
/*
    ____            _             _       _                                          
  / ___|___  _ __ | |_ _ __ ___ | |   __| | ___    ___ _ __ _ __ ___  _ __ ___  ___ 
 | |   / _ \| '_ \| __| '__/ _ \| |  / _` |/ _ \  / _ \ '__| '__/ _ \| '__/ _ \/ __|
 | |__| (_) | | | | |_| | | (_) | | | (_| |  __/ |  __/ |  | | | (_) | | |  __/\__ \
  \____\___/|_| |_|\__|_|  \___/|_|  \__,_|\___|  \___|_|  |_|  \___/|_|  \___||___/

  Solo opera con la varible flag, le "permite el paso" si está entre 1 y 48, si es decimal,
  negativo, un texto o no está dentro del rango, el programa vuelve a pedir
  el número de bandera hasta que sea válido.
                                                                                
*/
int flag = 0;

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

        // Imprimir la tabla una sola vez
        System.out.println("+------+---------------------------+");
        System.out.println("| Num  | País                      |");
        System.out.println("+------+---------------------------+");
        for (int i = 0; i < paises.length; i++) {
            System.out.println("| " + (i + 1) + "\t| " + paises[i]);
        }
        System.out.println("+------+---------------------------+");

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

/* 
▄▄▄▄ ▄▄▄▄ ▄▄▄▄ ▄▄▄▄ ▄▄▄▄ ▄▄▄▄ ▄▄▄▄ ▄▄▄▄ ▄▄▄▄ ▄▄▄▄ ▄▄▄▄ ▄▄▄▄ ▄▄▄▄ ▄▄▄▄ ▄▄▄▄ ▄▄▄▄ ▄▄▄▄ ▄▄▄▄ ▄▄▄▄ ▄▄▄▄ ▄▄▄▄ ▄▄▄▄ ▄▄▄▄ ▄▄▄▄ 
████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████                                                   
*/
/* 
 _____          _ _       _      ______                 _                    
/  ___|        (_) |     | |     | ___ \               | |                   
\ `--.__      ___| |_ ___| |__   | |_/ / __ _ _ __   __| | ___ _ __ __ _ ___ 
 `--. \ \ /\ / / | __/ __| '_ \  | ___ \/ _` | '_ \ / _` |/ _ \ '__/ _` / __|
/\__/ /\ V  V /| | || (__| | | | | |_/ / (_| | | | | (_| |  __/ | | (_| \__ \
\____/  \_/\_/ |_|\__\___|_| |_| \____/ \__,_|_| |_|\__,_|\___|_|  \__,_|___/
                                                                                                   
*/


switch (flag) {

     // -------------------------------------------------------------
    // Case 1: Inglaterra (Filas 61-70)
    // -------------------------------------------------------------
    case 1:

    System.out.println("--------------------------------");  

    for (fila = (61)-1; fila < 70; fila++) {

        for (int columna = 0; columna < matriz[fila].length; columna++) {

            if(matriz[fila][columna]=='1'){
		 			System.out.print(ConsoleColors.YELLOW_BACKGROUND+"   ");
		 		}
            if(matriz[fila][columna]=='2'){
		 			System.out.print(ConsoleColors.ORANGE_BACKGROUND+"   ");
		 		}
            if(matriz[fila][columna]=='3'){
		 			System.out.print(ConsoleColors.RED_BACKGROUND+"   ");
		 		}
            if(matriz[fila][columna]=='4'){
		 			System.out.print(ConsoleColors.PURPLE_BACKGROUND+"   ");
		 		}
            if(matriz[fila][columna]=='5'){
		 			System.out.print(ConsoleColors.BLUE_BACKGROUND+"   ");
		 		}
            if(matriz[fila][columna]=='6'){
		 			System.out.print(ConsoleColors.GREEN_BACKGROUND+"   ");
		 		}
            if(matriz[fila][columna]=='7'){
		 			System.out.print(ConsoleColors.WHITE_BACKGROUND+"   ");
		 		}
            if(matriz[fila][columna]=='8'){
		 			System.out.print(ConsoleColors.BLACK_BACKGROUND+"   ");
		 		}
            if(matriz[fila][columna]=='9'){
		 			System.out.print(ConsoleColors.BROWN_BACKGROUND+"   ");
		 		}
            System.out.print(ConsoleColors.RESET);
        }

    System.out.println();
    }
    break;
    //España
    case 2:

     System.out.println("--------------------------------");  

    for (fila = (71)-1; fila < 80; fila++) {

        for (int columna = 0; columna < matriz[fila].length; columna++) {

            if(matriz[fila][columna]=='1'){
		 			System.out.print(ConsoleColors.YELLOW_BACKGROUND+"   ");
		 		}
            if(matriz[fila][columna]=='2'){
		 			System.out.print(ConsoleColors.ORANGE_BACKGROUND+"   ");
		 		}
            if(matriz[fila][columna]=='3'){
		 			System.out.print(ConsoleColors.RED_BACKGROUND+"   ");
		 		}
            if(matriz[fila][columna]=='4'){
		 			System.out.print(ConsoleColors.PURPLE_BACKGROUND+"   ");
		 		}
            if(matriz[fila][columna]=='5'){
		 			System.out.print(ConsoleColors.BLUE_BACKGROUND+"   ");
		 		}
            if(matriz[fila][columna]=='6'){
		 			System.out.print(ConsoleColors.GREEN_BACKGROUND+"   ");
		 		}
            if(matriz[fila][columna]=='7'){
		 			System.out.print(ConsoleColors.WHITE_BACKGROUND+"   ");
		 		}
            if(matriz[fila][columna]=='8'){
		 			System.out.print(ConsoleColors.BLACK_BACKGROUND+"   ");
		 		}
            if(matriz[fila][columna]=='9'){
		 			System.out.print(ConsoleColors.BROWN_BACKGROUND+"   ");
		 		}
            System.out.print(ConsoleColors.RESET);
        }

    System.out.println();
    }
        break;

    case 9: // Estados Unidos 
    System.out.println("--------------------------------");  
    for (fila = (81) - 1; fila < 90; fila++) {
        for (int columna = 0; columna < matriz[fila].length; columna++) {
            if (matriz[fila][columna] == '1') {
                System.out.print(ConsoleColors.YELLOW_BACKGROUND + "   ");
            }
            if (matriz[fila][columna] == '2') {
                System.out.print(ConsoleColors.ORANGE_BACKGROUND + "   ");
            }
            if (matriz[fila][columna] == '3') {
                System.out.print(ConsoleColors.RED_BACKGROUND + "   ");
            }
            if (matriz[fila][columna] == '4') {
                System.out.print(ConsoleColors.PURPLE_BACKGROUND + "   ");
            }
            if (matriz[fila][columna] == '5') {
                System.out.print(ConsoleColors.BLUE_BACKGROUND + "   ");
            }
            if (matriz[fila][columna] == '6') {
                System.out.print(ConsoleColors.GREEN_BACKGROUND + "   ");
            }
            if (matriz[fila][columna] == '7') {
                System.out.print(ConsoleColors.WHITE_BACKGROUND + "   ");
            }
            if (matriz[fila][columna] == '8') {
                System.out.print(ConsoleColors.BLACK_BACKGROUND + "   ");
            }
            if (matriz[fila][columna] == '9') {
                System.out.print(ConsoleColors.BROWN_BACKGROUND + "   ");
            }
            System.out.print(ConsoleColors.RESET);
        }
        System.out.println();
    }
    break;

    case 10://Argentina 
    System.out.println("--------------------------------");  
    for (fila = (91) - 1; fila < 100; fila++) {
        for (int columna = 0; columna < matriz[fila].length; columna++) {
            if (matriz[fila][columna] == '1') {
                System.out.print(ConsoleColors.YELLOW_BACKGROUND + "   ");
            }
            if (matriz[fila][columna] == '2') {
                System.out.print(ConsoleColors.ORANGE_BACKGROUND + "   ");
            }
            if (matriz[fila][columna] == '3') {
                System.out.print(ConsoleColors.RED_BACKGROUND + "   ");
            }
            if (matriz[fila][columna] == '4') {
                System.out.print(ConsoleColors.PURPLE_BACKGROUND + "   ");
            }
            if (matriz[fila][columna] == '5') {
                System.out.print(ConsoleColors.BLUE_BACKGROUND + "   ");
            }
            if (matriz[fila][columna] == '6') {
                System.out.print(ConsoleColors.GREEN_BACKGROUND + "   ");
            }
            if (matriz[fila][columna] == '7') {
                System.out.print(ConsoleColors.WHITE_BACKGROUND + "   ");
            }
            if (matriz[fila][columna] == '8') {
                System.out.print(ConsoleColors.BLACK_BACKGROUND + "   ");
            }
            if (matriz[fila][columna] == '9') {
                System.out.print(ConsoleColors.BROWN_BACKGROUND + "   ");
            }
            System.out.print(ConsoleColors.RESET);
        }
        System.out.println();
    }
    break;

    case 11://Brasil
    System.out.println("--------------------------------");  
    for (fila = (291) - 1; fila < 300; fila++) {
        for (int columna = 0; columna < matriz[fila].length; columna++) {
            if (matriz[fila][columna] == '1') {
                System.out.print(ConsoleColors.YELLOW_BACKGROUND + "   ");
            }
            if (matriz[fila][columna] == '2') {
                System.out.print(ConsoleColors.ORANGE_BACKGROUND + "   ");
            }
            if (matriz[fila][columna] == '3') {
                System.out.print(ConsoleColors.RED_BACKGROUND + "   ");
            }
            if (matriz[fila][columna] == '4') {
                System.out.print(ConsoleColors.PURPLE_BACKGROUND + "   ");
            }
            if (matriz[fila][columna] == '5') {
                System.out.print(ConsoleColors.BLUE_BACKGROUND + "   ");
            }
            if (matriz[fila][columna] == '6') {
                System.out.print(ConsoleColors.GREEN_BACKGROUND + "   ");
            }
            if (matriz[fila][columna] == '7') {
                System.out.print(ConsoleColors.WHITE_BACKGROUND + "   ");
            }
            if (matriz[fila][columna] == '8') {
                System.out.print(ConsoleColors.BLACK_BACKGROUND + "   ");
            }
            if (matriz[fila][columna] == '9') {
                System.out.print(ConsoleColors.BROWN_BACKGROUND + "   ");
            }
            System.out.print(ConsoleColors.RESET);
        }
        System.out.println();
    }
    break;

    case 12://Canada
    System.out.println("--------------------------------");  
    for (fila = (321) - 1; fila < 330; fila++) {
        for (int columna = 0; columna < matriz[fila].length; columna++) {
            if (matriz[fila][columna] == '1') {
                System.out.print(ConsoleColors.YELLOW_BACKGROUND + "   ");
            }
            if (matriz[fila][columna] == '2') {
                System.out.print(ConsoleColors.ORANGE_BACKGROUND + "   ");
            }
            if (matriz[fila][columna] == '3') {
                System.out.print(ConsoleColors.RED_BACKGROUND + "   ");
            }
            if (matriz[fila][columna] == '4') {
                System.out.print(ConsoleColors.PURPLE_BACKGROUND + "   ");
            }
            if (matriz[fila][columna] == '5') {
                System.out.print(ConsoleColors.BLUE_BACKGROUND + "   ");
            }
            if (matriz[fila][columna] == '6') {
                System.out.print(ConsoleColors.GREEN_BACKGROUND + "   ");
            }
            if (matriz[fila][columna] == '7') {
                System.out.print(ConsoleColors.WHITE_BACKGROUND + "   ");
            }
            if (matriz[fila][columna] == '8') {
                System.out.print(ConsoleColors.BLACK_BACKGROUND + "   ");
            }
            if (matriz[fila][columna] == '9') {
                System.out.print(ConsoleColors.BROWN_BACKGROUND + "   ");
            }
            System.out.print(ConsoleColors.RESET);
        }
        System.out.println();
    }
    break;

    case 13:// Costa de Marfil 
    System.out.println("--------------------------------");  
    for (fila = (311) - 1; fila < 320; fila++) {
        for (int columna = 0; columna < matriz[fila].length; columna++) {
            if (matriz[fila][columna] == '1') {
                System.out.print(ConsoleColors.YELLOW_BACKGROUND + "   ");
            }
            if (matriz[fila][columna] == '2') {
                System.out.print(ConsoleColors.ORANGE_BACKGROUND + "   ");
            }
            if (matriz[fila][columna] == '3') {
                System.out.print(ConsoleColors.RED_BACKGROUND + "   ");
            }
            if (matriz[fila][columna] == '4') {
                System.out.print(ConsoleColors.PURPLE_BACKGROUND + "   ");
            }
            if (matriz[fila][columna] == '5') {
                System.out.print(ConsoleColors.BLUE_BACKGROUND + "   ");
            }
            if (matriz[fila][columna] == '6') {
                System.out.print(ConsoleColors.GREEN_BACKGROUND + "   ");
            }
            if (matriz[fila][columna] == '7') {
                System.out.print(ConsoleColors.WHITE_BACKGROUND + "   ");
            }
            if (matriz[fila][columna] == '8') {
                System.out.print(ConsoleColors.BLACK_BACKGROUND + "   ");
            }
            if (matriz[fila][columna] == '9') {
                System.out.print(ConsoleColors.BROWN_BACKGROUND + "   ");
            }
            System.out.print(ConsoleColors.RESET);
        }
        System.out.println();
    }
    break;

    case 14://Jordania
    System.out.println("--------------------------------");  
    for (fila = (301) - 1; fila < 310; fila++) {
        for (int columna = 0; columna < matriz[fila].length; columna++) {
            if (matriz[fila][columna] == '1') {
                System.out.print(ConsoleColors.YELLOW_BACKGROUND + "   ");
            }
            if (matriz[fila][columna] == '2') {
                System.out.print(ConsoleColors.ORANGE_BACKGROUND + "   ");
            }
            if (matriz[fila][columna] == '3') {
                System.out.print(ConsoleColors.RED_BACKGROUND + "   ");
            }
            if (matriz[fila][columna] == '4') {
                System.out.print(ConsoleColors.PURPLE_BACKGROUND + "   ");
            }
            if (matriz[fila][columna] == '5') {
                System.out.print(ConsoleColors.BLUE_BACKGROUND + "   ");
            }
            if (matriz[fila][columna] == '6') {
                System.out.print(ConsoleColors.GREEN_BACKGROUND + "   ");
            }
            if (matriz[fila][columna] == '7') {
                System.out.print(ConsoleColors.WHITE_BACKGROUND + "   ");
            }
            if (matriz[fila][columna] == '8') {
                System.out.print(ConsoleColors.BLACK_BACKGROUND + "   ");
            }
            if (matriz[fila][columna] == '9') {
                System.out.print(ConsoleColors.BROWN_BACKGROUND + "   ");
            }
            System.out.print(ConsoleColors.RESET);
        }
        System.out.println();
    }
    break;

    
    // -------------------------------------------------------------
    // Case 22: Suiza (Filas 221-230)
    // -------------------------------------------------------------
    case 22:
        System.out.println("--------------------------------");  
        for (fila = (221) - 1; fila < 230; fila++) {
            for (int columna = 0; columna < matriz[fila].length; columna++) {
                if (matriz[fila][columna] == '1') {
                    System.out.print(ConsoleColors.YELLOW_BACKGROUND + "   ");
                }
                if (matriz[fila][columna] == '2') {
                    System.out.print(ConsoleColors.ORANGE_BACKGROUND + "   ");
                }
                if (matriz[fila][columna] == '3') {
                    System.out.print(ConsoleColors.RED_BACKGROUND + "   ");
                }
                if (matriz[fila][columna] == '4') {
                    System.out.print(ConsoleColors.PURPLE_BACKGROUND + "   ");
                }
                if (matriz[fila][columna] == '5') {
                    System.out.print(ConsoleColors.BLUE_BACKGROUND + "   ");
                }
                if (matriz[fila][columna] == '6') {
                    System.out.print(ConsoleColors.GREEN_BACKGROUND + "   ");
                }
                if (matriz[fila][columna] == '7') {
                    System.out.print(ConsoleColors.WHITE_BACKGROUND + "   ");
                }
                if (matriz[fila][columna] == '8') {
                    System.out.print(ConsoleColors.BLACK_BACKGROUND + "   ");
                }
                if (matriz[fila][columna] == '9') {
                    System.out.print(ConsoleColors.BROWN_BACKGROUND + "   ");
                }
                System.out.print(ConsoleColors.RESET);
            }
            System.out.println();
        }
        break;

    // -------------------------------------------------------------
    // Case 23: Portugal (Filas 241-250)
    // -------------------------------------------------------------
    case 23:
        System.out.println("--------------------------------");  
        for (fila = (241) - 1; fila < 250; fila++) {
            for (int columna = 0; columna < matriz[fila].length; columna++) {
                if (matriz[fila][columna] == '1') {
                    System.out.print(ConsoleColors.YELLOW_BACKGROUND + "   ");
                }
                if (matriz[fila][columna] == '2') {
                    System.out.print(ConsoleColors.ORANGE_BACKGROUND + "   ");
                }
                if (matriz[fila][columna] == '3') {
                    System.out.print(ConsoleColors.RED_BACKGROUND + "   ");
                }
                if (matriz[fila][columna] == '4') {
                    System.out.print(ConsoleColors.PURPLE_BACKGROUND + "   ");
                }
                if (matriz[fila][columna] == '5') {
                    System.out.print(ConsoleColors.BLUE_BACKGROUND + "   ");
                }
                if (matriz[fila][columna] == '6') {
                    System.out.print(ConsoleColors.GREEN_BACKGROUND + "   ");
                }
                if (matriz[fila][columna] == '7') {
                    System.out.print(ConsoleColors.WHITE_BACKGROUND + "   ");
                }
                if (matriz[fila][columna] == '8') {
                    System.out.print(ConsoleColors.BLACK_BACKGROUND + "   ");
                }
                if (matriz[fila][columna] == '9') {
                    System.out.print(ConsoleColors.BROWN_BACKGROUND + "   ");
                }
                System.out.print(ConsoleColors.RESET);
            }
            System.out.println();
        }
        break;

    // -------------------------------------------------------------
    // Case 24: Egipto (Filas 231-240)
    // -------------------------------------------------------------
    case 24:
        System.out.println("--------------------------------");  
        for (fila = (231) - 1; fila < 240; fila++) {
            for (int columna = 0; columna < matriz[fila].length; columna++) {
                if (matriz[fila][columna] == '1') {
                    System.out.print(ConsoleColors.YELLOW_BACKGROUND + "   ");
                }
                if (matriz[fila][columna] == '2') {
                    System.out.print(ConsoleColors.ORANGE_BACKGROUND + "   ");
                }
                if (matriz[fila][columna] == '3') {
                    System.out.print(ConsoleColors.RED_BACKGROUND + "   ");
                }
                if (matriz[fila][columna] == '4') {
                    System.out.print(ConsoleColors.PURPLE_BACKGROUND + "   ");
                }
                if (matriz[fila][columna] == '5') {
                    System.out.print(ConsoleColors.BLUE_BACKGROUND + "   ");
                }
                if (matriz[fila][columna] == '6') {
                    System.out.print(ConsoleColors.GREEN_BACKGROUND + "   ");
                }
                if (matriz[fila][columna] == '7') {
                    System.out.print(ConsoleColors.WHITE_BACKGROUND + "   ");
                }
                if (matriz[fila][columna] == '8') {
                    System.out.print(ConsoleColors.BLACK_BACKGROUND + "   ");
                }
                if (matriz[fila][columna] == '9') {
                    System.out.print(ConsoleColors.BROWN_BACKGROUND + "   ");
                }
                System.out.print(ConsoleColors.RESET);
            }
            System.out.println();
        }
        break;

    // -------------------------------------------------------------
    // Case 25: Paraguay (Filas 211-220)
    // -------------------------------------------------------------
    case 25:
        System.out.println("--------------------------------");  
        for (fila = (211) - 1; fila < 220; fila++) {
            for (int columna = 0; columna < matriz[fila].length; columna++) {
                if (matriz[fila][columna] == '1') {
                    System.out.print(ConsoleColors.YELLOW_BACKGROUND + "   ");
                }
                if (matriz[fila][columna] == '2') {
                    System.out.print(ConsoleColors.ORANGE_BACKGROUND + "   ");
                }
                if (matriz[fila][columna] == '3') {
                    System.out.print(ConsoleColors.RED_BACKGROUND + "   ");
                }
                if (matriz[fila][columna] == '4') {
                    System.out.print(ConsoleColors.PURPLE_BACKGROUND + "   ");
                }
                if (matriz[fila][columna] == '5') {
                    System.out.print(ConsoleColors.BLUE_BACKGROUND + "   ");
                }
                if (matriz[fila][columna] == '6') {
                    System.out.print(ConsoleColors.GREEN_BACKGROUND + "   ");
                }
                if (matriz[fila][columna] == '7') {
                    System.out.print(ConsoleColors.WHITE_BACKGROUND + "   ");
                }
                if (matriz[fila][columna] == '8') {
                    System.out.print(ConsoleColors.BLACK_BACKGROUND + "   ");
                }
                if (matriz[fila][columna] == '9') {
                    System.out.print(ConsoleColors.BROWN_BACKGROUND + "   ");
                }
                System.out.print(ConsoleColors.RESET);
            }
            System.out.println();
        }
        break;

    // -------------------------------------------------------------
    // Case 26: Escocia (Filas 201-210)
    // -------------------------------------------------------------
    case 26:
        System.out.println("--------------------------------");  
        for (fila = (201) - 1; fila < 210; fila++) {
            for (int columna = 0; columna < matriz[fila].length; columna++) {
                if (matriz[fila][columna] == '1') {
                    System.out.print(ConsoleColors.YELLOW_BACKGROUND + "   ");
                }
                if (matriz[fila][columna] == '2') {
                    System.out.print(ConsoleColors.ORANGE_BACKGROUND + "   ");
                }
                if (matriz[fila][columna] == '3') {
                    System.out.print(ConsoleColors.RED_BACKGROUND + "   ");
                }
                if (matriz[fila][columna] == '4') {
                    System.out.print(ConsoleColors.PURPLE_BACKGROUND + "   ");
                }
                if (matriz[fila][columna] == '5') {
                    System.out.print(ConsoleColors.BLUE_BACKGROUND + "   ");
                }
                if (matriz[fila][columna] == '6') {
                    System.out.print(ConsoleColors.GREEN_BACKGROUND + "   ");
                }
                if (matriz[fila][columna] == '7') {
                    System.out.print(ConsoleColors.WHITE_BACKGROUND + "   ");
                }
                if (matriz[fila][columna] == '8') {
                    System.out.print(ConsoleColors.BLACK_BACKGROUND + "   ");
                }
                if (matriz[fila][columna] == '9') {
                    System.out.print(ConsoleColors.BROWN_BACKGROUND + "   ");
                }
                System.out.print(ConsoleColors.RESET);
            }
            System.out.println();
        }
        break;

    // -------------------------------------------------------------
    // Case 27: Haití (Filas 251-260)
    // -------------------------------------------------------------
    case 27:
        System.out.println("--------------------------------");  
        for (fila = (251) - 1; fila < 260; fila++) {
            for (int columna = 0; columna < matriz[fila].length; columna++) {
                if (matriz[fila][columna] == '1') {
                    System.out.print(ConsoleColors.YELLOW_BACKGROUND + "   ");
                }
                if (matriz[fila][columna] == '2') {
                    System.out.print(ConsoleColors.ORANGE_BACKGROUND + "   ");
                }
                if (matriz[fila][columna] == '3') {
                    System.out.print(ConsoleColors.RED_BACKGROUND + "   ");
                }
                if (matriz[fila][columna] == '4') {
                    System.out.print(ConsoleColors.PURPLE_BACKGROUND + "   ");
                }
                if (matriz[fila][columna] == '5') {
                    System.out.print(ConsoleColors.BLUE_BACKGROUND + "   ");
                }
                if (matriz[fila][columna] == '6') {
                    System.out.print(ConsoleColors.GREEN_BACKGROUND + "   ");
                }
                if (matriz[fila][columna] == '7') {
                    System.out.print(ConsoleColors.WHITE_BACKGROUND + "   ");
                }
                if (matriz[fila][columna] == '8') {
                    System.out.print(ConsoleColors.BLACK_BACKGROUND + "   ");
                }
                if (matriz[fila][columna] == '9') {
                    System.out.print(ConsoleColors.BROWN_BACKGROUND + "   ");
                }
                System.out.print(ConsoleColors.RESET);
            }
            System.out.println();
        }
        break;

    // -------------------------------------------------------------
    // Case 28: Argelia (Filas 261-270)
    // -------------------------------------------------------------
    case 28:
        System.out.println("--------------------------------");  
        for (fila = (261) - 1; fila < 270; fila++) {
            for (int columna = 0; columna < matriz[fila].length; columna++) {
                if (matriz[fila][columna] == '1') {
                    System.out.print(ConsoleColors.YELLOW_BACKGROUND + "   ");
                }
                if (matriz[fila][columna] == '2') {
                    System.out.print(ConsoleColors.ORANGE_BACKGROUND + "   ");
                }
                if (matriz[fila][columna] == '3') {
                    System.out.print(ConsoleColors.RED_BACKGROUND + "   ");
                }
                if (matriz[fila][columna] == '4') {
                    System.out.print(ConsoleColors.PURPLE_BACKGROUND + "   ");
                }
                if (matriz[fila][columna] == '5') {
                    System.out.print(ConsoleColors.BLUE_BACKGROUND + "   ");
                }
                if (matriz[fila][columna] == '6') {
                    System.out.print(ConsoleColors.GREEN_BACKGROUND + "   ");
                }
                if (matriz[fila][columna] == '7') {
                    System.out.print(ConsoleColors.WHITE_BACKGROUND + "   ");
                }
                if (matriz[fila][columna] == '8') {
                    System.out.print(ConsoleColors.BLACK_BACKGROUND + "   ");
                }
                if (matriz[fila][columna] == '9') {
                    System.out.print(ConsoleColors.BROWN_BACKGROUND + "   ");
                }
                System.out.print(ConsoleColors.RESET);
            }
            System.out.println();
        }
        break;
    }

sc.close();
archivo.close();
}
}


