package Calculator2;

import java.awt.*;

import javax.swing.*;




public class Cal extends JFrame {
	
	
	public static void main(String  args[])
	{
		Cal cal = new Cal();
		
	}
	
	
	
    /** �������ϵļ�����ʾ���� */  
    private final String[] KEYS = { "7", "8", "9", "/", "sqrt", "4", "5", "6",  
            "*", "%", "1", "2", "3", "-", "1/x", "0", "+/-", ".", "+", "=" };  
    /** �������ϵĹ��ܼ�����ʾ���� */  
    private final String[] COMMAND = { "Backspace", "CE", "C" };  
    /** ��������ߵ�M����ʾ���� */  
    private final String[] M = { " ", "MC", "MR", "MS", "M+" }; 
    /*������ϵİ�ť*/

	


   /*���캯��*/
    public Cal()
    {

 
    }
    /*��ʼ��������*/
    public void init()
    {

    	JPanel calckeysPanel = new JPanel(); 
    	calckeysPanel.setLayout(new GridLayout(4, 5, 3, 3));

    }





}
