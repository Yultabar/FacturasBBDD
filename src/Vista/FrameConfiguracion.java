package Vista;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class FrameConfiguracion extends javax.swing.JFrame {
    


    public FrameConfiguracion() {
        initComponents();   
        obtenerDatos();
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpTitulo = new javax.swing.JPanel();
        jlTitulo = new javax.swing.JLabel();
        jpConfiguracion = new javax.swing.JPanel();
        jbAceptar = new javax.swing.JButton();
        jbCerrar = new javax.swing.JButton();
        tfIVANew = new javax.swing.JTextField();
        jlTipoIVAConfiguracion = new javax.swing.JLabel();
        jlNombreEmpresConfiguracion = new javax.swing.JLabel();
        tfNombreEmpresaNew = new javax.swing.JTextField();
        jlNifCif = new javax.swing.JLabel();
        tfNifCif = new javax.swing.JTextField();
        jlDireccion1 = new javax.swing.JLabel();
        tfDireccion1 = new javax.swing.JTextField();
        jlDireccion2 = new javax.swing.JLabel();
        tfDireccion2 = new javax.swing.JTextField();
        jlTipoRetencionConfiguracion = new javax.swing.JLabel();
        tfRetencionNew = new javax.swing.JTextField();
        jlDireccion3 = new javax.swing.JLabel();
        tfDireccion3 = new javax.swing.JTextField();
        jlTelefono = new javax.swing.JLabel();
        tfTelefono = new javax.swing.JTextField();

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
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jpTituloLayout.setVerticalGroup(
            jpTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTituloLayout.createSequentialGroup()
                .addComponent(jlTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jpConfiguracion.setBackground(new java.awt.Color(37, 134, 169));

        jbAceptar.setBackground(new java.awt.Color(226, 179, 44));
        jbAceptar.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jbAceptar.setText("Aceptar");
        jbAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAceptarActionPerformed(evt);
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

        jlTipoIVAConfiguracion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlTipoIVAConfiguracion.setText("Tipo de IVA:");

        jlNombreEmpresConfiguracion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlNombreEmpresConfiguracion.setText("Nombre de la empresa:");

        jlNifCif.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlNifCif.setText("NIF/CIF:");

        jlDireccion1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlDireccion1.setText("Codigo Postal:");

        jlDireccion2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlDireccion2.setText("Provincia:");

        jlTipoRetencionConfiguracion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlTipoRetencionConfiguracion.setText("Tipo de Retencion:");

        jlDireccion3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlDireccion3.setText("Calle:");

        jlTelefono.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlTelefono.setText("Telefono:");

        javax.swing.GroupLayout jpConfiguracionLayout = new javax.swing.GroupLayout(jpConfiguracion);
        jpConfiguracion.setLayout(jpConfiguracionLayout);
        jpConfiguracionLayout.setHorizontalGroup(
            jpConfiguracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpConfiguracionLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jpConfiguracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpConfiguracionLayout.createSequentialGroup()
                        .addGroup(jpConfiguracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlDireccion1)
                            .addComponent(jlDireccion2))
                        .addGap(18, 18, 18)
                        .addGroup(jpConfiguracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpConfiguracionLayout.createSequentialGroup()
                                .addComponent(tfDireccion2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22)
                                .addComponent(jlDireccion3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jpConfiguracionLayout.createSequentialGroup()
                                .addComponent(tfDireccion1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22)
                                .addComponent(jlTelefono)))
                        .addGap(100, 100, 100))
                    .addGroup(jpConfiguracionLayout.createSequentialGroup()
                        .addGroup(jpConfiguracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jpConfiguracionLayout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addGroup(jpConfiguracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jpConfiguracionLayout.createSequentialGroup()
                                        .addComponent(jlTipoIVAConfiguracion)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(tfIVANew, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jpConfiguracionLayout.createSequentialGroup()
                                        .addComponent(jlTipoRetencionConfiguracion)
                                        .addGap(27, 27, 27)
                                        .addComponent(tfRetencionNew, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(82, 82, 82)
                                .addGroup(jpConfiguracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlNombreEmpresConfiguracion)
                                    .addComponent(jlNifCif))
                                .addGap(18, 18, 18)
                                .addGroup(jpConfiguracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jpConfiguracionLayout.createSequentialGroup()
                                        .addComponent(tfTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(jpConfiguracionLayout.createSequentialGroup()
                                        .addComponent(tfNifCif, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                                        .addGap(64, 64, 64))
                                    .addComponent(tfNombreEmpresaNew)))
                            .addGroup(jpConfiguracionLayout.createSequentialGroup()
                                .addGroup(jpConfiguracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jbAceptar)
                                    .addComponent(tfDireccion3, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(134, 134, 134)))
                        .addContainerGap())))
        );
        jpConfiguracionLayout.setVerticalGroup(
            jpConfiguracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpConfiguracionLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jpConfiguracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlTipoIVAConfiguracion)
                    .addComponent(tfIVANew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlNombreEmpresConfiguracion)
                    .addComponent(tfNombreEmpresaNew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpConfiguracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlTipoRetencionConfiguracion)
                    .addComponent(tfRetencionNew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlNifCif)
                    .addComponent(tfNifCif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jpConfiguracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlDireccion1)
                    .addComponent(tfDireccion1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlTelefono)
                    .addComponent(tfTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jpConfiguracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlDireccion2)
                    .addComponent(tfDireccion2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlDireccion3)
                    .addComponent(tfDireccion3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(jpConfiguracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbAceptar)
                    .addComponent(jbCerrar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpConfiguracion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jpConfiguracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

 public static void obtenerDatos(){
        try{
            BufferedReader br = new BufferedReader(new FileReader("./config/empresa"));
            String titulo = "";
            titulo = br.readLine();
            tfNombreEmpresaNew.setText(titulo);
            jlTitulo.setText(titulo);           
            tfNifCif.setText(br.readLine());
            tfDireccion1.setText(br.readLine());
            tfDireccion3.setText(br.readLine());
            tfDireccion2.setText(br.readLine());
            tfTelefono.setText(br.readLine());
            
            br = new BufferedReader(new FileReader("./config/ivas"));
            tfIVANew.setText(br.readLine());
            
            br = new BufferedReader(new FileReader("./config/retencion"));
            tfRetencionNew.setText(br.readLine());
            
            br.close();
            
        }catch(IOException ex){
            ex.printStackTrace();
        }
    }

    private void jbCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCerrarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jbCerrarActionPerformed

    private void jbAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAceptarActionPerformed

        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter("./config/empresa"));
            BufferedWriter bw2 = new BufferedWriter(new FileWriter("./config/ivas"));
            BufferedWriter bw3 = new BufferedWriter(new FileWriter("./config/retencion"));

            if(!tfNombreEmpresaNew.getText().equals("")){
                bw.write(tfNombreEmpresaNew.getText());
            }
            bw.newLine();
            if(!tfNifCif.getText().equals("")){
                bw.write(tfNifCif.getText());
            }
            bw.newLine();
            if(!tfDireccion1.getText().equals("")){
                bw.write(tfDireccion1.getText());
            }
            bw.newLine();
            if(!tfDireccion3.getText().equals("")){
                bw.write(tfDireccion3.getText());
            }
            bw.newLine();
            if(!tfDireccion2.getText().equals("")){
                bw.write(tfDireccion2.getText());
            }
            bw.newLine();
            if(!tfTelefono.getText().equals("")){
                bw.write(tfTelefono.getText());
            }

            if(!tfIVANew.getText().equals("")){
                bw2.write(tfIVANew.getText());
            }
            if(!tfRetencionNew.getText().equals("")){
                bw3.write(tfRetencionNew.getText());
            }
            
            this.hide();
            JOptionPane.showMessageDialog(null, "Reinicie la aplicación para que se apliquen algunos cambios");
            bw.close();
            bw2.close();
            bw3.close();
        }catch(IOException ex){

        }
        
    }//GEN-LAST:event_jbAceptarActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbAceptar;
    private javax.swing.JButton jbCerrar;
    private javax.swing.JLabel jlDireccion1;
    private javax.swing.JLabel jlDireccion2;
    private javax.swing.JLabel jlDireccion3;
    private javax.swing.JLabel jlNifCif;
    private javax.swing.JLabel jlNombreEmpresConfiguracion;
    private javax.swing.JLabel jlTelefono;
    private javax.swing.JLabel jlTipoIVAConfiguracion;
    private javax.swing.JLabel jlTipoRetencionConfiguracion;
    private static javax.swing.JLabel jlTitulo;
    private javax.swing.JPanel jpConfiguracion;
    private javax.swing.JPanel jpTitulo;
    protected static javax.swing.JTextField tfDireccion1;
    protected static javax.swing.JTextField tfDireccion2;
    protected static javax.swing.JTextField tfDireccion3;
    protected static javax.swing.JTextField tfIVANew;
    protected static javax.swing.JTextField tfNifCif;
    protected static javax.swing.JTextField tfNombreEmpresaNew;
    protected static javax.swing.JTextField tfRetencionNew;
    protected static javax.swing.JTextField tfTelefono;
    // End of variables declaration//GEN-END:variables

}
