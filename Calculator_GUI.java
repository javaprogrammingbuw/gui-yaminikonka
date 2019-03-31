

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.ArrayList;


public class Calculator_GUI extends JFrame{
       

       public Calculator_GUI(){
       	inputUI();
       }
       private JButton onebutton;private JButton twobutton;private JButton threebutton;private JButton fourbutton;private JButton fivebutton;
       private JButton sixbutton;private JButton sevenbutton;private JButton eightbutton;private JButton ninebutton;private JButton zerobutton;
       private JButton plusbutton;private JButton minusbutton;private JButton crossbutton;private JButton divisionbutton;private JButton clearbutton;
       private JButton equalbutton;private JPanel pane1;private JPanel pane2;private JPanel pane3;private GroupLayout gl1;private GroupLayout gl2;private GroupLayout gl3;
       private JTextField tf;private JTextArea ta;private Font font=new Font("SansSerif", Font.PLAIN, 20);
       private JPanel pane4; 

       private double current = 0;
       private Mode currentMode;
       private enum Mode{PLUS,MINUS,TIMES,DIVIDED;};

       public void inputUI(){
       	  onebutton =new JButton("1");
       	  onebutton.setToolTipText("you want 1 press me");
          onebutton.addActionListener((event) -> press("1"));
       	  twobutton =new JButton("2");
       	  twobutton.setToolTipText("you want 2 press me");
          twobutton.addActionListener((event) -> press("2"));
       	  threebutton =new JButton("3");
       	  threebutton.setToolTipText("you want 3 press me");
          threebutton.addActionListener((event) -> press("3"));
       	  fourbutton =new JButton("4");
       	  fourbutton.setToolTipText("you want 4 press me");
          fourbutton.addActionListener((event) -> press("4"));
       	  fivebutton =new JButton("5");
       	  fivebutton.setToolTipText("you want 5 press me");
          fivebutton.addActionListener((event) -> press("5"));
       	  sixbutton =new JButton("6");
       	  sixbutton.setToolTipText("you want 6 press me");
          sixbutton.addActionListener((event) -> press("6"));
       	  sevenbutton =new JButton("7");
       	  sevenbutton.setToolTipText("you want 7 press me");
          sevenbutton.addActionListener((event) -> press("7"));
       	  eightbutton =new JButton("8");
       	  eightbutton.setToolTipText("you want 8 press me");
          eightbutton.addActionListener((event) -> press("8"));
       	  ninebutton =new JButton("9");
       	  ninebutton.setToolTipText("you want 9 press me");
          ninebutton.addActionListener((event) -> press("9"));
       	  zerobutton =new JButton("0");
       	  zerobutton.setToolTipText("you want 0 press me");
          zerobutton.addActionListener((event) -> press("0"));
       	  plusbutton =new JButton("+");
       	  plusbutton.setToolTipText("you want + press me");
       	  plusbutton.addActionListener((event) -> addition(Double.parseDouble(tf.getText())));
       	  minusbutton =new JButton("-");
       	  minusbutton.setToolTipText("you want - press me");
          minusbutton.addActionListener((event) -> substraction(Double.parseDouble(tf.getText())));
       	  crossbutton =new JButton("*");
       	  crossbutton.setToolTipText("you want * press me");
          crossbutton.addActionListener((event) -> multiplication(Double.parseDouble(tf.getText())));
       	  divisionbutton =new JButton("/");
       	  divisionbutton.setToolTipText("you want / press me");
          divisionbutton.addActionListener((event) -> division(Double.parseDouble(tf.getText())));
       	  equalbutton =new JButton("=");
       	  equalbutton.setToolTipText("you want = press me");
          equalbutton.addActionListener((event) -> displayResult(Double.parseDouble(tf.getText())));
       	  clearbutton =new JButton("C");
       	  clearbutton.setToolTipText("you want C press me");
          clearbutton.addActionListener((event) -> ta.setText(""));
       	  
       	  tf=new JTextField();
       	  tf.setFont(font);
       	  // tf.setAction(System.Next());
       	  // tf.addActionListener()
       	  tf.setText("");
          
       	  ta=new JTextArea();
       	  ta.setFont(font);
       	  ta.setText("");

       	  setTitle("Easy Calculator Try it! 'if u w fun'");

       	  createGroupLayout();

       	  setLocationRelativeTo(null);

       	  setDefaultCloseOperation(EXIT_ON_CLOSE);

        }
        private void createGroupLayout(){

        	//   pane 1
        	pane1=new JPanel();
        	gl1=new GroupLayout(pane1);
        	pane1.setLayout(gl1);

        	pane1.setToolTipText("this is a Input and Output pane");

        	gl1.setAutoCreateContainerGaps(true);
        	gl1.setAutoCreateGaps(true);

        	gl1.setHorizontalGroup(gl1.createSequentialGroup().addComponent(tf).addComponent(equalbutton).addComponent(ta).addComponent(clearbutton));
        	gl1.setVerticalGroup(gl1.createSequentialGroup().addGroup(gl1.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                    .addComponent(tf)
                                                    .addComponent(equalbutton)
                                                    .addComponent(ta)
                                                    .addComponent(clearbutton)));
             
             //  pane 2
        	pane2=new JPanel();
        	gl2=new GroupLayout(pane2);
        	pane2.setLayout(gl2);

        	pane2.setToolTipText("this a Numbers pane ");

        	gl2.setAutoCreateContainerGaps(true);
        	gl2.setAutoCreateGaps(true);

        	gl2.setHorizontalGroup(gl2.createSequentialGroup().addGroup(gl2.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(onebutton).addComponent(fourbutton).addComponent(sevenbutton))
        		.addGroup(gl2.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(twobutton).addComponent(fivebutton).addComponent(eightbutton).addComponent(zerobutton))
        		.addGroup(gl2.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(threebutton).addComponent(sixbutton).addComponent(ninebutton)));

        	gl2.setVerticalGroup(gl2.createSequentialGroup().addGroup(gl2.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(onebutton).addComponent(twobutton).addComponent(threebutton)).
                                                    addGroup(gl2.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(fourbutton).addComponent(fivebutton).addComponent(sixbutton)).
                                                    addGroup(gl2.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(sevenbutton).addComponent(eightbutton).addComponent(ninebutton))
                                                    .addComponent(zerobutton));

            //  pane3
        	pane3=new JPanel();
        	gl3=new GroupLayout(pane3);
        	pane3.setLayout(gl3);

        	pane3.setToolTipText("this a Operations pane");


        	gl3.setAutoCreateContainerGaps(true);
        	gl3.setAutoCreateGaps(true);

        	gl3.setHorizontalGroup(gl3.createSequentialGroup().addGroup(gl3.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(plusbutton).addComponent(minusbutton).addComponent(crossbutton)
        		                                             .addComponent(divisionbutton)));
        	gl3.setVerticalGroup(gl3.createSequentialGroup().addComponent(plusbutton).addComponent(minusbutton).addComponent(crossbutton).addComponent(divisionbutton));

       		pane4=(JPanel)getContentPane();
       		GroupLayout gl = new GroupLayout(pane4);
       		pane4.add(pane1);
       		pane4.add(pane2);
       		pane4.add(pane3);
       		gl.setHorizontalGroup(gl.createSequentialGroup().addGroup(gl.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(pane1).addComponent(pane2)).addGroup(gl.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(pane1).addComponent(pane3)));
       		gl.setVerticalGroup(gl.createSequentialGroup().addComponent(pane1).addGroup(gl.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(pane2).addComponent(pane3)));
       		pane4.setLayout(gl);

       		pack();

        }
        private void onsubmit(){
        	ta.setText("You entered: "+tf.getText());
        	// press();

        }
        private void press(String btnName){
        	tf.setText(tf.getText() + btnName);
        }
        public static void main(String[] args){
             EventQueue.invokeLater(() ->{
            Calculator_GUI cgui = new Calculator_GUI();
            cgui.setVisible(true);
        });
    
        }

        private void addition(double current){
        	this.current=current;
        	this.currentMode = Mode.PLUS;
        	tf.setText("");
        }
        private void substraction(double current){
        	this.current=current;
        	this.currentMode=Mode.MINUS;
        	tf.setText("");
        }
        private void multiplication(double current){
        	this.current=current;
        	this.currentMode=Mode.TIMES;
        	tf.setText("");
        }
        private void division(double current){
        	this.current=current;
        	this.currentMode=Mode.DIVIDED;
        	tf.setText("");
        }
        // private void clear(){
        // 	tf.setText("");
        // 	ta.setText("");
        // }


        private double getResult(double val){
        	tf.setText("");
        	switch(currentMode){
        		case PLUS:
        			return current + val;
    			case MINUS:
    				return current - val;
				case TIMES:
					return current * val;
				case DIVIDED:
					return current/val;
				default:
					return -1;
        	}
        }

        private void displayResult(double val){
        	ta.setText(String.valueOf(getResult(val)));
        }

}