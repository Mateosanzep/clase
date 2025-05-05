public class ventana extends JFrame{

    public JPanel panel;

    public ventana(){
        this.setSize(width: 500, height:550);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle(title:"Alta de alumnos");
        this.setLocationRelativeTo(c:null);
    }
    private void paneles(){
        panel = new JPanel();
    }
}