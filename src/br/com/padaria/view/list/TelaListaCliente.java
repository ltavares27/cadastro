package br.com.padaria.view.list;

import br.com.padaria.dao.ClienteDAOImp;
import br.com.padaria.model.Cliente;
import br.com.padaria.view.Edit.TelaEditarCliente;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author luisp
 */
public class TelaListaCliente extends javax.swing.JFrame {
    
    private TelaEditarCliente telaEditarCliente =  new TelaEditarCliente();
    /**
     * Creates new form TelaCadastroFuncionario
     */
    public TelaListaCliente() {
        initComponents();
        DefaultTableModel modelo = (DefaultTableModel) jTableCliente.getModel(); 
        jTableCliente.setRowSorter(new TableRowSorter(modelo));
        carregaListClientes();
    }
  
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
        jButtonDetalhesCliente = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCliente = new javax.swing.JTable();
        jButtonEditar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        jMenu3.setText("jMenu3");

        jMenu4.setText("jMenu4");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tela de Clientes");
        setResizable(false);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cliente.png"))); // NOI18N

        CPF.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Clientes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 12))); // NOI18N
        CPF.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jButtonDetalhesCliente.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonDetalhesCliente.setText("Detalhes");
        jButtonDetalhesCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDetalhesClienteActionPerformed(evt);
            }
        });

        jTableCliente.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTableCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "CPF", "Nome", "Tipo Fidelidade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableCliente);
        if (jTableCliente.getColumnModel().getColumnCount() > 0) {
            jTableCliente.getColumnModel().getColumn(0).setPreferredWidth(1);
            jTableCliente.getColumnModel().getColumn(1).setPreferredWidth(1);
        }

        jButtonEditar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonEditar.setText("Editar");
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });

        jButtonExcluir.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonExcluir.setText("Excluir");
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CPFLayout = new javax.swing.GroupLayout(CPF);
        CPF.setLayout(CPFLayout);
        CPFLayout.setHorizontalGroup(
            CPFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CPFLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonEditar)
                .addGap(18, 18, 18)
                .addComponent(jButtonDetalhesCliente)
                .addGap(18, 18, 18)
                .addComponent(jButtonExcluir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 626, Short.MAX_VALUE)
        );
        CPFLayout.setVerticalGroup(
            CPFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CPFLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(CPFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonDetalhesCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonEditar)
                    .addComponent(jButtonExcluir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(CPF, javax.swing.GroupLayout.PREFERRED_SIZE, 532, Short.MAX_VALUE)))
        );

        getAccessibleContext().setAccessibleName("Tele de Cadastro de Cliente");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonDetalhesClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDetalhesClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonDetalhesClienteActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
          if(jTableCliente.getSelectedRow() != -1) {                   
            if (comfirmaSeDesejaExcluir()){
                Cliente cliente = new Cliente();
                ClienteDAOImp dao = new ClienteDAOImp();

                cliente.setId((Integer) jTableCliente.getValueAt(jTableCliente.getSelectedRow(), 0));
                dao.delete(cliente);
                carregaListClientes();
                JOptionPane.showMessageDialog(null,"Cliente deletado com sucesso.");
           } else {
             return;   
           }
        } else {
             JOptionPane.showMessageDialog(null,"selecione um cliente para excluir.");
        }
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
          if (jTableCliente.getSelectedRow() != -1){
            this.dispose();           
          
           telaEditarCliente.carregaTelaEditarCliente((int) jTableCliente.getValueAt(jTableCliente.getSelectedRow(), 0));
           telaEditarCliente.setVisible(true);
          } else {
             JOptionPane.showMessageDialog(null,"selecione um cliente para editar.");
        }
    }//GEN-LAST:event_jButtonEditarActionPerformed

      private boolean comfirmaSeDesejaExcluir() {
         int input = JOptionPane.showConfirmDialog(null, "Deseje realmente exluir esse cliente?");
         if(input == 0){
           return  true; 
         } else {
           return false;  
         }  
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
             try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaListaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaListaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaListaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaListaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
  

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaListaCliente().setVisible(true);
            }
        });
    }
    
    public void carregaListClientes(){
        DefaultTableModel modelo = (DefaultTableModel) jTableCliente.getModel(); 
        modelo.setNumRows(0);
        ClienteDAOImp dao = new ClienteDAOImp();
        
        List<Cliente> clientes = dao.findAll();        
        if(!clientes.isEmpty()) {
          for(Cliente c: clientes) {
            modelo.addRow(new Object[]{
            c.getId(),
            c.getCpf(),
            c.getNome(),
            c.getTipoCartaoFidelidade() !=  null ? c.getTipoCartaoFidelidade().getNome() : "---"
            });
         }
      }       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CPF;
    private javax.swing.JButton jButtonDetalhesCliente;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableCliente;
    // End of variables declaration//GEN-END:variables

       
}
