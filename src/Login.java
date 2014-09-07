import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by erickchali on 9/6/14.
 */
public class Login extends JFrame implements ActionListener {

    JLabel user,pass,invalid;
    JButton login;
    JTextField usuario;
    JPasswordField contra;

    public Login(){
        super("Login");

        this.setLayout(new FlowLayout());

        user = new JLabel("Usuario");
        pass = new JLabel("Contraseña");
        invalid = new JLabel(" ");

        usuario = new JTextField();
        usuario.setPreferredSize(new Dimension(150,25));

        contra = new JPasswordField();
        contra.setPreferredSize(new Dimension(150,25));

        login = new JButton("Ingresar");
        login.addActionListener(this);

        this.add(user);
        this.add(usuario);
        this.add(pass);
        this.add(contra);
        this.add(login);
        this.add(invalid);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
