/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atvdparcial;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ProdutoDAO {
     Connection conexao;
     PreparedStatement pstm;
     ResultSet rs;
     ArrayList<ProdutoDTO> lista = new ArrayList<>();
     
    public void novoDesc(ProdutoDTO objprodutodto) throws ClassNotFoundException{
  
       String sql = "insert into produto values (null,?,?,null)";
       
         try {
             conexao = conect.getConnection();
             pstm = conn.prepareStatement(sql);
             pstm.setString(1, objprodutodto.getNome_Produto());
             pstm.setString(2, objprodutodto.getDescricao_Produto());
             
             
             pstm.execute();
             pstm.close();
             
         } catch (SQLException erro) {
              JOptionPane.showMessageDialog(null,"Erro ao inserir dados"+ erro.getMessage());
         }
         
        
    }
    
        public ArrayList<ProdutoDTO> PesquisarProduto() throws ClassNotFoundException{
            
            String sql = "select * from produto";
            conexao = conect.getConnection();

            try{
             pstm = conexao.prepareStatement(sql);
             rs = pstm.executeQuery();

                 while(rs.next()){
                     ProdutoDTO objprodutodto = new ProdutoDTO();
                     objprodutodto.setId_Produto(rs.getInt("id"));
                     objprodutodto.setNome_Produto(rs.getString("nome"));
                     objprodutodto.setDescricao_Produto(rs.getString("descricao"));
                     
                     
                     lista.add(objprodutodto);
                 }             
             
             pstm.close();
                
            }catch(SQLException erro){
            JOptionPane.showMessageDialog(null,"Erro ao listar dados"+ erro.getMessage());
            }
            return lista;
        }
    
        public void upDesc(ProdutoDTO objprodutodto) throws ClassNotFoundException{
  
       String sql = "UPDATE produto SET nome = ?,descricao = ? WHERE id = ?";     
         try {
             conexao = conect.getConnection();
             pstm = conexao.prepareStatement(sql);
             pstm.setString(1, objprodutodto.getNome_Produto());
             pstm.setString(2, objprodutodto.getDescricao_Produto());
             pstm.setInt(3, objprodutodto.getId_Produto());
             
             
             pstm.execute();
             pstm.close();
             
         } catch (SQLException erro) {
              JOptionPane.showMessageDialog(null,"Erro ao atualizar dados"+ erro.getMessage());
         }
         
        
    }
        
       public void deleteDesc(ProdutoDTO objprodutodto) throws ClassNotFoundException{
       
        conexao = conect.getConnection();
       String sql = "delete from produto WHERE id = ?";     
       
         try {
             
             pstm = conexao.prepareStatement(sql);
         
             pstm.setInt(1, objprodutodto.getId_Produto());
             
             
             pstm.execute();
             pstm.close();
             
         } catch (SQLException erro) {
              JOptionPane.showMessageDialog(null,"Erro ao deletar dados"+ erro.getMessage());
         }
        
    }
    
}
