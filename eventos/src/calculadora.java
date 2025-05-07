
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class calculadora extends JFrame {
    
    //atributos
    public JPanel panel;

    private JTextField campo1, campo2; //ingresar numeros
    private JButton botonSuma, botonMultiplicar;
    private JLabel etiquetaNum1, etiquetaNum2, etiquetaResultado;

    // metodos

    public calculadora(){
        this.setSize(400, 300);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Calculadora");
        this.setLocationRelativeTo(null);

        componentes();
    }

    private void componentes(){
        paneles();
        etiquetas();
        camposTextos();
        botones();
    }

    //agregar el panel
    private void paneles(){
        panel = new JPanel();
        panel .setBackground(Color.DARK_GRAY);
        panel.setLayout(null); //Poder editar
        this.getContentPane().add(panel);
    }

    //etiquetas
    private void etiquetas(){
        etiquetaNum1 = new JLabel("Numero 1:");
        etiquetaNum1.setBounds(70, 30, 100, 20);
        etiquetaNum1.setForeground(Color.ORANGE);
        panel.add(etiquetaNum1);

        etiquetaNum2 = new JLabel("Numero 2:");
        etiquetaNum2.setBounds(70, 80, 100, 20);
        etiquetaNum2.setForeground(Color.ORANGE);
        panel.add(etiquetaNum2);

        etiquetaResultado = new JLabel("Resultado:");
        etiquetaResultado.setBounds(70, 180, 160, 20);
        etiquetaResultado.setForeground(Color.CYAN);
        panel.add(etiquetaResultado);
    }

    //cuadros de textos
    private void camposTextos(){
        campo1 = new JTextField();
        campo1.setBounds(160, 30, 150, 20);
        panel.add(campo1);

        campo2 = new JTextField();
        campo2.setBounds(160, 80, 150, 20);
        panel.add(campo2);
    }

    // botones
    private void botones(){
        botonSuma = new JButton("+");
        botonSuma.setBounds(100, 130, 80, 30);
        panel.add(botonSuma);

        botonSuma.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                calcularOperacion('+');
            }
        });

        botonMultiplicar = new JButton("*");
        botonMultiplicar.setBounds(200, 130, 80, 30);
        panel.add(botonMultiplicar);

        botonMultiplicar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                calcularOperacion('*');
            }
        });

        //Evento- accion del boton

    }

    private void calcularOperacion(char operacion){
        //logica de las operaciones
        try {
            double num1 = Double.parseDouble(campo1.getText());
            double num2 = Double.parseDouble(campo2.getText());
            double result;
    
            switch (operacion) {
                case '+' -> {
                    result = num1+num2;
                    etiquetaResultado.setText("Resultado: "+result);
                }
                case '*' -> {
                    result = num1*num2;
                    etiquetaResultado.setText("Resultado: "+result);
                }
            }
        } catch (NumberFormatException e) {
            etiquetaResultado.setText("Error: ingresa numeros");
        }
        

    }

}
