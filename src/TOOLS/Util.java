/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TOOLS;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author vivic
 */
public class Util {
    //... varios argumentos varArdis
    //JComponent => arvore de deveração polimosfismo = pai do setEnable
    //vetComp => vetor 
    //for => componentes 
    //laço para percorrer o os componentes do vetor 
     public static void habilitar(boolean valor, JComponent ... vetComp){
        for (int i = 0; i < vetComp.length; i++){
            vetComp[i].setEnabled(valor);
        }
   
     }
     
     public static void limparCampos(JComponent ... vetComp) {
         // pega cada volor // elemento/índice do vetor "vetComp" do tipo "JComponent" e joga para o "componente"
         for (JComponent componente : vetComp) {
             
             //O componente não conhece o setText, então fazemos a comversão // tranformamos o componente em JTextField // agora ele conhece 
             
             if (componente instanceof JTextField){
             // pergunta do prof - O componente hj vc é um JComponent e como vc era antes? ai ele usa o instanceof e prova sua inocencia
             //os if são as salinhas do JComponent
             ((JTextField) componente).setText("");
         
         }
             
              if (componente instanceof JComboBox){
                  ((JComboBox) componente).setSelectedIndex(-1);
              }
             
              if (componente instanceof JComboBox){
                  ((JComboBox) componente).setSelectedIndex(-1);
              }
              
              if (componente instanceof JCheckBox){
                  ((JCheckBox) componente).setSelected(false);
              }
              
         }
     
     }
     
     
  
    
     //cadeia de caracter
     public static void mensagem(String cadeia){
           JOptionPane.showMessageDialog(null, cadeia);
     }
     
     public static boolean perguntar (String cadeia){
          int resp = JOptionPane.showConfirmDialog(null, cadeia, "Perguntar", JOptionPane.YES_NO_OPTION);
          return resp == JOptionPane.YES_OPTION;
           
     }
       
     
     public static int strInt(String cad){
           return Integer.valueOf(cad);
     }
     
     public static String intStr(int num){
           return String.valueOf(num);
     }
     
      public static String doubleStr(double num){
           return String.valueOf(num);
     }
      
     public static double strDouble(String cad){
           return Integer.valueOf(cad);
     }
      
       public static Date strDate(String cad){
           SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
           try {
               return formato.parse(cad);
           
           } catch (ParseException ex){
               Logger.getLogger(Util.class.getName()).log(Level.SEVERE, null, ex);
           }
           return null;
     }
       
        public static String dateStr (Date num){
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
           return formato.format(num);
     }
     
}
