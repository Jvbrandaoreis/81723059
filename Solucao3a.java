import javax.swing.*;

public class Solucao3a
{
   public static void main(String[] args)
   {
      String dia;
      String mes;
      String ano;
      
      dia = JOptionPane.showInputDialog("Informe o dia");
      mes = JOptionPane.showInputDialog("Informe o mês");
      ano = JOptionPane.showInputDialog("Informe o ano");
      
      JOptionPane.showMessageDialog(null,dia + "/" + mes + "/" + ano); 
    
   }
}