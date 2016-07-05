package Vista;

import com.sun.imageio.plugins.jpeg.JPEG;
import dao.Modelo;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JFrame;



public class FrameAltaMatricula extends javax.swing.JFrame {
    


    private Modelo m;
    private FrameAltaFacturas faf;
    
    public FrameAltaMatricula(Modelo m, FrameAltaFacturas faf) {
        initComponents();   
        this.m = m;
        this.faf = faf;
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        cambiarTitulo();
        
        
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpTitulo = new javax.swing.JPanel();
        jlTitulo = new javax.swing.JLabel();
        jpAltaMatriculas = new javax.swing.JPanel();
        jlMatriculaNew = new javax.swing.JLabel();
        tfMatriculaNew = new javax.swing.JTextField();
        jbNuevaMatricula = new javax.swing.JButton();
        jbCerrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("FacturacionApp Pepito");
        setBackground(new java.awt.Color(37, 134, 169));
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("../documentacion/transporteApp.png")).getImage());

        jpTitulo.setBackground(new java.awt.Color(37, 134, 169));
        jpTitulo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jlTitulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlTitulo.setForeground(new java.awt.Color(195, 48, 48));
        jlTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/documentacion/transporte.png"))); // NOI18N
        jlTitulo.setText("Transportes Pepito");

        javax.swing.GroupLayout jpTituloLayout = new javax.swing.GroupLayout(jpTitulo);
        jpTitulo.setLayout(jpTituloLayout);
        jpTituloLayout.setHorizontalGroup(
            jpTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTituloLayout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(jlTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpTituloLayout.setVerticalGroup(
            jpTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTituloLayout.createSequentialGroup()
                .addComponent(jlTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jpAltaMatriculas.setBackground(new java.awt.Color(37, 134, 169));

        jlMatriculaNew.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlMatriculaNew.setText("Matricula:");

        tfMatriculaNew.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfMatriculaNewKeyReleased(evt);
            }
        });

        jbNuevaMatricula.setBackground(new java.awt.Color(226, 179, 44));
        jbNuevaMatricula.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jbNuevaMatricula.setText("Alta");
        jbNuevaMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevaMatriculaActionPerformed(evt);
            }
        });

        jbCerrar.setBackground(new java.awt.Color(226, 179, 44));
        jbCerrar.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jbCerrar.setText("Cerrar");
        jbCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpAltaMatriculasLayout = new javax.swing.GroupLayout(jpAltaMatriculas);
        jpAltaMatriculas.setLayout(jpAltaMatriculasLayout);
        jpAltaMatriculasLayout.setHorizontalGroup(
            jpAltaMatriculasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpAltaMatriculasLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jlMatriculaNew)
                .addGap(18, 18, 18)
                .addComponent(tfMatriculaNew, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbNuevaMatricula)
                .addGap(35, 35, 35)
                .addComponent(jbCerrar)
                .addGap(25, 25, 25))
        );
        jpAltaMatriculasLayout.setVerticalGroup(
            jpAltaMatriculasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpAltaMatriculasLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jpAltaMatriculasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlMatriculaNew)
                    .addComponent(tfMatriculaNew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbNuevaMatricula)
                    .addComponent(jbCerrar))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpAltaMatriculas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jpAltaMatriculas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void cambiarTitulo(){
        try{
            BufferedReader br = new BufferedReader(new FileReader("./config/empresa"));
            String titulo = "";
            //jlTitulo.setText(br.readLine());
        }catch(IOException ex){
            ex.printStackTrace();
        }
    }

    private void jbCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCerrarActionPerformed
        this.setVisible(false);
        //new FramePrincipal().setVisible(true);    
    }//GEN-LAST:event_jbCerrarActionPerformed

    private void jbNuevaMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevaMatriculaActionPerformed
        m.altaMatricula(tfMatriculaNew.getText());
        faf.getJcbMatriculaNew().addItem(tfMatriculaNew.getText());
        this.faf.getFp().getCbMatricula().addItem(tfMatriculaNew.getText());
        this.faf.getFp().getCbMatriculaPorte().addItem(tfMatriculaNew.getText());
        
        tfMatriculaNew.setText("");
    }//GEN-LAST:event_jbNuevaMatriculaActionPerformed

    /*
    PARA QUE CONVIERTA A MAYUSCULAS
    */
    private void tfMatriculaNewKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfMatriculaNewKeyReleased
       tfMatriculaNew.setText(tfMatriculaNew.getText().toUpperCase());
    }//GEN-LAST:event_tfMatriculaNewKeyReleased



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbCerrar;
    private javax.swing.JButton jbNuevaMatricula;
    private javax.swing.JLabel jlMatriculaNew;
    private javax.swing.JLabel jlTitulo;
    private javax.swing.JPanel jpAltaMatriculas;
    private javax.swing.JPanel jpTitulo;
    private javax.swing.JTextField tfMatriculaNew;
    // End of variables declaration//GEN-END:variables

}
