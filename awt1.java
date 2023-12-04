import java.awt.*;
class Shr extends Frame
{
 Label l1;
  TextField t1;
   Shr()
  {
   setVisible(true);
   setSize(300,200);
   //setTitle("add");
   setLocation(500,500);
  setBackground(Color.red);
 l1=new Label("Enter no:");
t1=new TextField(10);
add(l1);
add(t1);

 }
 public static void main(String ag[])
 {
  Shr f1=new Shr();
} 
}
