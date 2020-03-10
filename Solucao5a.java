import javax.swing.*;

public class Ex5a
{
   public static void main(String... args)
   {
      char letra1 = JOptionPane.showInputDialog("Digite 1º letra").charAt(0);
      char letra2 = JOptionPane.showInputDialog("Digite 2º letra").charAt(0);
      char letra3 = JOptionPane.showInputDialog("Digite 3º letra").charAt(0);
      char letra4 = JOptionPane.showInputDialog("Digite 4º letra").charAt(0);
      char letra5 = JOptionPane.showInputDialog("Digite 5º letra").charAt(0);
      char letra6 = JOptionPane.showInputDialog("Digite 6º letra").charAt(0);
      char letra7 = JOptionPane.showInputDialog("Digite 7º letra").charAt(0);
      char letra8 = JOptionPane.showInputDialog("Digite 8º letra").charAt(0);
      char letra9 = JOptionPane.showInputDialog("Digite 9º letra").charAt(0);
      char letra10 = JOptionPane.showInputDialog("Digite 10º letra").charAt(0);
      String palavra = ""+letra1 + letra2 + letra3 + letra4 + letra5 + letra6 + letra7 + letra8 + letra9 + letra10;  
      JOptionPane.showMessageDialog(null,palavra);
      
   }
}