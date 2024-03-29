/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Carui;

import Carinfo.Carproduct;
import Carinfo.Servicerecord;
import Carinfo.Servicerecordhistory;
import java.awt.Image;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.ImageIcon;
/**
 *
 * @author Sarvesh
 */
public class ViewDetails extends javax.swing.JPanel {

    /**
     * Creates new form ViewDetails
     */
    Carproduct carproduct;
    Servicerecordhistory history;
    public ViewDetails(Carproduct carproduct, Servicerecordhistory history) {
        initComponents();
        this.carproduct = carproduct;
        this.history = history;
        displayProduct();
        populateTable();
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
        jbrand = new javax.swing.JLabel();
        brand = new javax.swing.JTextField();
        model = new javax.swing.JTextField();
        jmodel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jbrand1 = new javax.swing.JLabel();
        brand1 = new javax.swing.JTextField();
        jmodel1 = new javax.swing.JLabel();
        model1 = new javax.swing.JTextField();
        jcolor = new javax.swing.JLabel();
        color = new javax.swing.JTextField();
        jyear = new javax.swing.JLabel();
        year = new javax.swing.JTextField();
        jengineno = new javax.swing.JLabel();
        engineno = new javax.swing.JTextField();
        jseatsno = new javax.swing.JLabel();
        seatsno = new javax.swing.JTextField();
        jlicenseplate = new javax.swing.JLabel();
        licenseplate = new javax.swing.JTextField();
        jtelephone = new javax.swing.JLabel();
        telephone = new javax.swing.JTextField();
        jownername = new javax.swing.JLabel();
        ownername = new javax.swing.JTextField();
        jemail = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jaddress = new javax.swing.JLabel();
        address = new javax.swing.JTextField();
        jssn = new javax.swing.JLabel();
        ssn = new javax.swing.JTextField();
        jlicense = new javax.swing.JLabel();
        license = new javax.swing.JTextField();
        jservicerecord = new javax.swing.JLabel();
        jwarrantyyear = new javax.swing.JLabel();
        warrantyyear = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        sr = new javax.swing.JTable();
        icon = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Create");

        jbrand.setText("brand:");

        jmodel.setText("model:");

        setPreferredSize(new java.awt.Dimension(675, 522));

        jLabel2.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("View");

        jbrand1.setText("brand:");

        brand1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brand1ActionPerformed(evt);
            }
        });

        jmodel1.setText("model:");

        jcolor.setText("color:");

        jyear.setText("year :  ");

        jengineno.setText("engine no:");

        engineno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enginenoActionPerformed(evt);
            }
        });

        jseatsno.setText("seatsno:");

        jlicenseplate.setText("licenseplate:");

        jtelephone.setText("telephone:");

        jownername.setText("ownername:");

        jemail.setText("email:");

        jaddress.setText("address:");

        jssn.setText("ssn:");

        jlicense.setText("license:");

        jservicerecord.setText("service record:");

        jwarrantyyear.setText("warranty year:");

        sr.setAutoCreateRowSorter(true);
        sr.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "mileage", "limit", "odometer"
            }
        ));
        jScrollPane1.setViewportView(sr);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jservicerecord)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jaddress)
                                    .addComponent(jemail)
                                    .addComponent(jssn)
                                    .addComponent(jlicense)
                                    .addComponent(jwarrantyyear)
                                    .addComponent(jownername)
                                    .addComponent(jtelephone)
                                    .addComponent(jlicenseplate)
                                    .addComponent(jseatsno)
                                    .addComponent(jengineno)
                                    .addComponent(jyear)
                                    .addComponent(jcolor)
                                    .addComponent(jmodel1)
                                    .addComponent(jbrand1))
                                .addGap(62, 62, 62)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(color, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ssn, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(model1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(licenseplate, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(seatsno, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(warrantyyear, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(telephone, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                            .addComponent(brand1, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                                                            .addComponent(year)
                                                            .addComponent(engineno)
                                                            .addComponent(ownername)
                                                            .addComponent(license)))
                                                    .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGap(51, 51, 51)
                                        .addComponent(icon, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(73, 73, 73)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(brand1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbrand1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jmodel1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(model1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcolor)
                    .addComponent(color, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jyear))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(engineno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jengineno))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jseatsno)
                            .addComponent(seatsno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlicenseplate)
                            .addComponent(licenseplate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jtelephone)
                                .addGap(10, 10, 10))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(telephone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jownername)
                            .addComponent(ownername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jemail)
                            .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(icon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jaddress)
                    .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jssn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(ssn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlicense)
                    .addComponent(license, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jwarrantyyear)
                    .addComponent(warrantyyear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jservicerecord))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void enginenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enginenoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enginenoActionPerformed

    private void brand1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brand1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_brand1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField address;
    private javax.swing.JTextField brand;
    private javax.swing.JTextField brand1;
    private javax.swing.JTextField color;
    private javax.swing.JTextField email;
    private javax.swing.JTextField engineno;
    private javax.swing.JLabel icon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jaddress;
    private javax.swing.JLabel jbrand;
    private javax.swing.JLabel jbrand1;
    private javax.swing.JLabel jcolor;
    private javax.swing.JLabel jemail;
    private javax.swing.JLabel jengineno;
    private javax.swing.JLabel jlicense;
    private javax.swing.JLabel jlicenseplate;
    private javax.swing.JLabel jmodel;
    private javax.swing.JLabel jmodel1;
    private javax.swing.JLabel jownername;
    private javax.swing.JLabel jseatsno;
    private javax.swing.JLabel jservicerecord;
    private javax.swing.JLabel jssn;
    private javax.swing.JLabel jtelephone;
    private javax.swing.JLabel jwarrantyyear;
    private javax.swing.JLabel jyear;
    private javax.swing.JTextField license;
    private javax.swing.JTextField licenseplate;
    private javax.swing.JTextField model;
    private javax.swing.JTextField model1;
    private javax.swing.JTextField ownername;
    private javax.swing.JTextField seatsno;
    private javax.swing.JTable sr;
    private javax.swing.JTextField ssn;
    private javax.swing.JTextField telephone;
    private javax.swing.JTextField warrantyyear;
    private javax.swing.JTextField year;
    // End of variables declaration//GEN-END:variables

    private void displayProduct() {
        brand1.setText(carproduct.getBrand());
        model1.setText(carproduct.getModel());
        color.setText(carproduct.getColor());
        year.setText(String.valueOf(carproduct.getYear()));
        engineno.setText(String.valueOf(carproduct.getEngineno()));
        licenseplate.setText(carproduct.getLicenseplate());
        seatsno.setText(String.valueOf(carproduct.getSeatsno()));
        telephone.setText(String.valueOf(carproduct.getTelephoneno()));
        ownername.setText(carproduct.getName());
        email.setText(carproduct.getEmailaddress());
        address.setText(carproduct.getAddress());
        ssn.setText(String.valueOf(carproduct.getSSN()));
        license.setText(carproduct.getDrivinglicense());
        warrantyyear.setText(carproduct.getWarrantyyear());
        String imgicon = carproduct.getIcon();
        ImageIcon icn = new ImageIcon(new ImageIcon(imgicon).getImage().getScaledInstance(238, 207,Image.SCALE_DEFAULT));
        icon.setIcon(icn);  
        
    }

    private void populateTable() {
          DefaultTableModel model = (DefaultTableModel) sr.getModel();
          model.setRowCount(0);
          
          for (Servicerecord srd : history.getHistory()){
              
              Object[] row = new Object[3];
              row[0] = srd.getMileage();
              row[1] = srd.getLimit();
              row[2] = srd.getOdometer();
              
              model.addRow(row);
              
          }
    }
}
