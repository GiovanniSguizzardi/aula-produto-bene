package br.com.fiap.domain.view;
import br.com.fiap.domain.entity.Produto;
import javax.swing.*;
import java.math.BigDecimal;

public class ProdutoView {

    public Produto form(){
        String nome = JOptionPane.showInputDialog("Nome do Produto:");
        String descricao = JOptionPane.showInputDialog("Descrição do produto:");
        Double valor = Double.valueOf(JOptionPane.showInputDialog("Preço do Produto:"));

        return new Produto(nome, descricao, BigDecimal.valueOf(valor));
    }
}
