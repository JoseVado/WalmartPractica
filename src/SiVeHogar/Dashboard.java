package SiVeHogar;

import java.awt.BorderLayout;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

public class Dashboard extends javax.swing.JFrame {

    int xMouse;
    int yMouse;
    
    private int sesion = 0;
    
    private javax.swing.JPanel botonActual;
    private final int TIEMPO_CARGA_PANTALLA = 2000;
    private Thread base;
    private Runnable MENSJAE_ERROR_RUN = new Runnable() {
        @Override
        public void run() {
            try {
                Thread.sleep(TIEMPO_CARGA_PANTALLA);
                if (base.isAlive()){
                    base.interrupt();
                    ventanaError();
                }
            } catch (InterruptedException ex) {
                Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    };
    
    private Login parent;
    private Vender hijo;

    public Dashboard(Login parent, boolean esAdmin, int sesion) {
        initComponents();
        
        btnEmpleados.setVisible(esAdmin);
        this.parent = parent;
        
        actualizarPantalla(new Inicio());
        this.sesion = sesion;
        botonActual = btnInicio;
        hijo = new Vender(this);
    }
    
    public int getSesion(){
        return this.sesion;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        barraArriba = new javax.swing.JPanel();
        btnCerrar = new javax.swing.JPanel();
        txtCerra = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        Background = new javax.swing.JPanel();
        Menu = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnInicio = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnProductos = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnVender = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        btnVentas = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btnClientes = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnEmpleados = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        Header = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        frase = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        content = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 51, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        barraArriba.setBackground(new java.awt.Color(0, 113, 206));
        barraArriba.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        barraArriba.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                barraArribaMouseDragged(evt);
            }
        });
        barraArriba.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                barraArribaMousePressed(evt);
            }
        });

        btnCerrar.setBackground(new java.awt.Color(0, 113, 206));
        btnCerrar.setMinimumSize(new java.awt.Dimension(40, 40));
        btnCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCerrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCerrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCerrarMouseExited(evt);
            }
        });

        txtCerra.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtCerra.setForeground(new java.awt.Color(255, 255, 255));
        txtCerra.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtCerra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SiVeHogar/Imagenes/cerrar-sesion.png"))); // NOI18N
        txtCerra.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtCerra.setMinimumSize(new java.awt.Dimension(40, 40));
        txtCerra.setPreferredSize(new java.awt.Dimension(40, 40));

        jLabel15.setBackground(new java.awt.Color(204, 204, 204));
        jLabel15.setForeground(new java.awt.Color(204, 204, 204));
        jLabel15.setText("Cerrar Sesión");

        javax.swing.GroupLayout btnCerrarLayout = new javax.swing.GroupLayout(btnCerrar);
        btnCerrar.setLayout(btnCerrarLayout);
        btnCerrarLayout.setHorizontalGroup(
            btnCerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnCerrarLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCerra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        btnCerrarLayout.setVerticalGroup(
            btnCerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnCerrarLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel15)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(btnCerrarLayout.createSequentialGroup()
                .addComponent(txtCerra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout barraArribaLayout = new javax.swing.GroupLayout(barraArriba);
        barraArriba.setLayout(barraArribaLayout);
        barraArribaLayout.setHorizontalGroup(
            barraArribaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barraArribaLayout.createSequentialGroup()
                .addContainerGap(874, Short.MAX_VALUE)
                .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        barraArribaLayout.setVerticalGroup(
            barraArribaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnCerrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Background.setBackground(new java.awt.Color(255, 255, 255));
        Background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Menu.setBackground(new java.awt.Color(0, 113, 206));
        Menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel25.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("SiVeHogar");
        Menu.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 190, -1));

        jSeparator1.setPreferredSize(new java.awt.Dimension(50, 5));
        Menu.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 190, 20));

        btnInicio.setBackground(new java.awt.Color(102, 153, 255));
        btnInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnInicio.setName("btnInicio"); // NOI18N
        btnInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnInicioMousePressed(evt);
            }
        });
        btnInicio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SiVeHogar/Imagenes/home-outline.png"))); // NOI18N
        btnInicio.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Inicio");
        btnInicio.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, 30));

        Menu.add(btnInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 270, 50));

        btnProductos.setBackground(new java.awt.Color(4, 30, 66));
        btnProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnProductos.setName("btnProductos"); // NOI18N
        btnProductos.setPreferredSize(new java.awt.Dimension(270, 51));
        btnProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnProductosMousePressed(evt);
            }
        });
        btnProductos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SiVeHogar/Imagenes/productos.png"))); // NOI18N
        btnProductos.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Productos");
        btnProductos.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, 30));

        Menu.add(btnProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, -1, -1));

        btnVender.setBackground(new java.awt.Color(4, 30, 66));
        btnVender.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnVender.setName("btnVender"); // NOI18N
        btnVender.setPreferredSize(new java.awt.Dimension(270, 51));
        btnVender.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnVenderMousePressed(evt);
            }
        });
        btnVender.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SiVeHogar/Imagenes/vender.png"))); // NOI18N
        btnVender.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Vender");
        btnVender.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, 30));

        Menu.add(btnVender, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, -1, -1));

        btnVentas.setBackground(new java.awt.Color(4, 30, 66));
        btnVentas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnVentas.setName("btnVentas"); // NOI18N
        btnVentas.setPreferredSize(new java.awt.Dimension(270, 51));
        btnVentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnVentasMousePressed(evt);
            }
        });
        btnVentas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SiVeHogar/Imagenes/ventas.png"))); // NOI18N
        btnVentas.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Ventas");
        btnVentas.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, 30));

        Menu.add(btnVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, -1, -1));

        btnClientes.setBackground(new java.awt.Color(4, 30, 66));
        btnClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnClientes.setName("btnClientes"); // NOI18N
        btnClientes.setPreferredSize(new java.awt.Dimension(270, 51));
        btnClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnClientesMousePressed(evt);
            }
        });
        btnClientes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SiVeHogar/Imagenes/usuario.png"))); // NOI18N
        btnClientes.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Clientes");
        btnClientes.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, 30));

        Menu.add(btnClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, -1, -1));

        btnEmpleados.setBackground(new java.awt.Color(4, 30, 66));
        btnEmpleados.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnEmpleados.setName("btnEmpleados"); // NOI18N
        btnEmpleados.setPreferredSize(new java.awt.Dimension(270, 51));
        btnEmpleados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnEmpleadosMousePressed(evt);
            }
        });
        btnEmpleados.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SiVeHogar/Imagenes/account-multiple.png"))); // NOI18N
        btnEmpleados.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Empleados");
        btnEmpleados.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, 30));

        Menu.add(btnEmpleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 590, 270, -1));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SiVeHogar/Imagenes/walmart-spark (1).png"))); // NOI18N
        Menu.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 70, -1));

        Background.add(Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 640));

        Header.setBackground(new java.awt.Color(0, 113, 206));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 194, 32));
        jLabel2.setText("SiVeHogar");

        frase.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        frase.setForeground(new java.awt.Color(255, 255, 255));
        frase.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        frase.setText("Con SiveHogar \"'ahorra dinero, vive mejor\"");

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SiVeHogar/Imagenes/carrito-walmart-png (2).png"))); // NOI18N
        jLabel6.setToolTipText("");

        javax.swing.GroupLayout HeaderLayout = new javax.swing.GroupLayout(Header);
        Header.setLayout(HeaderLayout);
        HeaderLayout.setHorizontalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addGroup(HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HeaderLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(frase, javax.swing.GroupLayout.DEFAULT_SIZE, 730, Short.MAX_VALUE))
                    .addGroup(HeaderLayout.createSequentialGroup()
                        .addGap(266, 266, 266)
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(HeaderLayout.createSequentialGroup()
                .addGap(296, 296, 296)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        HeaderLayout.setVerticalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(frase, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        Background.add(Header, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 750, 210));

        content.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 430, Short.MAX_VALUE)
        );

        Background.add(content, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, 750, 430));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(barraArriba, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(Background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(barraArriba, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 627, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void ventanaError(){
        actualizarPantalla(new Error());
    }

    public static void actualizarPantalla(javax.swing.JPanel panelActualizar){
        panelActualizar.setSize(750, 430);
        panelActualizar.setLocation(0,0);
        
        content.removeAll();
        content.add(panelActualizar, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }
    
    private void actualizarBoton(javax.swing.JPanel btnAux){
        resetColor(botonActual);
        botonActual = btnAux;
        setColor(btnAux);
    }
    
    private void btnInicioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInicioMousePressed
        actualizarBoton( btnInicio );
        
        // Abrir sección
        actualizarPantalla(new Inicio());
    }//GEN-LAST:event_btnInicioMousePressed

    private void btnVenderMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVenderMousePressed
        actualizarBoton(btnVender );
        
        // Abrir sección
        base = new Thread(
            new Runnable() {
                @Override
                public void run() {
                    // Abrir sección
                    actualizarPantalla(hijo);
                }
            }
        );
        Thread error = new Thread(MENSJAE_ERROR_RUN);
        base.start();
        error.start();
        
    }//GEN-LAST:event_btnVenderMousePressed

    private void btnClientesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClientesMousePressed
        actualizarBoton( btnClientes );
        
        base = new Thread(
            new Runnable() {
                @Override
                public void run() {
                    // Abrir sección
                    actualizarPantalla( new Clientes(parent.dashboard));
                }
            }
        );
        Thread error = new Thread(MENSJAE_ERROR_RUN);
        base.start();
        error.start();
    }//GEN-LAST:event_btnClientesMousePressed

    private void btnProductosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProductosMousePressed
        actualizarBoton(btnProductos );
        
        
        base = new Thread(
            new Runnable() {
                @Override
                public void run() {
                    // Abrir sección
                    actualizarPantalla(new Productos(parent.dashboard));
                }
            }
        );
        Thread error = new Thread(MENSJAE_ERROR_RUN);
        base.start();
        error.start();
    }//GEN-LAST:event_btnProductosMousePressed

    private void btnVentasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVentasMousePressed
        actualizarBoton(btnVentas );
        base = new Thread(
            new Runnable() {
                @Override
                public void run() {
                    // Abrir sección
                    actualizarPantalla(new Ventas(parent.dashboard));
                }
            }
        );
        Thread error = new Thread(MENSJAE_ERROR_RUN);
        base.start();
        error.start();
    }//GEN-LAST:event_btnVentasMousePressed

    private void btnEmpleadosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEmpleadosMousePressed
        actualizarBoton( btnEmpleados );
        base = new Thread(
            new Runnable() {
                @Override
                public void run() {
                    actualizarPantalla(new Empleados(parent.dashboard));
                }
            }
        );
        Thread error = new Thread(MENSJAE_ERROR_RUN);
        base.start();
        error.start();
    }//GEN-LAST:event_btnEmpleadosMousePressed

    private void barraArribaMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barraArribaMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_barraArribaMouseDragged

    private void barraArribaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barraArribaMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_barraArribaMousePressed

    private void btnCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMouseClicked
        int aceptar = javax.swing.JOptionPane.showConfirmDialog(this, "¿Está seguro de cerrar sesión?", "SALIR", javax.swing.JOptionPane.WARNING_MESSAGE);
        if(aceptar == javax.swing.JOptionPane.YES_OPTION){
            parent.setVisible(true);
            parent.requestFocus();
            this.dispose();
        }
        
    }//GEN-LAST:event_btnCerrarMouseClicked

    private void btnCerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMouseEntered
        btnCerrar.setBackground(new Color(102,153,255));
    }//GEN-LAST:event_btnCerrarMouseEntered

    private void btnCerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMouseExited
        btnCerrar.setBackground(new Color(0,113,206));
    }//GEN-LAST:event_btnCerrarMouseExited

    void setColor(JPanel panel){
        panel.setBackground(new Color(102,153,255));
    }
    void resetColor(JPanel panel){
        panel.setBackground(new Color(4,30,66));
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JPanel Header;
    private javax.swing.JPanel Menu;
    private javax.swing.JPanel barraArriba;
    private javax.swing.JPanel btnCerrar;
    private javax.swing.JPanel btnClientes;
    private javax.swing.JPanel btnEmpleados;
    private javax.swing.JPanel btnInicio;
    private javax.swing.JPanel btnProductos;
    private javax.swing.JPanel btnVender;
    private javax.swing.JPanel btnVentas;
    public static javax.swing.JPanel content;
    private javax.swing.JLabel frase;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel txtCerra;
    // End of variables declaration//GEN-END:variables
}
