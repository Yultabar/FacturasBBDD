package Vista;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.draw.DottedLineSeparator;
import com.itextpdf.text.pdf.draw.LineSeparator;
import com.itextpdf.text.pdf.draw.VerticalPositionMark;
import dao.Modelo;
import dominio.Cliente;
import dominio.Factura;
import dominio.Porte;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;





public class FramePrincipal extends javax.swing.JFrame {
    

    private Modelo modelo;
    private DefaultTableModel modeloTablaClientes;
    private DefaultTableModel modeloTablaPortes;
    private DefaultTableModel modeloTablaFacturas;
    private ArrayList<Cliente> clientesHabilitados;
    
    public FramePrincipal(Modelo modelo) {
        this.modelo = modelo;
        initComponents();   
        modeloTablaClientes = (DefaultTableModel)jtClientes.getModel();
        modeloTablaFacturas = (DefaultTableModel)jtFacturas.getModel();
        clientesHabilitados=new ArrayList<Cliente>();
        jrbHabilitados.setSelected(true);
        bgTipoCliente.add(jrbTodos);
        bgTipoCliente.add(jrbHabilitados);
        llenarTablaClientes();
        actualizarTablePortes();
        //llenarTablaFacturas();
        llenarMatriculas();
        llenarClientes();
        trimestral();
        cambiarTitulo();
        //no se pueda redimensionar
        this.setResizable(false);
        setVisible(true);
            
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgTipoCliente = new javax.swing.ButtonGroup();
        jpTitulo = new javax.swing.JPanel();
        jlTitulo = new javax.swing.JLabel();
        jbConfiguracion = new javax.swing.JButton();
        jtpMenuPrincipal = new javax.swing.JTabbedPane();
        jpConsultasBajas = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtClientes = new javax.swing.JTable();
        jbBorrarCliente = new javax.swing.JButton();
        jlAliasCliente = new javax.swing.JLabel();
        tfAliasCliente = new javax.swing.JTextField();
        jbNuevoCliente = new javax.swing.JButton();
        jbModificarCliente = new javax.swing.JButton();
        tfZona = new javax.swing.JTextField();
        jlZona = new javax.swing.JLabel();
        jbConsultarClientes = new javax.swing.JButton();
        jrbTodos = new javax.swing.JRadioButton();
        jrbHabilitados = new javax.swing.JRadioButton();
        jlTipoCliente = new javax.swing.JLabel();
        jbHabilitarCliente = new javax.swing.JButton();
        jpPortes = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtPortes = new javax.swing.JTable();
        jlFacturaPorte = new javax.swing.JLabel();
        jlOrigenPorte = new javax.swing.JLabel();
        tfOrigenPorte = new javax.swing.JTextField();
        jlDestinoPorte = new javax.swing.JLabel();
        tfDestinoPorte = new javax.swing.JTextField();
        jbConsultarTodoPorte = new javax.swing.JButton();
        cbMatriculaPorte = new javax.swing.JComboBox<>();
        jpFacturas = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtFacturas = new javax.swing.JTable();
        jbNuevaFactura = new javax.swing.JButton();
        jbModificarFactura = new javax.swing.JButton();
        jbImprimirFactura = new javax.swing.JButton();
        jlClienteFactura = new javax.swing.JLabel();
        jbConsultarTodoFactura = new javax.swing.JButton();
        jlFechaFacturaD = new javax.swing.JLabel();
        jlFechaFacturaH = new javax.swing.JLabel();
        jdcFechaFacturaD = new com.toedter.calendar.JDateChooser();
        jdcFechaFacturaH = new com.toedter.calendar.JDateChooser();
        jlFactura = new javax.swing.JLabel();
        cbMatricula = new javax.swing.JComboBox<>();
        jlOrigen = new javax.swing.JLabel();
        tfOrigen = new javax.swing.JTextField();
        jlDestino = new javax.swing.JLabel();
        tfDestino = new javax.swing.JTextField();
        comboClientesFactura = new javax.swing.JComboBox<>();
        jcbTrimestral = new javax.swing.JComboBox();

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

        jbConfiguracion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/documentacion/gear.png"))); // NOI18N
        jbConfiguracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbConfiguracionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpTituloLayout = new javax.swing.GroupLayout(jpTitulo);
        jpTitulo.setLayout(jpTituloLayout);
        jpTituloLayout.setHorizontalGroup(
            jpTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTituloLayout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(jlTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbConfiguracion, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jpTituloLayout.setVerticalGroup(
            jpTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTituloLayout.createSequentialGroup()
                .addGroup(jpTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbConfiguracion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jtpMenuPrincipal.setBackground(new java.awt.Color(37, 134, 169));
        jtpMenuPrincipal.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N

        jpConsultasBajas.setBackground(new java.awt.Color(37, 134, 169));

        jtClientes.setFont(new java.awt.Font("Arial", 2, 15)); // NOI18N
        jtClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cliente", "Zona", "Telefono 1", "Telefono 2", "Persona contacto", "Inhabilitado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtClientes);

        jbBorrarCliente.setBackground(new java.awt.Color(226, 179, 44));
        jbBorrarCliente.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jbBorrarCliente.setText("Inhabilitar Cliente");
        jbBorrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBorrarClienteActionPerformed(evt);
            }
        });

        jlAliasCliente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlAliasCliente.setText("Cliente:");

        tfAliasCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfAliasClienteKeyReleased(evt);
            }
        });

        jbNuevoCliente.setBackground(new java.awt.Color(226, 179, 44));
        jbNuevoCliente.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jbNuevoCliente.setText("Nuevo Cliente");
        jbNuevoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoClienteActionPerformed(evt);
            }
        });

        jbModificarCliente.setBackground(new java.awt.Color(226, 179, 44));
        jbModificarCliente.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jbModificarCliente.setText("Modificar Cliente");
        jbModificarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarClienteActionPerformed(evt);
            }
        });

        tfZona.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfZonaKeyReleased(evt);
            }
        });

        jlZona.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlZona.setText("Zona:");

        jbConsultarClientes.setBackground(new java.awt.Color(226, 179, 44));
        jbConsultarClientes.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jbConsultarClientes.setText("Por defecto");
        jbConsultarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbConsultarClientesActionPerformed(evt);
            }
        });

        jrbTodos.setBackground(new java.awt.Color(37, 134, 169));
        jrbTodos.setText("Todos");
        jrbTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbTodosActionPerformed(evt);
            }
        });

        jrbHabilitados.setBackground(new java.awt.Color(37, 134, 169));
        jrbHabilitados.setText("Habilitados");
        jrbHabilitados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbHabilitadosActionPerformed(evt);
            }
        });

        jlTipoCliente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlTipoCliente.setText("Tipo de cliente:");

        jbHabilitarCliente.setBackground(new java.awt.Color(226, 179, 44));
        jbHabilitarCliente.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jbHabilitarCliente.setText("Habilitar Cliente");
        jbHabilitarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbHabilitarClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpConsultasBajasLayout = new javax.swing.GroupLayout(jpConsultasBajas);
        jpConsultasBajas.setLayout(jpConsultasBajasLayout);
        jpConsultasBajasLayout.setHorizontalGroup(
            jpConsultasBajasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpConsultasBajasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpConsultasBajasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpConsultasBajasLayout.createSequentialGroup()
                        .addComponent(jlAliasCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfAliasCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlZona)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfZona, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jlTipoCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jrbTodos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jrbHabilitados)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 353, Short.MAX_VALUE)
                        .addComponent(jbConsultarClientes)
                        .addGap(58, 58, 58))
                    .addGroup(jpConsultasBajasLayout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpConsultasBajasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbNuevoCliente)
                .addGap(18, 18, 18)
                .addComponent(jbModificarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbBorrarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbHabilitarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        jpConsultasBajasLayout.setVerticalGroup(
            jpConsultasBajasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpConsultasBajasLayout.createSequentialGroup()
                .addGroup(jpConsultasBajasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpConsultasBajasLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jpConsultasBajasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlAliasCliente)
                            .addComponent(tfAliasCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlZona)
                            .addComponent(tfZona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlTipoCliente)
                            .addComponent(jrbTodos)
                            .addComponent(jrbHabilitados)))
                    .addGroup(jpConsultasBajasLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jbConsultarClientes)))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpConsultasBajasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbBorrarCliente)
                    .addComponent(jbModificarCliente)
                    .addComponent(jbNuevoCliente)
                    .addComponent(jbHabilitarCliente))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jtpMenuPrincipal.addTab("Clientes", jpConsultasBajas);

        jpPortes.setBackground(new java.awt.Color(37, 134, 169));

        jtPortes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Matricula", "Fecha", "Origen", "Destino", "Importe", "Cliente"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jtPortes);

        jlFacturaPorte.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlFacturaPorte.setText("Matricula");

        jlOrigenPorte.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlOrigenPorte.setText("Origen:");

        tfOrigenPorte.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfOrigenPorteKeyReleased(evt);
            }
        });

        jlDestinoPorte.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlDestinoPorte.setText("Destino:");

        tfDestinoPorte.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfDestinoPorteKeyReleased(evt);
            }
        });

        jbConsultarTodoPorte.setBackground(new java.awt.Color(226, 179, 44));
        jbConsultarTodoPorte.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jbConsultarTodoPorte.setText("Por defecto");
        jbConsultarTodoPorte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbConsultarTodoPorteActionPerformed(evt);
            }
        });

        cbMatriculaPorte.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbMatriculaPorteItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jpPortesLayout = new javax.swing.GroupLayout(jpPortes);
        jpPortes.setLayout(jpPortesLayout);
        jpPortesLayout.setHorizontalGroup(
            jpPortesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPortesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpPortesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jpPortesLayout.createSequentialGroup()
                        .addComponent(jlFacturaPorte)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbMatriculaPorte, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jlOrigenPorte)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfOrigenPorte, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jlDestinoPorte)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfDestinoPorte, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 199, Short.MAX_VALUE)
                        .addComponent(jbConsultarTodoPorte)
                        .addGap(17, 17, 17)))
                .addContainerGap())
        );
        jpPortesLayout.setVerticalGroup(
            jpPortesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpPortesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpPortesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlFacturaPorte)
                    .addComponent(jbConsultarTodoPorte)
                    .addComponent(cbMatriculaPorte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlOrigenPorte)
                    .addComponent(tfOrigenPorte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlDestinoPorte)
                    .addComponent(tfDestinoPorte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jtpMenuPrincipal.addTab("Portes", jpPortes);

        jpFacturas.setBackground(new java.awt.Color(37, 134, 169));

        jtFacturas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nº Factura", "Fecha", "Matricula", "Cliente", "Origen", "Destino", "Fecha Porte", "Importe", "IVA", "Retención", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Float.class, java.lang.Double.class, java.lang.Double.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jtFacturas);

        jbNuevaFactura.setBackground(new java.awt.Color(226, 179, 44));
        jbNuevaFactura.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jbNuevaFactura.setText("Nueva Factura");
        jbNuevaFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevaFacturaActionPerformed(evt);
            }
        });

        jbModificarFactura.setBackground(new java.awt.Color(226, 179, 44));
        jbModificarFactura.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jbModificarFactura.setText("Modificar Factura");
        jbModificarFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarFacturaActionPerformed(evt);
            }
        });

        jbImprimirFactura.setBackground(new java.awt.Color(226, 179, 44));
        jbImprimirFactura.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jbImprimirFactura.setText("Imprimir Factura");
        jbImprimirFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbImprimirFacturaActionPerformed(evt);
            }
        });

        jlClienteFactura.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlClienteFactura.setText("Cliente:");

        jbConsultarTodoFactura.setBackground(new java.awt.Color(226, 179, 44));
        jbConsultarTodoFactura.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jbConsultarTodoFactura.setText("Por defecto");
        jbConsultarTodoFactura.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jbConsultarTodoFacturaItemStateChanged(evt);
            }
        });
        jbConsultarTodoFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbConsultarTodoFacturaActionPerformed(evt);
            }
        });

        jlFechaFacturaD.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlFechaFacturaD.setText("Desde:");

        jlFechaFacturaH.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlFechaFacturaH.setText("Hasta:");

        jdcFechaFacturaD.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jdcFechaFacturaDPropertyChange(evt);
            }
        });
        jdcFechaFacturaD.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jdcFechaFacturaDKeyReleased(evt);
            }
        });

        jdcFechaFacturaH.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jdcFechaFacturaHPropertyChange(evt);
            }
        });
        jdcFechaFacturaH.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jdcFechaFacturaHKeyReleased(evt);
            }
        });

        jlFactura.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlFactura.setText("Matricula:");

        cbMatricula.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbMatriculaItemStateChanged(evt);
            }
        });

        jlOrigen.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlOrigen.setText("Origen:");

        tfOrigen.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfOrigenKeyReleased(evt);
            }
        });

        jlDestino.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlDestino.setText("Destino:");

        tfDestino.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfDestinoKeyReleased(evt);
            }
        });

        comboClientesFactura.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboClientesFacturaItemStateChanged(evt);
            }
        });
        comboClientesFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboClientesFacturaActionPerformed(evt);
            }
        });

        jcbTrimestral.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jcbTrimestral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbTrimestralActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpFacturasLayout = new javax.swing.GroupLayout(jpFacturas);
        jpFacturas.setLayout(jpFacturasLayout);
        jpFacturasLayout.setHorizontalGroup(
            jpFacturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpFacturasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbNuevaFactura)
                .addGap(35, 35, 35)
                .addComponent(jbModificarFactura)
                .addGap(27, 27, 27)
                .addComponent(jbImprimirFactura)
                .addGap(40, 40, 40))
            .addGroup(jpFacturasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpFacturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpFacturasLayout.createSequentialGroup()
                        .addComponent(jScrollPane3)
                        .addContainerGap())
                    .addGroup(jpFacturasLayout.createSequentialGroup()
                        .addGroup(jpFacturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpFacturasLayout.createSequentialGroup()
                                .addComponent(jlClienteFactura)
                                .addGap(18, 18, 18)
                                .addComponent(comboClientesFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jpFacturasLayout.createSequentialGroup()
                                .addComponent(jlFactura)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(43, 43, 43)
                        .addGroup(jpFacturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpFacturasLayout.createSequentialGroup()
                                .addComponent(jlFechaFacturaD)
                                .addGap(3, 3, 3)
                                .addComponent(jdcFechaFacturaD, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jpFacturasLayout.createSequentialGroup()
                                .addComponent(jlOrigen)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(61, 61, 61)
                        .addGroup(jpFacturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpFacturasLayout.createSequentialGroup()
                                .addComponent(jlFechaFacturaH)
                                .addGap(4, 4, 4)
                                .addComponent(jdcFechaFacturaH, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 260, Short.MAX_VALUE)
                                .addComponent(jcbTrimestral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jbConsultarTodoFactura)
                                .addGap(24, 24, 24))
                            .addGroup(jpFacturasLayout.createSequentialGroup()
                                .addComponent(jlDestino)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        jpFacturasLayout.setVerticalGroup(
            jpFacturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpFacturasLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jpFacturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jdcFechaFacturaD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpFacturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jlClienteFactura)
                        .addComponent(jlFechaFacturaD)
                        .addComponent(jlFechaFacturaH)
                        .addComponent(comboClientesFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jdcFechaFacturaH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpFacturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbConsultarTodoFactura)
                        .addComponent(jcbTrimestral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jpFacturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlFactura)
                    .addComponent(cbMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlOrigen)
                    .addComponent(tfOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlDestino)
                    .addComponent(tfDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpFacturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbNuevaFactura)
                    .addComponent(jbModificarFactura)
                    .addComponent(jbImprimirFactura))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jtpMenuPrincipal.addTab("Facturas", jpFacturas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jtpMenuPrincipal)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jtpMenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbHabilitarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbHabilitarClienteActionPerformed
       int indiceClienteModificar=jtClientes.getSelectedRow();
        try{
            String alias=jtClientes.getValueAt(indiceClienteModificar, 0)+"";
            int idC = modelo.consultaIdClientePorAlias(alias);
            modelo.habilitarCliente(idC);
            modeloTablaClientes.removeRow(indiceClienteModificar);

            
        }catch(ArrayIndexOutOfBoundsException ex){
            JOptionPane.showMessageDialog(null, "No ha seleccionado ningun cliente");
        }
    }//GEN-LAST:event_jbHabilitarClienteActionPerformed

    private void tfOrigenPorteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfOrigenPorteKeyReleased
        actualizarTablePortes();
    }//GEN-LAST:event_tfOrigenPorteKeyReleased

    private void tfDestinoPorteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfDestinoPorteKeyReleased
        actualizarTablePortes();
    }//GEN-LAST:event_tfDestinoPorteKeyReleased

    private void cbMatriculaPorteItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbMatriculaPorteItemStateChanged
        actualizarTablePortes();
    }//GEN-LAST:event_cbMatriculaPorteItemStateChanged

    private void jbConsultarTodoPorteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbConsultarTodoPorteActionPerformed
        cbMatriculaPorte.setSelectedIndex(0);
        
        tfDestinoPorte.setText("");
        tfOrigenPorte.setText("");
        actualizarTablePortes();        
    }//GEN-LAST:event_jbConsultarTodoPorteActionPerformed

   public void actualizarTablePortes(){
        modeloTablaPortes= (DefaultTableModel)jtPortes.getModel();
       //CAMBIARLO PARA PORTES
        int indiceMat = cbMatriculaPorte.getSelectedIndex();
        String mat;

        if(indiceMat==0){
            mat="";
        }else{
            mat = cbMatriculaPorte.getItemAt(indiceMat);
        }
        
            
        try{
            while(modeloTablaPortes.getRowCount()>0) modeloTablaPortes.removeRow(0);
        
            ArrayList<Factura> listaFacturas = modelo.consultaTodasFacturas();
            ArrayList<Factura> listaFacturasFiltrada = new ArrayList<Factura>();
                        
            
            for(Factura factura: listaFacturas){
                if(mat.equals("")){
                    listaFacturasFiltrada.add(factura);
                }else if(!mat.equals("") && factura.getMatricula().contains(mat)){
                    listaFacturasFiltrada.add(factura);
                }
                
                if(!factura.getOrigen().contains(tfOrigenPorte.getText())){
                    listaFacturasFiltrada.remove(factura);
                }
                if(!factura.getDestino().contains(tfDestinoPorte.getText())){
                    listaFacturasFiltrada.remove(factura);
                }
            }

            for(Factura f : listaFacturasFiltrada){
                Object[] porte = new Object[6];
                porte[0] = f.getMatricula();
                porte[1] = util.MiCalendar.toFecha(f.getFechaPorte());
                porte[2] = f.getOrigen();
                porte[3] = f.getDestino();
                porte[4] = f.getPrecio();
                porte[5] = f.getCliente().getAlias();

                modeloTablaPortes.addRow(porte);
            }
        }catch(NullPointerException ex){
            
        }              
   }
   
   public void llenarTablaClientes(){
        ArrayList<Cliente> listaClientesInicial = modelo.consultaTodosClientes();
        mostrar(listaClientesInicial);
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
    
    //esto sobra, se puede colocar en las propiedades del combobox
    public void trimestral(){
        //Date date = new Date(2016-1900,00,01);
        //Date date2 = new Date(2016-1900,11,31);
        jcbTrimestral.removeAllItems();
        jcbTrimestral.addItem("Seleccione trimestre");
        jcbTrimestral.addItem("Enero-Marzo");
        jcbTrimestral.addItem("Abril-Junio");
        jcbTrimestral.addItem("Julio-Septiembre");
        jcbTrimestral.addItem("Octubre-Diciembre");
        //jdcFechaFacturaD.setDate(date);
        //jdcFechaFacturaH.setDate(date2);
    }
    
    public void operacionTrimestral(){
        try {
            int year = Calendar.getInstance().get(Calendar.YEAR);
            int opcion =  jcbTrimestral.getSelectedIndex();
            switch(opcion){
                case 0:
                    jbConsultarTodoFactura.doClick();
                    break;
                case 1:
                    jdcFechaFacturaD.setDate(new SimpleDateFormat("dd/MM/yyyy").parse("01/00/"+year));
                    jdcFechaFacturaH.setDate(new SimpleDateFormat("dd/MM/yyyy").parse("31/02/"+year));
                    break;
                case 2:
                    jdcFechaFacturaD.setDate(new SimpleDateFormat("dd/MM/yyyy").parse("01/03/"+year));
                    jdcFechaFacturaH.setDate(new SimpleDateFormat("dd/MM/yyyy").parse("31/05/"+year));
                    break;
                case 3:
                    jdcFechaFacturaD.setDate(new SimpleDateFormat("dd/MM/yyyy").parse("01/06/"+year));
                    jdcFechaFacturaH.setDate(new SimpleDateFormat("dd/MM/yyyy").parse("30/08/"+year));
                    break;
                case 4:
                    jdcFechaFacturaD.setDate(new SimpleDateFormat("dd/MM/yyyy").parse("01/09/"+year));
                    jdcFechaFacturaH.setDate(new SimpleDateFormat("dd/MM/yyyy").parse("31/1/"+year));
                    break;
            }
            
        } catch (ParseException ex) {
            Logger.getLogger(FramePrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
 
    }
    
    public void llenarClientes(){
        comboClientesFactura.addItem("Seleccione cliente");
        for(Cliente c:modelo.consultaTodosClientes()){
            comboClientesFactura.addItem(c.getAlias());
        }
    }
        
    public void llenarMatriculas(){
        this.cbMatriculaPorte.removeAllItems();
        this.cbMatricula.removeAllItems();
        this.cbMatriculaPorte.addItem("Seleccione matricula");
        
        this.cbMatricula.addItem("Seleccione matricula");
        for(String s:modelo.consultaMatriculas()){
            this.cbMatricula.addItem(s);
            
            this.cbMatriculaPorte.addItem(s);
        }
    }
    
    private void jbConfiguracionActionPerformed(java.awt.event.ActionEvent evt) {                                                
        new FrameConfiguracion().setVisible(true);
    }                                               

    private void jbModificarFacturaActionPerformed(java.awt.event.ActionEvent evt) {                                                   
        new FrameModificacionFacturas(this.modelo,this).setVisible(true);
    }                                                  

    private void jbNuevaFacturaActionPerformed(java.awt.event.ActionEvent evt) {                                               
        new FrameAltaFacturas(modelo,this).setVisible(true);
    }                                              

    private void jrbHabilitadosActionPerformed(java.awt.event.ActionEvent evt) {                                               
        ArrayList<Cliente> clientes = modelo.consultaTodosClientes();
        this.tfAliasCliente.setText("");
        this.tfZona.setText("");
        mostrar(clientes);
    }                                              

    private void jrbTodosActionPerformed(java.awt.event.ActionEvent evt) {                                         
        ArrayList<Cliente> todos = modelo.consultaTodosClientes();
        tfAliasCliente.setText("");
        tfZona.setText("");
        mostrar(todos);

    }                                        

    private void jbConsultarClientesActionPerformed(java.awt.event.ActionEvent evt) {                                                    
        tfAliasCliente.setText("");
        tfZona.setText("");
        jrbHabilitados.setSelected(true);
        jrbTodos.setSelected(false);
        clientesHabilitados = modelo.consultaTodosClientes();
        mostrar(clientesHabilitados);
    }                                                   

    private void tfZonaKeyReleased(java.awt.event.KeyEvent evt) {                                   
        while(modeloTablaClientes.getRowCount()>0)modeloTablaClientes.removeRow(0);
        this.clientesHabilitados = modelo.consultaClienteNombreZona(tfAliasCliente.getText(),tfZona.getText());
        mostrar(clientesHabilitados);
    }                                  

    private void jbModificarClienteActionPerformed(java.awt.event.ActionEvent evt) {                                                   
        //this.setVisible(false);
        new FrameModificacionClientes(modelo,this).setVisible(true);
    }                                                  

    private void jbNuevoClienteActionPerformed(java.awt.event.ActionEvent evt) {                                               
        //this.setVisible(false);
        new FrameAltaClientes(this.modelo,this).setVisible(true);
    }                                              

    private void jbBorrarClienteActionPerformed(java.awt.event.ActionEvent evt) {                                                
        if(jrbHabilitados.isSelected()){
            int indiceClienteModificar=jtClientes.getSelectedRow();
            try{
                String alias=jtClientes.getValueAt(indiceClienteModificar, 0)+"";
                int idC = modelo.consultaIdClientePorAlias(alias);
                modelo.inhabilitarCliente(idC);
                modeloTablaClientes.removeRow(indiceClienteModificar);
            }catch(ArrayIndexOutOfBoundsException ex){
                JOptionPane.showMessageDialog(null, "No ha seleccionado ningun cliente");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Este cliente ya está deshabilitado");
        }
    }                                               

    private void tfOrigenKeyReleased(java.awt.event.KeyEvent evt) {                                     
        actualizarTableFacturas();
    }                                    

    private void tfDestinoKeyReleased(java.awt.event.KeyEvent evt) {                                      
        actualizarTableFacturas();
    }                                     

    private void cbMatriculaItemStateChanged(java.awt.event.ItemEvent evt) {                                                   
        actualizarTableFacturas();
    }                                            

    private void tfAliasClienteKeyReleased(java.awt.event.KeyEvent evt) {                                           
        while(modeloTablaClientes.getRowCount()>0)modeloTablaClientes.removeRow(0);
        this.clientesHabilitados = modelo.consultaClienteNombreZona(tfAliasCliente.getText(),tfZona.getText());
        mostrar(clientesHabilitados);
    }                                          

    private void comboClientesFacturaItemStateChanged(java.awt.event.ItemEvent evt) {                                                      
        actualizarTableFacturas();
        
    }                                                     

    private void jdcFechaFacturaDKeyReleased(java.awt.event.KeyEvent evt) {                                             
        actualizarTableFacturas();
    }                                            

    private void jdcFechaFacturaHKeyReleased(java.awt.event.KeyEvent evt) {                                             
        actualizarTableFacturas();
        
    }                                            

    private void jbConsultarTodoFacturaItemStateChanged(java.awt.event.ItemEvent evt) {                                                        
            
    }                                                       

    private void jbConsultarTodoFacturaActionPerformed(java.awt.event.ActionEvent evt) {                                                       
        cbMatricula.setSelectedIndex(0);
        comboClientesFactura.setSelectedIndex(0);
        jcbTrimestral.setSelectedIndex(0);
        
        tfDestino.setText("");
        tfOrigen.setText("");
        jdcFechaFacturaD.setDate(null);
        jdcFechaFacturaH.setDate(null);
        actualizarTableFacturas();
    }                                                      

    private void jdcFechaFacturaDPropertyChange(java.beans.PropertyChangeEvent evt) {                                                
       actualizarTableFacturas();
       
    }                                               

    private void jdcFechaFacturaHPropertyChange(java.beans.PropertyChangeEvent evt) {                                                
        actualizarTableFacturas();
        
    }                                               

    private void jbImprimirFacturaActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        // TODO add your handling code here:
        try{
            int row = jtFacturas.getSelectedRow();

            String nroFactura=modeloTablaFacturas.getValueAt(row, 0).toString(); 
            String fecha=modeloTablaFacturas.getValueAt(row, 1).toString();    
            String matricula=modeloTablaFacturas.getValueAt(row, 2).toString();
            String cliente=modeloTablaFacturas.getValueAt(row, 3).toString();
            String origen=modeloTablaFacturas.getValueAt(row, 4).toString();
            String destino=modeloTablaFacturas.getValueAt(row, 5).toString();
            String fechaPorte=modeloTablaFacturas.getValueAt(row, 6).toString();
            Double importe=(Double) modeloTablaFacturas.getValueAt(row, 7);
            Double iva=(Double) modeloTablaFacturas.getValueAt(row, 8);
            Double retencion=(Double) modeloTablaFacturas.getValueAt(row, 9);
            Double total=(Double) modeloTablaFacturas.getValueAt(row, 10);

            JFileChooser file=new JFileChooser();
            file.setSelectedFile(new File(""+Calendar.getInstance().get(Calendar.DAY_OF_MONTH)+"-"+Calendar.getInstance().get(Calendar.MONTH)+"-"+Calendar.getInstance().get(Calendar.YEAR)+"_"+nroFactura));
            file.showSaveDialog(this);        


            Factura cFactura = modelo.consultaFacturaPorId(Integer.parseInt(nroFactura));
            Cliente cCliente = modelo.consultaClienteId(cFactura.getCliente().getId());

            FileOutputStream archivo;

            try{
                archivo = new FileOutputStream(file.getSelectedFile().getAbsoluteFile()+".pdf");
                Document documento = new Document();
                PdfWriter.getInstance(documento, archivo);

                //destruye el documento (al menos en linux, en windows ni idea)
                LineSeparator dottedline = new LineSeparator();
                //dottedline.setOffset(-2);
                //dottedline.setGap(0f);
                ////////////////////////////////////////////////////
                Chunk glue = new Chunk(new VerticalPositionMark()); //permite alinear derecha-izquierda

                documento.open();
                Image foto = Image.getInstance("src/documentacion/transporteApp.png");
                foto.scaleToFit(100, 100);
                foto.setAlignment(Image.LEFT|Image.TEXTWRAP);
                
                BufferedReader br = new BufferedReader(new FileReader("./config/empresa"));
                String empresa=br.readLine();           
                String cifnif=br.readLine();
                String cp=br.readLine();
                String calle=br.readLine();
                String provincia=br.readLine();
                String telefono=br.readLine();
                Paragraph cabecera = new Paragraph(empresa+"\n"+telefono+"\nC.P. "+cp+" "+provincia+"\n"+calle+"\nN.I.F/C.I.F "+cifnif);
                cabecera.setAlignment(Chunk.ALIGN_RIGHT);
                  
                documento.add(foto);
                documento.add(cabecera);

                documento.add(new Paragraph("  "));
                documento.add(new Paragraph("  "));
                
                documento.add(new Paragraph(jlTitulo.getText(),
                                    FontFactory.getFont("Arial",   // fuente
                                    16,                            // tamaño
                                    Font.ITALIC,                   // estilo
                                    BaseColor.RED)));             // color

                documento.add(new Paragraph("  "));
                documento.add(new Paragraph("  "));
                documento.add(dottedline);
                documento.add(new Paragraph("  "));
                documento.add(new Paragraph("CLIENTE ",
                                    FontFactory.getFont("arial",   // fuente
                                    12,                            // tamaño
                                    Font.BOLD,                   // estilo
                                    BaseColor.BLACK)));             // color)););));
                documento.add(new Paragraph("  "));
                documento.add(new Paragraph(""+cCliente.getDireccion()));
                documento.add(new Paragraph(""+cCliente.getDireccion2()));
                documento.add(new Paragraph(""+cCliente.getZona()));
                documento.add(new Paragraph("CIF : "+cCliente.getCif()));
                documento.add(new Paragraph("  "));
                documento.add(new Paragraph("  "));
                documento.add(dottedline);
    //            documento.add(dottedline);
                documento.add(new Paragraph("  "));
                documento.add(new Paragraph("Factura Número        "+nroFactura));
    //            documento.add(dottedline);
                documento.add(new Paragraph("Fecha                        "+fecha));
                documento.add(new Paragraph("  "));
                documento.add(new Paragraph("  "));
                documento.add(new Paragraph("  "));
                documento.add(new Paragraph("Matrícula                   "+matricula));
                documento.add(new Paragraph("Fecha                        "+fechaPorte));
                documento.add(new Paragraph("Origen                       "+origen+"\n"
                                          + "Destino                     "+destino));
                documento.add(new Paragraph("  "));
                documento.add(new Paragraph("  "));
                documento.add(new Paragraph("  "));
                documento.add(new Paragraph("  "));
                documento.add(new Paragraph("  "));
                documento.add(new Paragraph("  "));
                
                Phrase p = new Phrase(""+importe+"€",
                                    FontFactory.getFont("arial",   // fuente
                                    12,                            // tamaño
                                    Font.BOLD,                   // estilo
                                    BaseColor.BLACK));             // color));););
                Paragraph pI = new Paragraph("Importe: ");
                pI.add(new Chunk(glue));
                pI.add(p);
                documento.add(pI);
                
                p = new Phrase("-"+((retencion/100)*importe+"€"),
                                    FontFactory.getFont("arial",   // fuente
                                    12,                            // tamaño
                                    Font.BOLD,                   // estilo
                                    BaseColor.BLACK));             // color));););
                Paragraph pR = new Paragraph("Retencion "+retencion+"%");
                pR.add(new Chunk(glue));
                pR.add(p);
                documento.add(pR);
                
                p = new Phrase(""+((iva/100)*importe+"€"),
                                    FontFactory.getFont("arial",   // fuente
                                    12,                            // tamaño
                                    Font.BOLD,                   // estilo
                                    BaseColor.BLACK));             // color));););
                Paragraph pIv = new Paragraph("IVA "+iva+"%");
                pIv.add(new Chunk(glue));
                pIv.add(p);
                documento.add(pIv);

                Paragraph pT = new Paragraph("Total: ",
                                    FontFactory.getFont("arial",   // fuente
                                    12,                            // tamaño
                                    Font.BOLD,                   // estilo
                                    BaseColor.BLACK));             // color)););
                pT.add(new Chunk(glue));
                pT.add(""+total+"€");
                documento.add(pT);            

                documento.close();
                archivo.close();
            }catch( Exception e){
                e.printStackTrace();
            }
            
        }catch(ArrayIndexOutOfBoundsException ex){
            JOptionPane.showMessageDialog(null, "No ha seleccionado ningun cliente");
        }
        
    } 
    
    private void comboClientesFacturaActionPerformed(java.awt.event.ActionEvent evt) {                                                     
        // TODO add your handling code here:
    }                                                    

    private void jcbTrimestralActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
        operacionTrimestral();
    }                                             

    private void mostrar(ArrayList<Cliente> lista){
        //lista=modelo.consultaTodosClientes();
        this.clientesHabilitados = lista;
        while(modeloTablaClientes.getRowCount()>0) modeloTablaClientes.removeRow(0);
        for(Cliente c:clientesHabilitados){
            if(jrbHabilitados.isSelected()){
                if(!c.isInhabilitado()){
                    Object[] cliente= new Object[6];
                    cliente[0] = c.getAlias();
                    cliente[1] = c.getZona();
                    cliente[2] = c.getTelefono1();
                    cliente[3] = c.getTelefono2();
                    cliente[4] = c.getContacto();
                    cliente[5] = c.isInhabilitado();
                    modeloTablaClientes.addRow(cliente);
                }
            }
            else{
                Object[] cliente= new Object[6];
                cliente[0] = c.getAlias();
                cliente[1] = c.getZona();
                cliente[2] = c.getTelefono1();
                cliente[3] = c.getTelefono2();
                cliente[4] = c.getContacto();
                cliente[5] = c.isInhabilitado();
                modeloTablaClientes.addRow(cliente);
            }
        }
    }
    
    public void actualizarTableFacturas(){
        int idClienteSeleccionadoCombo = comboClientesFactura.getSelectedIndex();
        String aliasClienteSeleccionadoCombo = comboClientesFactura.getItemAt(idClienteSeleccionadoCombo);
        int  idClienteSel = modelo.consultaIdClientePorAlias(aliasClienteSeleccionadoCombo);
        System.out.println(idClienteSel);
        int indiceMat = cbMatricula.getSelectedIndex();
        String mat = cbMatricula.getItemAt(indiceMat);
        
        try{
            while(modeloTablaFacturas.getRowCount()>0) modeloTablaFacturas.removeRow(0);
        
            ArrayList<Factura> listaFacturas = modelo.consultaParametrizada( idClienteSel, mat,
                    tfOrigen.getText(), tfDestino.getText());

            ArrayList<Factura> listaFechasFiltradas = new ArrayList<Factura>();
            Calendar desdeC=jdcFechaFacturaD.getCalendar();
            Calendar hastaC=jdcFechaFacturaH.getCalendar();

            if(desdeC==null){
                Calendar desdeDefecto=Calendar.getInstance();
                desdeDefecto.set(1990, 1, 1);
                desdeC=desdeDefecto;
            }
            if(hastaC==null){
                hastaC=Calendar.getInstance();
            }
            for(Factura f:listaFacturas){
                if(f.getFecha().before(hastaC) && f.getFecha().after(desdeC)){
                    listaFechasFiltradas.add(f);
                }
            }


            for(Factura f : listaFechasFiltradas){
                f.getCliente().getAlias();
                Object[] factura = new Object[11];
                factura[0] = f.getId();
                factura[1] = util.MiCalendar.toFecha(f.getFecha());
                factura[2] = f.getMatricula();
                factura[3] = f.getCliente().getAlias();
                factura[4] = f.getOrigen();
                factura[5] = f.getDestino();
                factura[6] = util.MiCalendar.toFecha(f.getFechaPorte());
                factura[7] = f.getPrecio();
                factura[8] = f.getTipoIva();
                factura[9] = f.getTipoRetencion();
                
                double total = f.getPrecio()-(f.getPrecio()*(f.getTipoRetencion()/100));
                total=total +(f.getPrecio()*(f.getTipoIva()/100));
                factura[10] =total;
                modeloTablaFacturas.addRow(factura);
            }
        }catch(NullPointerException ex){
            
        }
        
    }

    public JComboBox<String> getComboClientesFactura() {
        return comboClientesFactura;
    }

    public JComboBox<String> getCbMatricula() {
        return cbMatricula;
    }
    public JComboBox<String> getCbMatriculaPorte() {
        return cbMatriculaPorte;
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgTipoCliente;
    private javax.swing.JComboBox<String> cbMatricula;
    private javax.swing.JComboBox<String> cbMatriculaPorte;
    private javax.swing.JComboBox<String> comboClientesFactura;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton jbBorrarCliente;
    private javax.swing.JButton jbConfiguracion;
    private javax.swing.JButton jbConsultarClientes;
    private javax.swing.JButton jbConsultarTodoFactura;
    private javax.swing.JButton jbConsultarTodoPorte;
    private javax.swing.JButton jbHabilitarCliente;
    private javax.swing.JButton jbImprimirFactura;
    private javax.swing.JButton jbModificarCliente;
    private javax.swing.JButton jbModificarFactura;
    private javax.swing.JButton jbNuevaFactura;
    private javax.swing.JButton jbNuevoCliente;
    private javax.swing.JComboBox jcbTrimestral;
    private com.toedter.calendar.JDateChooser jdcFechaFacturaD;
    private com.toedter.calendar.JDateChooser jdcFechaFacturaH;
    private javax.swing.JLabel jlAliasCliente;
    private javax.swing.JLabel jlClienteFactura;
    private javax.swing.JLabel jlDestino;
    private javax.swing.JLabel jlDestinoPorte;
    private javax.swing.JLabel jlFactura;
    private javax.swing.JLabel jlFacturaPorte;
    private javax.swing.JLabel jlFechaFacturaD;
    private javax.swing.JLabel jlFechaFacturaH;
    private javax.swing.JLabel jlOrigen;
    private javax.swing.JLabel jlOrigenPorte;
    private javax.swing.JLabel jlTipoCliente;
    private static javax.swing.JLabel jlTitulo;
    private javax.swing.JLabel jlZona;
    private javax.swing.JPanel jpConsultasBajas;
    private javax.swing.JPanel jpFacturas;
    private javax.swing.JPanel jpPortes;
    private javax.swing.JPanel jpTitulo;
    private javax.swing.JRadioButton jrbHabilitados;
    private javax.swing.JRadioButton jrbTodos;
    private javax.swing.JTable jtClientes;
    private javax.swing.JTable jtFacturas;
    private javax.swing.JTable jtPortes;
    private javax.swing.JTabbedPane jtpMenuPrincipal;
    private javax.swing.JTextField tfAliasCliente;
    private javax.swing.JTextField tfDestino;
    private javax.swing.JTextField tfDestinoPorte;
    private javax.swing.JTextField tfOrigen;
    private javax.swing.JTextField tfOrigenPorte;
    private javax.swing.JTextField tfZona;
    // End of variables declaration//GEN-END:variables


}
