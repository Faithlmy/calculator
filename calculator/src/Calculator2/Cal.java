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
    private JButton keys[] = new JButton[KEYS.length]; 
    private JButton commands[] = new JButton[COMMAND.length];  
    private JButton m[] = new JButton[M.length];  
    private JTextField resultText = new JTextField("0"); 
	


   /*���캯��*/
    public Cal()
    {
    	init();
 
    }
    /*��ʼ��������*/
    public void init()
    {

        // ��ʼ���������ϼ��İ�ť����������һ��������  
        JPanel calckeysPanel = new JPanel();  
        // �����񲼾�����4�У�5�е���������֮���ˮƽ������Ϊ3�����أ���ֱ������Ϊ3������  
        calckeysPanel.setLayout(new GridLayout(4, 5, 3, 3));  
        for (int i = 0; i < KEYS.length; i++) {  
            keys[i] = new JButton(KEYS[i]);  
            calckeysPanel.add(keys[i]);  
            keys[i].setForeground(Color.blue);  
        } 
    	
    	this.setTitle("������");
    	this.setSize(200, 300);
		this.setLocation(200, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
    	this.setVisible(true);

    }





}
