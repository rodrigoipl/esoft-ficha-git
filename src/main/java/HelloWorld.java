import javax.swing.*;

public class HelloWorld extends JFrame {
    private JPanel panel1;
    private JLabel lblMensagem;
    private JLabel lblMensagem2;

    public HelloWorld(){
        lblMensagem2.setText("O Rodrigo Sousa esteve aqui");
        setContentPane(panel1);
        pack();
    }

    public static void main(String[] args) {
        new HelloWorld().setVisible(true);
    }
}
