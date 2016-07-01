package Vista;

import dao.Modelo;
import dominio.Cliente;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class FrameAltaClientes extends javax.swing.JFrame {
    


    private String tituloFrame="";
    private Modelo modelo;
    private FramePrincipal fp;
    
    public FrameAltaClientes(Modelo modelo,FramePrincipal fp) {
        initComponents();   
        this.modelo = modelo;
        this.fp = fp;
        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        cambiarTitulo();
    }

    public static void cambiarTitulo(){
        try{
            BufferedReader br = new BufferedReader(new FileReader("./config/empresa"));
            String titulo = "";
            jlTitulo.setText(br.readLine());
        }catch(IOException ex){
            ex.printStackTrace();
        }
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpTitulo = new javax.swing.JPanel();
        jlTitulo = new javax.swing.JLabel();
        jpAltaClientes = new javax.swing.JPanel();
        jlAliasClienteNew = new javax.swing.JLabel();
        tfAliasClienteNew = new javax.swing.JTextField();
        jlCIFNew = new javax.swing.JLabel();
        tfCIFNew = new javax.swing.JTextField();
        jlZonaNew = new javax.swing.JLabel();
        tfZonaNew = new javax.swing.JTextField();
        jlTelefono1New = new javax.swing.JLabel();
        tfTelefono1New = new javax.swing.JTextField();
        jlTelefono2New = new javax.swing.JLabel();
        tfTelefono2New = new javax.swing.JTextField();
        jbNuevoCliente = new javax.swing.JButton();
        jbCerrar = new javax.swing.JButton();
        jlContactoNew = new javax.swing.JLabel();
        tfContactoNew = new javax.swing.JTextField();
        jlDireccionNew = new javax.swing.JLabel();
        tfDireccionNew = new javax.swing.JTextField();
        jlDireccion2New = new javax.swing.JLabel();
        tfDireccion2New = new javax.swing.JTextField();
        tfPaisNew = new javax.swing.JTextField();
        jlPaisNew = new javax.swing.JLabel();

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

        jpAltaClientes.setBackground(new java.awt.Color(37, 134, 169));

        jlAliasClienteNew.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlAliasClienteNew.setText("Cliente:");

        jlCIFNew.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlCIFNew.setText("CIF:");

        jlZonaNew.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlZonaNew.setText("Zona:");

        jlTelefono1New.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlTelefono1New.setText("Telefono1:");

        jlTelefono2New.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlTelefono2New.setText("Telefono2:");

        jbNuevoCliente.setBackground(new java.awt.Color(226, 179, 44));
        jbNuevoCliente.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jbNuevoCliente.setText("Alta");
        jbNuevoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoClienteActionPerformed(evt);
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

        jlContactoNew.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlContactoNew.setText("Contacto:");

        tfContactoNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfContactoNewActionPerformed(evt);
            }
        });

        jlDireccionNew.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlDireccionNew.setText("Direccion1:");

        jlDireccion2New.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlDireccion2New.setText("Direccion2:");

        jlPaisNew.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlPaisNew.setText("Pais:");

        javax.swing.GroupLayout jpAltaClientesLayout = new javax.swing.GroupLayout(jpAltaClientes);
        jpAltaClientes.setLayout(jpAltaClientesLayout);
        jpAltaClientesLayout.setHorizontalGroup(
            jpAltaClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpAltaClientesLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jpAltaClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpAltaClientesLayout.createSequentialGroup()
                        .addComponent(jlAliasClienteNew)
                        .addGap(4, 4, 4)
                        .addComponent(tfAliasClienteNew, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jlCIFNew)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfCIFNew, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jlZonaNew)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfZonaNew, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jlDireccionNew))
                    .addGroup(jpAltaClientesLayout.createSequentialGroup()
                        .addGroup(jpAltaClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlTelefono1New)
                            .addComponent(jlTelefono2New))
                        .addGap(4, 4, 4)
                        .addGroup(jpAltaClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfTelefono1New)
                            .addComponent(tfTelefono2New))
                        .addGroup(jpAltaClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpAltaClientesLayout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addComponent(jlContactoNew))
                            .addGroup(jpAltaClientesLayout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(jlDireccion2New)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpAltaClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpAltaClientesLayout.createSequentialGroup()
                        .addGroup(jpAltaClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(tfDireccionNew, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                            .addComponent(tfContactoNew, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfDireccion2New, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jlPaisNew)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfPaisNew, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpAltaClientesLayout.createSequentialGroup()
                        .addComponent(jbNuevoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jbCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 152, Short.MAX_VALUE))
        );
        jpAltaClientesLayout.setVerticalGroup(
            jpAltaClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpAltaClientesLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jpAltaClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpAltaClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jlDireccionNew)
                        .addComponent(tfDireccionNew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jpAltaClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlPaisNew)
                            .addComponent(tfPaisNew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jpAltaClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jlAliasClienteNew)
                        .addComponent(tfAliasClienteNew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlCIFNew)
                        .addComponent(tfCIFNew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlZonaNew)
                        .addComponent(tfZonaNew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jpAltaClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpAltaClientesLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jpAltaClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlTelefono1New)
                            .addComponent(tfTelefono1New, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jpAltaClientesLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jpAltaClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfDireccion2New, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlDireccion2New))))
                .addGap(23, 23, 23)
                .addGroup(jpAltaClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlTelefono2New)
                    .addComponent(tfTelefono2New, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlContactoNew)
                    .addComponent(tfContactoNew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jpAltaClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbNuevoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(66, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpAltaClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jpAltaClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

 

    private void jbCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCerrarActionPerformed
        this.setVisible(false);
        //new FramePrincipal().setVisible(true);    
    }//GEN-LAST:event_jbCerrarActionPerformed

    private void jbNuevoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoClienteActionPerformed
        String alias = tfAliasClienteNew.getText();
        String cif = tfCIFNew.getText();
        String direccion = tfDireccionNew.getText();
        String direccion2 = tfDireccion2New.getText();
        String zona= tfZonaNew.getText();
        String pais=tfPaisNew.getText();
        String telefono1 = tfTelefono1New.getText();
        String telefono2=tfTelefono2New.getText();
        String contacto = tfContactoNew.getText();
        modelo.altaCliente(new Cliente(alias, cif, direccion,direccion2, zona, pais, telefono1, telefono2, contacto));
        tfAliasClienteNew.setText("");
        tfCIFNew.setText("");
        tfDireccionNew.setText("");
        tfDireccion2New.setText("");
        tfZonaNew.setText("");
        tfPaisNew.setText("");
        tfTelefono1New.setText("");
        tfTelefono2New.setText("");
        tfContactoNew.setText("");
        fp.llenarTablaClientes();
        fp.getComboClientesFactura().addItem(alias);
        this.hide();
        
    }//GEN-LAST:event_jbNuevoClienteActionPerformed

    private void tfContactoNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfContactoNewActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfContactoNewActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbCerrar;
    private javax.swing.JButton jbNuevoCliente;
    private javax.swing.JLabel jlAliasClienteNew;
    private javax.swing.JLabel jlCIFNew;
    private javax.swing.JLabel jlContactoNew;
    private javax.swing.JLabel jlDireccion2New;
    private javax.swing.JLabel jlDireccionNew;
    private javax.swing.JLabel jlPaisNew;
    private javax.swing.JLabel jlTelefono1New;
    private javax.swing.JLabel jlTelefono2New;
    private static javax.swing.JLabel jlTitulo;
    private javax.swing.JLabel jlZonaNew;
    private javax.swing.JPanel jpAltaClientes;
    private javax.swing.JPanel jpTitulo;
    private javax.swing.JTextField tfAliasClienteNew;
    private javax.swing.JTextField tfCIFNew;
    private javax.swing.JTextField tfContactoNew;
    private javax.swing.JTextField tfDireccion2New;
    private javax.swing.JTextField tfDireccionNew;
    private javax.swing.JTextField tfPaisNew;
    private javax.swing.JTextField tfTelefono1New;
    private javax.swing.JTextField tfTelefono2New;
    private javax.swing.JTextField tfZonaNew;
    // End of variables declaration//GEN-END:variables

}
