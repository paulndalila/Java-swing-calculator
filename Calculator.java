import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.border.CompoundBorder;
import java.awt.SystemColor;
import javax.swing.JTextPane;
import javax.swing.JScrollPane;
import javax.swing.border.LineBorder;

public class Calculator {

	private static JFrame frmCalculator;
	private static JTextField textField;
	private static String operator=null;
	private static float Value1=0,Value2=0,ans=0;
	private static JTextField tHold;
	private static JTextField textField_1;
	private static LinkedList<String> history;
	private static JTextPane textPane;
	private static int count;
	private static JScrollPane scrollPane;
	private static JButton btnNewButton_13;
	
	public static void main(String[] args) {

		frmCalculator =new JFrame();
		frmCalculator.setTitle("Calculator");
		frmCalculator.setBounds(50, 50, 427, 521);
		frmCalculator.getContentPane().setLayout(null);
		
		history=new LinkedList<String>();
		history.add("                                          --             History             --\n");
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 131, 391, 342);
		scrollPane.setVisible(false);
		frmCalculator.getContentPane().add(scrollPane);
		
		textPane = new JTextPane();
		textPane.setBorder(new LineBorder(new Color(51, 0, 51)));
		textPane.setEditable(false);
		scrollPane.setViewportView(textPane);
		scrollPane.setBorder(new CompoundBorder());
		textPane.setVisible(false);
		
		JPanel panel = new JPanel();
		panel.setBorder(new CompoundBorder());
		panel.setBounds(0, 50, 401, 84);
		frmCalculator.getContentPane().add(panel);
		panel.setLayout(null);
		
		textField = new JTextField();
		textField.setBackground(Color.WHITE);
		textField.setEditable(false);
		textField.setBounds(10, 32, 391, 42);
		panel.add(textField);
		textField.setText("0");
		textField.setFont(new Font("Arial", Font.PLAIN, 25));
		textField.setForeground(Color.BLACK);
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBorder(new CompoundBorder());
		textField.setColumns(10);
		
		tHold = new JTextField();
		tHold.setBackground(Color.WHITE);
		tHold.setEditable(false);
		tHold.setHorizontalAlignment(SwingConstants.RIGHT);
		tHold.setBounds(10, 11, 391, 25);
		panel.add(tHold);
		tHold.setBorder(new CompoundBorder());
		tHold.setForeground(Color.DARK_GRAY);
		tHold.setColumns(10);
		textField.setVisible(true);
		
		JButton btnNewButton = new JButton("7");
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton.setBorder(new CompoundBorder());
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				extTxtField("7");
			}
		});
		btnNewButton.setBounds(10, 212, 89, 60);
		frmCalculator.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton("9");
		btnNewButton_2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton_2.setBorder(new CompoundBorder());
		btnNewButton_2.setBackground(Color.LIGHT_GRAY);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				extTxtField("9");
			}
		});
		btnNewButton_2.setBounds(208, 212, 89, 60);
		frmCalculator.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("4");
		btnNewButton_3.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton_3.setBorder(new CompoundBorder());
		btnNewButton_3.setBackground(Color.LIGHT_GRAY);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				extTxtField("4");
			}
		});
		btnNewButton_3.setBounds(10, 283, 89, 60);
		frmCalculator.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_5 = new JButton("6");
		btnNewButton_5.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton_5.setBorder(new CompoundBorder());
		btnNewButton_5.setBackground(Color.LIGHT_GRAY);
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				extTxtField("6");
			}
		});
		btnNewButton_5.setBounds(208, 283, 89, 60);
		frmCalculator.getContentPane().add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("1");
		btnNewButton_6.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton_6.setBorder(new CompoundBorder());
		btnNewButton_6.setBackground(Color.LIGHT_GRAY);
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				extTxtField("1");
			}
		});
		btnNewButton_6.setBounds(10, 354, 89, 60);
		frmCalculator.getContentPane().add(btnNewButton_6);
		
		JButton btnNewButton_8 = new JButton("3");
		btnNewButton_8.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton_8.setBorder(new CompoundBorder());
		btnNewButton_8.setBackground(Color.LIGHT_GRAY);
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				extTxtField("3");
			}
		});
		btnNewButton_8.setBounds(208, 354, 89, 60);
		frmCalculator.getContentPane().add(btnNewButton_8);
		
		JButton btnNewButton_10_1 = new JButton("C");
		btnNewButton_10_1.setForeground(Color.BLACK);
		btnNewButton_10_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton_10_1.setBorder(new CompoundBorder());
		btnNewButton_10_1.setBackground(Color.LIGHT_GRAY);
		btnNewButton_10_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("0");
				tHold.setText("");
				Value1=0;
				Value2=0;
			}
		});
		btnNewButton_10_1.setBounds(10, 425, 72, 42);
		frmCalculator.getContentPane().add(btnNewButton_10_1);
		
		JLabel lblNewLabel = new JLabel("Calculator");
		lblNewLabel.setFont(new Font("Snap ITC", Font.BOLD, 23));
		lblNewLabel.setBounds(10, 11, 280, 42);
		frmCalculator.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Paul is awesome at programming!");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(10, 131, 391, 23);
		frmCalculator.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("contact:paulndalila001@gmail.com");
		lblNewLabel_2.setFont(new Font("Dialog", Font.PLAIN, 9));
		lblNewLabel_2.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_2.setBounds(10, 472, 248, 14);
		frmCalculator.getContentPane().add(lblNewLabel_2);
		
		JButton btnNewButton_12_1 = new JButton("Sqrt");
		btnNewButton_12_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					double vall=Double.valueOf(textField.getText());
					ans=(float) Math.sqrt(vall);
					tHold.setText("Sqrt of: "+vall);
					AnsWithOrWithoutZero();
					addToHistory();
				}catch(Exception e2) {
						tHold.setText("");
						textField.setText("Math error");
				}
			}
		});
		btnNewButton_12_1.setForeground(Color.BLACK);
		btnNewButton_12_1.setBorder(new CompoundBorder());
		btnNewButton_12_1.setBackground(Color.LIGHT_GRAY);
		btnNewButton_12_1.setBounds(196, 178, 62, 23);
		frmCalculator.getContentPane().add(btnNewButton_12_1);
		
		JButton btnNewButton_12_1_1 = new JButton("x^2");
		btnNewButton_12_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					tHold.setText("sqr("+Integer.parseInt(textField.getText())+")");
					int valo=Integer.parseInt(textField.getText());
					ans=valo*valo;
					AnsWithOrWithoutZero();
					addToHistory();
				}catch(Exception e2) {
						tHold.setText("");
						textField.setText("Math error");
				}
			}
		});
		btnNewButton_12_1_1.setForeground(Color.BLACK);
		btnNewButton_12_1_1.setBorder(new CompoundBorder());
		btnNewButton_12_1_1.setBackground(Color.LIGHT_GRAY);
		btnNewButton_12_1_1.setBounds(146, 178, 52, 23);
		frmCalculator.getContentPane().add(btnNewButton_12_1_1);
		
		JButton btnNewButton_12_2 = new JButton("CE");
		btnNewButton_12_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("0");
				tHold.setText("");
				Value1=0;
				Value2=0;
			}
		});
		btnNewButton_12_2.setForeground(Color.BLACK);
		btnNewButton_12_2.setBorder(new CompoundBorder());
		btnNewButton_12_2.setBackground(Color.LIGHT_GRAY);
		btnNewButton_12_2.setBounds(257, 178, 62, 23);
		frmCalculator.getContentPane().add(btnNewButton_12_2);
		
		JButton btnNewButton_12_1_1_1_1 = new JButton("x^e");
		btnNewButton_12_1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				tHold.setText(Integer.parseInt(textField.getText())+"^");
				String inp=JOptionPane.showInputDialog(frmCalculator, "Value of e:");
				float in=Integer.parseInt(inp);
				tHold.setText(Integer.parseInt(textField.getText())+" ^"+inp);
				ans=power(Float.valueOf(textField.getText()),in);
				AnsWithOrWithoutZero();
				addToHistory();
				}catch(Exception e2) {
					tHold.setText("");
					textField.setText("Math error");
				}
			}
		});
		btnNewButton_12_1_1_1_1.setForeground(Color.BLACK);
		btnNewButton_12_1_1_1_1.setBorder(new CompoundBorder());
		btnNewButton_12_1_1_1_1.setBackground(Color.LIGHT_GRAY);
		btnNewButton_12_1_1_1_1.setBounds(45, 178, 52, 23);
		frmCalculator.getContentPane().add(btnNewButton_12_1_1_1_1);
		
		JButton btnNewButton_12_1_2 = new JButton("R");
		btnNewButton_12_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Float intToRound=Float.valueOf(textField.getText());
				ans=Math.round(intToRound);
				textField.setText(""+ans);
				AnsWithOrWithoutZero();
			}
		});
		btnNewButton_12_1_2.setForeground(Color.BLACK);
		btnNewButton_12_1_2.setBorder(new CompoundBorder());
		btnNewButton_12_1_2.setBackground(Color.LIGHT_GRAY);
		btnNewButton_12_1_2.setBounds(10, 178, 37, 23);
		frmCalculator.getContentPane().add(btnNewButton_12_1_2);
		
		count=2;
		
		btnNewButton_13 = new JButton("...");
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int even=count%2;
				
				if(even==0) {
					textPane.setVisible(true);
					scrollPane.setVisible(true);
					btnNewButton_13.setBackground(Color.CYAN);
					btnNewButton_13.setText("\\|/");
					btnNewButton_13.setVerticalAlignment(SwingConstants.CENTER);
					textField_1.requestFocus();
					showHistory();
					
				}else {
					textPane.setVisible(false);
					scrollPane.setVisible(false);
					btnNewButton_13.setBackground(SystemColor.control);
					btnNewButton_13.setText("...");
					btnNewButton_13.setVerticalAlignment(SwingConstants.TOP);
					textField_1.requestFocus();


				}
				count++;
			}
		});
		btnNewButton_13.setVerticalAlignment(SwingConstants.TOP);
		btnNewButton_13.setBorder(new CompoundBorder());
		btnNewButton_13.setBackground(SystemColor.control);
		btnNewButton_13.setBounds(377, 11, 24, 28);
		frmCalculator.getContentPane().add(btnNewButton_13);
		
		textField_1 = new JTextField();
		textField_1.setBorder(new CompoundBorder());
		textField_1.setEditable(false);
		textField_1.setBackground(SystemColor.control);
		textField_1.setBounds(255, 0, 86, 20);
		frmCalculator.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton_9_1 = new JButton("+");
		btnNewButton_9_1.setForeground(Color.BLACK);
		btnNewButton_9_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_9_1.setBorder(new CompoundBorder());
		btnNewButton_9_1.setBackground(Color.PINK);
		btnNewButton_9_1.addActionListener(e -> {
				
				if(operator!="+") {
					operator="+";
					String fgf=textField.getText();
					tHold.setText(fgf+" + ");
					Value1=Float.valueOf(fgf);
					textField.setText("");
				}else if((tHold.getText()).equals("") || (tHold.getText()).equals(null) || (tHold.getText()).equals(" ")) {
					operator="+";
					String fgf=textField.getText();
					tHold.setText(fgf+" + ");
					Value1=Float.valueOf(fgf);
					textField.setText("");
				}else {
					operator="+";
					String fgf=textField.getText();
					int lengt=tHold.getText().length();
					String nw=tHold.getText().substring(0, lengt-3);
					float ler=Float.valueOf(nw);
					Value1=Float.valueOf(fgf)+ler;
					tHold.setText(String.valueOf(Value1)+" + ");
					textField.setText("");
				}
				
			
		});
		btnNewButton_9_1.setBounds(307, 212, 94, 54);
		frmCalculator.getContentPane().add(btnNewButton_9_1);
		
		JButton btnNewButton_9_1_1 = new JButton("_");
		btnNewButton_9_1_1.setForeground(Color.BLACK);
		btnNewButton_9_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_9_1_1.setBorder(new CompoundBorder());
		btnNewButton_9_1_1.setBackground(Color.PINK);
		btnNewButton_9_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(operator!="-") {
					operator="-";
					String fgf=textField.getText();
					tHold.setText(fgf+" - ");
					Value1=Float.valueOf(fgf);
					textField.setText("");
				}else if((tHold.getText()).equals("") || (tHold.getText()).equals(null) || (tHold.getText()).equals(" ")) {
					operator="-";
					String fgf=textField.getText();
					tHold.setText(fgf+" - ");
					Value1=Float.valueOf(fgf);
					textField.setText("");
				}else {
					operator="-";
					String fgf=textField.getText();					
					int lengt=tHold.getText().length();
					String nw=tHold.getText().substring(0, lengt-3);
					float ler=Float.valueOf(nw);
					Value1=ler-Float.valueOf(fgf);
					tHold.setText(String.valueOf(Value1)+" - ");
					textField.setText("");
				}
			}
		});
		btnNewButton_9_1_1.setBounds(307, 264, 94, 54);
		frmCalculator.getContentPane().add(btnNewButton_9_1_1);
		
		JButton btnNewButton_9_1_2 = new JButton("/");
		btnNewButton_9_1_2.setForeground(Color.BLACK);
		btnNewButton_9_1_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_9_1_2.setBorder(new CompoundBorder());
		btnNewButton_9_1_2.setBackground(Color.PINK);
		btnNewButton_9_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(operator!="/") {
					operator="/";
					String fgf=textField.getText();
					tHold.setText(fgf+" / ");
					Value1=Float.valueOf(fgf);
					textField.setText("");
				}else if((tHold.getText()).equals("") || (tHold.getText()).equals(null) || (tHold.getText()).equals(" ")) {
					operator="/";
					String fgf=textField.getText();
					tHold.setText(fgf+" / ");
					Value1=Float.valueOf(fgf);
					textField.setText("");
				}else {
					operator="/";
					String fgf=textField.getText();			
					int lengt=tHold.getText().length();
					String nw=tHold.getText().substring(0, lengt-3);
					float ler=Float.valueOf(nw);
					Value1=ler/Float.valueOf(fgf);
					tHold.setText(String.valueOf(Value1)+" / ");
					textField.setText("");
				}
			}
		});
		btnNewButton_9_1_2.setBounds(307, 318, 94, 60);
		frmCalculator.getContentPane().add(btnNewButton_9_1_2);
		
		JButton btnNewButton_9_1_3 = new JButton("X");
		btnNewButton_9_1_3.setForeground(Color.BLACK);
		btnNewButton_9_1_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_9_1_3.setBorder(new CompoundBorder());
		btnNewButton_9_1_3.setBackground(Color.PINK);
		btnNewButton_9_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(operator!="x") {
					operator="x";
					String fgf=textField.getText();
					tHold.setText(fgf+" x ");
					Value1=Float.valueOf(fgf);
					textField.setText("");
				}else if((tHold.getText()).equals("") || (tHold.getText()).equals(null) || (tHold.getText()).equals(" ")) {
					operator="x";
					String fgf=textField.getText();
					tHold.setText(fgf+" x ");
					Value1=Float.valueOf(fgf);
					textField.setText("");
				}else {
					operator="x";
					String fgf=textField.getText();		
					int lengt=tHold.getText().length();
					String nw=tHold.getText().substring(0, lengt-3);
					float ler=Float.valueOf(nw);
					Value1=ler*Float.valueOf(fgf);
					tHold.setText(String.valueOf(Value1)+" x ");
					textField.setText("");
				}
			}
		});
		btnNewButton_9_1_3.setBounds(307, 378, 94, 48);
		frmCalculator.getContentPane().add(btnNewButton_9_1_3);
		
		JButton btnNewButton_9 = new JButton("=");
		btnNewButton_9.setForeground(new Color(51, 0, 51));
		btnNewButton_9.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_9.setBorder(new CompoundBorder());
		btnNewButton_9.setBackground(new Color(153, 153, 102));
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				String fgf=textField.getText();
				String hhd=tHold.getText();
				if(operator.equals("")||operator.equals(" ") || operator.equals(null)) {
					
				}else {
					tHold.setText(hhd+""+fgf);
				}
				Value2=Float.valueOf(fgf);
				if(operator.equals("+")) {
					ans=Value1+Value2;
				}else if(operator.equals("-")) {
					ans=Value1-Value2;
				}else if(operator.equals("x")) {
					ans=Value1*Value2;
				}else if(operator.equals("/")) {
					ans=Value1/Value2;
				}else{
					textField.setText(""+ans);
				}
				Value1=0;
				Value2=0;
				operator="";
				AnsWithOrWithoutZero();
				addToHistory();

				}catch(Exception ee) {
					textField.setText("Syntax error");
				}
				textField_1.requestFocus();
			}
		});
		btnNewButton_9.setBounds(307, 425, 94, 48);
		frmCalculator.getContentPane().add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton(".");
		btnNewButton_10.setForeground(SystemColor.desktop);
		btnNewButton_10.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton_10.setBorder(new CompoundBorder());
		btnNewButton_10.setBackground(Color.LIGHT_GRAY);
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				extTxtField2(".");
			}
		});
		btnNewButton_10.setBounds(208, 425, 101, 42);
		frmCalculator.getContentPane().add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("0");
		btnNewButton_11.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton_11.setBorder(new CompoundBorder());
		btnNewButton_11.setBackground(Color.LIGHT_GRAY);
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				extTxtField("0");
			}
		});
		btnNewButton_11.setBounds(79, 425, 130, 42);
		frmCalculator.getContentPane().add(btnNewButton_11);
		
		JButton btnNewButton_7 = new JButton("2");
		btnNewButton_7.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton_7.setBorder(new CompoundBorder());
		btnNewButton_7.setBackground(Color.LIGHT_GRAY);
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				extTxtField("2");
			}
		});
		btnNewButton_7.setBounds(97, 354, 112, 60);
		frmCalculator.getContentPane().add(btnNewButton_7);
		
		JButton btnNewButton_4 = new JButton("5");
		btnNewButton_4.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton_4.setBorder(new CompoundBorder());
		btnNewButton_4.setBackground(Color.LIGHT_GRAY);
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				extTxtField("5");
			}
		});
		btnNewButton_4.setBounds(97, 283, 112, 60);
		frmCalculator.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_1 = new JButton("8");
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton_1.setBorder(new CompoundBorder());
		btnNewButton_1.setBackground(Color.LIGHT_GRAY);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				extTxtField("8");
			}
		});
		btnNewButton_1.setBounds(97, 212, 112, 60);
		frmCalculator.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_12_1_1_1 = new JButton("x^3");
		btnNewButton_12_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					tHold.setText("cube("+Integer.parseInt(textField.getText())+")");
					ans=power(Float.valueOf(textField.getText()),3);
					AnsWithOrWithoutZero();
					addToHistory();
					}catch(Exception e2) {
						tHold.setText("");
						textField.setText("Math error");
					}
			}
		});
		btnNewButton_12_1_1_1.setForeground(Color.BLACK);
		btnNewButton_12_1_1_1.setBorder(new CompoundBorder());
		btnNewButton_12_1_1_1.setBackground(Color.LIGHT_GRAY);
		btnNewButton_12_1_1_1.setBounds(97, 178, 52, 23);
		frmCalculator.getContentPane().add(btnNewButton_12_1_1_1);
		
		JButton btnNewButton_12 = new JButton("Del");
		btnNewButton_12.setForeground(Color.BLACK);
		btnNewButton_12.setBorder(new CompoundBorder());
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String bal=textField.getText();
				if(tHold.getText().equals("")&&bal.equals("")){
					textField.setText(bal);
					tHold.setText("");

				}else if(bal.equals("0")||bal.equals("")||bal.equals(" ")) {
					textField.setText(bal);
					String holder=tHold.getText();
					int ll=holder.length()-3;
					textField.setText(holder.substring(0, ll).strip());
					tHold.setText("");
				}else {
					int len=bal.length();
					textField.setText(bal.substring(0, len-1));
				}
				textField_1.requestFocus();

			}
		});
		btnNewButton_12.setBackground(Color.GRAY);
		btnNewButton_12.setBounds(349, 178, 52, 23);
		frmCalculator.getContentPane().add(btnNewButton_12);
		frmCalculator.setVisible(true);
	}
	public static void showHistory() {
		String valuesOfHistory="";
		for(int lengthS=0;lengthS<=(history.size()-1);lengthS++) {
			valuesOfHistory=valuesOfHistory.concat(history.get(lengthS))+"\n";
		}
		textPane.setText(valuesOfHistory);

	}
	public static void addToHistory() {
		if(textField.getText().equals("")) {
			//System.out.println("You have to fix this");
		}else {
			history.add(" :: "+tHold.getText());
			history.add("   = "+textField.getText()+"\n");
		}
	}
	public static void AnsWithOrWithoutZero() {
		textField.setText(""+ans);
		String inte=textField.getText();
		int l1=(inte.length());
		String en=inte.substring(l1-2);
		if(en.equals(".0")) {
			String witho=inte.substring(0, l1-2);
			textField.setText(""+witho);
		}else {
			textField.setText(""+ans);
		}
	}
	public static float power(float base,float exponent) {
		float power=1;
		for(float i=1;i<=exponent;i++) {
			power=power*base;
		}
		return power;
	}
	public static void extTxtField(String number) {
		String val=textField.getText();
		if(val.equals("0")) {
			textField.setText(number);
		}else {
			textField.setText(val+""+number);
		}
	}
	public static void extTxtField2(String dot) {
		if(textField.getText().equals("0")) {
			textField.setText("0"+dot);
		}else {
		extTxtField(dot);
		}
	}
	public static void extTxtField(char number) {
		String val=textField.getText();
		if(val.equals("0")) {
			textField.setText(""+number);
		}else {
			textField.setText(val+""+number);
		}
	}
}
