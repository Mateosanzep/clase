import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ventana extends JFrame{

    public JPanel panel;

    public ventana(){
        this.setSize(500, 550);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Alta de alumnos");
        this.setLocationRelativeTo(null);
        componentes();
    }

    private void componentes(){
        paneles();
        botones();
    }

    private void paneles(){
        panel = new JPanel();
        panel.setBackground(Color.DARK_GRAY);
        this.getContentPane().add(panel);
        panel.setLayout(null);
    }

    
    private void botones(){
        JButton boton2 = new JButton();
        boton2.setBounds(150,100,200,100);
        boton2.setOpaque(true);
        ImageIcon icon1 = new ImageIcon(getClass().getResource("/1015622.png"));
        boton2.setIcon(new ImageIcon(icon1.getImage().getScaledInstance(
            boton2.getWidth(),
            boton2.getHeight(),
            Image.SCALE_SMOOTH)));
        panel.add(boton2);

    }

}