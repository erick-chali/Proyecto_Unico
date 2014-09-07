import javax.swing.*;

/**
 * Created by erickchali on 9/6/14.
 */
public class IniciarInterfaz {

    public static void main(String args[]){
        IniciarInterfaz i = new IniciarInterfaz();
    }

    public IniciarInterfaz(){
        Login l = new Login();
        l.setSize(200,200);
        l.setLocationRelativeTo(null);
        l.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        l.setVisible(true);
    }
}
