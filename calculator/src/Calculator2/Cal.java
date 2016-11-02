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
    private JButton keys[] = new JButton[KEYS.length]; 
    private JButton commands[] = new JButton[COMMAND.length];  
    private JButton m[] = new JButton[M.length];  
    private JTextField resultText = new JTextField("0"); 
	


   /*构造函数*/
    public Cal()
    {
    	init();
 
    }
    /*初始化计算器*/
    public void init()
    {

        // 初始化计算器上键的按钮，将键放在一个画板内  
        JPanel calckeysPanel = new JPanel();  
        // 用网格布局器，4行，5列的网格，网格之间的水平方向间隔为3个象素，垂直方向间隔为3个象素  
        calckeysPanel.setLayout(new GridLayout(4, 5, 3, 3));  
        for (int i = 0; i < KEYS.length; i++) {  
            keys[i] = new JButton(KEYS[i]);  
            calckeysPanel.add(keys[i]);  
            keys[i].setForeground(Color.black);  
        } 
        
        
        // 初始化功能键，都用红色标示。将功能键放在一个画板内  
        JPanel commandsPanel = new JPanel(); 
        // 用网格布局器，1行，3列的网格，网格之间的水平方向间隔为3个象素，垂直方向间隔为3个象素  
        commandsPanel.setLayout(new GridLayout(1, 3, 3, 3));  
        for (int i = 0; i < COMMAND.length; i++) {  
            commands[i] = new JButton(COMMAND[i]);  
            commandsPanel.add(commands[i]);  
            commands[i].setForeground(Color.GREEN);  
        } 
        // 初始化M键，用红色标示，将M键放在一个画板内  
        JPanel calmsPanel = new JPanel();  
        // 用网格布局管理器，5行，1列的网格，网格之间的水平方向间隔为3个象素，垂直方向间隔为3个象素  
        calmsPanel.setLayout(new GridLayout(5, 1, 3, 3));  
        for (int i = 0; i < M.length; i++) {  
            m[i] = new JButton(M[i]);  
            calmsPanel.add(m[i]);  
            m[i].setForeground(Color.red);  
        } 
        
        // 新建一个大的画板，将上面建立的command和calckeys画板放在该画板内  
        JPanel panel1 = new JPanel();  
        // 画板采用边界布局管理器，画板里组件之间的水平和垂直方向上间隔都为3象素  
        panel1.setLayout(new BorderLayout(3, 3));  
        panel1.add("North", commandsPanel);  
        panel1.add("West", calckeysPanel);  
  
        // 建立一个画板放文本框  
        JPanel top = new JPanel();  
        top.setLayout(new BorderLayout());  
        top.add("Center", resultText);  
        // 整体布局  
        getContentPane().setLayout(new BorderLayout(3, 3));  
        getContentPane().add("North", top);  
        getContentPane().add("Center", panel1);  
        getContentPane().add("West", calmsPanel);  
    	
    	this.setTitle("计算器");
    	this.setSize(400, 200);
		this.setLocation(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
    	this.setVisible(true);

    }





}
