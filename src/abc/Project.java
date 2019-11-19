package abc;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
	 
	import javax.swing.JButton;
	import javax.swing.JFrame;
	import javax.swing.JLabel;
	import javax.swing.JTextField;
	 
	public class Project {
		Project(){
			JFrame f=new JFrame("Calculator");
			f.setVisible(true);
			f.setSize(450, 400);
			f.setLayout(null);
	 
			JLabel l1=new JLabel();
			l1.setText("First Input: ");
			l1.setBounds(20, 15, 80, 20);
			f.add(l1);
	 
			final JLabel l2=new JLabel();
			l2.setText("Second Input: ");
			l2.setBounds(20, 50, 80, 20);
			f.add(l2);
	 
			final JTextField jtf1=new JTextField();
			jtf1.setBounds(110, 15, 100, 20);
			f.add(jtf1);
	 
			final JTextField jtf2=new JTextField();
			jtf2.setBounds(110, 50, 100, 20);
			f.add(jtf2);
	 
			JButton jb1=new JButton("+");
			jb1.setBounds(40, 100, 60, 50);
			f.add(jb1);
	 
			JButton jb2=new JButton("-");
			jb2.setBounds(120, 100, 60, 50);
			f.add(jb2);
	 
			JButton jb3=new JButton("*");
			jb3.setBounds(200, 100, 60, 50);
			f.add(jb3);
	 
			JButton jb4=new JButton("/");
			jb4.setBounds(40, 180, 60, 50);
			f.add(jb4);
	 
			JButton jb5=new JButton("%");
			jb5.setBounds(120, 180, 60, 50);
			f.add(jb5);
	 
			JButton jb7=new JButton("^");
			jb7.setBounds(200, 180, 60, 50);
			f.add(jb7);
	 
			JButton jb8=new JButton("!");
			jb8.setBounds(40, 260, 60, 50);
			f.add(jb8);
	 
			JButton jb6=new JButton("Reset");
			jb6.setBounds(120, 260, 135, 50);
			f.add(jb6);
	 
			JLabel l3=new JLabel();
			l3.setText("Result: ");
			l3.setBounds(260, 32, 50, 20);
			f.add(l3);
	 
			final JTextField result=new JTextField();
			result.setBounds(320, 32, 100, 20);
			f.add(result);
	 
			jb1.addActionListener(new ActionListener() {
	 
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					String s1=jtf1.getText();
					String s2=jtf2.getText();
					int x=Integer.parseInt(s1);
					int y=Integer.parseInt(s2);
					int z=x+y;
					String s=Integer.toString(z);
					result.setText(s);
				}
			});
			jb2.addActionListener(new ActionListener() {
	 
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					String s1=jtf1.getText();
					String s2=jtf2.getText();
					int x=Integer.parseInt(s1);
					int y=Integer.parseInt(s2);
					int z=x-y;
					String s=Integer.toString(z);
					result.setText(s);
				}
			});
			jb3.addActionListener(new ActionListener() {
	 
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					String s1=jtf1.getText();
					String s2=jtf2.getText();
					int x=Integer.parseInt(s1);
					int y=Integer.parseInt(s2);
					int z=x*y;
					String s=Integer.toString(z);
					result.setText(s);
				}
			});
			jb4.addActionListener(new ActionListener() {
	 
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					String s1=jtf1.getText();
					String s2=jtf2.getText();
					double x=Double.parseDouble(s1);
					double y=Double.parseDouble(s2);
					double z=x/y;
					String s=Double.toString(z);
					result.setText(s);
				}
			});
			jb5.addActionListener(new ActionListener() {
	 
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					String s1=jtf1.getText();
					String s2=jtf2.getText();
					int x=Integer.parseInt(s1);
					int y=Integer.parseInt(s2);
					int z=x%y;
					String s=Integer.toString(z);
					result.setText(s);
				}
			});
			jb6.addActionListener(new ActionListener() {
	 
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					jtf2.setVisible(true);
					l2.setText("Second Input: ");
					jtf1.setText(null);
					jtf2.setText(null);
					result.setText(null);
				}
			});
			jb7.addActionListener(new ActionListener() {
	 
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					String s1=jtf1.getText();
					String s2=jtf2.getText();
					int x=Integer.parseInt(s1);
					int y=Integer.parseInt(s2);
					int z=1;
					for(int i=0;i<y;i++){
						z=z*x;
					}
					String s=Integer.toString(z);
					result.setText(s);
				}
			});
			jb8.addActionListener(new ActionListener() {
	 
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					String s1=jtf1.getText();
					jtf2.setVisible(false);
					l2.setText(null);
					int x=Integer.parseInt(s1);
					int z=1;
					for(int i=x;i>=1;i--){
						z=z*i;
					}
					String s=Integer.toString(z);
					result.setText(s);
				}
			});
		}
}