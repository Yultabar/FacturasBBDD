package Vista;

import dao.Modelo;
import dominio.Cliente;
import dominio.Factura;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;



public class FrameModificacionFacturas extends javax.swing.JFrame {
    


    private FramePrincipal fp;
    private Modelo m;
    
    public FrameModificacionFacturas(Modelo m,FramePrincipal fp) {
        //pasarle por el constructor toda la info de la factura y 
        //colocarlo como default en sus textfield
        initComponents();   
        this.m = m;
        this.fp = fp;
        
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        llenarComboNFacturas();
        llenarComboClientes();
        llenarComboMatriculas();
        cambiarTitulo();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpTitulo = new javax.swing.JPanel();
        jlTitulo = new javax.swing.JLabel();
        jpModificacionFacturas = new javax.swing.JPanel();
        jbModificacionFactura = new javax.swing.JButton();
        jbCerrar = new javax.swing.JButton();
        jdcFechaPorteNew = new com.toedter.calendar.JDateChooser();
        jlFechaPorteNew = new javax.swing.JLabel();
        jlOrigenNew = new javax.swing.JLabel();
        tfOrigenNew = new javax.swing.JTextField();
        jlDestinoNew = new javax.swing.JLabel();
        tfDestinoNew = new javax.swing.JTextField();
        jlMatriculaNew = new javax.swing.JLabel();
        jcbMatriculaNew = new javax.swing.JComboBox<>();
        jlPrecioNew = new javax.swing.JLabel();
        tfPrecioNew = new javax.swing.JTextField();
        jlFechaFacturaNew = new javax.swing.JLabel();
        jdcFechaFacturaNew = new com.toedter.calendar.JDateChooser();
        jlClienteNew = new javax.swing.JLabel();
        jcbClienteNew = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        comboNFacturas = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();

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
                .addContainerGap(118, Short.MAX_VALUE))
        );
        jpTituloLayout.setVerticalGroup(
            jpTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTituloLayout.createSequentialGroup()
                .addComponent(jlTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jpModificacionFacturas.setBackground(new java.awt.Color(37, 134, 169));

        jbModificacionFactura.setBackground(new java.awt.Color(226, 179, 44));
        jbModificacionFactura.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jbModificacionFactura.setText("Modificar");
        jbModificacionFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificacionFacturaActionPerformed(evt);
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

        jlFechaPorteNew.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlFechaPorteNew.setText("Fecha porte:");

        jlOrigenNew.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlOrigenNew.setText("Origen:");

        tfOrigenNew.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfOrigenNewKeyReleased(evt);
            }
        });

        jlDestinoNew.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlDestinoNew.setText("Destino:");

        tfDestinoNew.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfDestinoNewKeyReleased(evt);
            }
        });

        jlMatriculaNew.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlMatriculaNew.setText("Matricula:");

        jlPrecioNew.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlPrecioNew.setText("Importe:");

        tfPrecioNew.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfPrecioNewKeyTyped(evt);
            }
        });

        jlFechaFacturaNew.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlFechaFacturaNew.setText("Fecha factura:");

        jlClienteNew.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlClienteNew.setText("Cliente:");

        jLabel1.setText("Nº Factura:");

        comboNFacturas.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboNFacturasItemStateChanged(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("€");

        javax.swing.GroupLayout jpModificacionFacturasLayout = new javax.swing.GroupLayout(jpModificacionFacturas);
        jpModificacionFacturas.setLayout(jpModificacionFacturasLayout);
        jpModificacionFacturasLayout.setHorizontalGroup(
            jpModificacionFacturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpModificacionFacturasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpModificacionFacturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpModificacionFacturasLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(comboNFacturas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66)
                        .addComponent(jlFechaPorteNew)
                        .addGap(18, 18, 18)
                        .addComponent(jdcFechaPorteNew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpModificacionFacturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpModificacionFacturasLayout.createSequentialGroup()
                            .addComponent(jlPrecioNew)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfPrecioNew, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(34, 34, 34)
                            .addComponent(jlClienteNew)
                            .addGap(18, 18, 18)
                            .addComponent(jcbClienteNew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                            .addComponent(jlMatriculaNew)
                            .addGap(18, 18, 18)
                            .addComponent(jcbMatriculaNew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpModificacionFacturasLayout.createSequentialGroup()
                            .addGroup(jpModificacionFacturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jlOrigenNew)
                                .addComponent(jlDestinoNew))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jpModificacionFacturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tfOrigenNew, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                                .addComponent(tfDestinoNew))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpModificacionFacturasLayout.createSequentialGroup()
                        .addComponent(jlFechaFacturaNew)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jdcFechaFacturaNew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(264, 264, 264)))
                .addContainerGap(71, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpModificacionFacturasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbModificacionFactura)
                .addGap(18, 18, 18)
                .addComponent(jbCerrar)
                .addGap(52, 52, 52))
        );
        jpModificacionFacturasLayout.setVerticalGroup(
            jpModificacionFacturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpModificacionFacturasLayout.createSequentialGroup()
                .addGroup(jpModificacionFacturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpModificacionFacturasLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jpModificacionFacturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpModificacionFacturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1)
                                .addComponent(comboNFacturas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jlFechaPorteNew))
                            .addGroup(jpModificacionFacturasLayout.createSequentialGroup()
                                .addComponent(jdcFechaPorteNew, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(17, 17, 17)
                                .addGroup(jpModificacionFacturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jlOrigenNew)
                                    .addComponent(tfOrigenNew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addGroup(jpModificacionFacturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlDestinoNew)
                            .addComponent(tfDestinoNew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jpModificacionFacturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpModificacionFacturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jcbMatriculaNew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jlMatriculaNew)
                                .addComponent(jcbClienteNew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jlClienteNew))
                            .addGroup(jpModificacionFacturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jlPrecioNew)
                                .addComponent(tfPrecioNew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(52, 52, 52)
                        .addComponent(jlFechaFacturaNew))
                    .addGroup(jpModificacionFacturasLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jdcFechaFacturaNew, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22)
                .addGroup(jpModificacionFacturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbModificacionFactura)
                    .addComponent(jbCerrar))
                .addGap(54, 54, 54))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpModificacionFacturas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jpModificacionFacturas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void llenarComboNFacturas(){
        for(Factura f:m.consultaTodasFacturas()){
            this.comboNFacturas.addItem(String.valueOf(f.getId()));
        }
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
    
    public void llenarComboClientes(){
        for(Cliente c:m.consultaTodosClientes()){
            this.jcbClienteNew.addItem(String.valueOf(c.getAlias()));
        }
    }
    
    public void llenarComboMatriculas(){
        for(String s:m.getMatriculas().consulta()){
            this.jcbMatriculaNew.addItem(s);
        }
    }


    private void jbCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCerrarActionPerformed
        this.setVisible(false);
        //new FramePrincipal().setVisible(true);

    }//GEN-LAST:event_jbCerrarActionPerformed

    private void comboNFacturasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboNFacturasItemStateChanged
        int indiceFacturaSeleccionada = comboNFacturas.getSelectedIndex();
        Factura f = m.consultaFacturaPorId(indiceFacturaSeleccionada+1);
        tfOrigenNew.setText(f.getOrigen());
        tfDestinoNew.setText(f.getDestino());
        jdcFechaFacturaNew.setCalendar(f.getFecha());
        jdcFechaPorteNew.setCalendar(f.getFechaPorte());
        tfPrecioNew.setText(String.valueOf(f.getPrecio()));
        
        
    }//GEN-LAST:event_comboNFacturasItemStateChanged

    private void jbModificacionFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificacionFacturaActionPerformed
        double tipoIva=0;
        double tipoRetencion=0;
        String linea=null;
        
        int idclienteSeleccionado = jcbClienteNew.getSelectedIndex();
        Cliente cliente =m.consultaClienteId(m.consultaIdClientePorAlias(jcbClienteNew.getItemAt(idclienteSeleccionado)));
        if(cliente.getPais().equalsIgnoreCase("España")){
            try{
                BufferedReader br = new BufferedReader(new FileReader("./config/ivas"));
                tipoIva=Double.parseDouble(linea=br.readLine());
                br.close();
            }catch(IOException ex){
                ex.printStackTrace();
            }
            try{
                BufferedReader br = new BufferedReader(new FileReader("./config/retencion"));
                tipoRetencion=Double.parseDouble(linea=br.readLine());
                br.close();
            }catch(IOException ex){
                ex.printStackTrace();
            }  
        }
      
        Factura f = new Factura();
        
        f.setTipoIva(tipoIva);
        f.setTipoRetencion(tipoRetencion);
        f.setOrigen(tfOrigenNew.getText());
        f.setDestino(tfDestinoNew.getText());
        f.setPrecio(Float.parseFloat(tfPrecioNew.getText()));
        f.setFecha(jdcFechaFacturaNew.getCalendar());
        f.setFechaPorte(jdcFechaPorteNew.getCalendar());
        
        int idmatriculaSeleccionada = jcbMatriculaNew.getSelectedIndex();
        
        f.setMatricula(jcbMatriculaNew.getItemAt(idmatriculaSeleccionada));
        f.setCliente(cliente);
        int idfacturaseleccionada = comboNFacturas.getSelectedIndex()+1;
        f.setId(idfacturaseleccionada);
        m.modificacionFactura(f);
        this.fp.actualizarTableFacturas();
        
    }//GEN-LAST:event_jbModificacionFacturaActionPerformed

    private void tfPrecioNewKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfPrecioNewKeyTyped
        //Esto es para que admita punto decimal
        //Declaramos la variable y le asignamos un evento
        char car = evt.getKeyChar();
        //Condición que nos permite ingresar números con su punto decimal
        if((car<'0' || car>'9') && tfPrecioNew.getText().contains(".") //&& tfPrecioNew.getText().contains(",") 
                && (car!=(char)KeyEvent.VK_BACK_SPACE)){//Esto nos permite ingresar números del 1-9 y también de un punto decimal
            evt.consume();
            JOptionPane.showMessageDialog(null,"Solo se admite números y punto decimal", "Validar números", JOptionPane.INFORMATION_MESSAGE);
        }else if((car<'0' || car>'9') && (car!='.')// && (car!=',')
                && (car!=(char)KeyEvent.VK_BACK_SPACE)){//Esto nos permite ingresar números del 1-9 y también de un punto decimal
            evt.consume();
            JOptionPane.showMessageDialog(null,"Solo se admite números y punto decimal", "Validar números", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_tfPrecioNewKeyTyped

    /*
    PARA CONVERTIR A MAYUSCULAS
    */
    private void tfOrigenNewKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfOrigenNewKeyReleased
        tfOrigenNew.setText(tfOrigenNew.getText().toUpperCase());
    }//GEN-LAST:event_tfOrigenNewKeyReleased

    private void tfDestinoNewKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfDestinoNewKeyReleased
        tfDestinoNew.setText(tfDestinoNew.getText().toUpperCase());
    }//GEN-LAST:event_tfDestinoNewKeyReleased



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comboNFacturas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton jbCerrar;
    private javax.swing.JButton jbModificacionFactura;
    private javax.swing.JComboBox<String> jcbClienteNew;
    private javax.swing.JComboBox<String> jcbMatriculaNew;
    private com.toedter.calendar.JDateChooser jdcFechaFacturaNew;
    private com.toedter.calendar.JDateChooser jdcFechaPorteNew;
    private javax.swing.JLabel jlClienteNew;
    private javax.swing.JLabel jlDestinoNew;
    private javax.swing.JLabel jlFechaFacturaNew;
    private javax.swing.JLabel jlFechaPorteNew;
    private javax.swing.JLabel jlMatriculaNew;
    private javax.swing.JLabel jlOrigenNew;
    private javax.swing.JLabel jlPrecioNew;
    private static javax.swing.JLabel jlTitulo;
    private javax.swing.JPanel jpModificacionFacturas;
    private javax.swing.JPanel jpTitulo;
    private javax.swing.JTextField tfDestinoNew;
    private javax.swing.JTextField tfOrigenNew;
    private javax.swing.JTextField tfPrecioNew;
    // End of variables declaration//GEN-END:variables


}
