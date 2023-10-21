/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VIEWS;

import BEAN.GenerosVc;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author vivic
 */
public class GenerosVcControle  extends AbstractTableModel{//classe Usuario Controle
     private List lista;//var
    
    public void setList(List lista) {
        this.lista = lista;
        // Método=> recebe lista como argumento = a var lista
       // this.fireTableDataChanged();
        
    }
    
    public GenerosVc getBean(int linha) {
        return (GenerosVc) lista.get(linha);
        //M.P R.NúmLinha 
       // retorna o objeto Usuario correspondente numero de linha na lista.    
    }
    
    @Override
    public int getRowCount() {
        return lista.size();
        //retorna o número de linhas da tabela
    }

    @Override
    public int getColumnCount() {
        return 4;
        //número de colunas 
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        //retorna o valor a ser exibido em uma célula específica da tabela
        GenerosVc generosVc = (GenerosVc) lista.get(rowIndex);
        // número da linha (rowIndex) 
        if (columnIndex == 0) {
       // número da coluna (columnIndex)
            return generosVc.getIdgenerosVc();
        }
        if (columnIndex == 1) {
            return generosVc.getNomeVc();
        }
        if (columnIndex == 2) {
            return generosVc.getAnoOrigemVc();
        }
        if (columnIndex == 3) {
            return generosVc.getNotasVc();
        }
        return "";
    }
    
    @Override
    public String getColumnName(int columnIndex) {
        if (columnIndex == 0) {
            return "ID";
        }
        if (columnIndex == 1) {
            return "Nome";
        }
        if (columnIndex == 2) {
            return "Ano de origem";
        }
        if (columnIndex == 3) {
            return "Notas";
        }
        return "";
    }
}
