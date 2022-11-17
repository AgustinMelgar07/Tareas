import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class OpcionesClientes implements Serializable {
    private LinkedList<Cliente> clientes;

    public OpcionesClientes() {
        this.clientes = new LinkedList<>();
    }

    String nombres;
    int dnis;

    public Cliente agregarCliente() {
        Scanner leer = new Scanner(System.in);
        System.out.print("NOMBRE: ");
        String nombre = leer.nextLine();

        System.out.print("DNI:");
        int dni = leer.nextInt();

        Cliente cliente = new Cliente(nombre, dni);
        nombres = cliente.getNombre();
        dnis = cliente.getDni();
        this.clientes.add(cliente);

        return cliente;
    }

    public void listarClientes() throws FileNotFoundException, IOException, ClassNotFoundException  {
        for (Cliente cliente1 : clientes) {
            System.out.println(cliente1.MostrarDatos());

            try {
                FileWriter crearficherodenombres = new FileWriter("C:\\Users\\AMD Ryzen\\untitled13\\miObjetoSerializado.txt", true);

                for (int i = 0; i < cliente1.MostrarDatos().length(); i++) {
                    crearficherodenombres.write(cliente1.MostrarDatos().charAt(i));
                }
                crearficherodenombres.write("\n");
                crearficherodenombres.close();
            } catch (IOException a) {
                a.printStackTrace();
            }
        };

        try {
            ObjectInputStream flujoEntrada = new ObjectInputStream(new FileInputStream("miObjetoSerializado.txt"));
            //debemos crear una variable del mismo objeto que queremos deserializar
            //Debemos hacer un casting de Objet a la clase Personas
            Cliente personasEntrada = (Cliente) flujoEntrada.readObject();
            for(Cliente e: clientes) {
                System.out.println(e.toString());
            }
        } catch (IOException e) {
            // catch para capturar los errores al intentar leer el archivo
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            // catch para capturar los errores producto de la lecuta del archivo
            e.printStackTrace();
        }

    }

    public void buscarCliente() {
        Scanner leer = new Scanner(System.in);
        System.out.print("NOMBRE: ");
        String nombreCliente = leer.nextLine();
        for (Cliente cliente1 : clientes) {
            if (cliente1.getNombre().equals(nombreCliente)) {
                System.out.println(cliente1.MostrarDatos());
                break;
            }
        }
    }

    public void eliminarCliente() {
        Scanner leer = new Scanner(System.in);
        System.out.print("NOMBRE: ");
        String nombreCliente1 = leer.nextLine();
        for (Cliente cliente1 : clientes) {
            if (cliente1.getNombre().equals(nombreCliente1)) {
                clientes.remove(cliente1);
                System.out.println("Cliente eliminado");
                break;
            }
        }
    }



}
