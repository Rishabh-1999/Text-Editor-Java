package texteditor;

import java.awt.Color;
import java.awt.FileDialog;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.event.WindowListener;
import java.awt.geom.Area;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.text.DefaultHighlighter;
import javax.swing.text.Document;
import javax.swing.text.Highlighter;
import javax.swing.text.JTextComponent;

public class textEditorGui extends javax.swing.JFrame{
    String filename;
    Clipboard clipboard = getToolkit().getSystemClipboard();
    public textEditorGui() {
        setIconImage(new ImageIcon(getClass().getResource("/img/logo.png")).getImage());
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        topToolbar = new javax.swing.JToolBar();
        newFile = new javax.swing.JButton();
        openFile = new javax.swing.JButton();
        saveFile = new javax.swing.JButton();
        cutB = new javax.swing.JButton();
        copyB = new javax.swing.JButton();
        pasteB = new javax.swing.JButton();
        compileB = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JToolBar.Separator();
        searchField = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        exit = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        topToolbar.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 255), null));
        topToolbar.setFloatable(false);
        topToolbar.setRollover(true);
        topToolbar.setMargin(new java.awt.Insets(5, 0, 5, 0));

        newFile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/newb.png"))); // NOI18N
        newFile.setMnemonic('N');
        newFile.setToolTipText("Create new file (Alt+N)");
        newFile.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        newFile.setFocusable(false);
        newFile.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        newFile.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        newFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newFileActionPerformed(evt);
            }
        });
        topToolbar.add(newFile);

        openFile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/openb.png"))); // NOI18N
        openFile.setMnemonic('O');
        openFile.setToolTipText("Open file (Alt+O)");
        openFile.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        openFile.setFocusable(false);
        openFile.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        openFile.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        openFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openFileActionPerformed(evt);
            }
        });
        topToolbar.add(openFile);

        saveFile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/saveb.png"))); // NOI18N
        saveFile.setMnemonic('S');
        saveFile.setToolTipText("Save file (Alt+S)");
        saveFile.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        saveFile.setFocusable(false);
        saveFile.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        saveFile.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        saveFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveFileActionPerformed(evt);
            }
        });
        topToolbar.add(saveFile);

        cutB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cutb.png"))); // NOI18N
        cutB.setMnemonic('X');
        cutB.setToolTipText("Cut (Alt+X)");
        cutB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cutB.setFocusable(false);
        cutB.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cutB.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        cutB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cutBActionPerformed(evt);
            }
        });
        topToolbar.add(cutB);

        copyB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/copyb.png"))); // NOI18N
        copyB.setMnemonic('C');
        copyB.setToolTipText("Copy (Alt+C)");
        copyB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        copyB.setFocusable(false);
        copyB.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        copyB.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        copyB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyBActionPerformed(evt);
            }
        });
        topToolbar.add(copyB);

        pasteB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pasteb.png"))); // NOI18N
        pasteB.setMnemonic('P');
        pasteB.setToolTipText("Paste (Alt+P)");
        pasteB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pasteB.setFocusable(false);
        pasteB.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pasteB.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        pasteB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pasteBActionPerformed(evt);
            }
        });
        topToolbar.add(pasteB);

        compileB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/compileb.png"))); // NOI18N
        compileB.setToolTipText("Compile");
        compileB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        compileB.setFocusable(false);
        compileB.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        compileB.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        compileB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compileBActionPerformed(evt);
            }
        });
        topToolbar.add(compileB);
        topToolbar.add(jSeparator6);

        searchField.setMargin(new java.awt.Insets(10, 10, 10, 10));
        searchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchFieldActionPerformed(evt);
            }
        });
        topToolbar.add(searchField);

        searchButton.setText("Search");
        searchButton.setFocusable(false);
        searchButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        searchButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });
        topToolbar.add(searchButton);
        topToolbar.add(jSeparator2);

        exit.setFont(new java.awt.Font("Ebrima", 1, 22)); // NOI18N
        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/closeb.png"))); // NOI18N
        exit.setMnemonic('E');
        exit.setToolTipText("Close (Alt+E)");
        exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exit.setFocusable(false);
        exit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        exit.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        topToolbar.add(exit);

        textArea.setColumns(20);
        textArea.setRows(5);
        jScrollPane1.setViewportView(textArea);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 29, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 601, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(317, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(topToolbar, javax.swing.GroupLayout.PREFERRED_SIZE, 683, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 343, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(73, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(topToolbar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 683, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchFieldActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
//        serachTextArea(textArea, searchField.getText());
    }//GEN-LAST:event_searchButtonActionPerformed

    private void newFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newFileActionPerformed
        textArea.setText("");
        setTitle(filename);
    }//GEN-LAST:event_newFileActionPerformed

    private void openFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openFileActionPerformed
        FileDialog fileDialog = new FileDialog(textEditorGui.this,"Open File",FileDialog.LOAD);
        fileDialog.setVisible(true);
        
        if(fileDialog.getFile() != null) {
            filename = fileDialog.getDirectory() + fileDialog.getFile();
            setTitle(filename);
        }
        
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            StringBuffer sb = new StringBuffer();
            
            String line = null;
            
            while((line = reader.readLine()) != null) {
                sb.append(line + "\n");
                textArea.setText(sb.toString());
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("File Not Found");
        }
    }//GEN-LAST:event_openFileActionPerformed

    private void saveFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveFileActionPerformed
        
    }//GEN-LAST:event_saveFileActionPerformed

    private void cutBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cutBActionPerformed
        
    }//GEN-LAST:event_cutBActionPerformed

    private void copyBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyBActionPerformed
        
    }//GEN-LAST:event_copyBActionPerformed

    private void pasteBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pasteBActionPerformed
        
    }//GEN-LAST:event_pasteBActionPerformed

    private void compileBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_compileBActionPerformed
        
    }//GEN-LAST:event_compileBActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed
    
    class myHighter extends DefaultHighlighter.DefaultHighlightPainter {
        
        public myHighter(Color c) {
            super(c);
        }
        
    }
    
    DefaultHighlighter.DefaultHighlightPainter  highlighter = new myHighter(Color.YELLOW);
    
    public void removeHighlighter(JTextComponent textComp ) {
        Highlighter removelighter = textComp.getHighlighter();
        Highlighter.Highlight[] remove = removelighter.getHighlights();
        
        for(int i=0;i<remove.length;i++) {
            if(remove[i].getPainter() instanceof myHighter) {
                removelighter.removeHighlight(remove[i]);
            }
        }
    }
    
    public void serachTextArea(JTextComponent textComp,String textString) {
        removeHighlighter(textComp);
        try {
            Highlighter highli = textComp.getHighlighter();
            Document doc = textComp.getDocument();
            String text = doc.getText(0, doc.getLength());
            
            int pos=0;
            while((pos = text.toUpperCase().indexOf(textString.toUpperCase(),pos)) >= 0) {
                highli.addHighlight(pos,pos+textString.length(), highlighter);
                pos += textString.length();
            }
        } catch (Exception e) {
            
        }
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new textEditorGui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton compileB;
    private javax.swing.JButton copyB;
    private javax.swing.JButton cutB;
    private javax.swing.JButton exit;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator6;
    private javax.swing.JButton newFile;
    private javax.swing.JButton openFile;
    private javax.swing.JButton pasteB;
    private javax.swing.JButton saveFile;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField searchField;
    private javax.swing.JTextArea textArea;
    private javax.swing.JToolBar topToolbar;
    // End of variables declaration//GEN-END:variables
}
