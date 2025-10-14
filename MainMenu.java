import java.util.Scanner;

import com.packages.string_java.*;
import com.packages.arrays.*;
import com.packages.linked_list.*;
import com.packages.stack_queue.*;
import com.packages.recursitivy.*;

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
            System.out.println("4. Registros");
            System.out.println("5. Listas ligadas");
            System.out.println("6. Pilas y colas");
            System.out.println("7. Recursividad");
            System.out.println("8. Árboles y grafos");
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
                case "4":
                    menuRecords();
                    break;
                case "5":
                    menuLinkedList();
                    break;
                case "6":
                    menuStackQueue();
                    break;
                case "7":
                    menuRecursivity();
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
            System.out.println("8. Búsqueda binaria");
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
                case "8":
                    if (v.getN() > 0) {
                        v.sortVector();
                        System.out.print("Dato a buscar: ");
                        datum = input.nextInt();
                        input.nextLine();
                        position = v.binarySearch(datum);
                        if (position > -1) {
                            System.out.println("Dato encontrado en posición " + position);
                        } else {
                            System.out.println(datum + " no se encuentra en el vector");
                        }
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
            System.out.println("5. Triangular inferior secundaria");
            System.out.println("6. Triángulo arriba");
            System.out.println("7. Suma columna");
            System.out.println("8. Promedio columna");
            System.out.println("9. Varianza columna");
            System.out.println("10. Desviación columna");
            System.out.println("11. Suma Triangular Superior");
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
                case "5":
                    if (m.getM() > 0 && m.getM() == m.getN()) {
                        m.lowerTriangularSecondary();
                    } else {
                        System.out.println("Tamaño de la matriz no válido para esta operación");
                    }
                    break;
                case "6":
                    if (m.getM() > 0 && m.getN() > 0) {
                        m.triangleSup();
                    } else {
                        System.out.println("Tamaño de la matriz no válido para esta operación");
                    }
                    break;
                case "7":
                    if (m.getM() > 0 && m.getN() > 0) {
                        System.out.print("Columna: ");
                        numberColumns = input.nextInt();
                        input.nextLine();
                        System.out.println("Suma columna " + numberColumns + ": " + m.sumSalaryMonth(numberColumns));
                    } else {
                        System.out.println("Tamaño de la matriz no válido para esta operación");
                    }
                    break;
                case "8":
                    if (m.getM() > 0 && m.getN() > 0) {
                        System.out.print("Columna: ");
                        numberColumns = input.nextInt();
                        input.nextLine();
                        System.out.println("Promedio columna " + numberColumns + ": " + m.avgSalaryMonth(numberColumns));
                    } else {
                        System.out.println("Tamaño de la matriz no válido para esta operación");
                    }
                    break;
                case "9":
                    if (m.getM() > 0 && m.getN() > 0) {
                        System.out.print("Columna: ");
                        numberColumns = input.nextInt();
                        input.nextLine();
                        System.out.println("Varianza columna " + numberColumns + ": " + m.variance(numberColumns));
                    } else {
                        System.out.println("Tamaño de la matriz no válido para esta operación");
                    }
                    break;
                case "10":
                    if (m.getM() > 0 && m.getN() > 0) {
                        System.out.print("Columna: ");
                        numberColumns = input.nextInt();
                        input.nextLine();
                        System.out.println("Desviación columna " + numberColumns + ": " + m.desviation(numberColumns));
                    } else {
                        System.out.println("Tamaño de la matriz no válido para esta operación");
                    }
                    break;
                case "11":
                    if (m.getM() > 0 && m.getM() == m.getN()) {
                        System.out.println(m.sumTriangularSuper());
                    } else {
                        System.out.println("Tamaño de la matriz no válido para esta operación");
                    }
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        } while (!option.equals("0"));
    }

    public static void menuRecords()
    {
        String option;
        Record r = new Record();
        String id;
        String name;
        byte age;
        boolean study;
        
        do {
            System.out.println("");
            System.out.println("------------------------------");
            System.out.println("       Submenú Registros");
            System.out.println("------------------------------");
            System.out.println("0. Regresar");
            System.out.println("1. Crear");
            System.out.println("2. Mostrar");
            System.out.print("Ingrese su opción: ");
            option = input.nextLine();

            switch (option) {
                case "0":
                    break;
                case "1":
                    System.out.print("Identificación: ");
                    id = input.nextLine();
                    System.out.print("Nombre: ");
                    name = input.nextLine();
                    System.out.print("Edad: ");
                    age = input.nextByte();
                    input.nextLine();
                    System.out.print("Estudia [true/false]: ");
                    study = input.nextBoolean();
                    r.addPerson(id, name, age, study);
                    break;
                case "2":
                    if (r.getN() > 0) {
                       r.showPersons();
                    } else {
                        System.out.println("No hay personas");
                    }
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        } while (!option.equals("0"));
    }

    public static void menuLinkedList()
    {
        String option;
        int datum, datumRef;
        Node q;
        NodeLDL t;
        LinkedSimplyList lsl = new LinkedSimplyList();
        CircularLinkedSimplyList lslc = new CircularLinkedSimplyList();
        LinkedDoubleList ldl = new LinkedDoubleList();

        do {
            System.out.println("");
            System.out.println("----------------------------------");
            System.out.println("       Submenú Listas Ligadas");
            System.out.println("----------------------------------");
            System.out.println("0. Regresar");
            System.out.println("1. Agregar nodo por el inicio");
            System.out.println("2. Mostrar lista");
            System.out.println("3. Buscar nodo (booleano)");
            System.out.println("4. Buscar nodo (puntero -nodo-)");
            System.out.println("5. Modificar nodo");
            System.out.println("6. Eliminar nodo");
            System.out.println("7. Insertar nodo antes");
            System.out.println("8. Agregar nodo por el final");
            System.out.println("9. Crear LSLC final");
            System.out.println("10. Mostrar LSLC");
            System.out.println("11. Sumar impares LSLC");
            System.out.println("12. Agregar nodo inicio LDL");
            System.out.println("13. Mostrar LDL");
            System.out.println("14. Buscar LDL");
            System.out.println("15. Modificar LDL");
            System.out.println("16. Eliminar LDL");
            System.out.println("17. Insertar después LDL");
            System.out.println("18. Suma cuadrados recursiva (LSL)");
            System.out.print("Ingrese su opción: ");
            option = input.nextLine();

            switch (option) {
                case "0":
                    break;
                case "1":
                    System.out.print("Dato: ");
                    datum = input.nextInt();
                    input.nextLine();
                    lsl.createBeginLSL(datum);
                    break;
                case "2":
                    if (lsl.head != null) {
                        lsl.showLSL();
                    } else {
                        System.out.println("No hay nodos");
                    }
                    break;
                case "3":
                    if (lsl.head != null) {
                        System.out.print("Dato a buscar: ");
                        datum = input.nextInt();
                        input.nextLine();
                        if (lsl.searchNode(datum)) {
                            System.out.println("El dato está en la LSL");
                        } else {
                            System.out.println("El dato no está en la LSL");
                        }
                    } else {
                        System.out.println("No hay nodos");
                    }
                    break;
                case "4":
                    if (lsl.head != null) {
                        System.out.print("Dato a buscar: ");
                        datum = input.nextInt();
                        input.nextLine();
                        q = lsl.searchNode((long)datum);
                        if (q != null ) {
                            System.out.println("El dato está en la LSL en la dirección " + q);
                        } else {
                            System.out.println("El dato no está en la LSL");
                        }
                    } else {
                        System.out.println("No hay nodos");
                    }
                    break;
                case "5":
                    if (lsl.head != null) {
                        System.out.print("Dato a modificar: ");
                        datum = input.nextInt();
                        input.nextLine();
                        q = lsl.searchNode((long)datum);
                        if (q != null ) {
                            System.out.print("Nuevo dato: ");
                            datum = input.nextInt();
                            input.nextLine();
                            lsl.updateNode(q, datum);
                            System.out.println("El nodo se actualizó");
                        } else {
                            System.out.println("El dato no está en la LSL");
                        }
                    } else {
                        System.out.println("No hay nodos");
                    }
                    break;
                case "6":
                    if (lsl.head != null) {
                        System.out.print("Dato a eliminar: ");
                        datum = input.nextInt();
                        input.nextLine();
                        if (lsl.deleteNode(datum)) {
                            System.out.print("Nodo eliminado");
                        } else {
                            System.out.println("El dato no está en la LSL");
                        }
                    } else {
                        System.out.println("No hay nodos");
                    }
                    break;
                case "7":
                    if (lsl.head != null) {
                        System.out.print("Dato de referencia: ");
                        datumRef = input.nextInt();
                        input.nextLine();
                        System.out.print("Dato a insertar: ");
                        datum = input.nextInt();
                        input.nextLine();
                        if (lsl.insertBeforeNode(datum, datumRef)) {
                            System.out.print("Nodo insertado");
                        } else {
                            System.out.println("El dato de referencia no está en la LSL");
                        }
                    } else {
                        System.out.println("No hay nodos");
                    }
                    break;
                case "8":
                    System.out.print("Dato: ");
                    datum = input.nextInt();
                    input.nextLine();
                    lsl.createEndLSL(datum);
                    break;
                case "9":
                    System.out.print("Dato: ");
                    datum = input.nextInt();
                    input.nextLine();
                    lslc.createEndLSLC(datum);
                    break;
                case "10":
                    if (lslc.head != null) {
                        lslc.showLSLC();
                    } else {
                        System.out.println("No hay nodos");
                    }
                    break;
                case "11":
                    if (lslc.head != null) {
                        System.out.println("Suma impares: " + lslc.sumNonesLSLC());
                    } else {
                        System.out.println("No hay nodos");
                    }
                    break;
                case "12":
                    System.out.print("Dato: ");
                    datum = input.nextInt();
                    input.nextLine();
                    ldl.createBeginLDL(datum);
                    break;
                case "13":
                    if (ldl.head != null) {
                        ldl.showLDL();
                    } else {
                        System.out.println("No hay nodos");
                    }
                    break;
                case "14":
                    if (ldl.head != null) {
                        System.out.print("Dato a buscar: ");
                        datum = input.nextInt();
                        input.nextLine();
                        t = ldl.searchNodeLDL(datum);
                        if (t != null ) {
                            System.out.println("El dato está en la LDL en la dirección " + t);
                        } else {
                            System.out.println("El dato no está en la LDL");
                        }
                    } else {
                        System.out.println("No hay nodos");
                    }
                    break;
                case "15":
                    if (ldl.head != null) {
                        System.out.print("Dato a modificar: ");
                        datum = input.nextInt();
                        input.nextLine();
                        t = ldl.searchNodeLDL(datum);
                        if (t != null) {
                            System.out.print("Nuevo dato: ");
                            datum = input.nextInt();
                            input.nextLine();
                            ldl.updateNodeLDL(t, datum);
                            System.out.println("El nodo se actualizó");
                        } else {
                            System.out.println("El dato no está en la LSL");
                        }
                    } else {
                        System.out.println("No hay nodos");
                    }
                    break;
                case "16":
                    if (ldl.head != null) {
                        System.out.print("Dato a eliminar: ");
                        datum = input.nextInt();
                        input.nextLine();
                        t = ldl.searchNodeLDL(datum);
                        if (t != null) {
                            ldl.deleteNodeLDL(t);
                            System.out.print("Nodo eliminado");
                        } else {
                            System.out.println("El dato no está en la LDL");
                        }
                    } else {
                        System.out.println("No hay nodos");
                    }
                    break;
                case "17":
                    if (ldl.head != null) {
                        System.out.print("Dato de referencia: ");
                        datumRef = input.nextInt();
                        input.nextLine();
                        t = ldl.searchNodeLDL(datumRef);
                        if (t != null) {
                            System.out.print("Dato a insertar: ");
                            datum = input.nextInt();
                            input.nextLine();
                            ldl.insertAfterNodeLDL(t, datum);
                            System.out.print("Nodo insertado");
                        } else {
                            System.out.println("El dato de referencia no está en la LDL");
                        }
                    } else {
                        System.out.println("No hay nodos");
                    }
                    break;
                case "18":
                    if (lsl.head != null) {
                        System.out.print("Suma cuadrados: " + lsl.squareRecursive(lsl.head));
                    } else {
                        System.out.println("No hay nodos");
                    }
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        } while (!option.equals("0"));
    }

    public static void menuStackQueue()
    {
        String option;
        int datum;
        Stacks s = new Stacks();
        Queues q = new Queues();

        do {
            System.out.println("");
            System.out.println("----------------------------------");
            System.out.println("       Submenú Pilas y Colas");
            System.out.println("----------------------------------");
            System.out.println("0. Regresar");
            System.out.println("1. Apilar");
            System.out.println("2. Mostrar pila");
            System.out.println("3. Desapilar");
            System.out.println("4. Encolar");
            System.out.println("5. Mostrar cola");
            System.out.println("6. Desencolar");
            System.out.print("Ingrese su opción: ");
            option = input.nextLine();

            switch (option) {
                case "0":
                    break;
                case "1":
                    if (s.TOP < s.MAX) {
                        System.out.print("Dato a apilar: ");
                        datum = input.nextInt();
                        input.nextLine();
                        s.stacking(datum);
                    } else {
                        System.out.println("Pila: desbordamiento");
                    }
                    break;
                case "2":
                    if (s.TOP > 0) {
                        s.showStack();
                    } else {
                        System.out.println("Pila vacía");
                    }
                    break;
                case "3":
                    if (s.TOP > 0) {
                        System.out.println("Elemento desapilado: " + s.unstacking());
                    } else {
                        System.out.println("Pila vacía: subdesbordamiento");
                    }
                    break;
                case "4":
                    if (q.LAST < q.MAX) {
                        System.out.print("Dato a encolar: ");
                        datum = input.nextInt();
                        input.nextLine();
                        q.push(datum);
                    } else {
                        System.out.println("Cola: desbordamiento");
                    }
                    break;
                case "5":
                    if (q.LAST > 0) {
                        q.showQueue();
                    } else {
                        System.out.println("Cola vacía");
                    }
                    break;
                case "6":
                    if (q.LAST > 0) {
                        System.out.println("Elemento desencolado: " + q.pop());
                    } else {
                        System.out.println("Cola vacía: subdesbordamiento");
                    }
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        } while (!option.equals("0"));
    }

    public static void menuRecursivity()
    {
        String option;
        int datum;

        do {
            System.out.println("");
            System.out.println("----------------------------------");
            System.out.println("       Submenú Recursividad");
            System.out.println("----------------------------------");
            System.out.println("0. Regresar");
            System.out.println("1. Factorial");
            System.out.println("2. Sumatoria");
            System.out.println("3. Fibonacci");
            System.out.print("Ingrese su opción: ");
            option = input.nextLine();

            switch (option) {
                case "0":
                    break;
                case "1":
                    System.out.print("Dato n: ");
                    datum = input.nextInt();
                    input.nextLine();
                    System.out.println("n! = " + Recursion.factorialRecursive(datum));
                    break;
                case "2":
                    System.out.print("Dato n: ");
                    datum = input.nextInt();
                    input.nextLine();
                    System.out.println("sum(1, n) = " + Recursion.sumNaturalsRecursive(datum));
                    break;
                case "3":
                    System.out.print("Dato n: ");
                    datum = input.nextInt();
                    input.nextLine();
                    System.out.println("Fibonacci(n) = " + Recursion.fibonacciRecursive(datum));
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        } while (!option.equals("0"));
    }
}
