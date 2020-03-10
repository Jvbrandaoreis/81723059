import javax.swing.*;
public class Ex6a
{
   public static void main(String... args)
   {
      char milhar = JOptionPane.showInputDialog("Digite a milhar").charAt(0);
      char centena=JOptionPane.showInputDialog("Digite a centena").charAt(0);
      char dezena=JOptionPane.showInputDialog("Digite a dezena").charAt(0);
      char unidade=JOptionPane.showInputDialog("Digite a unidade").charAt(0);
      String numero = ""+ milhar + "." + centena + dezena + unidade;
      JOptionPane.showMessageDialog(null,numero);
   }
}