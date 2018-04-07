package modelo;

import java.util.Scanner;
import javax.swing.JOptionPane;
import modelo.Calculadora;
/* @author Bruno Ramos */
public class MenuCalculadora {
    static Integer valorMenu = 0;
    static Scanner teclado = new Scanner(System.in);
    public static void main (String[] args) {
        Calculadora calculadora = new Calculadora();
        while(valorMenu != 6){
            if(valorMenu == 1){
                Float numero1 = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor 1"));
                Float numero2 = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor 2"));                
                calculadora.setValor1 (numero1);
                calculadora.setValor2 (numero2);
                calculadora.somar();
                chamarMenu();                
            } else if (valorMenu == 2) {
                Float numero1 = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor 1"));
                Float numero2 = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor 2"));                
                calculadora.setValor1 (numero1);
                calculadora.setValor2 (numero2);
                calculadora.subtrair();
                chamarMenu();                
            } else if (valorMenu == 3) {
                Float numero1 = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor 1"));
                Float numero2 = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor 2"));                
                calculadora.setValor1 (numero1);
                calculadora.setValor2 (numero2);
                calculadora.multiplicar();
                chamarMenu();                
            } else if (valorMenu == 4) {
                Float numero1 = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor 1"));
                Float numero2 = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor 2"));                
                calculadora.setValor1 (numero1);
                calculadora.setValor2 (numero2);
                calculadora.dividir();
                chamarMenu();                
            } else if (valorMenu == 5) {
                System.out.println(calculadora.getResultados());
                chamarMenu();
            } else if (valorMenu == 6) {
                System.exit(0);
            } else {
                chamarMenu();
            }
        }
    }
    private static void chamarMenu() {
        System.out.println ("#####################");
        System.out.println ("# MENU              #");
        System.out.println ("# 1:SOMAR           #");
        System.out.println ("# 2:SUBTRAIR        #");
        System.out.println ("# 3:MULTIPLICAR     #");
        System.out.println ("# 4:DIVIDIR         #");
        System.out.println ("# 5:IMPRIMIR        #");
        System.out.println ("# 6:SAIR            #");
        System.out.println ("#####################");
        valorMenu = teclado.nextInt();
    }
}