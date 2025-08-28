import java.util.Scanner;

import com.packages.string_java.*;
import com.packages.arrays.*;


public class MainMenu 
{
    public static Scanner input = new Scanner(System.in);

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    
    public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
    public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
    public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
    public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
    public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";

    public static void main(String[] args) 
    {
        String option;
        do {
            System.out.println("");
            System.out.println(ANSI_GREEN + "----------------------------");
            System.out.println(
                ANSI_WHITE_BACKGROUND + ANSI_BLUE + 
                "       Menú Principal       " + 
                ANSI_RESET
            );
            System.out.println(ANSI_GREEN + "----------------------------" + 
                ANSI_RESET);
            System.out.println("0. Salir");
            System.out.println("1. Cadenas de caracteres");
            System.out.println("2. Vectores");
            System.out.println("3. Matrices");
            System.out.println("4. Listas ligadas");
            System.out.println("5. Pilas y colas");
            System.out.println("6. Recursividad");
            System.out.println("7. Árboles y grafos");
            System.out.print("Ingrese su opción: ");
            option = input.nextLine();

            switch (option) {
                case "0":
                    System.out.println("Programa finalizado");
                    break;
                case "1":
                    // Llamar a algún método para el submenú cadenas
                    menuStrings();
                    break;
                case "2":
                    menuVectors();
                    break;
                case "3":
                    menuMatrix();
                    break;
                default:
                    System.out.println();
                    System.out.println(ANSI_WHITE_BACKGROUND + ANSI_RED +
                        "Opción no válida" + ANSI_RESET
                    );
            }

        } while (!option.equals("0"));
    }
    
    public static void menuStrings()
    {
        String option, chain;
        Strings str = new Strings();
        Palindrome palin = new Palindrome();

        do {
            System.out.println("");
            System.out.println("-------------------------------------------");
            System.out.println("       Submenú Cadenas de Caracteres");
            System.out.println("-------------------------------------------");
            System.out.println("0. Regresar");
            System.out.println("1. Ejemplos básicos de cadenas");
            System.out.println("2. Ingresar una cadena");
            System.out.println("3. Palíndromo");
            System.out.println("4. Decimal a romano");
            System.out.println("3. Palíndromo");
            System.out.print("Ingrese su opción: ");
            option = input.nextLine();

            switch (option) {
                case "0":
                    break;
                case "1":
                    // Llamar al método 
                    str.basicOperations();
                    break;
                case "2":
                    System.out.print("Ingrese un texto: ");
                    chain = input.nextLine();
                    str.showString(chain);
                    palin.setText(chain);
                    break;
                case "3":
                    // Palíndromo
                    System.out.println("Frase sin espacios: " + palin.deleteSpaces());
                    if (palin.compareCharacters()) {
                        System.out.println(palin.getText() + " es palíndromo");
                    } else {
                        System.out.println(palin.getText() + " no es palíndromo");
                    }
                    break;
                case "4":
                    // Decimal a romano
                    System.out.print("Ingrese un número entre 1 y 3999: ");
                    int number = input.nextInt();
                    input.nextLine(); // Limpiar el buffer
                    System.out.println(number + " => " + DecimalToRoman.decimalToRoman(number));
                    // System.out.println(String.valueOf(number) + " = " + 
                    //     Romans.toRoman(number));
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        } while (!option.equals("0"));
    }


    public static void menuVectors()
    {
        String option;
        int datum;
        int position;
        Vector v = new Vector();

        do {
            System.out.println("");
            System.out.println("------------------------------");
            System.out.println("       Submenú Vectores");
            System.out.println("------------------------------");
            System.out.println("0. Regresar");
            System.out.println("1. Agregar dato");
            System.out.println("2. Mostrar");
            System.out.println("3. Buscar");
            System.out.println("4. Modificar");
            System.out.println("5. Eliminar");
            System.out.println("6. Insertar");
            System.out.println("7. Ordenar");
            System.out.print("Ingrese su opción: ");
            option = input.nextLine();

            switch (option) {
                case "0":
                    break;
                case "1":
                    if (v.getN() < 20) {
                        System.out.print("Ingrese un número entero: ");
                        datum = input.nextInt();
                        input.nextLine();
                        v.addVector(datum);
                    } else {
                        System.out.println("Vector lleno: desbordamiento");
                    }
                    break;
                case "2":
                    if (v.getN() > 0) {
                        v.showVector();
                    } else {
                        System.out.println("Vector vacío");
                    }
                    break;
                case "3":
                    if (v.getN() > 0) {
                        System.out.print("Dato a buscar: ");
                        datum = input.nextInt();
                        input.nextLine();
                        position = v.findVector(datum);
                        if (position > -1) {
                            System.out.println("Dato encontrado en posición " + position);
                        } else {
                            System.out.println(datum + " no se encuentra en el vector");
                        }
                    } else {
                        System.out.println("Vector vacío");
                    }
                    break;
                case "4":
                    if (v.getN() > 0) {
                        System.out.print("Dato a modificar: ");
                        datum = input.nextInt();
                        input.nextLine();
                        position = v.findVector(datum);
                        if (position > -1) {
                            System.out.print("Nuevo dato: ");
                            datum = input.nextInt();
                            input.nextLine();
                            v.updateVector(datum, position);
                            System.out.println("Dato modificado en posición " + position);
                        } else {
                            System.out.println(datum + " no se encuentra en el vector");
                        }
                    } else {
                        System.out.println("Vector vacío");
                    }
                    break;
                case "5":
                    if (v.getN() > 0) {
                        System.out.print("Dato a eliminar: ");
                        datum = input.nextInt();
                        input.nextLine();
                        position = v.findVector(datum);
                        if (position > -1) {
                            v.deleteVector(position);
                            System.out.println("Dato eliminado de la posición " + position);
                        } else {
                            System.out.println(datum + " no se encuentra en el vector");
                        }
                    } else {
                        System.out.println("Vector vacío");
                    }
                    break;
                case "6":
                    if (v.getN() < 20) {
                        System.out.print("Dato referencia para insertar: ");
                        datum = input.nextInt();
                        input.nextLine();
                        position = v.findVector(datum);
                        if (position > -1) {
                            System.out.print("Nuevo dato: ");
                            datum = input.nextInt();
                            input.nextLine();
                            v.insertVector(datum, position);
                            System.out.println("Dato insertado en posición " + position);
                        } else {
                            System.out.println(datum + " no se encuentra en el vector");
                        }
                    } else {
                        System.out.println("Vector vacío");
                    }
                    break;
                case "7":
                    if (v.getN() > 0) {
                        v.sortVector();
                        v.showVector();
                        System.out.println("Vector ordenado");
                    } else {
                        System.out.println("Vector vacío");
                    }
                    break;    
                default:
                    System.out.println("Opción no válida");
            }
        } while (!option.equals("0"));
    }

    public static void menuMatrix()
    {
        String option;
        int numberRows;
        int numberColumns;
        Matrix m = new Matrix();

        do {
            System.out.println("");
            System.out.println("------------------------------");
            System.out.println("       Submenú Matrices");
            System.out.println("------------------------------");
            System.out.println("0. Regresar");
            System.out.println("1. Crear");
            System.out.println("2. Mostrar");
            System.out.println("3. Diagonal principal");
            System.out.println("4. Diagonal secundaria");
            System.out.print("Ingrese su opción: ");
            option = input.nextLine();

            switch (option) {
                case "0":
                    break;
                case "1":
                    System.out.print("Número filas: ");
                    numberRows = input.nextInt();
                    input.nextLine();
                    System.out.print("Número columnas: ");
                    numberColumns = input.nextInt();
                    input.nextLine();
                    m.setM(numberRows);
                    m.setN(numberColumns);
                    m.fillMatrix();
                    break;
                case "2":
                    if (m.getM() > 0 && m.getN() > 0) {
                        m.showMatrix();
                    } else {
                        System.out.println("Especifique el tamaño de la matriz");
                    }
                    break;
                case "3":
                    if (m.getM() > 0 && m.getM() == m.getN()) {
                        m.mainDiagonal();
                    } else {
                        System.out.println("Especifique el tamaño de la matriz");
                    }
                    break;
                case "4":
                    if (m.getM() > 0 && m.getM() == m.getN()) {
                        m.secondaryDiagonal();
                    } else {
                        System.out.println("Tamaño de la matriz no válido para esta operación");
                    }
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        } while (!option.equals("0"));
    }
}
