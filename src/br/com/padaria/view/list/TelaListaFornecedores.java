/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.padaria.view.list;

import br.com.padaria.dao.FornecedorDAOImp;
import br.com.padaria.model.Fornecedor;
import br.com.padaria.view.Edit.TelaEditarFornecedor;
import br.com.padaria.view.detail.TelaDetalheFornecedor;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author luisp
 */
public class TelaListaFornecedores extends javax.swing.JFrame { 
    
    private TelaEditarFornecedor telaEditarFornecedor = new TelaEditarFornecedor();
    
    private TelaDetalheFornecedor telaDetalheFornecedor = new TelaDetalheFornecedor();
    
    private FornecedorDAOImp fornecedorDao = new FornecedorDAOImp();

    /**
     * Creates new form TelaCadastroFuncionario
     */
    public TelaListaFornecedores() {
        initComponents();
        DefaultTableModel modelo = (DefaultTableModel) jTableFornecedores.getModel(); 
        jTableFornecedores.setRowSorter(new TableRowSorter(modelo));
        carregaListFornecedores();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jLabel1 = new javax.swing.JLabel();
        CPF = new javax.swing.JPanel();
        jButtonExcluirFornecedor = new javax.swing.JButton();
        jButtonEditarFornecedor = new javax.swing.JButton();
        jButtonDetalhesFornecedor1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableFornecedores = new javax.swing.JTable();

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        jMenu3.setText("jMenu3");

        jMenu4.setText("jMenu4");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tela de Fornecedores");
        setResizable(false);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fornecedor.png"))); // NOI18N

        CPF.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Fornecedores", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 12))); // NOI18N
        CPF.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jButtonExcluirFornecedor.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonExcluirFornecedor.setText("Exluir");
        jButtonExcluirFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirFornecedorActionPerformed(evt);
            }
        });

        jButtonEditarFornecedor.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonEditarFornecedor.setText("Editar");
        jButtonEditarFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarFornecedorActionPerformed(evt);
            }
        });

        jButtonDetalhesFornecedor1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonDetalhesFornecedor1.setText("Detalhes");
        jButtonDetalhesFornecedor1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDetalhesFornecedor1ActionPerformed(evt);
            }
        });

        jTableFornecedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "CNPJ", "Razao Social"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableFornecedores.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTableFornecedores);
        if (jTableFornecedores.getColumnModel().getColumnCount() > 0) {
            jTableFornecedores.getColumnModel().getColumn(0).setMinWidth(20);
            jTableFornecedores.getColumnModel().getColumn(0).setMaxWidth(5);
            jTableFornecedores.getColumnModel().getColumn(1).setMinWidth(200);
            jTableFornecedores.getColumnModel().getColumn(1).setMaxWidth(1000);
            jTableFornecedores.getColumnModel().getColumn(2).setPreferredWidth(5);
        }

        javax.swing.GroupLayout CPFLayout = new javax.swing.GroupLayout(CPF);
        CPF.setLayout(CPFLayout);
        CPFLayout.setHorizontalGroup(
            CPFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CPFLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonEditarFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonDetalhesFornecedor1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonExcluirFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(331, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        CPFLayout.setVerticalGroup(
            CPFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CPFLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(CPFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonExcluirFornecedor)
                    .addComponent(jButtonEditarFornecedor)
                    .addComponent(jButtonDetalhesFornecedor1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1))
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
                .addContainerGap(377, Short.MAX_VALUE))
            .addComponent(CPF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getAccessibleContext().setAccessibleName("Tele de Cadastro de Cliente");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonExcluirFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirFornecedorActionPerformed
          if (jTableFornecedores.getSelectedRow() != -1){
              if(comfirmaSeDesejaExcluir()){
              Fornecedor fornecedor = new Fornecedor();
              fornecedor.setId((Integer) jTableFornecedores.getValueAt(jTableFornecedores.getSelectedRow(), 0));
              fornecedorDao.delete(fornecedor);
              carregaListFornecedores();
              JOptionPane.showMessageDialog(null,"Fornecedor excluido com sucesso.");
             } else {
               return;
             }
          }else {
              JOptionPane.showMessageDialog(null,"selecione um Fornecedor para excluir.");
          }
    }//GEN-LAST:event_jButtonExcluirFornecedorActionPerformed

     private boolean comfirmaSeDesejaExcluir() {
         int input = JOptionPane.showConfirmDialog(null, "Deseje realmente exluir esse cliente?", "Aviso", JOptionPane.YES_NO_OPTION);        
         if(input == 0){
           return  true; 
         } else {
           return false;  
         }  
    }
    
    private void jButtonEditarFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarFornecedorActionPerformed
        if (jTableFornecedores.getSelectedRow() != -1){
            this.dispose();           
          
            telaEditarFornecedor.carregaTelaEditarCliente((int) jTableFornecedores.getValueAt(jTableFornecedores.getSelectedRow(), 0));
            telaEditarFornecedor.setVisible(true);
          } else {
             JOptionPane.showMessageDialog(null,"selecione um Fornecedor para editar.");
        }
    }//GEN-LAST:event_jButtonEditarFornecedorActionPerformed

    private void jButtonDetalhesFornecedor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDetalhesFornecedor1ActionPerformed
            if (jTableFornecedores.getSelectedRow() != -1){
            this.dispose();           
          
            telaDetalheFornecedor.carregaTela((int) jTableFornecedores.getValueAt(jTableFornecedores.getSelectedRow(), 0));
            telaDetalheFornecedor.setVisible(true);
          } else {
             JOptionPane.showMessageDialog(null,"selecione um Fornecedor para visualizar detalhes.");
        }
    }//GEN-LAST:event_jButtonDetalhesFornecedor1ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaListaFornecedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaListaFornecedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaListaFornecedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaListaFornecedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaListaFornecedores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CPF;
    private javax.swing.JButton jButtonDetalhesFornecedor1;
    private javax.swing.JButton jButtonEditarFornecedor;
    private javax.swing.JButton jButtonExcluirFornecedor;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableFornecedores;
    // End of variables declaration//GEN-END:variables

    private void carregaListFornecedores() {
        DefaultTableModel modelo = (DefaultTableModel) jTableFornecedores.getModel(); 
        FornecedorDAOImp fornecedorDao = new FornecedorDAOImp();
        modelo.setNumRows(0);
        List<Fornecedor> fornecedores = fornecedorDao.findAll();        
        if(!fornecedores.isEmpty()) {
          for(Fornecedor f: fornecedores) {
            modelo.addRow(new Object[]{
            f.getId(),
            f.getCnpj(),
            f.getRazaoSocial(),
            f.getEndereco()
            });
         }
      }
    }
}
