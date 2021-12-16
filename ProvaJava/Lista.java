//Guilherme Policarpo de Carvalho

import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Lista extends JFrame {
	
    JTable tabela;

    Color minhaCor = new Color(97, 63, 117);

    public Lista(){
        super("Listar Agendamentos");
        Container tela = getContentPane();
        getContentPane().setBackground(minhaCor);
        setSize(1000,600);
        setLayout(null);

        ImageIcon icone = new ImageIcon("./logo.png");
        setIconImage(icone.getImage());
        
        String arquivo = "dados.txt";
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Nome Completo");
        modelo.addColumn("CPF");
        modelo.addColumn("RG");
        modelo.addColumn("Telefone");
        modelo.addColumn("Endereço");
        modelo.addColumn("Data Agendamento");
        modelo.addColumn("Horário Agendamento");
        modelo.addColumn("Nome Acompanhante");

        try{
            FileReader fr = new FileReader(arquivo);
            BufferedReader br = new BufferedReader(fr);

            while (br.ready()) {
                String linha = br.readLine();
                modelo.addRow(linha.split(";"));
            }
            br.close();
            fr.close();

        } catch (IOException ex) {
            ex.printStackTrace();
        }


        tabela = new JTable(modelo);
        tabela.setBorder(new LineBorder(Color.black));
        tabela.setGridColor(Color.black);
        tabela.setShowGrid(true);

        tabela.getColumnModel().getColumn(0).setPreferredWidth(200);
        tabela.getColumnModel().getColumn(1).setPreferredWidth(100);
        tabela.getColumnModel().getColumn(2).setPreferredWidth(100);
        tabela.getColumnModel().getColumn(3).setPreferredWidth(100);
        tabela.getColumnModel().getColumn(4).setPreferredWidth(200);
        tabela.getColumnModel().getColumn(5).setPreferredWidth(100);
        tabela.getColumnModel().getColumn(6).setPreferredWidth(100);
        tabela.getColumnModel().getColumn(7).setPreferredWidth(200);

        JScrollPane scroll = new JScrollPane();
        scroll.getViewport().setBorder(null);
        scroll.getViewport().add(tabela);
        scroll.setSize(1000, 700);

        tela.add(scroll);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
