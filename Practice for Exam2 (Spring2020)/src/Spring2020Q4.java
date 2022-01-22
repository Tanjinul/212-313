
public class Spring2020Q4 {
    
    import java.awt.*;
    import java.awt.event.*;
    public class Exam2Listener implements ActionListener { //[1] : ActionListener
     private MainWindow mainFrame; //[2] MainWindow
     public Exam2Listener(MainWindow f) {
     mainFrame = f;
     } // constructor
     public void actionPerformed(ActionEvent e) { //[3] actionPerformed
     String chosenItem = ((MenuItem) e.getSource()).getLabel();
     if (chosenItem.equals( "Pass" )) { //[4] "Pass"
     System.out.println("Hooray! You passed!");
     } // end if mInputFile
     else if (chosenItem.equals("Fail")) {
     System.out.println( "Too bad! You failed." ); //[5] "Too bad! you failed!"
     } // end if mInputFile
     else if ( chosenItem.equals("Quit")) {
     System.exit(0);
     } //if
     } //
    } // class Exam2Listener


}
