import javax.swing.*;

class Programa04

{

public static void main (String entrada[])

{

int num1, num2, div;

double pot;

String msg="";

num1 = Integer.parseInt(JOptionPane.showInputDialog("Por gentileza, digite um número inteiro"));

num2 = Integer.parseInt(JOptionPane.showInputDialog("Agora digite outro número inteiro"));



div = (int)num1 / (int)num2;

pot = Math.pow(num1,num2);

msg = msg + "quociente da divisao de " + num1 + "por" + num2 + " = " + div + "\n";

msg = msg + "potencia de " + num1 + "por " + num2 + " = " + pot + "\n";

JOptionPane.showMessageDialog(null, msg);

System.exit(0);

}

}