import java.awt.event.*;
import javax.swing.*;

public class Butoane implements ActionListener {

    JTextField s1, s2, s3;
    JTextArea ta;

    public Butoane(JTextField s1, JTextField s2, JTextArea ta, JTextField s3 ) {
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
        this.ta = ta;
    }

    public void actionPerformed(ActionEvent event) {
        Calcul calcul=new Calcul(Integer.parseInt(s1.getText()), Integer.parseInt(s2.getText()), Integer.parseInt(s3.getText()));
        calcul.formareLista();
        ta.setText("");
        int i=0;
        for(Problema p: calcul.getList()){
            i++;
            ta.append(i + ":" + " Pb: "+p.getId()+" cu tipul: "+ p.getTip()+"\n");
        }
    }

}