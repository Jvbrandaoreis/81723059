import javax.swing.*;

public class Ex5a
{
   public static void main(String... args)
   {
      char letra1 = JOptionPane.showInputDialog("Digite 1� letra").charAt(0);
      char letra2 = JOptionPane.showInputDialog("Digite 2� letra").charAt(0);
      char letra3 = JOptionPane.showInputDialog("Digite 3� letra").charAt(0);
      char letra4 = JOptionPane.showInputDialog("Digite 4� letra").charAt(0);
      char letra5 = JOptionPane.showInputDialog("Digite 5� letra").charAt(0);
      char letra6 = JOptionPane.showInputDialog("Digite 6� letra").charAt(0);
      char letra7 = JOptionPane.showInputDialog("Digite 7� letra").charAt(0);
      char letra8 = JOptionPane.showInputDialog("Digite 8� letra").charAt(0);
      char letra9 = JOptionPane.showInputDialog("Digite 9� letra").charAt(0);
      char letra10 = JOptionPane.showInputDialog("Digite 10� letra").charAt(0);
      String palavra = ""+letra1 + letra2 + letra3 + letra4 + letra5 + letra6 + letra7 + letra8 + letra9 + letra10;  
      JOptionPane.showMessageDialog(null,palavra);
      
   }
}