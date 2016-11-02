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
            keys[i].setForeground(Color.black);  
        } 
        
        
        // ��ʼ�����ܼ������ú�ɫ��ʾ�������ܼ�����һ��������  
        JPanel commandsPanel = new JPanel(); 
        // �����񲼾�����1�У�3�е���������֮���ˮƽ������Ϊ3�����أ���ֱ������Ϊ3������  
        commandsPanel.setLayout(new GridLayout(1, 3, 3, 3));  
        for (int i = 0; i < COMMAND.length; i++) {  
            commands[i] = new JButton(COMMAND[i]);  
            commandsPanel.add(commands[i]);  
            commands[i].setForeground(Color.GREEN);  
        } 
        // ��ʼ��M�����ú�ɫ��ʾ����M������һ��������  
        JPanel calmsPanel = new JPanel();  
        // �����񲼾ֹ�������5�У�1�е���������֮���ˮƽ������Ϊ3�����أ���ֱ������Ϊ3������  
        calmsPanel.setLayout(new GridLayout(5, 1, 3, 3));  
        for (int i = 0; i < M.length; i++) {  
            m[i] = new JButton(M[i]);  
            calmsPanel.add(m[i]);  
            m[i].setForeground(Color.red);  
        } 
        
        // �½�һ����Ļ��壬�����潨����command��calckeys������ڸû�����  
        JPanel panel1 = new JPanel();  
        // ������ñ߽粼�ֹ����������������֮���ˮƽ�ʹ�ֱ�����ϼ����Ϊ3����  
        panel1.setLayout(new BorderLayout(3, 3));  
        panel1.add("North", commandsPanel);  
        panel1.add("West", calckeysPanel);  
  
        // ����һ��������ı���  
        JPanel top = new JPanel();  
        top.setLayout(new BorderLayout());  
        top.add("Center", resultText);  
        // ���岼��  
        getContentPane().setLayout(new BorderLayout(3, 3));  
        getContentPane().add("North", top);  
        getContentPane().add("Center", panel1);  
        getContentPane().add("West", calmsPanel);  
    	
    	this.setTitle("������");
    	this.setSize(400, 200);
		this.setLocation(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
    	this.setVisible(true);

    }





}
