package Calculator2;

import java.awt.*;

import javax.swing.*;

public class Cal {
	
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

        super();  
        // ��ʼ��������  
        init();  
        // ���ü������ı�����ɫ  
        this.setBackground(Color.LIGHT_GRAY);  
        this.setTitle("������");  
        // ����Ļ(500, 300)���괦��ʾ������  
        this.setLocation(500, 300);  
        // �����޸ļ������Ĵ�С  
        this.setResizable(false);  
        // ʹ�������и������С����  
        this.pack(); 
    	
    }
    /*��ʼ��������*/
    public void init()
    {

    	resultText.setHorizontalAlignment(JTextField.RIGHT);
    }





}
