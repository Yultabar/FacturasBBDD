package Vista;

import dao.Modelo;
import dominio.Cliente;
import dominio.Factura;
import dominio.Porte;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.SwingUtilities;

public class FrameAltaFacturas extends javax.swing.JFrame {

    private Modelo modelo;
    private FramePrincipal fp;
    
    public FrameAltaFacturas(Modelo m,FramePrincipal fp) {
        initComponents();

        
        FrameConfiguracion frame = new FrameConfiguracion();
        //tfIVANew.setText(FrameConfiguracion.tfIVANew.getText());
        this.modelo = m;
        this.fp = fp;
        llenarMatriculas();
        llenarComboClientes();
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
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

        jpmMatriculas = new javax.swing.JPopupMenu();
        jmiAltaMatricula = new javax.swing.JMenuItem();
        jmiBajaMatricula = new javax.swing.JMenuItem();
        jpTitulo = new javax.swing.JPanel();
        jlTitulo = new javax.swing.JLabel();
        jpAltaFacturas = new javax.swing.JPanel();
        jbNuevaFactura = new javax.swing.JButton();
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
        jlClienteNew = new javax.swing.JLabel();
        jcbClienteNew = new javax.swing.JComboBox<>();
        jlInfoMatricula = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jmiAltaMatricula.setText("Nueva Matricula");
        jmiAltaMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiAltaMatriculaActionPerformed(evt);
            }
        });
        jpmMatriculas.add(jmiAltaMatricula);

        jmiBajaMatricula.setText("Borrar matricula seleccionada");
        jmiBajaMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiBajaMatriculaActionPerformed(evt);
            }
        });
        jpmMatriculas.add(jmiBajaMatricula);

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
                .addContainerGap(214, Short.MAX_VALUE))
        );
        jpTituloLayout.setVerticalGroup(
            jpTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTituloLayout.createSequentialGroup()
                .addComponent(jlTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jpAltaFacturas.setBackground(new java.awt.Color(37, 134, 169));

        jbNuevaFactura.setBackground(new java.awt.Color(226, 179, 44));
        jbNuevaFactura.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jbNuevaFactura.setText("Alta");
        jbNuevaFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevaFacturaActionPerformed(evt);
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

        jcbMatriculaNew.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jcbMatriculaNewMouseReleased(evt);
            }
        });

        jlPrecioNew.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlPrecioNew.setText("Importe:");

        tfPrecioNew.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfPrecioNewKeyTyped(evt);
            }
        });

        jlClienteNew.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlClienteNew.setText("Cliente:");

        jlInfoMatricula.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        jlInfoMatricula.setText("Clic derecho sobre la lista de \"Matricula\" para crear nuevas o borrar las actuales");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("€");

        javax.swing.GroupLayout jpAltaFacturasLayout = new javax.swing.GroupLayout(jpAltaFacturas);
        jpAltaFacturas.setLayout(jpAltaFacturasLayout);
        jpAltaFacturasLayout.setHorizontalGroup(
            jpAltaFacturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpAltaFacturasLayout.createSequentialGroup()
                .addGroup(jpAltaFacturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpAltaFacturasLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jlMatriculaNew)
                        .addGap(18, 18, 18)
                        .addComponent(jcbMatriculaNew, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jlInfoMatricula))
                    .addGroup(jpAltaFacturasLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jlOrigenNew)
                        .addGap(10, 10, 10)
                        .addComponent(tfOrigenNew, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpAltaFacturasLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jlDestinoNew)
                        .addGap(4, 4, 4)
                        .addComponent(tfDestinoNew, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpAltaFacturasLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jlPrecioNew)
                        .addGap(4, 4, 4)
                        .addComponent(tfPrecioNew, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jlClienteNew)
                        .addGap(10, 10, 10)
                        .addComponent(jcbClienteNew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(jlFechaPorteNew)
                        .addGap(18, 18, 18)
                        .addComponent(jdcFechaPorteNew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpAltaFacturasLayout.createSequentialGroup()
                        .addGap(307, 307, 307)
                        .addComponent(jbNuevaFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jbCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jpAltaFacturasLayout.setVerticalGroup(
            jpAltaFacturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpAltaFacturasLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jpAltaFacturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlMatriculaNew)
                    .addComponent(jcbMatriculaNew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpAltaFacturasLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jlInfoMatricula)))
                .addGap(17, 17, 17)
                .addGroup(jpAltaFacturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlOrigenNew)
                    .addComponent(tfOrigenNew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpAltaFacturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlDestinoNew)
                    .addComponent(tfDestinoNew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpAltaFacturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpAltaFacturasLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jlPrecioNew))
                    .addGroup(jpAltaFacturasLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(tfPrecioNew, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpAltaFacturasLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel1))
                    .addGroup(jpAltaFacturasLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jlClienteNew))
                    .addGroup(jpAltaFacturasLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jcbClienteNew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpAltaFacturasLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jlFechaPorteNew))
                    .addComponent(jdcFechaPorteNew, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(76, 76, 76)
                .addGroup(jpAltaFacturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbNuevaFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpAltaFacturas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jpAltaFacturas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void llenarMatriculas(){
        ArrayList<String> matriculas = modelo.consultaMatriculas();
        for(String m:matriculas){
            jcbMatriculaNew.addItem(m);
        }
    }
    
    public void llenarComboClientes(){
        ArrayList<Cliente> clientes = modelo.consultaTodosClientes();
        for(Cliente c:clientes){
            if(!c.isInhabilitado()){
                jcbClienteNew.addItem(c.getAlias());
            }
        }
        
    }

    public FramePrincipal getFp() {
        return fp;
    }
    
    

    private void jbCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCerrarActionPerformed
        this.setVisible(false);
        //new FramePrincipal().setVisible(true);

    }//GEN-LAST:event_jbCerrarActionPerformed

    private void jcbMatriculaNewMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jcbMatriculaNewMouseReleased

        if (SwingUtilities.isRightMouseButton(evt)) {
            jpmMatriculas.show(this, evt.getX(), evt.getY()+20);

        }
    }//GEN-LAST:event_jcbMatriculaNewMouseReleased

    public JComboBox<String> getJcbMatriculaNew() {
        return jcbMatriculaNew;
    }

    
    private void jmiAltaMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiAltaMatriculaActionPerformed
        //lanzar jframe que permita dar altas de matriculas
        new FrameAltaMatricula(modelo,this).setVisible(true);
        
    }//GEN-LAST:event_jmiAltaMatriculaActionPerformed

    private void jmiBajaMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiBajaMatriculaActionPerformed
        //codigo para dar de baja al instante la matricula que esta
        //seleccionada en el combobox
        modelo.bajaMatricula(jcbMatriculaNew.getItemAt(jcbMatriculaNew.getSelectedIndex()));
        jcbMatriculaNew.removeItemAt(jcbMatriculaNew.getSelectedIndex());
        fp.llenarMatriculas();
    }//GEN-LAST:event_jmiBajaMatriculaActionPerformed

    private void jbNuevaFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevaFacturaActionPerformed
        double tipoIva=0;
        double tipoRetencion=0;
        String linea=null;
        
        int idclienteSeleccionado = jcbClienteNew.getSelectedIndex();
        Cliente cliente =modelo.consultaClienteId(modelo.consultaIdClientePorAlias(jcbClienteNew.getItemAt(idclienteSeleccionado)));
        if(cliente.getPais().equalsIgnoreCase("España")){
            try{
                BufferedReader br = new BufferedReader(new FileReader("./config/ivas"));
                //br.readLine();
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
           
        int indicematriculaSeleccionada=jcbMatriculaNew.getSelectedIndex();
        int indiceclienteseleccionado=jcbClienteNew.getSelectedIndex();
        
        String mat = jcbMatriculaNew.getItemAt(indicematriculaSeleccionada);
        Calendar fecha=Calendar.getInstance();
        
        Calendar fechaPorte = jdcFechaPorteNew.getCalendar();
        String origen = tfOrigenNew.getText();
        String destino = tfDestinoNew.getText();
        float precio = Float.parseFloat(tfPrecioNew.getText());
        System.out.println(precio);
        
        Factura f = new Factura(fecha, tipoIva, tipoRetencion, fechaPorte, origen, destino
                , precio, mat, cliente);
        
        //Factura f = new Factura(jdcFechaFacturaNew.getCalendar(), Double.parseDouble(tfIVANew.getText()), Double.parseDouble(tfRetencionNew.getText()), porte);
        modelo.altaFactura(f);
        fp.actualizarTableFacturas();
    }//GEN-LAST:event_jbNuevaFacturaActionPerformed

    
    /*
    PARA QUE SOLO ADMITA PUNTO O COMA DECIMAL
    */
    private void tfPrecioNewKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfPrecioNewKeyTyped
       
       //Declaramos la variable y le asignamos un evento
        char car = evt.getKeyChar();
        //Condición que nos permite ingresar números con su punto decimal
        if((car<'0' || car>'9') && tfPrecioNew.getText().contains(".") //&& tfPrecioNew.getText().contains(",") 
                && (car!=(char)KeyEvent.VK_BACK_SPACE)){//Esto nos permite ingresar números del 1-9 y también de un punto decimal
            evt.consume();
            JOptionPane.showMessageDialog(null,"Solo se admite números y punto decimal", "Validar números", JOptionPane.INFORMATION_MESSAGE);
        }else if((car<'0' || car>'9') && (car!='.') //&& (car!=',')
                && (car!=(char)KeyEvent.VK_BACK_SPACE)){//Esto nos permite ingresar números del 1-9 y también de un punto o coma decimal
            evt.consume();
            JOptionPane.showMessageDialog(null,"Solo se admite números y punto decimal", "Validar números", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_tfPrecioNewKeyTyped

    
    /*
    PARA QUE CONVIERTA A MAYUSCULAS
    */
    private void tfOrigenNewKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfOrigenNewKeyReleased
         tfOrigenNew.setText(tfOrigenNew.getText().toUpperCase());
    }//GEN-LAST:event_tfOrigenNewKeyReleased

    private void tfDestinoNewKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfDestinoNewKeyReleased
        tfDestinoNew.setText(tfDestinoNew.getText().toUpperCase());
    }//GEN-LAST:event_tfDestinoNewKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jbCerrar;
    private javax.swing.JButton jbNuevaFactura;
    private javax.swing.JComboBox<String> jcbClienteNew;
    private javax.swing.JComboBox<String> jcbMatriculaNew;
    private com.toedter.calendar.JDateChooser jdcFechaPorteNew;
    private javax.swing.JLabel jlClienteNew;
    private javax.swing.JLabel jlDestinoNew;
    private javax.swing.JLabel jlFechaPorteNew;
    private javax.swing.JLabel jlInfoMatricula;
    private javax.swing.JLabel jlMatriculaNew;
    private javax.swing.JLabel jlOrigenNew;
    private javax.swing.JLabel jlPrecioNew;
    private static javax.swing.JLabel jlTitulo;
    private javax.swing.JMenuItem jmiAltaMatricula;
    private javax.swing.JMenuItem jmiBajaMatricula;
    private javax.swing.JPanel jpAltaFacturas;
    private javax.swing.JPanel jpTitulo;
    private javax.swing.JPopupMenu jpmMatriculas;
    private javax.swing.JTextField tfDestinoNew;
    private javax.swing.JTextField tfOrigenNew;
    private javax.swing.JTextField tfPrecioNew;
    // End of variables declaration//GEN-END:variables

}
