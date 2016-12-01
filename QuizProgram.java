 import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.*;
class  Quiz extends JFrame implements ActionListener{
            JPanel panel;
            JPanel panelresult;
            JRadioButton choice1;
            JRadioButton choice2;
            JRadioButton choice3;
            JRadioButton choice4;
            ButtonGroup bg;
            JLabel lblmess;
            JButton btnext;
            String[][] qpa;
            String[][] qca;
            int qaid;
            HashMap<Integer, String> map;


	



            Quiz(){
                      initializedata();
                      setTitle("Fun Facts-Quiz");
                      setDefaultCloseOperation(EXIT_ON_CLOSE);
                     setSize(430,350);
                      setLocation(300,100);
                      setResizable(false);
                      Container cont=getContentPane();
                      cont.setLayout(null);
                     cont.setBackground(Color.GRAY);
                    bg=new ButtonGroup();
                    choice1=new JRadioButton("Choice1",true);
                    choice2=new JRadioButton("Choice2",false);
                    choice3=new JRadioButton("Choice3",false);
                    choice4=new JRadioButton("Choice4",false);
                    bg.add(choice1);
                    bg.add(choice2);
                    bg.add(choice3);
                    bg.add(choice4);
                    lblmess=new JLabel("Choose a correct anwswer");
                    lblmess.setForeground(Color.BLUE);
                    lblmess.setFont(new Font("Arial", Font.BOLD, 11));
                    btnext=new JButton("Next");
                    btnext.setForeground(Color.GREEN);
                    btnext.addActionListener(this);
                    panel=new JPanel();
                    panel.setBackground(Color.LIGHT_GRAY);
                    panel.setLocation(10,10);
                    panel.setSize(400,300);
                    panel.setLayout(new GridLayout(6,2));
                    panel.add(lblmess);
                    panel.add(choice1);
                    panel.add(choice2);
                    panel.add(choice3);
                    panel.add(choice4);
                    panel.add(btnext);
                    cont.add(panel);
                    setVisible(true);
                    qaid=0;
                    readqa(qaid);

            }

        public void actionPerformed(ActionEvent e){

                        if(btnext.getText().equals("Next")){
                                    if(qaid<9){

                                                map.put(qaid,getSelection());
                                                qaid++;
                                                readqa(qaid);
                                                }
                                    else {
                                                map.put(qaid,getSelection());
                                                btnext.setText("Show answers");

                                             }
                                    }
                        else if(btnext.getText().equals("Show answers"))
                                    new Report();


            }



        public void initializedata(){
                        //qpa stores questions and its possible answers 
                        qpa=new String[10][5];

                        qpa[0][0]="Whats the capital of France?";
                        qpa[0][1]="Nice";
                        qpa[0][2]="Paris";
                        qpa[0][3]="Lyon";
                        qpa[0][4]="Bordeaux";

                        qpa[1][0]="Which Apollo mission landed the first humans on the Moon?";
                        qpa[1][1]="Apollo 7";
                        qpa[1][2]="Apollo 11";
                        qpa[1][3]="Apollo 9";
                        qpa[1][4]="Apollo 13";

                        qpa[2][0]="Who plays Lara Croft in the Tomb Raider series of films?";
                        qpa[2][1]="Minnie Driver";
                        qpa[2][2]="Nell McAndrew";
                        qpa[2][3]="Jennifer Aniston";
                        qpa[2][4]="Angelina Jolie";

                        qpa[3][0]="Which two colours make purple?";
                        qpa[3][1]="Blue and Yellow.";
                        qpa[3][2]="Red and Blue.";
                        qpa[3][3]="Green and Orange";
                        qpa[3][4]="Red and Green";

                        qpa[4][0]="What is the square root of 9?";
                        qpa[4][1]="3";
                        qpa[4][2]="1";
                        qpa[4][3]="27";
                        qpa[4][4]="81";

                        qpa[5][0]="Who's going to win the North Kerry Football Championship?";
                        qpa[5][1]="Ballyduff ;-)";
                        qpa[5][2]="Listowel";
                        qpa[5][3]="St. Senans";
                        qpa[5][4]="Ballydonoghue";

                        qpa[6][0]="Which fruits are most commonly used to make wine?";
                        qpa[6][1]="Lemons";
                        qpa[6][2]="Grapes";
                        qpa[6][3]="Oranges";
                        qpa[6][4]="Strawberries";

                        qpa[7][0]="Which Italian city has a famous leaning tower?";
                        qpa[7][1]="Florence";
                        qpa[7][2]="Pisa";
                        qpa[7][3]="Rome";
                        qpa[7][4]="Venice";

                        qpa[8][0]="Which tree grows from an acorn?";
                        qpa[8][1]="Ash";
                        qpa[8][2]="Elm";
                        qpa[8][3]="Lime";
                        qpa[8][4]="Oak";

                        qpa[9][0]="Which bear is smarter than the average bear?";
                        qpa[9][1]="Paddington Bear";
                        qpa[9][2]="Pooh Bear";
                        qpa[9][3]="Rupert Bear";
                        qpa[9][4]="Yogi Bear";


                        //qca stores questions and the correct answers
                        qca=new String[10][2];

                        qca[0][0]="Whats the capital of France?";
                        qca[0][1]="Paris";

                        qca[1][0]="Which Apollo mission landed the first humans on the Moon?";
                        qca[1][1]="Apollo 11";

                        qca[2][0]="Who plays Lara Croft in the Tomb Raider series of films?";
                        qca[2][1]="Angelina Jolie";

                        qca[3][0]="Which two colours make purple?";
                        qca[3][1]="Red and Blue.";


                        qca[4][0]="What is the square root of 9?";
                        qca[4][1]="3";

                        qca[5][0]="Who's going to win the North Kerry Football Championship?";
                        qca[5][1]="Ballyduff ;-)";

                        qca[6][0]="Which fruits are most commonly used to make wine?";
                        qca[6][1]="Grapes";

                        qca[7][0]="Which Italian city has a famous leaning tower??";
                        qca[7][1]="Pisa";

                        qca[8][0]="Which tree grows from an acorn?";
                        qca[8][1]="Oak";

                        qca[9][0]="Which bear is smarter than the average bear?";
                        qca[9][1]="Yogi Bear";


                        //create a map object to store pairs of question and selected answer
                        map=new HashMap<Integer, String>();

                        }
        public String getSelection(){
                        String selectedChoice=null;
                        Enumeration<AbstractButton> buttons=bg.getElements();
                        while(buttons.hasMoreElements())
                        {
                        JRadioButton temp=(JRadioButton)buttons.nextElement();
                        if(temp.isSelected())
                                    {
                                                selectedChoice=temp.getText();
                                    }
                         }
                        return(selectedChoice);
            }


        public void readqa(int qid){
                        lblmess.setText("  "+qpa[qid][0]);
                        choice1.setText(qpa[qid][1]);
                        choice2.setText(qpa[qid][2]);
                        choice3.setText(qpa[qid][3]);
                        choice4.setText(qpa[qid][4]);
                        choice1.setSelected(true);
            }
        public void reset(){
                        qaid=0;
                        map.clear();
                        readqa(qaid);
                        btnext.setText("Next");
                        }
        public int calCorrectAnswer(){
                        int qnum=10;
                        int count=0;
                        for(int qid=0;qid<qnum;qid++)
                                    if(qca[qid][1].equals(map.get(qid))) count++;
                        return count;
            }

   public class Report extends JFrame{
                        Report(){
                                    setTitle("Answers");
                                    setSize(850,550);
                                    setBackground(Color.WHITE);
                                    addWindowListener(new WindowAdapter(){
                                                            public void windowClosing(WindowEvent e){
                                                                        dispose();
                                                                        reset();
                                                            }
                                                });
                                    Draw d=new Draw();
                                    add(d);
                                    setVisible(true);
                                    }


      class Draw extends Canvas{
                                    public void paint(Graphics g){
                                                int qnum=10;
                                                int x=10;
                                                int y=20;
                                                for(int i=0;i<qnum;i++){
                                                            //print the 1st column
                                                            g.setFont(new Font("Arial",Font.BOLD,12));
                                                            g.drawString(i+1+". "+qca[i][0], x,y);
                                                            y+=30;
                                                            g.setFont(new Font("Arial",Font.PLAIN,12));
                                                            g.drawString("      Correct answer:"+qca[i][1], x,y);
                                                            y+=30;
                                                            g.drawString("      Your answer:"+map.get(i), x,y);
                                                            y+=30;
                                                            //print the 2nd column
                                                            if(y>400)
                                                            {y=20;
                                                              x=450;
                                                            }

                                                }
                                                //Show number of correct answers
                                                int numc=calCorrectAnswer();
                                                g.setColor(Color.BLUE);
                                                g.setFont(new Font("Arial",Font.BOLD,14));
                                                g.drawString("Number of correct answers:"+numc,300,500);


                                    }
                        }

            }




}


 public class QuizProgram{

      public static void main(String args[]){
                   new Quiz();


public ArrayList<Score> getScores() {
        loadScoreFile();
        sort();
        return scores;
    }

      }


}
