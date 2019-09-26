package br.com.padaria.view.register;

import br.com.padaria.dao.ClienteDAOImp;
import br.com.padaria.model.Cliente;
import br.com.padaria.view.list.TelaListaCliente;
import javax.swing.JOptionPane;

/**
 *
 * @author luisp
 */
public class TelaCadastroCliente extends javax.swing.JFrame {

    /**
     * Creates new form TelaCadastroFuncionario
     */
    
    TelaListaCliente telaListaCliente = new TelaListaCliente();
    
    public TelaCadastroCliente() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        CPF = new javax.swing.JPanel();
        jLabelNomeCliente = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        inputNome = new javax.swing.JTextPane();
        jLabel2 = new javax.swing.JLabel();
        inputEndereco = new javax.swing.JTextField();
        jLabelCpfCliente = new javax.swing.JLabel();
        jLabelTelefoneCliente = new javax.swing.JLabel();
        jButtonSalvarCliente = new javax.swing.JButton();
        jFormattedTextFieldCPF = new javax.swing.JFormattedTextField();
        jFormattedTextFieldTelefone = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tela de Cadastro de Cliente");
        setResizable(false);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cliente.png"))); // NOI18N

        CPF.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Cadastro Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 12))); // NOI18N
        CPF.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabelNomeCliente.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelNomeCliente.setText("Nome");

        jScrollPane1.setViewportView(inputNome);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setText("Endereço");

        inputEndereco.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabelCpfCliente.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelCpfCliente.setText("CPF");

        jLabelTelefoneCliente.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelTelefoneCliente.setText("Telefone");

        jButtonSalvarCliente.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButtonSalvarCliente.setText("Salvar");
        jButtonSalvarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarClienteActionPerformed(evt);
            }
        });

        try {
            jFormattedTextFieldCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldCPF.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        try {
            jFormattedTextFieldTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldTelefone.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        javax.swing.GroupLayout CPFLayout = new javax.swing.GroupLayout(CPF);
        CPF.setLayout(CPFLayout);
        CPFLayout.setHorizontalGroup(
            CPFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CPFLayout.createSequentialGroup()
                .addGroup(CPFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CPFLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(CPFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelNomeCliente)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
                            .addComponent(jLabel2)
                            .addComponent(inputEndereco)
                            .addComponent(jLabelCpfCliente)
                            .addComponent(jLabelTelefoneCliente)))
                    .addGroup(CPFLayout.createSequentialGroup()
                        .addGap(251, 251, 251)
                        .addComponent(jButtonSalvarCliente))
                    .addGroup(CPFLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(CPFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jFormattedTextFieldTelefone, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jFormattedTextFieldCPF, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        CPFLayout.setVerticalGroup(
            CPFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CPFLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelNomeCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelCpfCliente)
                .addGap(7, 7, 7)
                .addComponent(jFormattedTextFieldCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelTelefoneCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jFormattedTextFieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96)
                .addComponent(jButtonSalvarCliente)
                .addContainerGap(179, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CPF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(CPF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getAccessibleContext().setAccessibleName("Tele de Cadastro de Cliente");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalvarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarClienteActionPerformed

        if(!inputNome.getText().isEmpty() 
                && !jFormattedTextFieldCPF.getText().isEmpty() 
                && !jFormattedTextFieldTelefone.getText().isEmpty() 
                && !inputEndereco.getText().isEmpty()) {
            Cliente cliente = new Cliente(null,
                                          inputNome.getText(), 
                                          jFormattedTextFieldCPF.getText(),
                                          jFormattedTextFieldTelefone.getText(),
                                          inputEndereco.getText());
            ClienteDAOImp clienteDAOImp = new ClienteDAOImp();
            clienteDAOImp.save(cliente);
            limparTela();
           JOptionPane.showMessageDialog(null,"Cliente Cadastro com sucesso!");
        }
    }//GEN-LAST:event_jButtonSalvarClienteActionPerformed

       private void limparTela() {
         inputNome.setText("");                                         
         jFormattedTextFieldCPF.setText("");
         jFormattedTextFieldTelefone.setText("");
         inputEndereco.setText("");
    }
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
            java.util.logging.Logger.getLogger(TelaCadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CPF;
    private javax.swing.JTextField inputEndereco;
    private javax.swing.JTextPane inputNome;
    private javax.swing.JButton jButtonSalvarCliente;
    private javax.swing.JFormattedTextField jFormattedTextFieldCPF;
    private javax.swing.JFormattedTextField jFormattedTextFieldTelefone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelCpfCliente;
    private javax.swing.JLabel jLabelNomeCliente;
    private javax.swing.JLabel jLabelTelefoneCliente;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

}
