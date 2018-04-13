package modelo;

import java.util.Scanner;
import javax.swing.JOptionPane;
/* @author Bruno Ramos */
public class MenuCalculadora {
    static Integer valorMenu = 0;
    static Scanner teclado = new Scanner(System.in);
    static Calculadora calculadora = new Calculadora();
    
    public static void main (String[] args) {
        while(valorMenu != 6){
            if(null == valorMenu){
                chamarMenu();
            } else switch (valorMenu) {
                case 1:
                    informarValor();
                    calculadora.somar();
                    chamarMenu();
                    break;
                case 2:
                    informarValor();
                    calculadora.subtrair();
                    chamarMenu();
                    break;
                case 3:
                    informarValor();
                    calculadora.multiplicar();
                    chamarMenu();
                    break;
                case 4:
                    informarValor();
                    calculadora.dividir();
                    chamarMenu();
                    break;
                case 5:
                    System.out.println(calculadora.getResultados());
                    chamarMenu();
                    break;
                case 6:
                    System.exit(0);
                default:
                    chamarMenu();
                    break;
            }
        }
    }
    private static void chamarMenu() {
        System.out.println ("#####################");
        System.out.println ("#       MENU        #");
        System.out.println ("# 1:SOMAR           #");
        System.out.println ("# 2:SUBTRAIR        #");
        System.out.println ("# 3:MULTIPLICAR     #");
        System.out.println ("# 4:DIVIDIR         #");
        System.out.println ("# 5:IMPRIMIR        #");
        System.out.println ("# 6:SAIR            #");
        System.out.println ("#####################");
        valorMenu = teclado.nextInt();
    }
    private static void informarValor() {
        Float numero1 = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor 1"));
        Float numero2 = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor 2"));                
        calculadora.setValor1 (numero1);
        calculadora.setValor2 (numero2);
    }
}