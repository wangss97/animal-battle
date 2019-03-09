package animalbattle;
import java.awt.FlowLayout;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import javax.swing.JDialog;
import javax.swing.JTextArea;
public class rule extends JDialog{
	/**
	 * 
	 */
	private static final long serialVersionUID = -5383535117556831563L;
	InputStreamReader reader;
	JTextArea textarea;
	rule(int x,int y, String path)
	{
		this.setModal(true);
		textarea = new JTextArea();
		textarea.setFont(new Font("一般", Font.PLAIN,17));
		textarea.setEditable(false);
		this.setLayout(new FlowLayout());
		this.add(textarea);
//		textarea.setLocation(0,0);
		try {
			reader = new InputStreamReader(getClass().getResourceAsStream(path));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String tmp;
		BufferedReader bufread = new BufferedReader(reader);
		try {
			while((tmp = bufread.readLine()) != null)
			{
				textarea.append(tmp + "\n");
			}
			reader.close();
		} catch (IOException e1) {
			// TODO 自动生成的 catch 块
			e1.printStackTrace();
		}
		this.setSize(x, y);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
	}
}
