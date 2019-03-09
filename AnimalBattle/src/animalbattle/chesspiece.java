package animalbattle;
import javax.swing.*;
import java.util.HashSet;
public class chesspiece extends JButton{
	/**
	 * 
	 */
	private static final long serialVersionUID = 7085412541922738700L;
	public String type;
	public String team;
	public String name;
	public Point point;
	public HashSet<Point> availPoint;
	public int attack;
	ImageIcon ima;
	chesspiece(String path,String type,String team,Point point,int attack)
	{
		ima = new ImageIcon(getClass().getResource(path));
		this.type = type;
		this.team = team;
		this.point = point;
		this.attack = attack;
		name = team + type;
		availPoint = new HashSet<Point>();        //将当前棋子可走的点都保存在该集合中
		super.setIcon(ima);
		super.setSize(ima.getIconWidth(), ima.getIconHeight());
//		super.setFocusPainted(true);           //设置JButton绘制焦点边框
		super.setBorder(null);                 //设置JButton无边框
		super.setContentAreaFilled(false);     //设置JButton背景透明
	}
}
