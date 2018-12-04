package driveshare;

public class CreateDriver extends javax.swing.JFrame {

    /**
     * Creates new form CreateDriver
     */
    public CreateDriver(Driver driver, String vehicleType) {
        initComponents();
        this.user = driver;
        license.setText(driver.getLicense());
        number.setText(driver.getVehicle().getNumber());
        make.setText(driver.getVehicle().getMake());
        color.setText(driver.getVehicle().getColor());
        capacity.setText("" + driver.getVehicle().getCapacity());
        if (vehicleType.equalsIgnoreCase("car")) {
            isCar.setSelected(true);
        } else if (vehicleType.equalsIgnoreCase("van")) {
            isVan.setSelected(true);
        } else if (vehicleType.equalsIgnoreCase("tractor")) {
            isTractor.setSelected(true);
        } else if (vehicleType.equalsIgnoreCase("truck")) {
            isTruck.setSelected(true);
        }
    }

    public CreateDriver(User user) {
        initComponents();
        this.user = user;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        vehicleTypeSelector = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        license = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        number = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        make = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        color = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        capacity = new javax.swing.JTextField();
        next = new javax.swing.JButton();
        back = new javax.swing.JButton();
        isCar = new javax.swing.JRadioButton();
        isVan = new javax.swing.JRadioButton();
        isTractor = new javax.swing.JRadioButton();
        isTruck = new javax.swing.JRadioButton();

        vehicleTypeSelector.add(isCar); vehicleTypeSelector.add(isVan); vehicleTypeSelector.add(isTractor); vehicleTypeSelector.add(isTruck);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Create Driver");

        jLabel2.setText("License:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Vehicle");

        jLabel4.setText("Number:");

        jLabel5.setText("Make:");

        jLabel6.setText("Color:");

        jLabel7.setText("Capacity:");

        next.setText("Next");
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });

        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        isCar.setText("car");

        isVan.setText("van");

        isTractor.setText("tractor");

        isTruck.setText("truck");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(back, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(next, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(license, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(number, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(make, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(color)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(capacity, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(isCar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(isVan)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(isTractor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(isTruck)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(license, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(number, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(make, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(color, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(capacity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(isCar)
                    .addComponent(isVan)
                    .addComponent(isTractor)
                    .addComponent(isTruck))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(next, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(back)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        new CreateUser(user, "driver").setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backActionPerformed

    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed
        //Check for blank fields
        if (license.getText().equals("") || number.getText().equals("") || make.getText().equals("") || color.getText().equals("") || capacity.getText().equals("")) {
            new Error("Fields are blank.").setVisible(true);
            //Check for valid license number
        } else if (license.getText().length() > 15) {
            new Error("License length is above 15.").setVisible(true);
            //Check for valid vehicle number
        } else if (number.getText().length() > 8) {
            new Error("Vehicle number is above 8.").setVisible(true);
        } else {
            //Check for numeric capacity
            try {
                //Check for positive capacity
                if (Integer.parseInt(capacity.getText()) < 0) {
                    new Error("Capacity isn't positive.").setVisible(true);
                    return;
                }
            } catch (NumberFormatException e) {
                new Error("Capacity isn't numeric and whole.").setVisible(true);
                return;
            }
            if (isCar.isSelected()) {
                new CreateDriverVehicle(new Driver(user, license.getText(), new Vehicle(make.getText(), number.getText(), color.getText(), Integer.parseInt(capacity.getText()))), "car").setVisible(true);
                this.dispose();
            } else if (isVan.isSelected()) {
                new CreateDriverVehicle(new Driver(user, license.getText(), new Vehicle(make.getText(), number.getText(), color.getText(), Integer.parseInt(capacity.getText()))), "van").setVisible(true);
                this.dispose();
            } else if (isTractor.isSelected()) {
                new CreateDriverVehicle(new Driver(user, license.getText(), new Vehicle(make.getText(), number.getText(), color.getText(), Integer.parseInt(capacity.getText()))), "tractor").setVisible(true);
                this.dispose();
            } else if (isTruck.isSelected()) {
                new CreateDriverVehicle(new Driver(user, license.getText(), new Vehicle(make.getText(), number.getText(), color.getText(), Integer.parseInt(capacity.getText()))), "truck").setVisible(true);
                this.dispose();
            } else {
                new Error("Vehicle type isn't selected.").setVisible(true);
            }
        }
    }//GEN-LAST:event_nextActionPerformed

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
            java.util.logging.Logger.getLogger(CreateDriver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateDriver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateDriver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateDriver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateDriver(new User()).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JTextField capacity;
    private javax.swing.JTextField color;
    private javax.swing.JRadioButton isCar;
    private javax.swing.JRadioButton isTractor;
    private javax.swing.JRadioButton isTruck;
    private javax.swing.JRadioButton isVan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField license;
    private javax.swing.JTextField make;
    private javax.swing.JButton next;
    private javax.swing.JTextField number;
    private javax.swing.ButtonGroup vehicleTypeSelector;
    // End of variables declaration//GEN-END:variables
    private User user;
}
