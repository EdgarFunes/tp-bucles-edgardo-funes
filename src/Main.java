import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int option = 0;
        do {
            try{
                option = Integer.parseInt(JOptionPane.showInputDialog(null, """
                    Ingrese el ejercicio que desea ejecutar:
                    0. Salir
                    1. Cálculo del tiempo dedicado a cada actividad
                    2. Cálculo de salarios semanales
                    3. Control de inventario
                    4. Registro de ventas diarias
                    5.
                    """));

                switch (option){
                    case 0:
                        break;
                    case 1:
                        ejercicio1();
                        break;
                    case 2:
                        ejercicio2();
                        break;
                    case 3:
                        ejercicio3();
                        break;
                    case 4:
                        ejercicio4();
                        break;
                    default:
                        throw new Exception("Opcion no valida");
                }
            }catch (Exception e){
                JOptionPane.showMessageDialog(
                        null,
                        "Error: "+e.getMessage(),
                        "ERROR",
                        JOptionPane.ERROR_MESSAGE);
            }
        }while(option != 0);

    }
    public static void ejercicio1(){
        int totalHoras = 0;
        int[] horas = new int[4];
        String[] actividades = {"estudiar", "hacer ejercicio", "leer", "tiempo libre"};
        try{
            for (int i = 0; i < actividades.length; i++) {
                horas[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese las horas que le dedica a "+actividades[i]));
                if (horas[i] < 0) throw new Exception("No puede ingresar numeros negativos");
                totalHoras += horas[i];
                if(totalHoras > 24) throw new Exception("La cantidad de horas ingresadas superan las 24 horas del dia");
            }
            JOptionPane.showMessageDialog(
                    null,
                    "Usted dedica " + totalHoras + " horas a sus actividades."
            );
        }catch(Exception e){
            JOptionPane.showMessageDialog(
                    null,
                    "Error: "+e.getMessage(),
                    "ERROR",
                    JOptionPane.ERROR_MESSAGE
            );
        }
    }
    public static void ejercicio2(){
        try{
            int cantidadEmpleados = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la cantidad de empleados"));
            float tarifa = 15.0f;

            for (int i = 0; i < cantidadEmpleados; i++) {
                int horasTrabajadas = Integer.parseInt(JOptionPane.showInputDialog(
                        null,
                        "Ingrese la cantida de horas trabajadas del empleado " + (i+1)));
                if(horasTrabajadas < 0 || horasTrabajadas > 168) throw new Exception("Datos ingrsados invalidos");
                float salario = horasTrabajadas * tarifa;
                JOptionPane.showMessageDialog(null, "El sueldo del empleado " + (i+1)+" es "+salario);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(
                    null,
                    "Error: "+e.getMessage(),
                    "ERROR",
                    JOptionPane.ERROR_MESSAGE
            );
        }
    }
    public static void ejercicio3(){
        try{
            int cantProductos = 0;
            cantProductos = Integer.parseInt(JOptionPane.showInputDialog(
                    null,
                    "Ingrese la cantidad de productos que tiene."));
            if (cantProductos < 0) throw new Exception("La cantidad no puede ser negativa");
            int[] productos = new int[cantProductos];

            for (int i = 0; i < productos.length; i++) {
                productos[i] = Integer.parseInt(JOptionPane.showInputDialog(
                        null,
                        "Ingrese la cantidad del producto "+(i+1)));
                if(productos[i] < 0) throw new Exception("La cantidad no puede ser negativa");
                if(productos[i] >= 0 && productos[i] < 5) JOptionPane.showMessageDialog(null, "Es necesario realizar un pedido");
            }

        }catch(Exception e){
            JOptionPane.showMessageDialog(
                    null,
                    "Error: "+e.getMessage(),
                    "ERROR",
                    JOptionPane.ERROR_MESSAGE
            );
        }
    }
    public static void ejercicio4(){
        int[] ventas = new int[7];
        StringBuilder mensaje = new StringBuilder("Ventas de la semana\n");
        int totalVentas = 0;
        try{
            for (int i = 0; i < ventas.length; i++) {
                ventas[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese las ventas del dia " + (i+1)));
                if(ventas[i] < 0) throw new Exception("No pueden haber venras negativas");
                mensaje.append("Día ").append(i + 1).append(": ").append(ventas[i]).append("\n");
                totalVentas += ventas[i];
            }
            mensaje.append("Total de ventas: ").append(totalVentas);
            JOptionPane.showMessageDialog(null, mensaje.toString());
        }catch(Exception e){
            JOptionPane.showMessageDialog(
                    null,
                    "Error: "+e.getMessage(),
                    "ERROR",
                    JOptionPane.ERROR_MESSAGE
            );
        }
    }
    public static void ejercicio5(){
        try{

        }catch(Exception e){
            JOptionPane.showMessageDialog(
                    null,
                    "Error: "+e.getMessage(),
                    "ERROR",
                    JOptionPane.ERROR_MESSAGE
            );
        }
    }
}