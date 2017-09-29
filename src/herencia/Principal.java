/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

/**
 *
 * @author Anthonny
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();

        setLocationRelativeTo(null);//para que nos aparesca la pantalla sentrada
//        setResizable(false);
//        setTitle("CALCULADORA BASICA");
//        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/Vehiculo.jpg")).getImage());
//
//        ((JPanel) getContentPane()).setOpaque(false);
//        ImageIcon uno = new ImageIcon(this.getClass().getResource("/Imagenes/Vehiculo.jpg"));
//        JLabel fondo = new JLabel();
//        fondo.setIcon(uno);
//        getLayeredPane().add(fondo, JLayeredPane.FRAME_CONTENT_LAYER);
//        fondo.setBounds(0, 0, uno.getIconWidth(), uno.getIconHeight());

//        precio.setVisible(false);
//        textPrecio.setVisible(false);
//        placa.setVisible(false);
//        
        depo.setVisible(false);
        potencia.setVisible(false);
        textPotencia.setVisible(false);
        velocidad.setVisible(false);
        velo.setVisible(false);
        bntGuarda.setVisible(false);

        Furgoneta.setVisible(false);
        capacidad.setVisible(false);
        textCapasidad.setVisible(false);
        Disponible.setVisible(false);
        disponible.setVisible(false);
        capacidad.setVisible(false);
        bntGuardar.setVisible(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        precio = new javax.swing.JLabel();
        textPrecio = new javax.swing.JTextField();
        placa = new javax.swing.JLabel();
        textPlaca = new javax.swing.JTextField();
        furgoneta = new javax.swing.JCheckBox();
        deportivo = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        marca = new javax.swing.JComboBox();
        colores = new javax.swing.JComboBox();
        bntGuarda = new javax.swing.JButton();
        potencia = new javax.swing.JLabel();
        velo = new javax.swing.JComboBox();
        textPotencia = new javax.swing.JTextField();
        depo = new javax.swing.JLabel();
        velocidad = new javax.swing.JLabel();
        bntGuardar = new javax.swing.JButton();
        disponible = new javax.swing.JComboBox();
        Disponible = new javax.swing.JLabel();
        Furgoneta = new javax.swing.JLabel();
        capacidad = new javax.swing.JLabel();
        textCapasidad = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("REGISTRAR VEHICULO");

        precio.setText("Precio Vehiculo");

        placa.setText("Numero Placa");

        furgoneta.setText("Furgoneta");
        furgoneta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                furgonetaActionPerformed(evt);
            }
        });

        deportivo.setText("Deportivo");
        deportivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deportivoActionPerformed(evt);
            }
        });

        jLabel2.setText("Marca");

        jLabel3.setText("Colores");

        marca.setMaximumRowCount(5);
        marca.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Vehiculos" }));
        marca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marcaActionPerformed(evt);
            }
        });

        colores.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Color" }));
        colores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coloresActionPerformed(evt);
            }
        });

        bntGuarda.setText("GUARDAR");
        bntGuarda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntGuardaActionPerformed(evt);
            }
        });

        potencia.setText("Potencia");

        velo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "100", "150", "200" }));

        depo.setText("Deportivo");

        velocidad.setText("Velocidad Maxima");

        bntGuardar.setText("Guardar");
        bntGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntGuardarActionPerformed(evt);
            }
        });

        disponible.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SI", "NO" }));
        disponible.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                disponibleActionPerformed(evt);
            }
        });

        Disponible.setText("Disponible");

        Furgoneta.setText("Furgoneta");

        capacidad.setText("Capacidad");

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(colores, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)
                                        .addComponent(marca, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(146, 146, 146))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(velocidad)
                                    .addComponent(potencia))
                                .addGap(30, 30, 30)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textPotencia, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(depo)
                            .addComponent(velo, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bntGuarda)
                            .addComponent(capacidad)
                            .addComponent(Disponible))
                        .addGap(0, 199, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(precio)
                                    .addComponent(placa))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(textPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Furgoneta))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(furgoneta)
                                .addGap(43, 43, 43)
                                .addComponent(deportivo)))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(disponible, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textCapasidad, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(141, 141, 141))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bntGuardar)
                .addGap(198, 198, 198))
            .addGroup(layout.createSequentialGroup()
                .addGap(431, 431, 431)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(marca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(depo))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textPotencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(potencia))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(colores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(velo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(velocidad))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bntGuarda)
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(precio)
                                    .addComponent(textPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(32, 32, 32))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(146, 146, 146)
                                .addComponent(Furgoneta)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(placa)
                            .addComponent(textPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textCapasidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(capacidad))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(furgoneta)
                                    .addComponent(deportivo)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Disponible)
                                    .addComponent(disponible, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(204, 204, 204))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bntGuardar)
                        .addGap(52, 52, 52)
                        .addComponent(jButton1)
                        .addGap(89, 89, 89))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void furgonetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_furgonetaActionPerformed
        // TODO add your handling code here:
        depo.setVisible(false);
        potencia.setVisible(false);
        textPotencia.setVisible(false);
        velocidad.setVisible(false);
        velo.setVisible(false);
        bntGuarda.setVisible(false);

        Furgoneta.setVisible(true);
        capacidad.setVisible(true);
        textCapasidad.setVisible(true);
        Disponible.setVisible(true);
        disponible.setVisible(true);
        capacidad.setVisible(true);
        bntGuardar.setVisible(true);


    }//GEN-LAST:event_furgonetaActionPerformed

    private void deportivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deportivoActionPerformed
        // TODO add your handling code here:
        depo.setVisible(true);
        potencia.setVisible(true);
        textPotencia.setVisible(true);
        velocidad.setVisible(true);
        velo.setVisible(true);
        bntGuarda.setVisible(true);

        Furgoneta.setVisible(false);
        capacidad.setVisible(false);
        textCapasidad.setVisible(false);
        Disponible.setVisible(false);
        disponible.setVisible(false);
        capacidad.setVisible(false);
        bntGuardar.setVisible(false);

    }//GEN-LAST:event_deportivoActionPerformed

    private void marcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marcaActionPerformed
        // TODO add your handling code here:
        File f;
        FileWriter w;
        BufferedWriter bw;
        PrintWriter wi;
        String texto = "";
        ArrayList ListaVariada = new ArrayList<>();

        try {
            File archivo = new File("C:\\Users\\Anthonny\\Documents\\NetBeansProjects\\Herencia\\Vehiculos.txt");

            if (archivo.createNewFile()) {
                System.out.println("se ha creado un archivo");
            }

            //Aqui lo lee
            FileReader leer = new FileReader(archivo);
            BufferedReader a = new BufferedReader(leer);
            String inString = a.readLine();
            String temporal = "";
            while ((temporal = a.readLine()) != null) {
                ListaVariada.add(temporal);
                marca.addItem(temporal); //Agregamos los datos la combobox
            }

            // System.out.println(inString);
            a.close();

        } catch (IOException e) {
            System.out.println("no se ha podido crear el archivo" + e);
        }
    }//GEN-LAST:event_marcaActionPerformed

    private void coloresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coloresActionPerformed
        // TODO add your handling code here:
        File f;
        FileWriter w;
        BufferedWriter bw;
        PrintWriter wi;
        String texto = "";
        ArrayList Lista = new ArrayList<>();

        try {
            File archivo = new File("C:\\Users\\Anthonny\\Documents\\NetBeansProjects\\Herencia\\Colores.txt");

            if (archivo.createNewFile()) {
                System.out.println("se ha creado un archivo");
            }

            //Aqui lo lee
            FileReader leer = new FileReader(archivo);
            BufferedReader a = new BufferedReader(leer);
            String inString = a.readLine();
            String temporal = "";
            while ((temporal = a.readLine()) != null) {
                Lista.add(temporal + "\n");
                colores.addItem(temporal);

            }

            System.out.println(inString);
            a.close();

        } catch (IOException e) {
            System.out.println("no se ha podido crear el archivo" + e);
        }
    }//GEN-LAST:event_coloresActionPerformed

    private void bntGuardaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntGuardaActionPerformed
        // TODO add your handling code here:

        double precio;
        String numPlaca;
        precio = Double.parseDouble(textPrecio.getText());
        numPlaca = textPlaca.getText();

        double deportivo;
        deportivo = Double.parseDouble(textPotencia.getText());

        int index = velo.getSelectedIndex();
        if (index == 0) {
            int num = 100;
        } else if (index == 1) {
            int num1 = 150;
        } else if (index == 2) {
            int num2 = 250;

        }
        //Aqui llamo la clase Hija

        Deportivo c = new Deportivo();
        c.setMarca(String.valueOf(marca.getSelectedItem()));
        c.setColor(String.valueOf(colores.getSelectedItem()));
        c.setPrecio(precio);
        c.setMatricula(numPlaca);
        c.setPotencia(deportivo);
        c.setVelocidadMaxima(index);
        ArrayList ListaDeportivo = new ArrayList<>();
        ListaDeportivo.add(c);

        //Aqui imprimimo los atributos
        System.out.println(c.getAtributos());


    }//GEN-LAST:event_bntGuardaActionPerformed

    private void bntGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntGuardarActionPerformed
        // TODO add your handling code here:
        double precio;
        String numPlaca;
        precio = Double.parseDouble(textPrecio.getText());
        numPlaca = textPlaca.getText();
        int capacidad;
        capacidad = Integer.parseInt(textCapasidad.getText());
        String disponibles;
        int index1 = disponible.getSelectedIndex();
        String s = "SI";
        String n = "No";
        String mensaje;

        if (index1 == 0) {
            mensaje = s;

        } else if (index1 == 1) {
            mensaje = n;

        }

        Furgoneta m = new Furgoneta();
        m.setMarca(String.valueOf(marca.getSelectedItem()));
        m.setColor(String.valueOf(colores.getSelectedItem()));
        m.setPrecio(precio);
        m.setMatricula(numPlaca);
        m.setCapasidadPersonas(capacidad);
        m.setDisponible(String.valueOf(index1));

        System.out.println(m.getAtributos());


    }//GEN-LAST:event_bntGuardarActionPerformed

    private void disponibleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_disponibleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_disponibleActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Disponible;
    private javax.swing.JLabel Furgoneta;
    private javax.swing.JButton bntGuarda;
    private javax.swing.JButton bntGuardar;
    private javax.swing.JLabel capacidad;
    private javax.swing.JComboBox colores;
    private javax.swing.JLabel depo;
    private javax.swing.JCheckBox deportivo;
    private javax.swing.JComboBox disponible;
    private javax.swing.JCheckBox furgoneta;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JComboBox marca;
    private javax.swing.JLabel placa;
    private javax.swing.JLabel potencia;
    private javax.swing.JLabel precio;
    private javax.swing.JTextField textCapasidad;
    private javax.swing.JTextField textPlaca;
    private javax.swing.JTextField textPotencia;
    private javax.swing.JTextField textPrecio;
    private javax.swing.JComboBox velo;
    private javax.swing.JLabel velocidad;
    // End of variables declaration//GEN-END:variables
}
