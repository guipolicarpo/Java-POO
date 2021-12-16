//Guilherme Policarpo de Carvalho

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class Agendar extends JFrame {
    Cabeleireira c1 = new Cabeleireira();
    Prestador cab = new Cabeleireira();
	
    JLabel p1, p2, p3, p4, p5;
    JLabel r0, r1, r2, r3, r4, r5, r6, r7, r8;
    JTextField t1, t2, t3, t4, t5, t6, t7, t8;
    JButton agendar, listar;

    Color minhaCor = new Color(97, 63, 117);
    
    public Agendar(){      
        super("Agendamento de horário");
        Container tela = getContentPane();
        getContentPane().setBackground(minhaCor);
        setSize(680,600);
        setLayout(null);

        ImageIcon icone = new ImageIcon("./logo.png");
        setIconImage(icone.getImage());

        p1= new JLabel (c1.getNome());
        p2= new JLabel (c1.getEndereco());
        p3= new JLabel (c1.getHoraInicio() + " |");
        p4= new JLabel (c1.getHoraFim());
        p5= new JLabel (c1.getContato());

        r0= new JLabel ("Preencha abaixo com os seus dados:");
        r1= new JLabel ("Nome completo: ");
        r2= new JLabel ("CPF: ");
        r3= new JLabel ("RG: ");
        r4= new JLabel ("Telefone: ");
        r5= new JLabel ("Endereço: ");
        r6= new JLabel ("Data: ");
        r7= new JLabel ("Horário: ");
        r8= new JLabel ("Nome acompanhante: ");

        p1.setBounds(50,10,300,20);
        p2.setBounds(280,10,300,20);
        p3.setBounds(50,30,300,20);
        p4.setBounds(110,30,300,20);
        p5.setBounds(280,30,300,20);

        p1.setForeground(Color.WHITE);
        p2.setForeground(Color.WHITE);
        p3.setForeground(Color.WHITE);
        p4.setForeground(Color.WHITE);
        p5.setForeground(Color.WHITE);
        r0.setForeground(Color.WHITE);
        r1.setForeground(Color.WHITE);
        r2.setForeground(Color.WHITE);
        r3.setForeground(Color.WHITE);
        r4.setForeground(Color.WHITE);
        r5.setForeground(Color.WHITE);
        r6.setForeground(Color.WHITE);
        r7.setForeground(Color.WHITE);
        r8.setForeground(Color.WHITE);

        p1.setFont(new Font("Roboto", Font.BOLD, 18));
        p2.setFont(new Font("Roboto", Font.BOLD, 18));
        p3.setFont(new Font("Roboto", Font.BOLD, 18));
        p4.setFont(new Font("Roboto", Font.BOLD, 18));
        p5.setFont(new Font("Roboto", Font.BOLD, 18));
        r0.setFont(new Font("Roboto", Font.BOLD, 16));

        r0.setBounds(50,90,300,20);
        r1.setBounds(50,130,300,20);
        r2.setBounds(50,170,300,20);
        r3.setBounds(50,210,300,20);
        r4.setBounds(50,250,300,20);
        r5.setBounds(50,290,300,20);
        r6.setBounds(50,330,300,20);
        r7.setBounds(50,370,300,20);
        r8.setBounds(50,410,300,20);

        p1.setVisible(true);
        p2.setVisible(true);
        p3.setVisible(true);
        p4.setVisible(true);
        p5.setVisible(true);

        r0.setVisible(true);
        r1.setVisible(true);
        r2.setVisible(true);
        r3.setVisible(true);
        r4.setVisible(true);
        r5.setVisible(true);
        r6.setVisible(true);
        r7.setVisible(true);
        r8.setVisible(true);

        t1= new JTextField(10);
        t2= new JTextField(10);
        t3= new JTextField(10);
        t4= new JTextField(10);
        t5= new JTextField(10);
        t6= new JTextField(10);
        t7= new JTextField(10);
        t8= new JTextField(10);

        t1.setBounds(190, 130,300,20);
        t2.setBounds(190, 170,150,20);
        t3.setBounds(190, 210,150,20);
        t4.setBounds(190, 250,150,20);
        t5.setBounds(190, 290,300,20);
        t6.setBounds(190, 330,150,20);
        t7.setBounds(190, 370,150,20);
        t8.setBounds(190, 410,300,20);

        t1.setVisible(true);
        t2.setVisible(true);
        t3.setVisible(true);
        t4.setVisible(true);
        t5.setVisible(true);
        t6.setVisible(true);
        t7.setVisible(true);
        t8.setVisible(true);


        agendar = new JButton("Agendar");
        listar = new JButton("Listar Agendamentos");

        agendar.setVisible(true);
        listar.setVisible(true);

        agendar.setBounds(120, 500, 200, 30);
        listar.setBounds(340, 500, 200, 30);

        agendar.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        String arquivo = "dados.txt";
                        String separador = ";";
                        
                        try {
                            FileWriter fw = new FileWriter( arquivo, true );
                            BufferedWriter bw = new BufferedWriter( fw );

                            bw.write( t1.getText() );
                            bw.write(separador);
                            bw.write( t2.getText() );
                            bw.write(separador);
                            bw.write( t3.getText() );
                            bw.write(separador);
                            bw.write( t4.getText() );
                            bw.write(separador);
                            bw.write( t5.getText() );
                            bw.write(separador);
                            bw.write( t6.getText() );
                            bw.write(separador);
                            bw.write( t7.getText() );
                            bw.write(separador);
                            bw.write( t8.getText() );
                            bw.newLine();

                            bw.close();
                            fw.close();

                            JOptionPane.showMessageDialog(null,"Agendado!\n " + cab.Agendado());

                            t1.setText("");
                            t2.setText("");
                            t3.setText("");
                            t4.setText("");
                            t5.setText("");
                            t6.setText("");
                            t7.setText("");
                            t8.setText("");


                        }catch(IOException ex){
                            JOptionPane.showMessageDialog(null,"Erro!\n Arquivo!");
                        }
                    }
                }
        );

        listar.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e){
                        Lista lista = new Lista();
                        lista.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                    }
                }
        );

        tela.add(p1);
        tela.add(p2);
        tela.add(p3);
        tela.add(p4);
        tela.add(p5);

        tela.add(r0);
        tela.add(r1);
        tela.add(r2);
        tela.add(r3);
        tela.add(r4);
        tela.add(r5);
        tela.add(r6);
        tela.add(r7);
        tela.add(r8);

        tela.add(t1);
        tela.add(t2);
        tela.add(t3);
        tela.add(t4);
        tela.add(t5);
        tela.add(t6);
        tela.add(t7);
        tela.add(t8);

        tela.add(agendar);
        tela.add(listar);
        
        setLocationRelativeTo(null);
        setVisible(true);

    }
    
    public static void main(String args[]){
        Agendar app = new Agendar();
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
