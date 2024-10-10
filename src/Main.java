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
}