/*
Objetivo:		Receba um n�mero inteiro. Calcule e mostre a s�rie de Fibonacci at� o seu N�n�simo termo.
Programador:	Kesia Amanda
Data: 			22/02/2019
*/

import javax.swing.JOptionPane;

public class Lt01_EstRep37 
{
	public static void main (String[] args)
	{
		int cont, auxFibo1=1, auxFibo2=1, valorFibo=1;
		
		int valorLeitura = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor: "));
		
		for (cont=1;cont<=valorLeitura;cont++)
		{
			auxFibo1=valorFibo;
			valorFibo=auxFibo2+valorFibo;
			auxFibo2=auxFibo1;
		}
		
		JOptionPane.showMessageDialog(null, "A s�rie ate o "+valorLeitura+"� termo � "+valorFibo+"!");
	}
}
 