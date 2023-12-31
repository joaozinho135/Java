package pkApresentacao;

import javax.swing.JOptionPane;
import pkBanco.FlorDAO;
import pkModelo.Flor;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */

/**
 *
 * @author Jason
 */
public class CadastrarFlor extends javax.swing.JInternalFrame {

    /**
     * Creates new form CadastrarCliente
     */
    public CadastrarFlor() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblCpf = new javax.swing.JLabel();
        txtEspecie = new javax.swing.JTextField();
        lblIdade = new javax.swing.JLabel();
        txtValor = new javax.swing.JTextField();
        btnCadastrar = new javax.swing.JButton();
        btnFechar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuArquivo = new javax.swing.JMenu();
        itemCadastrar = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem1 = new javax.swing.JMenuItem();

        lblNome.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblNome.setText("Nome:");

        txtNome.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        lblCpf.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblCpf.setText("Espécie:");

        txtEspecie.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        lblIdade.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblIdade.setText("Valor:");

        txtValor.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        btnCadastrar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnFechar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnFechar.setText("Fechar");
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });

        menuArquivo.setText("Arquivo");

        itemCadastrar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_DOWN_MASK));
        itemCadastrar.setText("Cadastrar");
        itemCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCadastrarActionPerformed(evt);
            }
        });
        menuArquivo.add(itemCadastrar);
        menuArquivo.add(jSeparator1);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.ALT_DOWN_MASK));
        jMenuItem1.setText("Fechar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        menuArquivo.add(jMenuItem1);

        jMenuBar1.add(menuArquivo);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblNome)
                                    .addComponent(lblIdade)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(lblCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNome, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE)
                            .addComponent(txtEspecie)
                            .addComponent(txtValor)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(btnCadastrar)
                        .addGap(80, 80, 80)
                        .addComponent(btnFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNome))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCpf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIdade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrar)
                    .addComponent(btnFechar))
                .addGap(153, 153, 153))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        cadastrar();
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void itemCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCadastrarActionPerformed
        cadastrar();
    }//GEN-LAST:event_itemCadastrarActionPerformed

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        fechar();
    }//GEN-LAST:event_btnFecharActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        fechar();
    }//GEN-LAST:event_jMenuItem1ActionPerformed
    
    private void fechar() {
        dispose();
    }
    
    private void cadastrar() {
        if (txtNome.getText().equals(""))
	{
            JOptionPane.showMessageDialog(null,"Digite o nome da flor!","Nome",JOptionPane.ERROR_MESSAGE);
            txtNome.requestFocus();
	}else if (txtEspecie.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Digite a espécie da flor!","Espécie",JOptionPane.ERROR_MESSAGE);
            txtEspecie.requestFocus();
	}else if (txtValor.getText().equals(""))
	{
            JOptionPane.showMessageDialog(null,"Digite o preço da flor!","Valor",JOptionPane.ERROR_MESSAGE);
            txtValor.requestFocus();
        }else
	{
            Flor flor =new Flor();
            flor.setNome(txtNome.getText());
            flor.setEspecie(txtEspecie.getText());
            try
            {
                flor.setValor(Double.valueOf(txtValor.getText()));
		
		FlorDAO florDAO = new FlorDAO();
		Flor cadastrado = florDAO.selecionarFlor(flor.getNome());
		if (cadastrado != null)
                {
                    JOptionPane.showMessageDialog(null,"Já existe uma flor cadastrada com este Nome!","Flor Já cadastrada",JOptionPane.ERROR_MESSAGE);
                    txtEspecie.requestFocus();
                    txtEspecie.selectAll();
		}else
		{
                    int retorno=florDAO.cadastrarFlor(flor);
                    if (retorno == 1)
                    {
                        JOptionPane.showMessageDialog(null,"Cliente cadastrado com sucesso!","Cliente Cadastrado",JOptionPane.INFORMATION_MESSAGE);
			dispose();
                    }else
                        JOptionPane.showMessageDialog(null,"Ocorreu um erro ao tentar cadastrar um cliente!","Erro",JOptionPane.ERROR_MESSAGE);
		}
            }catch (Exception erro)
            {
                JOptionPane.showMessageDialog(null,"Idade informada inválida!","Idade",JOptionPane.ERROR_MESSAGE);
		txtValor.requestFocus();
        	txtValor.selectAll();
            }
	}
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnFechar;
    private javax.swing.JMenuItem itemCadastrar;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JLabel lblCpf;
    private javax.swing.JLabel lblIdade;
    private javax.swing.JLabel lblNome;
    private javax.swing.JMenu menuArquivo;
    private javax.swing.JTextField txtEspecie;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
