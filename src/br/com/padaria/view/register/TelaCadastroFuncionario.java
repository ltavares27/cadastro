/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.padaria.view.register;

import br.com.padaria.dao.FuncionarioDAOImp;
import br.com.padaria.domain.Cargo;
import br.com.padaria.model.Funcionario;
import javax.swing.JOptionPane;

/**
 *
 * @author luisp
 */
public class TelaCadastroFuncionario extends javax.swing.JFrame {
    
    FuncionarioDAOImp funcionarioDao = new FuncionarioDAOImp();
    

    /**
     * Creates new form TelaCadastroFuncionario
     */
    public TelaCadastroFuncionario() {
        initComponents();
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
        CPF = new javax.swing.JPanel();
        jLabelNomeFuncionario = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextNomeFuncionario = new javax.swing.JTextPane();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldEnderecoFuncionario = new javax.swing.JTextField();
        jLabelCpf = new javax.swing.JLabel();
        jLabelTelefone = new javax.swing.JLabel();
        jLabelSalario = new javax.swing.JLabel();
        jLabelCargo = new javax.swing.JLabel();
        jComboBoxCargo = new javax.swing.JComboBox<String>();
        jFormattedTextSalario = new javax.swing.JFormattedTextField();
        jFormattedTextCPF = new javax.swing.JFormattedTextField();
        jFormattedTextTelefone = new javax.swing.JFormattedTextField();
        jButtonFechar = new javax.swing.JButton();
        jButtonSalvarFuncionario = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tela de Cadastro de Funcionario");
        setPreferredSize(new java.awt.Dimension(802, 519));
        setResizable(false);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/funcionario.png"))); // NOI18N

        CPF.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Cadastro Funcionário", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 12))); // NOI18N
        CPF.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabelNomeFuncionario.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelNomeFuncionario.setText("Nome");

        jScrollPane1.setViewportView(jTextNomeFuncionario);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setText("Endereço");

        jTextFieldEnderecoFuncionario.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabelCpf.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelCpf.setText("CPF");

        jLabelTelefone.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelTelefone.setText("Telefone");

        jLabelSalario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelSalario.setText("Salário Mensal");

        jLabelCargo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelCargo.setText("Cargo");

        jComboBoxCargo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jComboBoxCargo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione um Cargo", "Gerente", "Padeito", "Vendedor" }));

        jFormattedTextSalario.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));
        jFormattedTextSalario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextSalarioActionPerformed(evt);
            }
        });

        try {
            jFormattedTextCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            jFormattedTextTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout CPFLayout = new javax.swing.GroupLayout(CPF);
        CPF.setLayout(CPFLayout);
        CPFLayout.setHorizontalGroup(
            CPFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CPFLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CPFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CPFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabelNomeFuncionario)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addComponent(jTextFieldEnderecoFuncionario)
                        .addComponent(jLabelCpf)
                        .addComponent(jLabelTelefone))
                    .addGroup(CPFLayout.createSequentialGroup()
                        .addGroup(CPFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(CPFLayout.createSequentialGroup()
                                .addComponent(jLabelSalario)
                                .addGap(85, 85, 85))
                            .addGroup(CPFLayout.createSequentialGroup()
                                .addComponent(jFormattedTextSalario)
                                .addGap(54, 54, 54)))
                        .addGroup(CPFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelCargo)
                            .addComponent(jComboBoxCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(CPFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jFormattedTextTelefone, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jFormattedTextCPF, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        CPFLayout.setVerticalGroup(
            CPFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CPFLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelNomeFuncionario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldEnderecoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelCpf)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jFormattedTextCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelTelefone)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jFormattedTextTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(CPFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(CPFLayout.createSequentialGroup()
                        .addComponent(jLabelCargo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxCargo))
                    .addGroup(CPFLayout.createSequentialGroup()
                        .addComponent(jLabelSalario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFormattedTextSalario)))
                .addGap(221, 221, 221))
        );

        jButtonFechar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButtonFechar.setText("Fechar");

        jButtonSalvarFuncionario.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButtonSalvarFuncionario.setText("Salvar");
        jButtonSalvarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarFuncionarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jButtonSalvarFuncionario)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonFechar)
                        .addContainerGap(466, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CPF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSalvarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CPF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalvarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarFuncionarioActionPerformed
          try {
        if(!validaPreenchimentoFormulario()){
           Funcionario funcionario = preencheFormulario();
           if (funcionario != null) {
             funcionarioDao.save(funcionario);
             JOptionPane.showMessageDialog(null,"Funcionario Cadastro com sucesso!");
             limpparCampos();
           }            
         }
        } catch (Exception e){
           JOptionPane.showMessageDialog(null,"Ocorreu um erro ao tentar salvar dados no banco."); 
          e.printStackTrace();
        }        
    }//GEN-LAST:event_jButtonSalvarFuncionarioActionPerformed

    private void jFormattedTextSalarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextSalarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextSalarioActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroFuncionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CPF;
    private javax.swing.JButton jButtonFechar;
    private javax.swing.JButton jButtonSalvarFuncionario;
    private javax.swing.JComboBox<String> jComboBoxCargo;
    private javax.swing.JFormattedTextField jFormattedTextCPF;
    private javax.swing.JFormattedTextField jFormattedTextSalario;
    private javax.swing.JFormattedTextField jFormattedTextTelefone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelCargo;
    private javax.swing.JLabel jLabelCpf;
    private javax.swing.JLabel jLabelNomeFuncionario;
    private javax.swing.JLabel jLabelSalario;
    private javax.swing.JLabel jLabelTelefone;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldEnderecoFuncionario;
    private javax.swing.JTextPane jTextNomeFuncionario;
    // End of variables declaration//GEN-END:variables

    private Funcionario preencheFormulario() {
       Funcionario funcionario = new Funcionario();
       funcionario.setNome(jTextNomeFuncionario.getText());
       funcionario.setCpf(jFormattedTextCPF.getText());
       funcionario.setEndereco(jTextFieldEnderecoFuncionario.getText());
       funcionario.setTelefone(jFormattedTextTelefone.getText());
       funcionario.setSalario(Double.valueOf(jFormattedTextSalario.getText()));
       funcionario.setCargo(jComboBoxCargo.getSelectedIndex());          
       return funcionario;
       
    }

    private boolean validaPreenchimentoFormulario() {
         if(jTextNomeFuncionario.getText().isEmpty()) {
           JOptionPane.showMessageDialog(null,"Informe o nome do Funcionario.");
           return true;
       }
       if(jFormattedTextCPF.getText().isEmpty()) {
          JOptionPane.showMessageDialog(null,"Informe o CPF do Funcionario. ");
          return true;
       } 
       if(jTextFieldEnderecoFuncionario.getText().isEmpty()) {
          JOptionPane.showMessageDialog(null,"Informe o endereço do funcionario.");
          return true;
       }        
       if(jFormattedTextTelefone.getText().isEmpty()) {
          JOptionPane.showMessageDialog(null,"Informe o telefone do funcionario.");
          return true;
       }        
       if(jFormattedTextSalario.getText().isEmpty()) {
          JOptionPane.showMessageDialog(null,"Informe o salário do funcionario.");
          return true;
       }        
       return false;
    }

    private void limpparCampos() {
       jTextNomeFuncionario.setText(null);
       jFormattedTextCPF.setText(null);
       jTextFieldEnderecoFuncionario.setText(null);
       jFormattedTextTelefone.setText(null);
       jFormattedTextSalario.setText(null);
       jComboBoxCargo.setSelectedIndex(0);      
       
    }
}
