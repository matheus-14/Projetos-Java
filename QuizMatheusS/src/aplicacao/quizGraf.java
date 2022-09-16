/*
    PROJETO FINAL - LABORATÓRIO PROGRAMAÇÃO DE COMPUTADORES II
    GRUPO: MATHEUS SOUZA 
*/
package aplicacao;

import quiz.Quiz;


public class quizGraf extends javax.swing.JFrame {

    
    public quizGraf() {
        initComponents();
    }

    Quiz jogo = new Quiz();
    int aux = 0;
    int k = -1;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton5 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();

        jButton5.setText("jButton5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));

        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel1.setText("QUIZ - Você consegue acertar todas?");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Pergunta:");

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Alternativas:");

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jTextArea2.setTabSize(5);
        jScrollPane2.setViewportView(jTextArea2);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Sua Resposta:");

        jButton1.setBackground(new java.awt.Color(153, 255, 255));
        jButton1.setText("A");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(153, 255, 255));
        jButton2.setText("B");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(153, 255, 255));
        jButton3.setText("C");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(153, 255, 255));
        jButton4.setText("D");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Pontuação:");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(204, 255, 204));
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton6.setText("INICIAR");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel3)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(18, 18, 18)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(26, 26, 26)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(28, 28, 28)
                                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(28, 28, 28)
                                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jScrollPane2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton6)
                        .addGap(470, 470, 470)))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(3, 3, 3)
                .addComponent(jButton6)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addContainerGap(100, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        jTextArea1.setText("Escolha o tema das perguntas!");
        jTextArea2.setText("(A) Futebol (B) Geografia (C) Biologia");
        jogo.setPontuacao(0);
        jTextField1.setText("0");
        k = 0;     
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jogo.setLetra("A");
        if(aux == 0){ //ESCOLHENDO TEMA
            jogo.setTemas(0);  // TEMA 0 = FUTEBOL
            jTextArea1.setText(jogo.Perguntar(0));
            jTextArea2.setText(jogo.Opcoes(0));
            aux = 1;
        }
        
        else {
        switch(jogo.getTemas()){
            
            case 0: //FUTEBOL
                if(jogo.VerificaResp()){                                        // Se acertar
                    jogo.setPontuacao(jogo.getPontuacao() + 1 );                // Incrementa pontuação
                    jTextField1.setText(Integer.toString(jogo.getPontuacao())); // Exibe pontuação atualizada
                    jTextArea1.setText(jogo.Perguntar(k));                      // 
                    jTextArea2.setText(jogo.Opcoes(k));
                    k++;
                }else{      
                    jTextArea1.setText(jogo.Perguntar(k));
                    jTextArea2.setText(jogo.Opcoes(k));
                    k++;
                }
            break;
            
            case 1: //GEOGRAFIA
                if(jogo.VerificaResp()){
                    jogo.setPontuacao(jogo.getPontuacao() + 1 );
                    jTextField1.setText(Integer.toString(jogo.getPontuacao()));
                    jTextArea1.setText(jogo.Perguntar(k + 10));
                    jTextArea2.setText(jogo.Opcoes(k + 10));
                    k++;
                }else{      
                    jTextArea1.setText(jogo.Perguntar(k + 10));
                    jTextArea2.setText(jogo.Opcoes(k + 10));
                    k++;
                }
             break;
             
             case 2:  //BIOLOGIA
                 try{
                    if(jogo.VerificaResp()){
                        jogo.setPontuacao(jogo.getPontuacao() + 1 );
                        jTextField1.setText(Integer.toString(jogo.getPontuacao()));
                        jTextArea1.setText(jogo.Perguntar(k+ 20));
                        jTextArea2.setText(jogo.Opcoes(k + 20));
                        k++;
                    }else{      
                        jTextArea1.setText(jogo.Perguntar(k + 20));
                        jTextArea2.setText(jogo.Opcoes(k + 20));
                        k++;
                    }
                 break;   
                 }catch(ArrayIndexOutOfBoundsException e){
                        jTextArea1.setText("Nova partida! Escolha o tema das perguntas!");
                        jTextArea2.setText("(A) Futebol (B) Geografia (C) Biologia");
                        jogo.setPontuacao(0);
                        jTextField1.setText("0");
                        k = 0;
                        aux = 0;
                 }      
        }
       }
        
        if(k == 10){
        jTextArea1.setText("FIM DE JOGO!");
        jTextArea2.setText("SUA PONTUAÇÃO FINAL: " + jogo.getPontuacao());
        jTextField1.setText("-");
        }
        if(k > 10){
            jTextArea1.setText("Nova partida! Escolha o tema das perguntas!");
            jTextArea2.setText("(A) Futebol (B) Geografia (C) Biologia");
            jogo.setPontuacao(0);
            jTextField1.setText("0");
            k = 0;
            aux = 0;
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jogo.setLetra("B");
        if(aux == 0){ //ESCOLHENDO TEMA
            jogo.setTemas(1);   // TEMA 1 = GEOGRAFIA
            jTextArea1.setText(jogo.Perguntar(10));
            jTextArea2.setText(jogo.Opcoes(10));
            aux = 1;
        }
        
        else{
        switch(jogo.getTemas()){
            
            case 0: //FUTEBOL
                if(jogo.VerificaResp()){
                    jogo.setPontuacao(jogo.getPontuacao() + 1 );
                    jTextField1.setText(Integer.toString(jogo.getPontuacao()));
                    jTextArea1.setText(jogo.Perguntar(k));
                    jTextArea2.setText(jogo.Opcoes(k));
                    k++;
                }else{      
                    jTextArea1.setText(jogo.Perguntar(k));
                    jTextArea2.setText(jogo.Opcoes(k));
                    k++;
                }
            break;
            
            case 1: //GEOGRAFIA
                if(jogo.VerificaResp()){
                    jogo.setPontuacao(jogo.getPontuacao() + 1 );
                    jTextField1.setText(Integer.toString(jogo.getPontuacao()));
                    jTextArea1.setText(jogo.Perguntar(k + 10));
                    jTextArea2.setText(jogo.Opcoes(k + 10));
                    k++;
                }else{      
                    jTextArea1.setText(jogo.Perguntar(k + 10));
                    jTextArea2.setText(jogo.Opcoes(k + 10));
                    k++;
                }
             break;
             
             case 2:  //BIOLOGIA
                 try{
                    if(jogo.VerificaResp()){
                        jogo.setPontuacao(jogo.getPontuacao() + 1 );
                        jTextField1.setText(Integer.toString(jogo.getPontuacao()));
                        jTextArea1.setText(jogo.Perguntar(k+ 20));
                        jTextArea2.setText(jogo.Opcoes(k + 20));
                        k++;
                    }else{      
                        jTextArea1.setText(jogo.Perguntar(k + 20));
                        jTextArea2.setText(jogo.Opcoes(k + 20));
                        k++;
                    }
                 break;   
                 }catch(ArrayIndexOutOfBoundsException e){
                        jTextArea1.setText("Nova partida! Escolha o tema das perguntas!");
                        jTextArea2.setText("(A) Futebol (B) Geografia (C) Biologia");
                        jogo.setPontuacao(0);
                        jTextField1.setText("0");
                        k = 0;
                        aux = 0;
                 }      
        }
       }
       
        
        if(k == 10){
        jTextArea1.setText("FIM DE JOGO!");
        jTextArea2.setText("SUA PONTUAÇÃO FINAL: " + jogo.getPontuacao());
        jTextField1.setText("-");
        }
        if(k > 10){
            jTextArea1.setText("Nova partida! Escolha o tema das perguntas!");
            jTextArea2.setText("(A) Futebol (B) Geografia (C) Biologia");
            jogo.setPontuacao(0);
            jTextField1.setText("0");
            k = 0;
            aux = 0;
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jogo.setLetra("C");
        if(aux == 0){//ESCOLHENDO TEMA
            jogo.setTemas(2);   // TEMA 2 = BIOLOGIA
            jTextArea1.setText(jogo.Perguntar(20));
            jTextArea2.setText(jogo.Opcoes(20));
            aux = 1;
        }
        
        else{
        switch(jogo.getTemas()){
            
            case 0: //FUTEBOL
                if(jogo.VerificaResp()){
                    jogo.setPontuacao(jogo.getPontuacao() + 1 );
                    jTextField1.setText(Integer.toString(jogo.getPontuacao()));
                    jTextArea1.setText(jogo.Perguntar(k));
                    jTextArea2.setText(jogo.Opcoes(k));
                    k++;
                }else{      
                    jTextArea1.setText(jogo.Perguntar(k));
                    jTextArea2.setText(jogo.Opcoes(k));
                    k++;
                }
            break;
            
            case 1: //GEOGRAFIA
                if(jogo.VerificaResp()){
                    jogo.setPontuacao(jogo.getPontuacao() + 1 );
                    jTextField1.setText(Integer.toString(jogo.getPontuacao()));
                    jTextArea1.setText(jogo.Perguntar(k + 10));
                    jTextArea2.setText(jogo.Opcoes(k + 10));
                    k++;
                }else{      
                    jTextArea1.setText(jogo.Perguntar(k + 10));
                    jTextArea2.setText(jogo.Opcoes(k + 10));
                    k++;
                }
             break;
             
             case 2:  //BIOLOGIA
                 try{
                    if(jogo.VerificaResp()){
                        jogo.setPontuacao(jogo.getPontuacao() + 1 );
                        jTextField1.setText(Integer.toString(jogo.getPontuacao()));
                        jTextArea1.setText(jogo.Perguntar(k+ 20));
                        jTextArea2.setText(jogo.Opcoes(k + 20));
                        k++;
                    }else{      
                        jTextArea1.setText(jogo.Perguntar(k + 20));
                        jTextArea2.setText(jogo.Opcoes(k + 20));
                        k++;
                    }
                 break;   
                 }catch(ArrayIndexOutOfBoundsException e){
                        jTextArea1.setText("Nova partida! Escolha o tema das perguntas!");
                        jTextArea2.setText("(A) Futebol (B) Geografia (C) Biologia");
                        jogo.setPontuacao(0);
                        jTextField1.setText("0");
                        k = 0;
                        aux = 0;
                 }       
        }
       }
        
        if(k == 10){
        jTextArea1.setText("FIM DE JOGO!");
        jTextArea2.setText("SUA PONTUAÇÃO FINAL: " + jogo.getPontuacao());
        jTextField1.setText("-");
        }
        if(k > 10){
            jTextArea1.setText("Nova partida! Escolha o tema das perguntas!");
            jTextArea2.setText("(A) Futebol (B) Geografia (C) Biologia");
            jogo.setPontuacao(0);
            jTextField1.setText("0");
            k = 0;
            aux = 0;
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        jogo.setLetra("D");
        if(aux != 0){
        

        switch(jogo.getTemas()){
            
            case 0: //FUTEBOL
                if(jogo.VerificaResp()){
                    jogo.setPontuacao(jogo.getPontuacao() + 1 );
                    jTextField1.setText(Integer.toString(jogo.getPontuacao()));
                    jTextArea1.setText(jogo.Perguntar(k));
                    jTextArea2.setText(jogo.Opcoes(k));
                    k++;
                }else{      
                    jTextArea1.setText(jogo.Perguntar(k));
                    jTextArea2.setText(jogo.Opcoes(k));
                    k++;
                }
            break;
            
            case 1: //GEOGRAFIA
                if(jogo.VerificaResp()){
                    jogo.setPontuacao(jogo.getPontuacao() + 1 );
                    jTextField1.setText(Integer.toString(jogo.getPontuacao()));
                    jTextArea1.setText(jogo.Perguntar(k + 10));
                    jTextArea2.setText(jogo.Opcoes(k + 10));
                    k++;
                }else{      
                    jTextArea1.setText(jogo.Perguntar(k + 10));
                    jTextArea2.setText(jogo.Opcoes(k + 10));
                    k++;
                }
             break;
             
             case 2:  //BIOLOGIA
                 try{
                    if(jogo.VerificaResp()){
                        jogo.setPontuacao(jogo.getPontuacao() + 1 );
                        jTextField1.setText(Integer.toString(jogo.getPontuacao()));
                        jTextArea1.setText(jogo.Perguntar(k+ 20));
                        jTextArea2.setText(jogo.Opcoes(k + 20));
                        k++;
                    }else{      
                        jTextArea1.setText(jogo.Perguntar(k + 20));
                        jTextArea2.setText(jogo.Opcoes(k + 20));
                        k++;
                    }
                 break;   
                 }catch(ArrayIndexOutOfBoundsException e){
                        jTextArea1.setText("Nova partida! Escolha o tema das perguntas!");
                        jTextArea2.setText("(A) Futebol (B) Geografia (C) Biologia");
                        jogo.setPontuacao(0);
                        jTextField1.setText("0");
                        k = 0;
                        aux = 0;
                 }
        }
      }
        
        if(k == 10){
        jTextArea1.setText("FIM DE JOGO!");
        jTextArea2.setText("SUA PONTUAÇÃO FINAL: " + jogo.getPontuacao());
        jTextField1.setText("-");
        }
        if(k > 10){
            jTextArea1.setText("Nova partida! Escolha o tema das perguntas!");
            jTextArea2.setText("(A) Futebol (B) Geografia (C) Biologia");
            jogo.setPontuacao(0);
            jTextField1.setText("0");
            k = 0;
            aux = 0;
        }
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(quizGraf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(quizGraf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(quizGraf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(quizGraf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new quizGraf().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
