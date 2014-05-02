package vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;

public class Ventana extends javax.swing.JFrame {

    public Ventana() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Ventana.class.getResource("/imagenes/icono.png")));
        initComponents();
    }

    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        casilla1 = new javax.swing.JButton();
		casilla1.setForeground(Color.BLACK);
        casilla2 = new javax.swing.JButton();
        casilla3 = new javax.swing.JButton();
        casilla4 = new javax.swing.JButton();
        casilla5 = new javax.swing.JButton();
        casilla6 = new javax.swing.JButton();
        casilla7 = new javax.swing.JButton();
        casilla8 = new javax.swing.JButton();
        casilla9 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new java.awt.GridLayout(3, 3));

		casilla1.setFont(new Font("Arial", Font.BOLD, 40));
        casilla1.setPreferredSize(new java.awt.Dimension(150, 150));
        jPanel1.add(casilla1);

		casilla2.setFont(new Font("Arial", Font.BOLD, 40));
        casilla2.setPreferredSize(new java.awt.Dimension(150, 150));
        jPanel1.add(casilla2);

		casilla3.setFont(new Font("Arial", Font.BOLD, 40));
        casilla3.setPreferredSize(new java.awt.Dimension(150, 150));
        jPanel1.add(casilla3);

		casilla4.setFont(new Font("Arial", Font.BOLD, 40));
        casilla4.setPreferredSize(new java.awt.Dimension(150, 150));
        jPanel1.add(casilla4);

		casilla5.setFont(new Font("Arial", Font.BOLD, 40));
        casilla5.setPreferredSize(new java.awt.Dimension(150, 150));
        jPanel1.add(casilla5);

		casilla6.setFont(new Font("Arial", Font.BOLD, 40));
        casilla6.setPreferredSize(new java.awt.Dimension(150, 150));
        jPanel1.add(casilla6);

		casilla7.setFont(new Font("Arial", Font.BOLD, 40));
        casilla7.setPreferredSize(new java.awt.Dimension(150, 150));
        jPanel1.add(casilla7);

		casilla8.setFont(new Font("Arial", Font.BOLD, 40));
        casilla8.setPreferredSize(new java.awt.Dimension(150, 150));
        jPanel1.add(casilla8);

		casilla9.setFont(new Font("Arial", Font.BOLD, 40));
        casilla9.setPreferredSize(new java.awt.Dimension(150, 150));
        jPanel1.add(casilla9);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
	}

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    public javax.swing.JButton casilla1;
    public javax.swing.JButton casilla2;
    public javax.swing.JButton casilla3;
    public javax.swing.JButton casilla4;
    public javax.swing.JButton casilla5;
    public javax.swing.JButton casilla6;
    public javax.swing.JButton casilla7;
    public javax.swing.JButton casilla8;
    public javax.swing.JButton casilla9;
    private javax.swing.JPanel jPanel1;


}
