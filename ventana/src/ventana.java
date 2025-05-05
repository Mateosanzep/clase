import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

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
        etiquetas();
        botones();
        fields();
        combos();
    }

    private void paneles(){
        panel = new JPanel();
        panel.setBackground(Color.DARK_GRAY);
        this.getContentPane().add(panel);
        panel.setLayout(null);
    }

    private void etiquetas(){
        JLabel etiqueta = new JLabel();
        etiqueta.setText("Alumnos");
        etiqueta.setBounds(10,10,50,50);
        etiqueta.setForeground(Color.ORANGE);
        panel.add(etiqueta);
    }
    
    private void botones(){
        JButton boton = new JButton();
        boton.setText("Alta");
        boton.setBounds(50,50,100,50);
        boton.setForeground(Color.GREEN);
        boton.setEnabled(true);
        boton.setMnemonic('a');
        panel.add(boton);
    }

    private void fields(){
        JTextField field = new JTextField("hola");
        field.setBounds(50, 120, 150, 30); // Add position and size
        field.setEditable(true);
        panel.add(field);
    }
    
    private void combos(){
        JComboBox<String> combo = new JComboBox<>();
        combo.addItem("Hola");
        combo.setSelectedIndex(0); // Use setSelectedIndex, not setSelectedItem with int
        combo.setBounds(50, 170, 150, 30); // Add position and size
        combo.setEnabled(true);
        panel.add(combo);
    }

}