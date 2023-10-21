/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VIEWS;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import BEAN.LeitoresVc;
/**
 *
 * @author vivic
 */
public class LeitoresVcControle extends AbstractTableModel{
     private List lista;
    
    public void setList(List lista) {
        this.lista = lista;
        this.fireTableDataChanged();
        
    }
    
    public LeitoresVc getBean(int linha) {
        return (LeitoresVc) lista.get(linha);
        //M.P R.NúmLinha 
          
    }
    
    @Override
    public int getRowCount() {
        return lista.size();
       
    }

    @Override
    public int getColumnCount() {
        return 4;
        
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        
        LeitoresVc leitoresVc = (LeitoresVc) lista.get(rowIndex);
         
        if (columnIndex == 0) {
       
            return leitoresVc.getIdleitoresVc();
        }
        if (columnIndex == 1) {
            return leitoresVc.getNomeLeitorVc();
        }
        if (columnIndex == 2) {
            return leitoresVc.getEmailVc();
        }
        if (columnIndex == 3) {
            return leitoresVc.getNumeroCartaoBibliotecaVc();
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
            return "Email";
        }
        if (columnIndex == 3) {
            return "N°Cartão Biblioteca";
        }
        return "";
    }
}

