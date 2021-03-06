/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SiVeHogar;

import java.awt.Color;
import javax.swing.JPanel;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;

public class UpProductos extends javax.swing.JPanel {

    private boolean edition;
    private String origId;
    private Productos parent;
    private javax.swing.JTextField[] campos;
    DBManager dbManager = DBManager.getDBManager();
    private static final String TABLA = Productos.TABLA;
    private String pattern = "dd-MM-yyyy";
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
    public static final String[] datosBD = new String [] {
        "nombre", "disponibles", "precioBruto","precioNeto","descripcion"
    };
    private final String[] instrucciones = new String[]{
            "Ingrese el nombre del producto",
            "Ingrese la cantidad disponibles",
            "Ingrese el precio bruto",
            "Ingrese el precio neto",
            "Ingrese una corta descripción"
    };
    
    
    /**
     * Creates new form Principal
     */
    public UpProductos(Productos parent) {
        initComponents();
        this.parent = parent;
        edition = false;
        
        campos = new javax.swing.JTextField[]{
            nombre,disponibles,precio_bruto,precio_neto,descripcion
                        };
        
        for(int i = 0; i<campos.length; i++){
            campos[i].setText(instrucciones[i]);
        } 
    }
    
    public UpProductos(Productos parent, Map<String,Object> producto){
        initComponents();
        this.parent = parent;
        edition = true;
        
        campos = new javax.swing.JTextField[]{
            nombre,disponibles,precio_bruto,precio_neto,descripcion
                        };
        
        for (int i = 0; i < datosBD.length; i++) {
            Object agregar = producto.get(datosBD[i]);
            if (agregar == null) {
                campos[i].setText("");
            } else {
                campos[i].setText(agregar.toString());
            }
        }
        
        origId = producto.get("idProducto").toString();
        
        lblTitulo.setText("Modificar Proeducto");
        jLabel1.setText("Guardar");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        body = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        button = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Text7 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        Text8 = new javax.swing.JLabel();
        disponibles = new javax.swing.JTextField();
        jSeparator9 = new javax.swing.JSeparator();
        Text9 = new javax.swing.JLabel();
        precio_bruto = new javax.swing.JTextField();
        jSeparator10 = new javax.swing.JSeparator();
        precio_neto = new javax.swing.JTextField();
        jSeparator11 = new javax.swing.JSeparator();
        Text10 = new javax.swing.JLabel();
        Text14 = new javax.swing.JLabel();
        descripcion = new javax.swing.JTextField();
        jSeparator15 = new javax.swing.JSeparator();
        btnCancelar = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(750, 430));
        setPreferredSize(new java.awt.Dimension(750, 430));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        body.setBackground(new java.awt.Color(255, 255, 255));
        body.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(body, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblTitulo.setText("Subir nuevo Libro");
        add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jSeparator3.setForeground(new java.awt.Color(204, 204, 204));
        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator3.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, 10, 350));

        button.setBackground(new java.awt.Color(18, 90, 173));
        button.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                buttonMousePressed(evt);
            }
        });
        button.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Subir");
        button.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, -1, 30));

        add(button, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 140, 280, 50));

        Text7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text7.setText("Nombre");
        add(Text7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        nombre.setForeground(new java.awt.Color(102, 102, 102));
        nombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nombre.setBorder(null);
        nombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nombreFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                nombreFocusLost(evt);
            }
        });
        add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 300, 30));

        jSeparator8.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator8.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 300, 10));

        Text8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text8.setText("Disponibles");
        add(Text8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        disponibles.setForeground(new java.awt.Color(102, 102, 102));
        disponibles.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        disponibles.setBorder(null);
        disponibles.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                disponiblesFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                disponiblesFocusLost(evt);
            }
        });
        add(disponibles, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 300, 30));

        jSeparator9.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator9.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 300, 10));

        Text9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text9.setText("Precio Bruto");
        add(Text9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        precio_bruto.setForeground(new java.awt.Color(102, 102, 102));
        precio_bruto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        precio_bruto.setBorder(null);
        precio_bruto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                precio_brutoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                precio_brutoFocusLost(evt);
            }
        });
        add(precio_bruto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 140, 30));

        jSeparator10.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator10.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 140, 10));

        precio_neto.setForeground(new java.awt.Color(102, 102, 102));
        precio_neto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        precio_neto.setBorder(null);
        precio_neto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                precio_netoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                precio_netoFocusLost(evt);
            }
        });
        add(precio_neto, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 140, 30));

        jSeparator11.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator11.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, 140, 10));

        Text10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text10.setText("Precio Neto");
        add(Text10, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, -1, -1));

        Text14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text14.setText("Descripción");
        add(Text14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, -1));

        descripcion.setForeground(new java.awt.Color(102, 102, 102));
        descripcion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        descripcion.setBorder(null);
        descripcion.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                descripcionFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                descripcionFocusLost(evt);
            }
        });
        add(descripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 300, 30));

        jSeparator15.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator15.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 300, 10));

        btnCancelar.setBackground(new java.awt.Color(18, 90, 173));
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCancelarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCancelarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnCancelarMousePressed(evt);
            }
        });
        btnCancelar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Cancelar");
        btnCancelar.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, 30));

        add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 250, 150, 50));
    }// </editor-fold>//GEN-END:initComponents

    private void buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonMouseEntered
        setColor(button);
    }//GEN-LAST:event_buttonMouseEntered

    private void buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonMouseExited
        resetColor(button);
    }//GEN-LAST:event_buttonMouseExited

    // SUBIR
    private void buttonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonMousePressed
        boolean algunDatoVacio = false;

        Map<String, Object> subir = new HashMap<>();
        for (int i = 0; i < campos.length; i++) {
            subir.put(datosBD[i], campos[i].getText());

            if (campos[i].getText().equals(instrucciones[i])) {
                algunDatoVacio = true;
                break;
            }
        }

        if (algunDatoVacio) {
            javax.swing.JOptionPane.showMessageDialog(this, "Debe llenar todos los campos \n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        } else {
            String errores = "";
            if (!nombre.getText().matches("^[a-zA-Z.\\s]+$")) {
                errores += "ERROR el producto debe ser alfabetico\n";
            }
            if (!disponibles.getText().matches("^\\d+$")) {
                errores += "ERROR cantidad disponible invalida\n";
            }
            if (!precio_bruto.getText().matches("\\d+\\.\\d+")) {
                errores += "ERROR precio bruto invalido\n";
            }
            if (!precio_neto.getText().matches("\\d+\\.\\d+")) {
                errores += "ERROR precio neto invalido\n";
            }

            if (errores.length() > 0) {
                javax.swing.JOptionPane.showMessageDialog(this, errores, "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            } else {
                if (edition) {
                    Map<String, Object> where = new HashMap<>();
                    where.put("idProducto", origId);

                    dbManager.actualizar(TABLA, subir, where);
                    javax.swing.JOptionPane.showMessageDialog(this,
                        "¡Producto editado correctamente! \n", "HECHO", javax.swing.JOptionPane.INFORMATION_MESSAGE);

                } else {
                    Map<String, Object> datos = dbManager.buscarUno(TABLA, subir);
                    if (datos.size() > 0) {
                        javax.swing.JOptionPane.showMessageDialog(this, "Producto anteriormente registrado", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        dbManager.insertar(TABLA, subir);
                        javax.swing.JOptionPane.showMessageDialog(this,
                            "¡Producto registrado correctamente! \n", "HECHO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                    }
                }
                parent.parent.actualizarPantalla(parent);
                parent.actualizarTabla();
            }
        }
    }//GEN-LAST:event_buttonMousePressed

    private void nombreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nombreFocusGained
        if(campos[0].getText().equals(instrucciones[0])){
            campos[0].setText("");
        }
    }//GEN-LAST:event_nombreFocusGained

    private void nombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nombreFocusLost
        if(campos[0].getText().isEmpty()){
            campos[0].setText(instrucciones[0]);
        }
    }//GEN-LAST:event_nombreFocusLost

    private void disponiblesFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_disponiblesFocusGained
        if(campos[1].getText().equals(instrucciones[1])){
            campos[1].setText("");
        }
    }//GEN-LAST:event_disponiblesFocusGained

    private void disponiblesFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_disponiblesFocusLost
        if(campos[1].getText().isEmpty()){
            campos[1].setText(instrucciones[1]);
        }
    }//GEN-LAST:event_disponiblesFocusLost

    private void precio_brutoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_precio_brutoFocusGained
        if(campos[2].getText().equals(instrucciones[2])){
            campos[2].setText("");
        }
    }//GEN-LAST:event_precio_brutoFocusGained

    private void precio_brutoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_precio_brutoFocusLost
        if(campos[2].getText().isEmpty()){
            campos[2].setText(instrucciones[2]);
        }
    }//GEN-LAST:event_precio_brutoFocusLost

    private void precio_netoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_precio_netoFocusGained
        if(campos[3].getText().equals(instrucciones[3])){
            campos[3].setText("");
        }
    }//GEN-LAST:event_precio_netoFocusGained

    private void precio_netoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_precio_netoFocusLost
        if(campos[3].getText().isEmpty()){
            campos[3].setText(instrucciones[3]);
        }
    }//GEN-LAST:event_precio_netoFocusLost

    private void btnCancelarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseEntered
        setColor(btnCancelar);
    }//GEN-LAST:event_btnCancelarMouseEntered

    private void btnCancelarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseExited
        resetColor(btnCancelar);
    }//GEN-LAST:event_btnCancelarMouseExited

    private void btnCancelarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMousePressed
        parent.parent.actualizarPantalla(parent);
    }//GEN-LAST:event_btnCancelarMousePressed

    private void descripcionFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_descripcionFocusGained
        if(campos[4].getText().equals(instrucciones[4])){
            campos[4].setText("");
        }
    }//GEN-LAST:event_descripcionFocusGained

    private void descripcionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_descripcionFocusLost
        if(campos[4].getText().equals(instrucciones[4])){
            campos[4].setText("");
        }
    }//GEN-LAST:event_descripcionFocusLost

    void setColor(JPanel panel){
        panel.setBackground(new Color(21,101,192));
    }
    void resetColor(JPanel panel){
        panel.setBackground(new Color(18,90,173));
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Text10;
    private javax.swing.JLabel Text14;
    private javax.swing.JLabel Text7;
    private javax.swing.JLabel Text8;
    private javax.swing.JLabel Text9;
    private javax.swing.JPanel body;
    private javax.swing.JPanel btnCancelar;
    private javax.swing.JPanel button;
    private javax.swing.JTextField descripcion;
    private javax.swing.JTextField disponibles;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField precio_bruto;
    private javax.swing.JTextField precio_neto;
    // End of variables declaration//GEN-END:variables
}
