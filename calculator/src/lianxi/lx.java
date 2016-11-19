/*页面布局练习*/

package lianxi;


import java.awt.*;
import javax.swing.*;

public class lx extends JFrame{
	
	public static void main(String[] args) {
		
		lx lx1 = new lx();
	}
	//定义组件
	JButton jb1, jb2, jb3, jb4, jb5;
	//构造函数
	public lx()
	{
		//创建组件
		jb1 = new JButton("中间");
		jb2 = new JButton("东");
		jb3 = new JButton("西");
		jb4 = new JButton("南");
		jb5 = new JButton("北");
		
		//添加组件
		this.add(jb1, BorderLayout.CENTER);
		this.add(jb2, BorderLayout.EAST);
		this.add(jb3, BorderLayout.WEST);
		this.add(jb4, BorderLayout.SOUTH);
		this.add(jb5, BorderLayout.NORTH);
		
		
		//设置窗体属性
		this.setTitle("布局");
		this.setSize(300, 400);
		this.setLocation(200, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//显示窗体
		this.setVisible(true);
		
	}
	

}
