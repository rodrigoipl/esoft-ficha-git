import javax.swing.*;

public class HelloWorld extends JFrame {
    private JPanel panel1;
    private  JLabel lblMensagem2;


    public HelloWorld(){
        setContentPane(panel1);
        lblMensagem2.setText("O Joel esteve aqui");
        pack();
    }

    public static void main(String[] args) {
        new HelloWorld().setVisible(true);
    }
}
