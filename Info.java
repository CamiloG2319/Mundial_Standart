import java.util.Scanner;

public class Info {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

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

        System.out.println("Elegiste: " + paises[flag - 1]);
    }
}