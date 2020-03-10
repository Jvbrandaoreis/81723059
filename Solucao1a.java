import javax.swing.*;

public class Solucao1a
{
   public static void main(String[] args)
   {
      //declarar variáveis
      String palavra1;
      String palavra2;
      String palavra3;     
      
      //entrada de dados
      palavra1 = JOptionPane.showInputDialog("Digite a primeira palavra");
      palavra2 = JOptionPane.showInputDialog("Digite a segunda palavra");
      palavra3 = JOptionPane.showInputDialog("Digite a terceira palavra");
      
      String resultado = palavra3 + " " + palavra2 + " " + palavra1;
      JOptionPane.showMessageDialog (null, resultado);
   }
}