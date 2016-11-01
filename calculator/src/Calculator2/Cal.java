package Calculator2;

import java.awt.*;

import javax.swing.*;

public class Cal {
	
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

        super();  
        // 初始化计算器  
        init();  
        // 设置计算器的背景颜色  
        this.setBackground(Color.LIGHT_GRAY);  
        this.setTitle("计算器");  
        // 在屏幕(500, 300)坐标处显示计算器  
        this.setLocation(500, 300);  
        // 不许修改计算器的大小  
        this.setResizable(false);  
        // 使计算器中各组件大小合适  
        this.pack(); 
    	
    }
    /*初始化计算器*/
    public void init()
    {

    	resultText.setHorizontalAlignment(JTextField.RIGHT);
    }





}
