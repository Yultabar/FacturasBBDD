package Vista;

import dao.Modelo;
import dominio.Cliente;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JFrame;



public class FrameModificacionClientes extends javax.swing.JFrame {
    


    private FramePrincipal fp;
    private Modelo m;
    
    private ArrayList<Cliente> listaClientesModificar;
    public FrameModificacionClientes(Modelo m, FramePrincipal fp) {
        initComponents(); 
        this.m = m;
        this.fp = fp;
        //pasarle por el constructor toda la info del cliente y 
        //colocarlo como default en sus textfield
        cambiarTitulo();
        llenarComboClientesModificar();
        
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        
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
        jpModificacionClientes = new javax.swing.JPanel();
        jlAliasClienteNew = new javax.swing.JLabel();
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
        comboClientesModificados = new javax.swing.JComboBox<>();
        jlDireccion2New = new javax.swing.JLabel();
        tfDireccion2New = new javax.swing.JTextField();
        jlPaisNew = new javax.swing.JLabel();
        tfPaisNew = new javax.swing.JTextField();

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
                .addContainerGap(480, Short.MAX_VALUE))
        );
        jpTituloLayout.setVerticalGroup(
            jpTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTituloLayout.createSequentialGroup()
                .addComponent(jlTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jpModificacionClientes.setBackground(new java.awt.Color(37, 134, 169));

        jlAliasClienteNew.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlAliasClienteNew.setText("Cliente:");

        jlCIFNew.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlCIFNew.setText("CIF:");

        tfCIFNew.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfCIFNewKeyReleased(evt);
            }
        });

        jlZonaNew.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlZonaNew.setText("Zona:");

        jlTelefono1New.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlTelefono1New.setText("Telefono1:");

        jlTelefono2New.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlTelefono2New.setText("Telefono2:");

        jbNuevoCliente.setBackground(new java.awt.Color(226, 179, 44));
        jbNuevoCliente.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jbNuevoCliente.setText("Modificar");
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

        tfContactoNew.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfContactoNewKeyReleased(evt);
            }
        });

        jlDireccionNew.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlDireccionNew.setText("Direccion1:");

        tfDireccionNew.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfDireccionNewKeyReleased(evt);
            }
        });

        comboClientesModificados.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboClientesModificadosItemStateChanged(evt);
            }
        });

        jlDireccion2New.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlDireccion2New.setText("Direccion2:");

        tfDireccion2New.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfDireccion2NewKeyReleased(evt);
            }
        });

        jlPaisNew.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlPaisNew.setText("Pais:");

        tfPaisNew.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfPaisNewKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jpModificacionClientesLayout = new javax.swing.GroupLayout(jpModificacionClientes);
        jpModificacionClientes.setLayout(jpModificacionClientesLayout);
        jpModificacionClientesLayout.setHorizontalGroup(
            jpModificacionClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpModificacionClientesLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jpModificacionClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jpModificacionClientesLayout.createSequentialGroup()
                        .addComponent(jlTelefono1New)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfTelefono1New))
                    .addGroup(jpModificacionClientesLayout.createSequentialGroup()
                        .addComponent(jlAliasClienteNew)
                        .addGap(1, 1, 1)
                        .addComponent(comboClientesModificados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jlCIFNew)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpModificacionClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpModificacionClientesLayout.createSequentialGroup()
                        .addComponent(tfCIFNew, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jlZonaNew)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfZonaNew, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(jlDireccionNew)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfDireccionNew, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jlDireccion2New)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfDireccion2New, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpModificacionClientesLayout.createSequentialGroup()
                        .addComponent(jlTelefono2New)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfTelefono2New, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jlContactoNew)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfContactoNew, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jlPaisNew)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfPaisNew, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpModificacionClientesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbNuevoCliente)
                .addGap(29, 29, 29)
                .addComponent(jbCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96))
        );
        jpModificacionClientesLayout.setVerticalGroup(
            jpModificacionClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpModificacionClientesLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jpModificacionClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpModificacionClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jlDireccion2New)
                        .addComponent(tfDireccion2New, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpModificacionClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jlDireccionNew)
                        .addComponent(tfDireccionNew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpModificacionClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jlAliasClienteNew)
                        .addComponent(jlCIFNew)
                        .addComponent(tfCIFNew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlZonaNew)
                        .addComponent(tfZonaNew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(comboClientesModificados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jpModificacionClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlTelefono2New)
                    .addComponent(tfTelefono2New, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlContactoNew)
                    .addComponent(tfContactoNew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlTelefono1New)
                    .addComponent(tfTelefono1New, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlPaisNew)
                    .addComponent(tfPaisNew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(jpModificacionClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbCerrar)
                    .addComponent(jbNuevoCliente))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpModificacionClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jpModificacionClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

 
    public void llenarComboClientesModificar(){
        listaClientesModificar = m.consultaTodosClientes();
        for(Cliente c:listaClientesModificar){
            comboClientesModificados.addItem(c.getAlias());
        }
    }

    private void jbCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCerrarActionPerformed
        this.setVisible(false);
        //new FramePrincipal().setVisible(true);    
    }//GEN-LAST:event_jbCerrarActionPerformed

    private void jbNuevoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoClienteActionPerformed
        int indiceClienteModificar=comboClientesModificados.getSelectedIndex();
        String clienteModificarString=comboClientesModificados.getItemAt(indiceClienteModificar);
        //Id del cliente que vamos a modificar
        int nuevoCliente = m.consultaIdClientePorAlias(clienteModificarString);
        Cliente nuevo= new Cliente(clienteModificarString,tfCIFNew.getText(),tfDireccionNew.getText(),tfDireccion2New.getText(),tfZonaNew.getText(),tfPaisNew.getText(),tfTelefono1New.getText(),tfTelefono2New.getText(),tfContactoNew.getText());
        nuevo.setId(nuevoCliente);
        m.modificarCliente(nuevo);
        fp.llenarTablaClientes();

    }//GEN-LAST:event_jbNuevoClienteActionPerformed

    private void comboClientesModificadosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboClientesModificadosItemStateChanged
        int indiceClienteModificar=comboClientesModificados.getSelectedIndex();
        String clienteModificarString=comboClientesModificados.getItemAt(indiceClienteModificar);
        //Id del cliente que vamos a modificar
        int nuevoCliente = m.consultaIdClientePorAlias(clienteModificarString);
        Cliente cRellenar =m.consultaClienteId(nuevoCliente);
        tfCIFNew.setText(cRellenar.getCif());
        tfContactoNew.setText(cRellenar.getContacto());
        tfDireccionNew.setText(cRellenar.getDireccion());
        tfDireccion2New.setText(cRellenar.getDireccion2());
        tfTelefono1New.setText(cRellenar.getTelefono1());
        tfTelefono2New.setText(cRellenar.getTelefono2());
        tfZonaNew.setText(cRellenar.getZona());
        tfPaisNew.setText(cRellenar.getPais());
    }//GEN-LAST:event_comboClientesModificadosItemStateChanged

    /*
    PARA CONVERTIR A MAYUSCULAS
    */
    private void tfCIFNewKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfCIFNewKeyReleased
        /*tfCIFNew.setText(tfCIFNew.getText().toUpperCase());*/
    }//GEN-LAST:event_tfCIFNewKeyReleased

    private void tfDireccionNewKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfDireccionNewKeyReleased
       /* tfDireccionNew.setText(tfDireccionNew.getText().toUpperCase());*/
    }//GEN-LAST:event_tfDireccionNewKeyReleased

    private void tfDireccion2NewKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfDireccion2NewKeyReleased
       /* tfDireccion2New.setText(tfDireccion2New.getText().toUpperCase());*/
    }//GEN-LAST:event_tfDireccion2NewKeyReleased

    private void tfContactoNewKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfContactoNewKeyReleased
       /* tfContactoNew.setText(tfContactoNew.getText().toUpperCase());*/
    }//GEN-LAST:event_tfContactoNewKeyReleased

    private void tfPaisNewKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfPaisNewKeyReleased
        /* tfPaisNew.setText(tfPaisNew.getText().toUpperCase());*/
    }//GEN-LAST:event_tfPaisNewKeyReleased



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comboClientesModificados;
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
    private javax.swing.JPanel jpModificacionClientes;
    private javax.swing.JPanel jpTitulo;
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
