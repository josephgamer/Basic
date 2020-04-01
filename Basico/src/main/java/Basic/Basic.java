package Basic;

/**
 * @author Esteban
 * @created 01/04/2020 - 10:54 a. m.
 */
import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

public class Basic extends JFrame{
    private final JLabel fondo = new JLabel();

    public Basic(){
        super("Imagen Fondo");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setSize(new Dimension(360,250));
        this.setLayout(null);
        this.setVisible(true);
        fondoJFrame();
        //mostrarFondo();
    }

    private void fondoJFrame() {
        ((JPanel)getContentPane()).setOpaque(false);
        ImageIcon imag= new ImageIcon(getClass().getResource("/imagenes/fondoLog.png"));
        JLabel fondo = new JLabel();
        fondo.setIcon(imag);
        getLayeredPane().add(fondo,JLayeredPane.FRAME_CONTENT_LAYER);
        fondo.setBounds(0,0,imag.getIconWidth(),imag.getIconHeight());
    }

    private void mostrarFondo(){
        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondoLog.png")));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(fondo)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }

    public static void main(String[] args) {
        Basic basic = new Basic();
    }
}
