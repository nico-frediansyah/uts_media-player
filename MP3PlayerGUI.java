package AppPackage;

//All code is added to create the widget. Follow the "Create a Widget" tutorial if you want to know how I did it.

import java.awt.Toolkit;
import java.io.File;
import java.io.FileFilter;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class MP3PlayerGUI extends javax.swing.JDialog 
{
    int theme1, theme2, theme3, theme4, theme5;
    int xMouse;
    int yMouse;
    MainClass MC=  new MainClass();
    int width = (Toolkit.getDefaultToolkit().getScreenSize().width / 2) - 185;
    int height = Toolkit.getDefaultToolkit().getScreenSize().height - 180;
    public static String name;
    public static boolean loop=false;
    
    public MP3PlayerGUI(java.awt.Frame parent, boolean modal) 
    {
        super(parent, modal);
        initComponents();
        
        this.setLocation(width, height);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Play = new javax.swing.JLabel();
        SelectFile = new javax.swing.JLabel();
        Pause = new javax.swing.JLabel();
        Stop = new javax.swing.JLabel();
        Loop = new javax.swing.JLabel();
        Display = new javax.swing.JLabel();
        LoopShow = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("MP3 Player");
        setIconImage(null);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("jLabel1");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 110, -1, -1));

        Play.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Play.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                PlayMouseReleased(evt);
            }
        });
        getContentPane().add(Play, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 70, 70));

        SelectFile.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SelectFile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                SelectFileMouseReleased(evt);
            }
        });
        getContentPane().add(SelectFile, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 70, 40, 30));

        Pause.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Pause.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                PauseMouseReleased(evt);
            }
        });
        getContentPane().add(Pause, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, 50, 50));

        Stop.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Stop.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                StopMouseReleased(evt);
            }
        });
        getContentPane().add(Stop, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 60, 50));

        Loop.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Loop.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                LoopMouseReleased(evt);
            }
        });
        getContentPane().add(Loop, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 40, 50));

        Display.setBackground(new java.awt.Color(255, 153, 51));
        Display.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        Display.setText("Play music & ignore the world...");
        getContentPane().add(Display, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 16, 340, -1));

        LoopShow.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        LoopShow.setText("No loop");
        getContentPane().add(LoopShow, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppPackage/Theme 1.jpg"))); // NOI18N
        Background.setLabelFor(Background);
        Background.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        Background.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                BackgroundMouseDragged(evt);
            }
        });
        Background.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackgroundMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BackgroundMousePressed(evt);
            }
        });
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackgroundMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackgroundMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_BackgroundMouseDragged

    private void BackgroundMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackgroundMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_BackgroundMousePressed

    private void StopMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StopMouseReleased
        // TODO add your handling code here:
        MC.Stop();
    }//GEN-LAST:event_StopMouseReleased

    private void PlayMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PlayMouseReleased
        // TODO add your handling code here:
        MC.Resume();
    }//GEN-LAST:event_PlayMouseReleased

    private void PauseMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PauseMouseReleased
        // TODO add your handling code here:
        MC.Pause();
    }//GEN-LAST:event_PauseMouseReleased

    private void SelectFileMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SelectFileMouseReleased
        // TODO add your handling code here:
        FileNameExtensionFilter filter = new FileNameExtensionFilter("MP3 Files","mp3","mpeg3","*.wav");
        
        JFileChooser chooser=new JFileChooser("G:\\Music");
        chooser.addChoosableFileFilter(filter);
        int returnValue= chooser.showOpenDialog(null);
        if(returnValue==JFileChooser.APPROVE_OPTION){
            File myFile=chooser.getSelectedFile();
            String song=myFile+"";
            MC.Stop();
            name=chooser.getSelectedFile().getName();
            Display.setText(name);
            MC.Play(song);
        }
    }//GEN-LAST:event_SelectFileMouseReleased

    private void LoopMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoopMouseReleased
        // TODO add your handling code here:
        loop=!(loop);
        if(loop){
            LoopShow.setText("Loop");
        }
        else{
            LoopShow.setText("No loop");
        }
    }//GEN-LAST:event_LoopMouseReleased

    private void BackgroundMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackgroundMouseClicked
        // TODO add your handling code here:
        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppPackage/Background.png")));
    }//GEN-LAST:event_BackgroundMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppPackage/Theme 2.jpg")));
    }//GEN-LAST:event_jLabel1MouseClicked

    public static void main(String args[]) 
    {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MP3PlayerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MP3PlayerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MP3PlayerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MP3PlayerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                MP3PlayerGUI dialog = new MP3PlayerGUI(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() 
                {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) 
                    {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    public static javax.swing.JLabel Display;
    private javax.swing.JLabel Loop;
    private javax.swing.JLabel LoopShow;
    private javax.swing.JLabel Pause;
    private javax.swing.JLabel Play;
    private javax.swing.JLabel SelectFile;
    private javax.swing.JLabel Stop;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
