package driveshare;

/**
 *
 * @author Jacob
 */
public class CreateAccount extends javax.swing.JFrame {

    /**
     * Creates new form CreateAccount
     */
    public CreateAccount() {
        initComponents();
        //This makes the window enough for the license number appearing. Must happen late in process for the frame to size well.
        licenseNumber.setVisible(false);
        licenseNumberLabel.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        accountTypeSelector = new javax.swing.ButtonGroup();
        fName = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        lName = new javax.swing.JTextField();
        emailAddress = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        clearFormButton = new javax.swing.JButton();
        address = new javax.swing.JTextField();
        createAccountButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        zipCode = new javax.swing.JTextField();
        city = new javax.swing.JTextField();
        isPassenger = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        isDriver = new javax.swing.JRadioButton();
        state = new javax.swing.JComboBox<String>();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        licenseNumber = new javax.swing.JTextField();
        licenseNumberLabel = new javax.swing.JLabel();

        accountTypeSelector.add(isDriver); accountTypeSelector.add(isPassenger);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel8.setText("Email");

        jLabel2.setText("Last Name");

        jLabel9.setText("Passsword");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Create New Account");

        jLabel4.setText("Address");

        clearFormButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        clearFormButton.setText("Clear Form");
        clearFormButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearFormButtonActionPerformed(evt);
            }
        });

        createAccountButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        createAccountButton.setText("Create Account");
        createAccountButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createAccountButtonActionPerformed(evt);
            }
        });

        jLabel5.setText("City");

        isPassenger.setText("Passenger");
        isPassenger.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isPassengerActionPerformed(evt);
            }
        });

        jLabel6.setText("State");

        isDriver.setText("Driver");
        isDriver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isDriverActionPerformed(evt);
            }
        });

        state.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Alabama", "Alaska", "Arizona", "Arkansas", "California", "Colorado", "Connecticut", "Delaware", "Flora", "Georgia", "Hawaii", "Idaho", "Illinois", "Indiana", "Iowa", "Kansas", "Kentucky", "Louisiana", "Maine", "Maryland", "Massachusetts", "Michigan", "Minnesota", "Mississippi", "Missouri", "Montana", "Nebraska", "Nevada", "New Hampshire", "New Jersey", "New Mexico", "New York", "North Carolina", "North Dakota", "Ohio", "Oklahoma", "Oregon", "Pennsylvania", "Rhode Island", "South Carolina", "South Dakota", "Tennessee", "Texas", "Utah", "Vermont", "Virginia", "Washington", "West Virginia", "Wisconsin", "Wyoming" }));

        jLabel1.setText("First Name");

        jLabel7.setText("ZIP");

        licenseNumberLabel.setText("License Number");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                        .addComponent(isDriver)
                        .addGap(18, 18, 18)
                        .addComponent(isPassenger))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(fName, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lName))
                            .addComponent(address)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(password)
                            .addComponent(emailAddress)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(licenseNumberLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(licenseNumber))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(city, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(state, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(zipCode))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(clearFormButton, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(createAccountButton, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(isDriver)
                    .addComponent(isPassenger)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(fName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(lName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(city, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(state, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(zipCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(emailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(licenseNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(licenseNumberLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clearFormButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(createAccountButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clearFormButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearFormButtonActionPerformed
        fName.setText("");
        lName.setText("");
        address.setText("");
        city.setText("");
        state.setSelectedItem("Alabama");
        zipCode.setText("");
        emailAddress.setText("");
        password.setText("");
        licenseNumber.setText("");
    }//GEN-LAST:event_clearFormButtonActionPerformed

    private void createAccountButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createAccountButtonActionPerformed
        try {
            if (isDriver.isSelected()) {
                Driver newDriver = new Driver();
                newDriver.setFirstname(fName.getText());
                newDriver.setLastname(lName.getText());
                newDriver.setStreetAddress(address.getText());
                newDriver.setCity(city.getText());
                newDriver.setState(state.getSelectedItem().toString());
                newDriver.setZipCode(zipCode.getText());
                newDriver.setEmail(emailAddress.getText());
                newDriver.setPassword(password.getText());
                newDriver.setDriverLicense(licenseNumber.getText());
                DriveShare.driversList.add(newDriver);

                new DriverGUI().setVisible(true);
                this.dispose();
            } else if (isPassenger.isSelected()) {
                Passenger newPass = new Passenger();
                newPass.setFirstname(fName.getText());
                newPass.setLastname(lName.getText());
                newPass.setStreetAddress(address.getText());
                newPass.setCity(city.getText());
                newPass.setState(state.getSelectedItem().toString());
                newPass.setZipCode(zipCode.getText());
                newPass.setEmail(emailAddress.getText());
                newPass.setPassword(password.getText());
                DriveShare.passengersList.add(newPass);

                new Schedule().setVisible(true);
                this.dispose();
            } else {
                new Error("Please select account type.").setVisible(true);
            }
        } catch (Exception e) {
            new Error("Account creation failed.").setVisible(true);
        }
    }//GEN-LAST:event_createAccountButtonActionPerformed

    private void isDriverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isDriverActionPerformed
        licenseNumber.setVisible(true);
        licenseNumberLabel.setVisible(true);
    }//GEN-LAST:event_isDriverActionPerformed

    private void isPassengerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isPassengerActionPerformed
        licenseNumber.setVisible(false);
        licenseNumberLabel.setVisible(false);
    }//GEN-LAST:event_isPassengerActionPerformed

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
            java.util.logging.Logger.getLogger(CreateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* CreateAccount and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateAccount().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup accountTypeSelector;
    private javax.swing.JTextField address;
    private javax.swing.JTextField city;
    private javax.swing.JButton clearFormButton;
    private javax.swing.JButton createAccountButton;
    private javax.swing.JTextField emailAddress;
    private javax.swing.JTextField fName;
    private javax.swing.JRadioButton isDriver;
    private javax.swing.JRadioButton isPassenger;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField lName;
    private javax.swing.JTextField licenseNumber;
    private javax.swing.JLabel licenseNumberLabel;
    private javax.swing.JPasswordField password;
    private javax.swing.JComboBox<String> state;
    private javax.swing.JTextField zipCode;
    // End of variables declaration//GEN-END:variables
}
