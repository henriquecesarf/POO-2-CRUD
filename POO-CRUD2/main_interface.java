/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package atvdparcial;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class main_interface extends javax.swing.JFrame {

    public main_interface() {
        initComponents();
        listarProduto();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_new = new javax.swing.JButton();
        Label1 = new javax.swing.JLabel();
        LaberTxt_Name = new javax.swing.JTextField();
        Label3 = new javax.swing.JLabel();
        jtb_Button_Up = new javax.swing.JButton();
        Button_Delet = new javax.swing.JButton();
        Scroll_Panel = new javax.swing.JScrollPane();
        tab = new javax.swing.JTable();
        Text_ID = new javax.swing.JTextField();
        Label2 = new javax.swing.JLabel();
        Text_desc = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_new.setText("Novo");
        btn_new.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_newMouseClicked(evt);
            }
        });
        btn_new.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_newActionPerformed(evt);
            }
        });

        Label1.setText("nome:");

        LaberTxt_Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LaberTxt_NameActionPerformed(evt);
            }
        });

        Label3.setText("Descricao:");

        jtb_Button_Up.setText("Atualizar");
        jtb_Button_Up.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtb_Button_UpMouseClicked(evt);
            }
        });
        jtb_Button_Up.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtb_Button_UpActionPerformed(evt);
            }
        });

        Button_Delet.setText("Excluir");
        Button_Delet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button_DeletMouseClicked(evt);
            }
        });

        tab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6"
            }
        ));
        Scroll_Panel.setViewportView(tab);

        Text_ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Text_IDActionPerformed(evt);
            }
        });

        Label2.setText("ID:");

        Text_desc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Text_descActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Label3)
                            .addComponent(Label1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Text_desc)
                            .addComponent(LaberTxt_Name, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE))
                        .addGap(57, 57, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(Label2)
                                .addGap(29, 29, 29))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btn_new)
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtb_Button_Up, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Text_ID))
                        .addGap(18, 18, 18)
                        .addComponent(Button_Delet))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(Scroll_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label1)
                    .addComponent(LaberTxt_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Text_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Label2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label3)
                    .addComponent(btn_new)
                    .addComponent(jtb_Button_Up)
                    .addComponent(Button_Delet)
                    .addComponent(Text_desc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Scroll_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_newMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_newMouseClicked
    
    inserirProduto();
    listarProduto();
    }//GEN-LAST:event_btn_newMouseClicked

    private void LaberTxt_NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LaberTxt_NameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LaberTxt_NameActionPerformed

    private void jtb_Button_UpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtb_Button_UpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtb_Button_UpActionPerformed

    private void jtb_Button_UpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtb_Button_UpMouseClicked
        
        try {
            upProduto();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(main_interface.class.getName()).log(Level.SEVERE, null, ex);
        }
        listarProduto();
    }//GEN-LAST:event_jtb_Button_UpMouseClicked

    private void btn_newActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_newActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_newActionPerformed

    private void Text_IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Text_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Text_IDActionPerformed

    private void Button_DeletMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_DeletMouseClicked
    
        try {
            delProduto();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(main_interface.class.getName()).log(Level.SEVERE, null, ex);
        }
        listarProduto();
    }//GEN-LAST:event_Button_DeletMouseClicked

    private void Text_descActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Text_descActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Text_descActionPerformed

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
            java.util.logging.Logger.getLogger(main_interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main_interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main_interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main_interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main_interface().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_Delet;
    private javax.swing.JLabel Label1;
    private javax.swing.JLabel Label2;
    private javax.swing.JLabel Label3;
    private javax.swing.JScrollPane Scroll_Panel;
    private javax.swing.JButton btn_new;
    private javax.swing.JButton jtb_Button_Up;
    private javax.swing.JTable tab;
    private javax.swing.JTextField Text_desc;
    private javax.swing.JTextField Text_ID;
    private javax.swing.JTextField LaberTxt_Name;
    // End of variables declaration//GEN-END:variables

    private void listarProduto(){
        try{
            ProdutoDAO objprodutodao = new ProdutoDAO();
            
            DefaultTableModel model = (DefaultTableModel) tab.getModel();
            model.setNumRows(0);
            
            ArrayList<ProdutoDTO> lista = objprodutodao.PesquisarProduto();
            
            for(int num = 0; num < lista.size(); num ++){
                model.addRow(new Object[]{
                    lista.get(num).getId_Produto(),
                    lista.get(num).getNome_Produto(),
                    lista.get(num).getDescricao_Produto()
                    
                });
            }
        }catch(Exception erro){
            JOptionPane.showMessageDialog(null,"Erro ao listar dados"+ erro.getMessage());
        }
    }
    
    private void inserirProduto(){
            try {
                
            String nome;
            String descricao;
            
            nome = LaberTxt_Name.getText();
            descricao = Text_desc.getText();
            
            
            ProdutoDTO objprodutodto = new ProdutoDTO();
            
            objprodutodto.setNome_Produto(nome);
            objprodutodto.setDescricao_Produto(descricao);
            
           
            ProdutoDAO objprodutodao = new ProdutoDAO();
            objprodutodao.novoDesc(objprodutodto);
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(main_interface.class.getName()).log(Level.SEVERE, null, ex);
           }
        listarProduto();
     }
    
    private void upProduto() throws ClassNotFoundException{
        
        int id;
        String nome;
        String descricao;
        
        id = Integer.parseInt(Text_ID.getText());
        nome = LaberTxt_Name.getText();
        descricao = Text_desc.getText();
        
        ProdutoDTO objprodutodto = new ProdutoDTO();
        objprodutodto.setId_Produto(id);
        objprodutodto.setNome_Produto(nome);
        objprodutodto.setDescricao_Produto(descricao);
                
        ProdutoDAO objprodutodao = new ProdutoDAO();
        objprodutodao.upDesc(objprodutodto);
        
        
    }
    
    private void delProduto() throws ClassNotFoundException{
        int id;
        id = Integer.parseInt(Text_ID.getText());
        
        ProdutoDTO objprodutodto = new ProdutoDTO();
        objprodutodto.setId_Produto(id);
        
        ProdutoDAO objprodutodao = new ProdutoDAO();
        objprodutodao.deleteDesc(objprodutodto);
        
    }
    
}
