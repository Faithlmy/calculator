/*ҳ�沼����ϰ*/

package lianxi;


import java.awt.*;
import javax.swing.*;

public class lx extends JFrame{
	
	public static void main(String[] args) {
		
		lx lx1 = new lx();
	}
	//�������
	JButton jb1, jb2, jb3, jb4, jb5;
	//���캯��
	public lx()
	{
		//�������
		jb1 = new JButton("�м�");
		jb2 = new JButton("��");
		jb3 = new JButton("��");
		jb4 = new JButton("��");
		jb5 = new JButton("��");
		
		//������
		this.add(jb1, BorderLayout.CENTER);
		this.add(jb2, BorderLayout.EAST);
		this.add(jb3, BorderLayout.WEST);
		this.add(jb4, BorderLayout.SOUTH);
		this.add(jb5, BorderLayout.NORTH);
		
		
		//���ô�������
		this.setTitle("����");
		this.setSize(300, 400);
		this.setLocation(200, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//��ʾ����
		this.setVisible(true);
		
	}
	

}
