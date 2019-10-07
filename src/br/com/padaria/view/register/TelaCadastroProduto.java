package br.com.padaria.view.register;

import br.com.padaria.dao.FornecedorDAOImp;
import br.com.padaria.model.Fornecedor;
import br.com.padaria.model.Produto;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author luisp
 */
public class TelaCadastroProduto extends javax.swing.JFrame {
    
    Produto produto = new Produto();

    private FornecedorDAOImp fornecedorDao;
        
    /**
     * Creates new form TelaCadastroProduto
     */
    public TelaCadastroProduto() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jLabel1 = new javax.swing.JLabel();
        jPanelPrincipal = new javax.swing.JPanel();
        labelNome = new java.awt.Label();
        textFieldNomeProduto = new java.awt.TextField();
        labelCodigo = new java.awt.Label();
        textFieldCodigoProduto = new java.awt.TextField();
        jLabel2 = new javax.swing.JLabel();
        jLabelPrecoCusto = new javax.swing.JLabel();
        jLabelPrecoFinal = new javax.swing.JLabel();
        jRadioButtonPerecivel = new javax.swing.JRadioButton();
        labelDataValidade = new java.awt.Label();
        textFieldApelidoProduto = new java.awt.TextField();
        labelApelido = new java.awt.Label();
        jFormattedTextDataValidade = new javax.swing.JFormattedTextField();
        jComboBoxFornecedor = new javax.swing.JComboBox();
        jFormattedTextPrecoFinal = new javax.swing.JFormattedTextField();
        jFormattedTextFieldPrecoCusto = new javax.swing.JFormattedTextField();
        jButtonFechar = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tela de Cadastro de Produto");
        setResizable(false);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/produto.png"))); // NOI18N

        jPanelPrincipal.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Cadastro Produto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 12))); // NOI18N
        jPanelPrincipal.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jPanelPrincipal.setPreferredSize(new java.awt.Dimension(630, 252));

        labelNome.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        labelNome.setText("Nome");

        textFieldNomeProduto.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        labelCodigo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        labelCodigo.setText("Código");

        textFieldCodigoProduto.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setText("Fornecedor");

        jLabelPrecoCusto.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelPrecoCusto.setText("Preço de Custo");

        jLabelPrecoFinal.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelPrecoFinal.setText("Preço Final");

        jRadioButtonPerecivel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jRadioButtonPerecivel.setText("Perecível");

        labelDataValidade.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        labelDataValidade.setText("Data de Validade");

        textFieldApelidoProduto.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        labelApelido.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        labelApelido.setText("Apelido");

        jComboBoxFornecedor.setSelectedItem(new FornecedorDAOImp().findAll());

        org.jdesktop.beansbinding.ELProperty eLProperty = org.jdesktop.beansbinding.ELProperty.create("${selectedItem}");
        org.jdesktop.swingbinding.JComboBoxBinding jComboBoxBinding = org.jdesktop.swingbinding.SwingBindings.createJComboBoxBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jComboBoxFornecedor, eLProperty, jComboBoxFornecedor);
        bindingGroup.addBinding(jComboBoxBinding);

        jComboBoxFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxFornecedorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelPrincipalLayout = new javax.swing.GroupLayout(jPanelPrincipal);
        jPanelPrincipal.setLayout(jPanelPrincipalLayout);
        jPanelPrincipalLayout.setHorizontalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                        .addComponent(jRadioButtonPerecivel)
                        .addGap(33, 33, 33)
                        .addComponent(labelDataValidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFormattedTextDataValidade, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(textFieldNomeProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(textFieldApelidoProduto, javax.swing.GroupLayout.DEFAULT_SIZE, 578, Short.MAX_VALUE)
                        .addComponent(jComboBoxFornecedor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                            .addComponent(jLabelPrecoCusto)
                            .addGap(44, 44, 44)
                            .addComponent(jLabelPrecoFinal))
                        .addComponent(jLabel2)
                        .addComponent(labelCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelNome, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelApelido, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                            .addComponent(jFormattedTextFieldPrecoCusto, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(28, 28, 28)
                            .addComponent(jFormattedTextPrecoFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(textFieldCodigoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanelPrincipalLayout.setVerticalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(textFieldNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelApelido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(textFieldApelidoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(textFieldCodigoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBoxFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPrecoCusto)
                    .addComponent(jLabelPrecoFinal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jFormattedTextPrecoFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextFieldPrecoCusto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jRadioButtonPerecivel)
                    .addComponent(labelDataValidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextDataValidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(119, Short.MAX_VALUE))
        );

        jButtonFechar.setText("Fechar");
        jButtonFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFecharActionPerformed(evt);
            }
        });

        jButtonSalvar.setText("Salvar");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 636, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jButtonSalvar)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonFechar)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(368, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSalvar)
                    .addComponent(jButtonFechar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE))
        );

        bindingGroup.bind();

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
       try {
        if(!validaPreenchimentoFormulario()){
          preencheDadosProduto();  
        }
       } catch(Exception e){           
         e.printStackTrace();
       }
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFecharActionPerformed
       this.dispose();
    }//GEN-LAST:event_jButtonFecharActionPerformed

    private void jComboBoxFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxFornecedorActionPerformed
        getListFornecedor();       
    }//GEN-LAST:event_jComboBoxFornecedorActionPerformed

    private Produto preencheDadosProduto() throws ParseException {        
       produto.setNome(textFieldNomeProduto.getText());
       produto.setApelido(textFieldApelidoProduto.getText());
       produto.setCodigo(textFieldCodigoProduto.getText());
       DateFormat formatter = new SimpleDateFormat("MM/dd/yy");
       Date date = (Date)formatter.parse(jFormattedTextDataValidade.getText());
       produto.setDataValidade(date);
       produto.setPrecoCusto(Double.valueOf(jFormattedTextFieldPrecoCusto.getText()));
       produto.setPrecoFinal(Double.valueOf(jFormattedTextPrecoFinal.getText()));
       
       return produto;
    
    }          
            
      private boolean validaPreenchimentoFormulario() {
         if(textFieldNomeProduto.getText().isEmpty()) {
           JOptionPane.showMessageDialog(null,"Informe o nome do Produto.");
           return true;
       }
       if(textFieldApelidoProduto.getText().isEmpty()) {
          JOptionPane.showMessageDialog(null,"Informe o apelido do Produto. ");
          return true;
       } 
       if(textFieldCodigoProduto.getText().isEmpty()) {
          JOptionPane.showMessageDialog(null,"Informe o codigo do Produto.");
          return true;
       }        
       if(jFormattedTextDataValidade.getText().isEmpty()) {
          JOptionPane.showMessageDialog(null,"Informe o data Validade do Produto.");
          return true;
       }        
       if(jFormattedTextFieldPrecoCusto.getText().isEmpty()) {
          JOptionPane.showMessageDialog(null,"Informe o Preco de Custo do Produto.");
          return true;
       }
        if(jFormattedTextPrecoFinal.getText().isEmpty()) {
          JOptionPane.showMessageDialog(null,"Informe o Preco Final do Produto.");
          return true;
       }        
       return false;
    }    
      
      
    private void limpparCampos() {
       textFieldNomeProduto.setText(null);
       textFieldApelidoProduto.setText(null);
       textFieldCodigoProduto.setText(null);
       jFormattedTextDataValidade.setText(null);
       jFormattedTextFieldPrecoCusto.setText(null);
       jFormattedTextPrecoFinal.setText(null);    
       
    }
    
    public List<Fornecedor> getListFornecedor (){
       return new FornecedorDAOImp().findAll();
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonFechar;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JComboBox jComboBoxFornecedor;
    private javax.swing.JFormattedTextField jFormattedTextDataValidade;
    private javax.swing.JFormattedTextField jFormattedTextFieldPrecoCusto;
    private javax.swing.JFormattedTextField jFormattedTextPrecoFinal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelPrecoCusto;
    private javax.swing.JLabel jLabelPrecoFinal;
    private javax.swing.JPanel jPanelPrincipal;
    private javax.swing.JRadioButton jRadioButtonPerecivel;
    private java.awt.Label labelApelido;
    private java.awt.Label labelCodigo;
    private java.awt.Label labelDataValidade;
    private java.awt.Label labelNome;
    private java.awt.TextField textFieldApelidoProduto;
    private java.awt.TextField textFieldCodigoProduto;
    private java.awt.TextField textFieldNomeProduto;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
