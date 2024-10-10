import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        try{
            int option;
            do {
                option = Integer.parseInt(JOptionPane.showInputDialog(null, """
                    Ingrese el ejercicio que desea ejecutar:
                    0. Salir
                    1. Cálculo del tiempo dedicado a cada actividad
                    2.
                    3.
                    4.
                    5.
                    """));

                switch (option){
                    case 0:
                        break;
                    case 1:
                        ejercicio1();
                        break;
                    case 2:
                        break;
                    default:
                        throw new Exception("Opcion no valida");
                }
            }while(option != 0);
        }catch (Exception e){
            System.out.println("Error: "+e.getMessage());
        }

    }
    public static void ejercicio1(){}
}