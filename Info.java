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

        // Imprimir la tabla de selección una sola vez
        System.out.println("+------+---------------------------+");
        System.out.println("| Num  | País                      |");
        System.out.println("+------+---------------------------+");
        for (int i = 0; i < paises.length; i++) {
            System.out.println("| " + (i + 1) + "\t| " + paises[i]);
        }
        System.out.println("+------+---------------------------+");

        // Control de errores
        int pais = 0;
        while (pais < 1 || pais > paises.length) {
            System.out.print("Ingresa un número de país (1-" + paises.length + "): ");
            try {
                pais = sc.nextInt();
                if (pais < 1 || pais > paises.length) {
                    System.out.println("Inválido: debe estar entre 1 y " + paises.length);
                }
            } catch (Exception e) {
                System.out.println("Inválido: ingresa un número");
                sc.nextLine(); // limpia el buffer
                pais = 0;
            }
        }

        System.out.println("Elegiste: " + paises[pais - 1]);

        System.out.println("");

        // Variables para los datos del país seleccionado
        String capital = "";
        String apariciones = "";
        String titular = "";

        switch (pais) {
            case 1:  // Inglaterra
                capital = "Londres";
                apariciones = "17";
                titular = "Pickford; Alexander-Arnold, Stones, Guéhi, Colwill; Rice, Bellingham, Palmer; Saka, Kane, Foden";
                break;
            case 2:  // España
                capital = "Madrid";
                apariciones = "17";
                titular = "Unai Simón; Carvajal, Le Normand, Laporte, Cucurella; Rodri, Fabián Ruiz, Pedri; Lamine Yamal, Morata, Nico Williams";
                break;
            case 3:  // Francia
                capital = "París";
                apariciones = "17";
                titular = "Maignan; Koundé, Saliba, Upamecano, T. Hernández; Tchouaméni, Rabiot, Zaïre-Emery; Dembélé, Mbappé, Barcola";
                break;
            case 4:  // Cabo Verde
                capital = "Praia";
                apariciones = "1";
                titular = "Vozinha; Steven Moreira, Logan Costa, Roberto Lopes, Joao Paulo; Jamiro Monteiro, Kevin Pina, Deroy Duarte; Ryan Mendes, Bébé, Jovane Cabral";
                break;
            case 5:  // Arabia Saudita
                capital = "Riad";
                apariciones = "7";
                titular = "Al-Owais; Abdulhamid, Tambakti, Al-Bulaihi, Kadesh; Al-Khaibari, Kanno, Al-Juwayr; Al-Dawsari, Al-Buraikan, Yahya";
                break;
            case 6:  // Corea del Sur
                capital = "Seúl";
                apariciones = "12";
                titular = "Jo Hyeon-woo; Seol Young-woo, Kim Min-jae, Cho Yu-min, Lee Ki-je; Hwang In-beom, Park Yong-woo; Lee Kang-in, Jae-sung Lee, Son Heung-min; Hwang Hee-chan";
                break;
            case 7:  // Congo RD
                capital = "Kinchasa";
                apariciones = "1 (1974 como Zaire)";
                titular = "Mpasi; Kalulu, Mbemba, Baka, Masuaku; Pickel, Moutoussamy, Kakuta; Elia, Bakambu, Wissa";
                break;
            case 8:  // Ecuador
                capital = "Quito";
                apariciones = "5";
                titular = "Galíndez; Preciado, Félix Torres, Hincapié, Estupiñán; Moisés Caicedo, Alan Franco, Kendry Páez; Gonzalo Plata, Enner Valencia, Jeremy Sarmiento";
                break;
            case 9:  // Estados Unidos
                capital = "Washington D.C.";
                apariciones = "12";
                titular = "Turner; Scally, Richards, Ream, Robinson; McKennie, Adams, Musah; Weah, Balogun, Pulisic";
                break;
            case 10: // Argentina
                capital = "Buenos Aires";
                apariciones = "19";
                titular = "Dibu Martínez; Molina, Romero, Otamendi, Tagliafico; De Paul, Enzo Fernández, Mac Allister; Messi, Lautaro Martínez, Julián Álvarez";
                break;
            case 11: // Brasil
                capital = "Brasilia";
                apariciones = "23";
                titular = "Alisson; Danilo, Marquinhos, Gabriel Magalhães, Arana; Bruno Guimarães, Lucas Paquetá, Rodrygo; Raphinha, Endrick, Vinícius Jr.";
                break;
            case 12: // Canadá
                capital = "Ottawa";
                apariciones = "3";
                titular = "Crépeau; Johnston, Bombito, Cornelius, Davies; Osorio, Eustáquio, Koné; Buchanan, Jonathan David, Larin";
                break;
            case 13: // Costa de Marfil
                capital = "Yamusukro";
                apariciones = "4";
                titular = "Fofana; Singo, Kossounou, Ndicka, Konan; Kessié, Seri, Seko Fofana; Adingra, Haller, Simon Adingra";
                break;
            case 14: // Jordania
                capital = "Amán";
                apariciones = "1";
                titular = "Abulaila; Nasib, Arab, Marie; Haddad, Al-Rashdan, Al-Rawabdeh, Al-Mardi; Al-Tamari, Olwan, Al-Naimat";
                break;
            case 15: // Alemania
                capital = "Berlín";
                apariciones = "21";
                titular = "Ter Stegen; Kimmich, Tah, Rüdiger, Mittelstädt; Andrich, Pavlović; Musiala, Wirtz, Sané; Füllkrug";
                break;
            case 16: // Japón
                capital = "Tokio";
                apariciones = "8";
                titular = "Suzuki; Sugawara, Itakura, Taniguchi, Ito; Endo, Morita; Doan, Kubo, Mitoma; Ueda";
                break;
            case 17: // Colombia
                capital = "Bogotá";
                apariciones = "7";
                titular = "Vargas; Muñoz, Sánchez, Cuesta, Mojica; Lerma, Ríos, Arias; James Rodríguez, Jhon Córdoba, Luis Díaz";
                break;
            case 18: // Bélgica
                capital = "Bruselas";
                apariciones = "15";
                titular = "Casteels; Castagne, Faes, Debast, De Cuyper; Onana, Tielemans, De Bruyne; Doku, Lukaku, Bakayoko";
                break;
            case 19: // Turquía
                capital = "Ankara";
                apariciones = "3";
                titular = "Günok; Müldür, Demiral, Bardakcı, Kadıoğlu; Özcan, Yüksek; Arda Güler, Çalhanoğlu, Yıldız; Barış Alper Yılmaz";
                break;
            case 20: // Sudáfrica
                capital = "Pretoria";
                apariciones = "4";
                titular = "Williams; Mudau, Xulu, Mvala, Modiba; Mokoena, Sithole; Morena, Zwane, Appollis; Makgopa";
                break;
            case 21: // Chequia
                capital = "Praga";
                apariciones = "2";
                titular = "Staněk; Coufal, Holeš, Krejčí, Jurásek; Souček, Provod; Černý, Schick, Hložek; Kuchta";
                break;
            case 22: // Suiza
                capital = "Berna";
                apariciones = "13";
                titular = "Sommer; Widmer, Akanji, Rodríguez; Aebischer, Xhaka, Freuler, Ndoye; Rieder, Embolo, Vargas";
                break;
            case 23: // Portugal
                capital = "Lisboa";
                apariciones = "9";
                titular = "Diogo Costa; Dalot, Rúben Dias, Inácio, Nuno Mendes; João Neves, Vitinha, Bruno Fernandes; Bernardo Silva, Cristiano Ronaldo, Rafael Leão";
                break;
            case 24: // Egipto
                capital = "El Cairo";
                apariciones = "4";
                titular = "El-Shenawy; Hany, Abdelmonem, Rabia, Hamdy; Fathi, Attia, Zizo; Mohamed Salah, Mostafa Mohamed, Marmoush";
                break;
            case 25: // Paraguay
                capital = "Asunción";
                apariciones = "9";
                titular = "Gatito Fernández; Velázquez, Balbuena, Alderete, Alonso; Villasanti, Cubas, Diego Gómez; Miguel Almirón, Enciso, Pitta";
                break;
            case 26: // Escocia
                capital = "Edimburgo";
                apariciones = "9";
                titular = "Gunn; Ralston, Porteous, Hendry, Tierney, Robertson; McTominay, Gilmour, McGregor; McGinn, Adams";
                break;
            case 27: // Haití
                capital = "Puerto Príncipe";
                apariciones = "2";
                titular = "Placide; Arcus, Ade, Lambese, Experiénce; Sainte, Alceus, Louicius; Nazon, Pierrot, Duckens Nazon";
                break;
            case 28: // Argelia
                capital = "Argel";
                apariciones = "5";
                titular = "Mandrea; Atal, Mandi, Tougai, Aït-Nouri; Bennacer, Zerrouki, Aouar; Mahrez, Bounedjah, Amoura";
                break;
            case 29: // México
                capital = "Ciudad de México";
                apariciones = "18";
                titular = "Malagón; Jorge Sánchez, Montes, Johan Vásquez, Gallardo; Edson Álvarez, Luis Chávez, Erick Sánchez; Uriel Antuna, Santiago Giménez, Julián Quiñones";
                break;
            case 30: // Marruecos
                capital = "Rabat";
                apariciones = "7";
                titular = "Bounou; Hakimi, Aguerd, Saïss, Mazraoui; Amrabat, Ounahi, Brahim Díaz; Ziyech, En-Nesyri, Ben Seghir";
                break;
            case 31: // Austria
                capital = "Viena";
                apariciones = "8";
                titular = "Pentz; Posch, Danso, Wöber, Mwene; Seiwald, Laimer; Schmid, Baumgartner, Sabitzer; Arnautović";
                break;
            case 32: // Noruega
                capital = "Oslo";
                apariciones = "4";
                titular = "Nyland; Ryerson, Ostigård, Hanche-Olsen, Wolfe; Berge, Thorsby, Ødegaard; Bobb, Haaland, Nusa";
                break;
            case 33: // Bosnia y Herzegovina
                capital = "Sarajevo";
                apariciones = "2";
                titular = "Vasilj; Ahmedhodžić, Katić, Bičakčić, Kolašinac; Tahirović, Saric, Hajradinović; Gigović, Džeko, Demirović";
                break;
            case 34: // Túnez
                capital = "Túnez";
                apariciones = "7";
                titular = "Ben Said; Kechrida, Meriah, Talbi, Abdi; Sassi, Skhiri, Laidouni; Rafia, Ben Romdhane, Achouri";
                break;
            case 35: // Croacia
                capital = "Zagreb";
                apariciones = "7";
                titular = "Livaković; Stanišić, Šutalo, Gvardiol, Sosa; Modrić, Kovačić, Sučić; Kramarić, Budimir, Perišić";
                break;
            case 36: // Países Bajos
                capital = "Ámsterdam";
                apariciones = "12";
                titular = "Verbruggen; Dumfries, De Vrij, Van Dijk, Aké; Schouten, Reijnders, Simons; Frimpong, Depay, Gakpo";
                break;
            case 37: // Uruguay
                capital = "Montevideo";
                apariciones = "15";
                titular = "Rochet; Nández, Araújo, Giménez, Mathías Olivera; Ugarte, Valverde, Bentancur; Pellistri, Darwin Núñez, Maximiliano Araújo";
                break;
            case 38: // Qatar
                capital = "Doha";
                apariciones = "2";
                titular = "Barsham; Pedro Miguel, Lucas Mendes, Khoukhi, Salman; Fatai, Waad, Gaber; Al-Haydos, Almoez Ali, Akram Afif";
                break;
            case 39: // Australia
                capital = "Canberra";
                apariciones = "7";
                titular = "Ryan; Miller, Souttar, Rowles, Behich; Metcalfe, Irvine, O'Neill; Boyle, Yengi, Goodwin";
                break;
            case 40: // Nueva Zelanda
                capital = "Wellington";
                apariciones = "3";
                titular = "Crocombe; Payne, Bindon, Pijnaker, Cacace; Bell, Stamenic, Garbett; Just, Wood, Old";
                break;
            case 41: // Senegal
                capital = "Dakar";
                apariciones = "4";
                titular = "Édouard Mendy; Mendy, Koulibaly, Niakhaté, Jakobs; Pape Sarr, Idrissa Gueye, Lamine Camara; Ismaïla Sarr, Jackson, Sadio Mané";
                break;
            case 42: // Ghana
                capital = "Acra";
                apariciones = "5";
                titular = "Ati-Zigi; Seidu, Djiku, Salisu, Mensah; Thomas Partey, Abdul Samed, Kudus; Ernest Nuamah, Inaki Williams, Jordan Ayew";
                break;
            case 43: // Panamá
                capital = "Ciudad de Panamá";
                apariciones = "2";
                titular = "Mosquera; Murillo, Córdoba, Fariña, Miller, Davis; Carrasquilla, Martínez; Bárcenas, Fajardo, Rodríguez";
                break;
            case 44: // Irak
                capital = "Bagdad";
                apariciones = "2";
                titular = "Hassan; Ali, Sulaka, Younis, Doski; Al-Ammari, Rashid, Iqbal; Jasim, Aymen Hussein, Bayesh";
                break;
            case 45: // Suecia
                capital = "Estocolmo";
                apariciones = "13";
                titular = "Johansson; Krafth, Hien, Lindelöf, Augustinsson; Cajuste, Salétros; Kulusevski, Isak, Elanga; Gyökeres";
                break;
            case 46: // Curazao
                capital = "Willemstad";
                apariciones = "1";
                titular = "Room; Markelo, Gaari, Martina, Floranus; Anita, Juninho Bacuna, Leah; Kuwas, Janga, Gorré";
                break;
            case 47: // Irán
                capital = "Teherán";
                apariciones = "7";
                titular = "Beiranvand; Rezaeian, Kanaanizadegan, Khalilzadeh, Mohammadi; Ezatolahi, Ghoddos, Nourollahi; Jahanbakhsh, Taremi, Azmoun";
                break;
            case 48: // Uzbekistán
                capital = "Tashkent";
                apariciones = "1";
                titular = "Yusupov; Alikulov, Khusanov, Eshmurodov, Nasrullaev; Shukurov, Hamrobekov; Turgunboev, Masharipov, Fayzullaev; Shomurodov";
                break;
            default:
                System.out.println("Número inválido");
                return;
        }

        // Impresión en tabla ASCII estilizada
        String nombrePais = paises[pais - 1];
        System.out.println("+-----------------------------------------------------------------------------------------------------------------------------------------------+");
        System.out.printf("| INFORMACIÓN GENERAL: %-85s |\n", nombrePais.toUpperCase());
        System.out.println("+--------------------------+--------------------------------------------------------------------------------------------------------------------+");
        System.out.printf("| Capital                  | %-87s |\n", capital);
        System.out.println("+-----------------------------------------------------------------------------------------------------------------------------------------------+");
        System.out.printf("| Apariciones Mundiales    | %-87s |\n", apariciones);
        System.out.println("+--------------------------+--------------------------------------------------------------------------------------------------------------------+");
        System.out.printf("| 11 Titular Mundial 2026  | %-87s |\n", titular);
        System.out.println("+--------------------------+--------------------------------------------------------------------------------------------------------------------+");
    }
}