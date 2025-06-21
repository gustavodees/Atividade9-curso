package principal;

import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int a = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro: "));

        if (a >= 0 ){
            JOptionPane.showMessageDialog(null, "O valor é não negativo");
        }else{
            JOptionPane.showMessageDialog(null, "O valor é negativo");
        }

    }
}