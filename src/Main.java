

import com.sun.source.tree.TryTree;
import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.util.*;



public class Main {
    public static void main(String[] args) throws IOException {


        System.out.println(reverse("Hola Mun9do"));
        arrayUnidimensional();
        arrayBidimensional();
        /*Indica cuál es el problema de utilizar un Vector con la capacidad por defecto si tuviésemos 1000 elementos

         Respuesta:El problema es: el vector en defecto tiene 10 espacios de capacidad
         y cada vez que se ocupa esa capacidad, el vector duplica la cantidad de espacios. Es decir,
         si un vector tiene 1000 elementos, quiere decir que su capacidad es de 2.000 elementos.
         Esto genera que el programa tenga mas memoria utiliza dentro del mismo
         */
        crearVector();
        arrayListInt();
        try {
            dividePorCero(6, 0);
        } catch (ArithmeticException e) {
            System.out.println("Esto no puede hacerse " + e.getClass());
        } finally {
            System.out.println("Demo de codigo");
        }
        try {
            String fileIn = ( "C://Nueva carpeta//fichero.txt.docx");
            String fileOut = ("C://Nueva carpeta//fichero_copia.txt.docx");
            files(fileIn, fileOut);
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
        String fileIn2 = ("C://Nueva carpeta//documentotexto.txt");
        String FileOut2 =("C://Nueva carpeta//documentotexto_copia.txt");
        creacionProyectoPropio(fileIn2, FileOut2);


    }


    /* Metodo para imprimir una palabra al reves*/
    public static String reverse(String texto) {
        String result = "";
        for (int i = texto.length() - 1; i >= 0; i--) {
            result += (texto.charAt(i));
        }
        return result;
    }

    public static void arrayUnidimensional() {
        String[] unidimensional = {
                "a", "b", "c"
        };
        for (String i : unidimensional) {
            System.out.println(i);
        }
    }

    public static void arrayBidimensional() {
        int[][] bidimensional = new int[3][3];
        bidimensional[0][0] = 1;
        bidimensional[0][1] = 2;
        bidimensional[0][2] = 3;
        bidimensional[1][0] = 11;
        bidimensional[1][1] = 12;
        bidimensional[1][2] = 13;
        bidimensional[2][0] = 21;
        bidimensional[2][1] = 22;
        bidimensional[2][2] = 23;
        for (int i = 0; i < bidimensional.length; i++) {
            for (int j = 0; j < bidimensional[i].length; j++) {
                System.out.print("con el valor " + bidimensional[i][j] + " ");
                System.out.println(" Estamos en la fila " + i + " y en la columna " + j);

            }
        }

    }

    public static void crearVector() {
        Vector<String> vector = new Vector<String>();
        vector.add("Elemento1");
        vector.add("Elemento2");
        vector.add("Elemento3");
        vector.add("Elemento4");
        vector.add("Elemento5");

        vector.remove(2);
        vector.remove(3);

        for (String vectores : vector) {
            System.out.println(vectores);
        }

    }

    public static void ArrayList_y_LinkedList() {
        List<String> arrayList = new ArrayList();
        arrayList.add("Arraylist1");
        arrayList.add("Arraylist2");
        arrayList.add("Arraylist3");
        arrayList.add("Arraylist4");
        List<String> linkedList = new LinkedList<>();
        linkedList.addAll(arrayList);
        for (String array : arrayList) {
            System.out.println("el valor del ArrayList es : " + array);
        }
        for (String array1 : linkedList) {
            System.out.println("el valor del LinkedList es : " + array1);
        }


    }

    public static void arrayListInt() {
        ArrayList<Integer> arrayListInt = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arrayListInt.add(i + 1);

        }

        for (int i = arrayListInt.size() - 1; i >= 0; i--) {
            System.out.println(arrayListInt.get(i));
            if (arrayListInt.get(i) % 2 == 0) {
                arrayListInt.remove(i);
            }
        }
        System.out.println("ArrayList después de eliminar los números pares:");
        System.out.println(arrayListInt);

    }

    private static void dividePorCero(int a, int b) throws ArithmeticException {
        int resultado = 0;
        try {
            resultado = a / b;
            System.out.println("el resultado es " + resultado);
        } catch (Exception e) {
            throw new ArithmeticException();
        }

    }

    public static void files(String fileIn, String fileOut) throws IOException {
        try {
            InputStream in = new FileInputStream(fileIn);
            PrintStream out = new PrintStream(fileOut);
            byte[] datos = in.readAllBytes();
                out.write(datos);
            in.close();
            out.close();
        } catch (FileNotFoundException e) {
            throw new IOException(e.getMessage());
        }

    }
    public static void creacionProyectoPropio(String fileIn2, String fileOut2) throws IOException {
        InputStream in2 = new FileInputStream(fileIn2);
        PrintStream out2 = new PrintStream(fileOut2);
        try {
            byte[]datos = in2.readAllBytes();
            out2.write(datos);
        }catch(IOException e){
            System.out.println("Excepcion: " + e.getMessage());
        }
        try{
            HashMap<String, Integer> mapa = new HashMap<>();
            int count = 0;
            while(count < 10){
                mapa.put("Llave numero " + count, count);
                        count = count+1;
            }
            for(Map.Entry<String , Integer> map : mapa.entrySet()){
                System.out.println("La clave es " + map.getKey() + " Con valor " + map.getValue());
            }
        }catch (Exception e){
            System.out.println("Error de excepcion en el mapa de tipo " + e.getMessage());
        }
        try {
            ArrayList<Integer> listaNum = new ArrayList<>();
            for( int i = 0; i<10; i++){
                listaNum.add(i);

            }
            for(int numeros : listaNum){
                System.out.println(numeros);
            }
            for(int i = listaNum.size()-1; i>=0; i--) {
                listaNum.remove(i);
                System.out.println("el tamaño del arraylist es de " + listaNum.size());
            }


        }catch (Exception w){
            System.out.println("Error en el ArrayList " + w.getMessage());
        }
    }
}

