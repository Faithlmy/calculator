package Calculator2;

import java.awt.*;

import javax.swing.*;




public class Cal extends JFrame {
	
	
	public static void main(String  args[])
	{
		Cal cal = new Cal();
		
	}
	
	
	
    /** 计算器上的键的显示名字 */  
    private final String[] KEYS = { "7", "8", "9", "/", "sqrt", "4", "5", "6",  
            "*", "%", "1", "2", "3", "-", "1/x", "0", "+/-", ".", "+", "=" };  
    /** 计算器上的功能键的显示名字 */  
    private final String[] COMMAND = { "Backspace", "CE", "C" };  
    /** 计算器左边的M的显示名字 */  
    private final String[] M = { " ", "MC", "MR", "MS", "M+" }; 
    /*计算机上的按钮*/

	


   /*构造函数*/
    public Cal()
    {

 
    }
    /*初始化计算器*/
    public void init()
    {

    	JPanel calckeysPanel = new JPanel(); 
    	calckeysPanel.setLayout(new GridLayout(4, 5, 3, 3));

    }





}
