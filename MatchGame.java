import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.util.Timer;
import java.net.*;
import java.util.TimerTask;

class MatchGame extends JFrame implements ActionListener{
    
  private JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16;
  //public  String buttonPressed="";
  public int b1clicked=0,b2clicked=0,clicks=0;
  /*public String files[] = {"pig.png","vir.png","bcat.png","time.png","tree.png", "mush.png","kk.png","vir.png","time.png","cat2.png",
        "tree.png","bcat.png","mush.png", "kk.png","pig.png","cat2.png"};*/
        public int count=0;
       int score,attempts=0;
    
    String prevbutton="",current="";
java.net.URL ic_regg =  MatchGame.class.getResource("images/logo.png");
   ImageIcon ic_reg=new ImageIcon(ic_regg) ;
        public ImageIcon ic_Logo= new ImageIcon(((Image) ic_reg.getImage()).getScaledInstance( 100,100,Image.SCALE_FAST));
   // JFrame f=new JFrame();





    MatchGame()
    {
        setTitle("BrainGame");
        setLayout(null);
        setButtons();
        setAction();
        setBackground();
        setSize(1000, 770);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void winSound(){
    java.net.URL lol= MatchGame.class.getResource("images/win.wav");   

    try{
        Clip clip = AudioSystem.getClip();
        clip.open(AudioSystem.getAudioInputStream(lol));
        clip.start();
    } catch (Exception e){
        e.printStackTrace();
    }
 }
        public void failSound(){
    java.net.URL lol= MatchGame.class.getResource("images/lose.wav");  
    

    try{
        Clip clip = AudioSystem.getClip();
        clip.open(AudioSystem.getAudioInputStream(lol));
        clip.start();
    } catch (Exception e){
        e.printStackTrace();
    }
}

      public void checkCount(int count){
            if(count==8)
                {
 //System.out.println("attempts"+attempts);
                     dispose();
                      score=(int)Math.round(attempts/count);
                     java.net.URL lol= MatchGame.class.getResource("images/congo.wav");  
                    try{
                     Clip clip = AudioSystem.getClip();
                    clip.open(AudioSystem.getAudioInputStream(lol));
                   clip.start();
                   } catch (Exception e){
                 e.printStackTrace();
                     }
                    JFrame f= new JFrame("game over");  
                   // JPanel panel = new JPanel();
                   System.out.println("count is 8 now");
                       
                Icon imgIcon = new ImageIcon( MatchGame.class.getResource("images/thank you.jpg"));

JLabel label1 = new JLabel(imgIcon);
JLabel label2 = new JLabel("Your attempts : "+attempts,SwingConstants.CENTER);
label2.setFont(new Font("Serif", Font.PLAIN, 30));
JLabel label3 = new JLabel("Your matches : "+count,SwingConstants.CENTER);
label3.setFont(new Font("Serif", Font.PLAIN, 30));
//label.setIcon(new ImageIcon("images/winning.jpg"));
label1.setBounds(30, 30, 800, 420); // You can use your own values
//panel.add(label);
label2.setBounds(40, 350, 800, 300); 
label3.setBounds(40,450,800,300);

f.add(label1);
f.add(label2);
f.add(label3);
//f.add(panel);
f.setSize(900,900);  
    f.setLayout(null);  
    f.setVisible(true);  

                }
             }
        public void close(String prevbutton)
       {
            if(prevbutton=="b1")
             {
              System.out.println("b1 closed");
                Timer  timer = new Timer(); 
              TimerTask tt= new TimerTask() {  
               public void run() {  
               System.out.println("Task is on");  
                b1.setIcon(ic_Logo);
               };  
             }; 
                           timer.schedule(tt, 300);
              // b1.setIcon(ic_Logo);
               
              }
            
            else if(prevbutton== "b2")
               {
                Timer  timer = new Timer(); 
              TimerTask tt= new TimerTask() {  
               public void run() {  
               System.out.println("Task is on");  
                 b2.setIcon(ic_Logo); 
               };  
             }; 
                           timer.schedule(tt, 300);
            
                }
             else if(prevbutton== "b3")
               {
                Timer  timer = new Timer(); 
              TimerTask tt= new TimerTask() {  
               public void run() {  
               System.out.println("Task is on");  
                 b3.setIcon(ic_Logo); 
               };  
             }; 
                           timer.schedule(tt, 300);
            
                }
            else if(prevbutton== "b4")
               {
                Timer  timer = new Timer(); 
              TimerTask tt= new TimerTask() {  
               public void run() {  
               System.out.println("Task is on");  
                 b4.setIcon(ic_Logo); 
               };  
             }; 
                           timer.schedule(tt, 300);
            
                }
            else if(prevbutton== "b5")
               {
                Timer  timer = new Timer(); 
              TimerTask tt= new TimerTask() {  
               public void run() {  
               System.out.println("Task is on");  
                 b5.setIcon(ic_Logo); 
               };  
             }; 
                           timer.schedule(tt, 300);
            
                }
              else if(prevbutton== "b6")
               {
                Timer  timer = new Timer(); 
              TimerTask tt= new TimerTask() {  
               public void run() {  
               System.out.println("Task is on");  
                 b6.setIcon(ic_Logo); 
               };  
             }; 
                           timer.schedule(tt, 300);
            
                } 
              else if(prevbutton== "b7")
               {
                Timer  timer = new Timer(); 
              TimerTask tt= new TimerTask() {  
               public void run() {  
               System.out.println("Task is on");  
                 b7.setIcon(ic_Logo); 
               };  
             }; 
                           timer.schedule(tt, 300);
            
                }
            else if(prevbutton== "b8")
               {
                Timer  timer = new Timer(); 
              TimerTask tt= new TimerTask() {  
               public void run() {  
               System.out.println("Task is on");  
                 b8.setIcon(ic_Logo); 
               };  
             }; 
                           timer.schedule(tt, 300);
            
                }
              else if(prevbutton== "b9")
               {
                Timer  timer = new Timer(); 
              TimerTask tt= new TimerTask() {  
               public void run() {  
               System.out.println("Task is on");  
                 b9.setIcon(ic_Logo); 
               };  
             }; 
                           timer.schedule(tt, 300);
            
                }
            else if(prevbutton== "b10")
               {
                Timer  timer = new Timer(); 
              TimerTask tt= new TimerTask() {  
               public void run() {  
               System.out.println("Task is on");  
                 b10.setIcon(ic_Logo); 
               };  
             }; 
                           timer.schedule(tt, 300);
            
                }
            else if(prevbutton== "b11")
               {
                Timer  timer = new Timer(); 
              TimerTask tt= new TimerTask() {  
               public void run() {  
               System.out.println("Task is on");  
                 b11.setIcon(ic_Logo); 
               };  
             }; 
                           timer.schedule(tt, 300);
            
                }
            else if(prevbutton== "b12")
               {
                Timer  timer = new Timer(); 
              TimerTask tt= new TimerTask() {  
               public void run() {  
               System.out.println("Task is on");  
                 b12.setIcon(ic_Logo); 
               };  
             }; 
                           timer.schedule(tt, 300);
            
                }
            else if(prevbutton== "b13")
               {
                Timer  timer = new Timer(); 
              TimerTask tt= new TimerTask() {  
               public void run() {  
               System.out.println("Task is on");  
                 b13.setIcon(ic_Logo); 
               };  
             }; 
                           timer.schedule(tt, 300);
            
                }
            else if(prevbutton== "b14")
               {
                Timer  timer = new Timer(); 
              TimerTask tt= new TimerTask() {  
               public void run() {  
               System.out.println("Task is on");  
                 b14.setIcon(ic_Logo); 
               };  
             }; 
                           timer.schedule(tt, 300);
            
                }
              else if(prevbutton== "b15")
               {
                Timer  timer = new Timer(); 
              TimerTask tt= new TimerTask() {  
               public void run() {  
               System.out.println("Task is on");  
                 b15.setIcon(ic_Logo); 
               };  
             }; 
                           timer.schedule(tt, 300);
            
                }
            else if(prevbutton== "b16")
               {
                Timer  timer = new Timer(); 
              TimerTask tt= new TimerTask() {  
               public void run() {  
               System.out.println("Task is on");  
                 b16.setIcon(ic_Logo); 
               };  
             }; 
                           timer.schedule(tt, 300);
            
                }
             
       }
       

public void setBackground()
{
     
 Icon bck = new ImageIcon( MatchGame.class.getResource("images/backd.jpg"));
JLabel jl=new JLabel(bck);
add(jl);
jl.setBounds(0,0,999,769);

}
     private void setButtons()
    {
        b1 = new JButton("JButton01");
        b2 = new JButton("JButton02");
        b3 = new JButton("JButton03");
        b4 = new JButton("JButton04");
        b5 = new JButton("JButton05");
        b6 = new JButton("JButton06");
        b7 = new JButton("JButton07");
        b8 = new JButton("JButton08");
        b9 = new JButton("JButton09");
        b10 = new JButton("JButton10");
        b11 = new JButton("JButton11");
        b12 = new JButton("JButton12");
        b13 = new JButton("JButton13");
        b14 = new JButton("JButton14");
        b15= new JButton("JButton15");
        b16 = new JButton("JButton16");
       

b1.setBounds(400,150,90,90);
b2.setBounds(495,150,90,90);
b3.setBounds(590,150,90,90);
b4.setBounds(685,150,90,90);
b5.setBounds(400,245,90,90);
b6.setBounds(495,245,90,90);
b7.setBounds(590,245,90,90);
b8.setBounds(685,245,90,90);
b9.setBounds(400,340,90,90);
b10.setBounds(495,340,90,90);
b11.setBounds(590,340,90,90);
b12.setBounds(685,340,90,90);
b13.setBounds(400,435,90,90);
b14.setBounds(495,435,90,90);
b15.setBounds(590,435,90,90);
b16.setBounds(685,435,90,90);


        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(b7);
        add(b8);
        add(b9);
        add(b10);
        add(b11);
        add(b12);
        add(b13);
        add(b14);
        add(b15);
        add(b16);
       
   
b1.setIcon(ic_Logo);
b2.setIcon(ic_Logo);
b3.setIcon(ic_Logo);
b4.setIcon(ic_Logo);
b5.setIcon(ic_Logo);
b6.setIcon(ic_Logo);
b7.setIcon(ic_Logo);
b8.setIcon(ic_Logo);
b9.setIcon(ic_Logo);
b10.setIcon(ic_Logo);
b11.setIcon(ic_Logo);
b12.setIcon(ic_Logo);
b13.setIcon(ic_Logo);
b14.setIcon(ic_Logo);
b15.setIcon(ic_Logo);
b16.setIcon(ic_Logo);
    
    }
    private void setAction()
    {
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this); 
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b10.addActionListener(this);
        b11.addActionListener(this);
        b12.addActionListener(this);
        b13.addActionListener(this);
        b14.addActionListener(this);
        b15.addActionListener(this);
        b16.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent eve)
    {
          
        if(eve.getSource() == b1 )
           {
 java.net.URL ic_regg1 =  MatchGame.class.getResource("images/ybt.png");
            ImageIcon ic_reg1=new ImageIcon(ic_regg1);
                 ImageIcon ic_Logo1= new ImageIcon(((Image) ic_reg1.getImage()).getScaledInstance( 100,100,Image.SCALE_FAST));
               b1.setIcon(ic_Logo1);
               
               if(prevbutton=="")
                { 
                  
                   //prev="b1";
                   prevbutton="b1";
                  }
                else{
                    current="b1";
                     if(current=="b1" && prevbutton=="b13")
                       {
                            winSound();
                           attempts+=1;
                         //System.out.println("b1 and "+prevbutton+" are clicked");
                          b1.setEnabled(false);
                         b13.setEnabled(false);
                         count++;
                         prevbutton="";
                         current="";
                       }
                      else{
                          attempts+=1;
                          failSound();
                             Timer  timer = new Timer(); 
              TimerTask tt1= new TimerTask() {  
               public void run() {  
               System.out.println("Task is on");  
                b1.setIcon(ic_Logo);
                    };  
                 }; 
                           timer.schedule(tt1, 300);
                           
                           close(prevbutton);
                           //nclose(current);
                             prevbutton="";
                             current="";
                       }
                 }
                 checkCount(count);
             
            }
 
          else if(eve.getSource() == b2 )
           {
                java.net.URL ic_regg1 =  MatchGame.class.getResource("images/tree.png");
            ImageIcon ic_reg1=new ImageIcon(ic_regg1);
                 ImageIcon ic_Logo1= new ImageIcon(((Image) ic_reg1.getImage()).getScaledInstance( 100,100,Image.SCALE_FAST));
               b2.setIcon(ic_Logo1);
                if(prevbutton=="")
                { 
                   //prev="b2";
                   prevbutton="b2";
                  }
                else{
                    current="b2";
                     if(current=="b2" && prevbutton=="b3")
                       {
                          winSound();
attempts+=1;
                         //System.out.println("b1 and "+prevbutton+" are clicked");
                          b2.setEnabled(false);
                          b3.setEnabled(false);
                          count++;
                          prevbutton="";
                          current="";
                       }
                      else{
                           failSound();
           attempts+=1;
                          Timer  timer = new Timer(); 
              TimerTask tt2= new TimerTask() {  
               public void run() {  
               System.out.println("Task is on");  
                b2.setIcon(ic_Logo);
               };  
             }; 
                           timer.schedule(tt2, 300);
                          // b2.setIcon(ic_Logo);
                           close(prevbutton);
                        
                            prevbutton="";
                             current="";
                       }
                 }
            checkCount(count);
            }
            

        else if(eve.getSource() == b3 )
           {
           java.net.URL ic_regg1 =  MatchGame.class.getResource("images/tree.png");
            ImageIcon ic_reg1=new ImageIcon(ic_regg1);
                 ImageIcon ic_Logo1= new ImageIcon(((Image) ic_reg1.getImage()).getScaledInstance( 100,100,Image.SCALE_FAST));
               b3.setIcon(ic_Logo1);
               //i++;
                  if(prevbutton=="")
                { 
                  
                   //prev="b3";
                   prevbutton="b3";
                  }
                else{
                    current="b3";
                     if(current=="b3" && prevbutton=="b2")
                       { attempts+=1;
                          winSound();
                        // System.out.println("b1 and "+prevbutton+" are clicked");
                          b3.setEnabled(false);
                         b2.setEnabled(false);
                          count++;
                         prevbutton="";
                         current="";
                       }
                      else{
                          attempts+=1;
                           Timer  timer = new Timer(); 
              TimerTask tt3= new TimerTask() {  
               public void run() {  
               System.out.println("Task is on");  
                b3.setIcon(ic_Logo);
               };  
             }; 
                           timer.schedule(tt3, 300);
                          failSound();
                           //b3.setIcon(ic_Logo);
                           current="";
                           close(prevbutton);
                             prevbutton="";
                       }
                 }
             checkCount(count);
           }
        else if(eve.getSource() == b4 )
           {
           java.net.URL ic_regg1 =  MatchGame.class.getResource("images/vir.png");
            ImageIcon ic_reg1=new ImageIcon(ic_regg1);
                 ImageIcon ic_Logo1= new ImageIcon(((Image) ic_reg1.getImage()).getScaledInstance( 100,100,Image.SCALE_FAST));
               b4.setIcon(ic_Logo1);
                if(prevbutton=="")
                { 
                  
                   //prev="b1";
                   prevbutton="b4";
                  }
                else{
                    current="b4";
                     if(current=="b4" && prevbutton=="b11")
                       { attempts+=1;
                       winSound();
                        // System.out.println("b1 and "+prevbutton+" are clicked");
                          b4.setEnabled(false);
                         b11.setEnabled(false);
                         count++;
                         prevbutton="";
                         current="";
                       }
                      else{
             attempts+=1;
                            Timer  timer = new Timer(); 
              TimerTask tt4= new TimerTask() {  
               public void run() {  
               System.out.println("Task is on");  
                b4.setIcon(ic_Logo);
               };  
             }; 
                           timer.schedule(tt4, 300);
                           failSound();
                           //b4.setIcon(ic_Logo);
                           current="";
                           close(prevbutton);
                             prevbutton="";
                       }
                 }
             checkCount(count);
              
           }
       else if(eve.getSource() == b5 )
           {
           java.net.URL ic_regg1 =  MatchGame.class.getResource("images/bcat.png");
            ImageIcon ic_reg1=new ImageIcon(ic_regg1);
                 ImageIcon ic_Logo1= new ImageIcon(((Image) ic_reg1.getImage()).getScaledInstance( 100,100,Image.SCALE_FAST));
               b5.setIcon(ic_Logo1);
               if(prevbutton=="")
                { 
                  
                   //prev="b1";
                   prevbutton="b5";
                  }
                else{
                    current="b5";
                     if(current=="b5" && prevbutton=="b8")
                       {
                         attempts+=1;
                        winSound();
                       //  System.out.println("b1 and "+prevbutton+" are clicked");
                          b5.setEnabled(false);
                         b8.setEnabled(false);
                         count++;
                         prevbutton="";
                         current="";
                       }
                      else{
                            attempts+=1;
                             Timer  timer = new Timer(); 
              TimerTask tt5= new TimerTask() {  
               public void run() {  
               System.out.println("Task is on");  
                b5.setIcon(ic_Logo);
               };  
             }; 
                           timer.schedule(tt5, 300);
                            failSound();
                           //b5.setIcon(ic_Logo);
                           current="";
                           close(prevbutton);
                             prevbutton="";
                       }
                 }
             
               checkCount(count);
           }
      else if(eve.getSource() == b6 )
           {
           java.net.URL ic_regg1 =  MatchGame.class.getResource("images/cat2.png");
            ImageIcon ic_reg1=new ImageIcon(ic_regg1);
                 ImageIcon ic_Logo1= new ImageIcon(((Image) ic_reg1.getImage()).getScaledInstance( 100,100,Image.SCALE_FAST));
               b6.setIcon(ic_Logo1);
               if(prevbutton=="")
                { 
                  
                   //prev="b1";
                   prevbutton="b6";
                  }
                else{
                    current="b6";
                     if(current=="b6" && prevbutton=="b16")
                       { attempts+=1;
                             winSound();
                        // System.out.println("b1 and "+prevbutton+" are clicked");
                          b6.setEnabled(false);
                         b16.setEnabled(false);
                          count++;
                         prevbutton="";
                         current="";
                       }
                      else{
              attempts+=1;

                              Timer  timer = new Timer(); 
              TimerTask tt6= new TimerTask() {  
               public void run() {  
               System.out.println("Task is on");  
                b6.setIcon(ic_Logo);
               };  
             }; 
                           timer.schedule(tt6, 300);
                            failSound();
                           //b6.setIcon(ic_Logo);
                           
                           close(prevbutton);
                           //nclose(current);
                             prevbutton="";
                             current="";
                       }
                 }
             
                checkCount(count);
               
           }
      else if(eve.getSource() == b7 )
           {
           java.net.URL ic_regg1 =  MatchGame.class.getResource("images/bbt.png");
            ImageIcon ic_reg1=new ImageIcon(ic_regg1);
                 ImageIcon ic_Logo1= new ImageIcon(((Image) ic_reg1.getImage()).getScaledInstance( 100,100,Image.SCALE_FAST));
               b7.setIcon(ic_Logo1);
                  if(prevbutton=="")
                { 
                  
                   //prev="b1";
                   prevbutton="b7";
                  }
                else{
                    current="b7";
                     if(current=="b7" && prevbutton=="b9")
                       {attempts+=1;
                          winSound();
                        // System.out.println("b1 and "+prevbutton+" are clicked");
                          b7.setEnabled(false);
                         b9.setEnabled(false);
                       count++;
                         prevbutton="";
                         current="";
                       }
                      else{
                         attempts+=1;

                          failSound();
                            Timer  timer = new Timer(); 
              TimerTask tt7= new TimerTask() {  
               public void run() {  
               System.out.println("Task is on");  
                b7.setIcon(ic_Logo);
               };  
             }; 
                           timer.schedule(tt7, 300);
                         //b7.setIcon(ic_Logo);
                           current="";
                           close(prevbutton);
                             prevbutton="";
                       }
                 }
             checkCount(count);
               
           }
       else if(eve.getSource() == b8 )
           {
          java.net.URL ic_regg1 =  MatchGame.class.getResource("images/bcat.png");
            ImageIcon ic_reg1=new ImageIcon(ic_regg1);
                 ImageIcon ic_Logo1= new ImageIcon(((Image) ic_reg1.getImage()).getScaledInstance( 100,100,Image.SCALE_FAST));
               b8.setIcon(ic_Logo1);
               if(prevbutton=="")
                {
                   //prev="b8";
                   prevbutton="b8";
                }
                else{
                     current="b8";
                      if(current=="b8"  && prevbutton=="b5"){
                        winSound();
                        attempts+=1;
                     //  System.out.println("b1 and b8 are clicked");
                          b8.setEnabled(false);
                         b5.setEnabled(false);
                          count++;
                          prevbutton="";
                        current="";
                        }
                       else{
                               attempts+=1;
                               failSound();
                         Timer  timer = new Timer(); 
              TimerTask tt8= new TimerTask() {  
               public void run() {  
               System.out.println("Task is on");  
                b8.setIcon(ic_Logo);
               };  
             }; 
                           timer.schedule(tt8, 300);
                            // b8.setIcon(ic_Logo);
                            
                           close(prevbutton);
                            //nclose(current);
                              prevbutton="";
                               current="";
                              }
                   }
               checkCount(count);
           }
        else if(eve.getSource() == b9 )
           {
           java.net.URL ic_regg1 =  MatchGame.class.getResource("images/bbt.png");
            ImageIcon ic_reg1=new ImageIcon(ic_regg1);
                 ImageIcon ic_Logo1= new ImageIcon(((Image) ic_reg1.getImage()).getScaledInstance( 100,100,Image.SCALE_FAST));
               b9.setIcon(ic_Logo1);
                 if(prevbutton=="")
                { 
                  
                   //prev="b1";
                   prevbutton="b9";
                  }
                else{
                    current="b9";
                     if(current=="b9" && prevbutton=="b7")
                       { attempts+=1;
                           winSound();
                         //System.out.println("b1 and "+prevbutton+" are clicked");
                          b9.setEnabled(false);
                         b7.setEnabled(false);
                          count++;
                         prevbutton="";
                         current="";
                       }
                      else{
                           attempts+=1;
                          failSound();
                           Timer  timer = new Timer(); 
              TimerTask tt9= new TimerTask() {  
               public void run() {  
               System.out.println("Task is on");  
                b9.setIcon(ic_Logo);
               };  
             }; 
                           timer.schedule(tt9, 300);
                           //b9.setIcon(ic_Logo);
                           current="";
                           close(prevbutton);
                             prevbutton="";
                       }
                 }
             checkCount(count);
               
           }
       else if(eve.getSource() == b10 )
           {
           java.net.URL ic_regg1 =  MatchGame.class.getResource("images/kk.png");
            ImageIcon ic_reg1=new ImageIcon(ic_regg1);
                 ImageIcon ic_Logo1= new ImageIcon(((Image) ic_reg1.getImage()).getScaledInstance( 100,100,Image.SCALE_FAST));
               b10.setIcon(ic_Logo1);
                 if(prevbutton=="")
                { 
                  
                   //prev="b1";
                   prevbutton="b10";
                  }
                else{
                    current="b10";
                     if(current=="b10" && prevbutton=="b15")
                       { attempts+=1;
                           winSound();
                        // System.out.println("b1 and "+prevbutton+" are clicked");
                          b10.setEnabled(false);
                         b15.setEnabled(false);
                            count++;
                         prevbutton="";
                         current="";
                       }
                      else{ attempts+=1;
                            Timer  timer = new Timer(); 
              TimerTask tt10= new TimerTask() {  
               public void run() {  
               System.out.println("Task is on");  
                b10.setIcon(ic_Logo);
               };  
             }; 
                           timer.schedule(tt10, 300);
                           failSound();
                          // b10.setIcon(ic_Logo);
                           current="";
                           close(prevbutton);
                             prevbutton="";
                       }
                 }
             
               checkCount(count);
           }
        else if(eve.getSource() == b11 )
           {
           java.net.URL ic_regg1 =  MatchGame.class.getResource("images/vir.png");
            ImageIcon ic_reg1=new ImageIcon(ic_regg1);
                 ImageIcon ic_Logo1= new ImageIcon(((Image) ic_reg1.getImage()).getScaledInstance( 100,100,Image.SCALE_FAST));
               b11.setIcon(ic_Logo1);
                if(prevbutton=="")
                { 
                  
                   //prev="b1";
                   prevbutton="b11";
                  }
                else{
                    current="b11";
                     if(current=="b11" && prevbutton=="b4")
                       { attempts+=1;
                             winSound();
                        // System.out.println("b1 and "+prevbutton+" are clicked");
                          b11.setEnabled(false);
                         b4.setEnabled(false);
                       count++;
                         prevbutton="";
                         current="";
                       }
                      else{ attempts+=1;
                            Timer  timer = new Timer(); 
              TimerTask tt11= new TimerTask() {  
               public void run() {  
               System.out.println("Task is on");  
                b11.setIcon(ic_Logo);
               };  
             }; 
                           timer.schedule(tt11, 300);
                            failSound();
                           //b11.setIcon(ic_Logo);
                           current="";
                           close(prevbutton);
                             prevbutton="";
                       }
                 }
             
              checkCount(count);
           }
       else if(eve.getSource() == b12)
           {
           java.net.URL ic_regg1 =  MatchGame.class.getResource("images/mush.png");
            ImageIcon ic_reg1=new ImageIcon(ic_regg1);
                 ImageIcon ic_Logo1= new ImageIcon(((Image) ic_reg1.getImage()).getScaledInstance( 100,100,Image.SCALE_FAST));
               b12.setIcon(ic_Logo1);
                if(prevbutton=="")
                { 
                  
                   //prev="b1";
                   prevbutton="b12";
                  }
                else{
                    current="b12";
                     if(current=="b12" && prevbutton=="b14")
                       { attempts+=1;
                          winSound();
                         System.out.println("b1 and "+prevbutton+" are clicked");
                          b12.setEnabled(false);
                         b14.setEnabled(false);
                           count++;
                         prevbutton="";
                         current="";
                       }
                      else{ attempts+=1;
                           Timer  timer = new Timer(); 
              TimerTask tt12= new TimerTask() {  
               public void run() {  
               System.out.println("Task is on");  
                b12.setIcon(ic_Logo);
               };  
             }; 
                           timer.schedule(tt12, 300);
                          failSound();
                           //b12.setIcon(ic_Logo);
                           current="";
                           close(prevbutton);
                             prevbutton="";
                       }
                 }
             checkCount(count);
           }
        else if(eve.getSource() == b13 )
           {
           java.net.URL ic_regg1 =  MatchGame.class.getResource("images/ybt.png");
            ImageIcon ic_reg1=new ImageIcon(ic_regg1);
                 ImageIcon ic_Logo1= new ImageIcon(((Image) ic_reg1.getImage()).getScaledInstance( 100,100,Image.SCALE_FAST));
               b13.setIcon(ic_Logo1);
                if(prevbutton=="")
                { 
                  
                   //prev="b1";
                   prevbutton="b13";
                  }
                else{
                    current="b13";
                     if(current=="b13" && prevbutton=="b1")
                       { attempts+=1;
                            winSound();
                         System.out.println("b1 and "+prevbutton+" are clicked");
                          b1.setEnabled(false);
                         b13.setEnabled(false);
                            count++;
                         prevbutton="";
                         current="";
                       }
                      else{ 
                               attempts+=1;
                            Timer  timer = new Timer(); 
              TimerTask tt13= new TimerTask() {  
               public void run() {  
               System.out.println("Task is on");  
                b13.setIcon(ic_Logo);
               };  
             }; 
                           timer.schedule(tt13, 300);
                            failSound();
                           //b13.setIcon(ic_Logo);
                           current="";
                           close(prevbutton);
                             prevbutton="";
                       }
                 }
             
               checkCount(count);
           }
      else if(eve.getSource() == b14 )
           {
           java.net.URL ic_regg1 =  MatchGame.class.getResource("images/mush.png");
            ImageIcon ic_reg1=new ImageIcon(ic_regg1);
                 ImageIcon ic_Logo1= new ImageIcon(((Image) ic_reg1.getImage()).getScaledInstance( 100,100,Image.SCALE_FAST));
               b14.setIcon(ic_Logo1);
                if(prevbutton=="")
                { 
                  
                   //prev="b1";
                   prevbutton="b14";
                  }
                else{
                    current="b14";
                     if(current=="b14" && prevbutton=="b12")
                       { attempts+=1;
                           winSound();
                         System.out.println("b1 and "+prevbutton+" are clicked");
                          b14.setEnabled(false);
                         b12.setEnabled(false);
                        count++;
                         prevbutton="";
                         current="";
                       }
                      else{ attempts+=1;
                             Timer  timer = new Timer(); 
              TimerTask tt14= new TimerTask() {  
               public void run() {  
               System.out.println("Task is on");  
                b14.setIcon(ic_Logo);
               };  
             }; 
                           timer.schedule(tt14, 300);
                             failSound();
                          // b14.setIcon(ic_Logo);
                           current="";
                           close(prevbutton);
                             prevbutton="";
                       }
                 }
             checkCount(count);
           }
      else if(eve.getSource() == b15 )
           {
           java.net.URL ic_regg1 =  MatchGame.class.getResource("images/kk.png");
            ImageIcon ic_reg1=new ImageIcon(ic_regg1);
                 ImageIcon ic_Logo1= new ImageIcon(((Image) ic_reg1.getImage()).getScaledInstance(100 ,100,Image.SCALE_FAST));
               b15.setIcon(ic_Logo1);
                if(prevbutton=="")
                { 
                  
                   //prev="b1";
                   prevbutton="b15";
                  }
                else{
                    current="b15";
                     if(current=="b15" && prevbutton=="b10")
                       { attempts+=1;
                        winSound();
                         System.out.println("b1 and "+prevbutton+" are clicked");
                          b15.setEnabled(false);
                         b10.setEnabled(false);
                         count++;
                         prevbutton="";
                         current="";
                       }
                      else{ attempts+=1;
                           Timer  timer = new Timer(); 
              TimerTask tt15= new TimerTask() {  
               public void run() {  
               System.out.println("Task is on");  
                b15.setIcon(ic_Logo);
               };  
             }; 
                           timer.schedule(tt15, 300);
                          failSound();
                           //b15.setIcon(ic_Logo);
                           current="";
                           close(prevbutton);
                             prevbutton="";
                       }
                 }
             checkCount(count);
           }
     else if(eve.getSource() == b16)
           {
           java.net.URL ic_regg1 =  MatchGame.class.getResource("images/cat2.png");
            ImageIcon ic_reg1=new ImageIcon(ic_regg1);
                 ImageIcon ic_Logo1= new ImageIcon(((Image) ic_reg1.getImage()).getScaledInstance(100,100,Image.SCALE_FAST));
               b16.setIcon(ic_Logo1);
                if(prevbutton=="")
                { 
                  
                   //prev="b1";
                   prevbutton="b16";
                  }
                else{
                    current="b16";
                     if(current=="b16" && prevbutton=="b6")
                       { attempts+=1;
                          winSound();
                         System.out.println("b1 and "+prevbutton+" are clicked");
                          b16.setEnabled(false);
                         b6.setEnabled(false);
                         count++;
                         prevbutton="";
                         current="";
                       }
                      else{ attempts+=1;
                            Timer  timer = new Timer(); 
              TimerTask tt16= new TimerTask() {  
               public void run() {  
               System.out.println("Task is on");  
                b16.setIcon(ic_Logo);
               };  
             }; 
                           timer.schedule(tt16, 300);
                           failSound();
                           //b16.setIcon(ic_Logo);
                           current="";
                           close(prevbutton);
                             prevbutton="";
                       }
                 }
             checkCount(count);
           }
           
    }
 
       public static void main(String[] args) {
        
        MatchGame f = new  MatchGame();
    }
   
  
}