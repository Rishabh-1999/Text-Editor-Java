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
import java.util.Stack;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.text.DefaultHighlighter;
import javax.swing.text.Document;
import javax.swing.text.Highlighter;
import javax.swing.text.JTextComponent;

public class textEditorGui extends javax.swing.JFrame{
    String filename;
    Clipboard clipboard = getToolkit().getSystemClipboard();
    
    Stack <String> prev,next;
    public textEditorGui() {
        setIconImage(new ImageIcon(getClass().getResource("/img/logo.png")).getImage());
        initComponents();
        prev = new Stack<String>();
        next = new Stack<String>();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        topToolbar = new javax.swing.JToolBar();
        newFile = new javax.swing.JButton();
        openFile = new javax.swing.JButton();
        saveFile = new javax.swing.JButton();
        copyButton = new javax.swing.JButton();
        pasteButton = new javax.swing.JButton();
        cutButton = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JToolBar.Separator();
        prevButton = new javax.swing.JButton();
        nextButton = new javax.swing.JButton();
        jSeparator7 = new javax.swing.JToolBar.Separator();
        searchField = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        exit = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(700, 700));
        setPreferredSize(new java.awt.Dimension(700, 700));

        topToolbar.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 255), null));
        topToolbar.setFloatable(false);
        topToolbar.setRollover(true);
        topToolbar.setToolTipText("Search Button");
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

        copyButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/copyb.png"))); // NOI18N
        copyButton.setMnemonic('C');
        copyButton.setToolTipText("Copy (Alt+C)");
        copyButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        copyButton.setFocusable(false);
        copyButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        copyButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        copyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyButtonActionPerformed(evt);
            }
        });
        topToolbar.add(copyButton);

        pasteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pasteb.png"))); // NOI18N
        pasteButton.setMnemonic('P');
        pasteButton.setToolTipText("Paste (Alt+P)");
        pasteButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pasteButton.setFocusable(false);
        pasteButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pasteButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        pasteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pasteButtonActionPerformed(evt);
            }
        });
        topToolbar.add(pasteButton);

        cutButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cutb.png"))); // NOI18N
        cutButton.setMnemonic('X');
        cutButton.setToolTipText("Cut (Alt+X)");
        cutButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cutButton.setFocusable(false);
        cutButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cutButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        cutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cutButtonActionPerformed(evt);
            }
        });
        topToolbar.add(cutButton);
        topToolbar.add(jSeparator6);

        prevButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fprevious.png"))); // NOI18N
        prevButton.setMnemonic('X');
        prevButton.setToolTipText("Undo");
        prevButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        prevButton.setFocusable(false);
        prevButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        prevButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        prevButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prevButtonActionPerformed(evt);
            }
        });
        topToolbar.add(prevButton);

        nextButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fnext.png"))); // NOI18N
        nextButton.setMnemonic('X');
        nextButton.setToolTipText("Redo");
        nextButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nextButton.setFocusable(false);
        nextButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        nextButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt);
            }
        });
        topToolbar.add(nextButton);
        topToolbar.add(jSeparator7);

        searchField.setToolTipText("Search");
        searchField.setMargin(new java.awt.Insets(10, 10, 10, 10));
        searchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchFieldActionPerformed(evt);
            }
        });
        topToolbar.add(searchField);

        searchButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/findreplaceb.png"))); // NOI18N
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
        textArea.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textAreaKeyTyped(evt);
            }
        });
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(topToolbar, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(29, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(topToolbar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 621, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchFieldActionPerformed
        
    }//GEN-LAST:event_searchFieldActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
    serachTextArea(textArea,searchField.getText());
    }//GEN-LAST:event_searchButtonActionPerformed

    private void newFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newFileActionPerformed
        textArea.setText("");
        setTitle("NotePad");
        prev.clear();
        next.clear();
    }//GEN-LAST:event_newFileActionPerformed

    private void openFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openFileActionPerformed
        FileDialog fileDialog = new FileDialog(textEditorGui.this,"Open File",FileDialog.LOAD);
        fileDialog.setVisible(true);
        
        if(fileDialog.getFile() != null) {
            filename = fileDialog.getDirectory() + fileDialog.getFile();
            setTitle(filename);
            prev.clear();
            next.clear();
            
            try {
            prev.clear();
            next.clear();
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            StringBuffer sb = new StringBuffer();
            
            String line = null;
            
            while((line = reader.readLine()) != null) {
                sb.append(line + "\n");
                textArea.setText(sb.toString());
            }
            reader.close();
            prev.add(textArea.getText());
            textArea.setCaretPosition(0);
        } catch (IOException e) {
            System.out.println("File Not Found");
        }
        }
    }//GEN-LAST:event_openFileActionPerformed

    private void saveFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveFileActionPerformed
        if(filename == null ) {
        FileDialog fileDialog = new FileDialog(textEditorGui.this,"Save File",FileDialog.SAVE);
        fileDialog.setVisible(true);
        
        if(fileDialog.getFile() != null) {
            filename = fileDialog.getDirectory() + fileDialog.getFile();
            setTitle(filename);
        }
        }
            
            try {
            FileWriter filewriter = new FileWriter(filename);
            filewriter.write(textArea.getText());
            setTitle(filename);
            filewriter.close();
        } catch(IOException e) {
            System.out.println("File not Found");
        }
        
    }//GEN-LAST:event_saveFileActionPerformed

    private void cutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cutButtonActionPerformed
        String cutString = textArea.getSelectedText();
        StringSelection cutselecttion = new StringSelection(cutString);
        clipboard.setContents(cutselecttion,cutselecttion);
        textArea.replaceRange("",textArea.getSelectionStart(), textArea.getSelectionEnd());
    }//GEN-LAST:event_cutButtonActionPerformed

    private void copyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyButtonActionPerformed
        String copyText = textArea.getSelectedText();
        StringSelection copysel = new StringSelection(copyText);
        clipboard.setContents(copysel,copysel);
    }//GEN-LAST:event_copyButtonActionPerformed

    private void pasteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pasteButtonActionPerformed
        try {
            Transferable pasteText = clipboard.getContents(textEditorGui.this);
            String sel = (String) pasteText.getTransferData(DataFlavor.stringFlavor);
            textArea.replaceRange(sel,textArea.getSelectionStart(),textArea.getSelectionEnd());
            
        } catch (Exception e) {
            System.out.println("Paste Didn't work");
        }
    }//GEN-LAST:event_pasteButtonActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonActionPerformed
        if(!next.empty()) {
            textArea.setText(next.peek());
            prev.add(next.pop());
        }
    }//GEN-LAST:event_nextButtonActionPerformed

    private void prevButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prevButtonActionPerformed
        int pos=textArea.getCaretPosition();
        if(!prev.empty()) {
            textArea.setText(prev.peek());
            next.add(prev.pop());
            textArea.setCaretPosition(pos -1);
        }
    }//GEN-LAST:event_prevButtonActionPerformed

    private void textAreaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textAreaKeyTyped
        prev.add(textArea.getText());
    }//GEN-LAST:event_textAreaKeyTyped
    
    
    
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
    private javax.swing.JButton copyButton;
    private javax.swing.JButton cutButton;
    private javax.swing.JButton exit;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator6;
    private javax.swing.JToolBar.Separator jSeparator7;
    private javax.swing.JButton newFile;
    private javax.swing.JButton nextButton;
    private javax.swing.JButton openFile;
    private javax.swing.JButton pasteButton;
    private javax.swing.JButton prevButton;
    private javax.swing.JButton saveFile;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField searchField;
    private javax.swing.JTextArea textArea;
    private javax.swing.JToolBar topToolbar;
    // End of variables declaration//GEN-END:variables
}
