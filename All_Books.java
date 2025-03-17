
package Tables;

import Coding.bookupdated;
import Coding.conn;
import java.awt.Color;
import java.awt.Font;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Hadi
 */
public class All_Books extends javax.swing.JFrame {

     private TableRowSorter sorter;
    
    Font headerFont = new Font("Arial", Font.BOLD, 18);
    JTableHeader tableHeader;
   
    DefaultTableCellRenderer renderer;
    
    
    File file = new File("Icon.png");
    String absolutePath = file.getAbsolutePath().replace("Icon.png", "/src/Images/Icon.png");
    ImageIcon FrameIcon = new ImageIcon(absolutePath);
       
    public String Online = "NO";
    
    public All_Books() {
        
        initComponents();
        this.setIconImage(FrameIcon.getImage());
        this.tableHeader = jTableBooks.getTableHeader();
        tableHeader.setFont(headerFont);
        
        this.renderer = (DefaultTableCellRenderer)
        jTableBooks.getTableHeader().getDefaultRenderer();
        renderer.setHorizontalAlignment(SwingConstants.CENTER);

        
        DoubleClick();
  
    }

    //double click On jTable Row ==========================   
    private void DoubleClick(){
    jTableBooks.addMouseListener(new MouseAdapter() {
    @Override
    public void mousePressed(MouseEvent mouseEvent) {
        JTable table =(JTable) mouseEvent.getSource();
        Point point = mouseEvent.getPoint();
        int row = table.rowAtPoint(point);
        if (mouseEvent.getClickCount() == 2 && table.getSelectedRow() != -1) {
            
            String first = jTableBooks.getValueAt(jTableBooks.getSelectedRow(), 0).toString();
            String second =  jTableBooks.getValueAt(jTableBooks.getSelectedRow(), 1).toString();
            String third =  jTableBooks.getValueAt(jTableBooks.getSelectedRow(), 2).toString();
            String fourth =  jTableBooks.getValueAt(jTableBooks.getSelectedRow(), 3).toString();
            String fifth = jTableBooks.getValueAt(jTableBooks.getSelectedRow(), 4).toString();
            String sixth =  jTableBooks.getValueAt(jTableBooks.getSelectedRow(), 5).toString();
            String seventh =  jTableBooks.getValueAt(jTableBooks.getSelectedRow(), 6).toString();
            
            if(Online.equals("YES")){
                bookupdated book = new bookupdated();
                book.Online = "YES";
                book.setVisible(true);
                dispose();
                book.GetBook(first, second, third, fourth, fifth, sixth, seventh); 
            }
            else{
                bookupdated book = new bookupdated();
                book.setVisible(true);
                dispose();
                book.GetBook(first, second, third, fourth, fifth, sixth, seventh); 
            }
            }
        }
    });
    }
    
    public void change(){
        if (jTableBooks.getSelectedRow() != -1) {
            
            String first = jTableBooks.getValueAt(jTableBooks.getSelectedRow(), 0).toString();
            String second =  jTableBooks.getValueAt(jTableBooks.getSelectedRow(), 1).toString();
            String third =  jTableBooks.getValueAt(jTableBooks.getSelectedRow(), 2).toString();
            String fourth =  jTableBooks.getValueAt(jTableBooks.getSelectedRow(), 3).toString();
            String fifth = jTableBooks.getValueAt(jTableBooks.getSelectedRow(), 4).toString();
            String sixth =  jTableBooks.getValueAt(jTableBooks.getSelectedRow(), 5).toString();
            String seventh =  jTableBooks.getValueAt(jTableBooks.getSelectedRow(), 6).toString();
            
             bookupdated book = new bookupdated();
             book.setVisible(true);
             dispose();
             book.GetBook(first, second, third, fourth, fifth, sixth, seventh);
//            
            }
        else{
            JOptionPane.showMessageDialog(this, "Select A Row to Be Edited");
        }
    }
    public void changeOnline(){
        if (jTableBooks.getSelectedRow() != -1) {
            
            String first = jTableBooks.getValueAt(jTableBooks.getSelectedRow(), 0).toString();
            String second =  jTableBooks.getValueAt(jTableBooks.getSelectedRow(), 1).toString();
            String third =  jTableBooks.getValueAt(jTableBooks.getSelectedRow(), 2).toString();
            String fourth =  jTableBooks.getValueAt(jTableBooks.getSelectedRow(), 3).toString();
            String fifth = jTableBooks.getValueAt(jTableBooks.getSelectedRow(), 4).toString();
            String sixth =  jTableBooks.getValueAt(jTableBooks.getSelectedRow(), 5).toString();
            String seventh =  jTableBooks.getValueAt(jTableBooks.getSelectedRow(), 6).toString();
            
             bookupdated book = new bookupdated();
             book.Online = "YES";
             book.setVisible(true);
             dispose();
             book.GetBook(first, second, third, fourth, fifth, sixth, seventh);
            
            }
        else{
            JOptionPane.showMessageDialog(this, "Select A Row to Be Edited");
        }
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelSearchBar = new javax.swing.JPanel();
        jTextFieldSearch = new javax.swing.JTextField();
        jButtonDelete = new javax.swing.JButton();
        jButtonSearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableBooks = new javax.swing.JTable();
        jButtonSearch1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("LIST OF ALL BOOKS");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanelSearchBar.setBackground(new java.awt.Color(243, 243, 243));
        jPanelSearchBar.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        jPanelSearchBar.setForeground(new java.awt.Color(0, 51, 51));

        jTextFieldSearch.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jTextFieldSearch.setForeground(new java.awt.Color(133, 133, 133));
        jTextFieldSearch.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextFieldSearch.setText("Search");
        jTextFieldSearch.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldSearchFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldSearchFocusLost(evt);
            }
        });
        jTextFieldSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldSearchKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldSearchKeyTyped(evt);
            }
        });

        jButtonDelete.setBackground(new java.awt.Color(0, 51, 51));
        jButtonDelete.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonDelete.setForeground(new java.awt.Color(255, 255, 255));
        jButtonDelete.setText("Remove");
        jButtonDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });

        jButtonSearch.setBackground(new java.awt.Color(0, 51, 51));
        jButtonSearch.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonSearch.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSearch.setText("Search");
        jButtonSearch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSearchActionPerformed(evt);
            }
        });

        jTableBooks.setAutoCreateRowSorter(true);
        jTableBooks.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTableBooks.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Book Id", "Book Name", "Publisher", "Price", "Availability", "Location", "Edition"
            }
        ));
        jTableBooks.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTableBooks.setFocusable(false);
        jTableBooks.setIntercellSpacing(new java.awt.Dimension(2, 2));
        jTableBooks.setName(""); // NOI18N
        jTableBooks.setRowHeight(30);
        jTableBooks.setSelectionBackground(new java.awt.Color(0, 0, 0));
        jTableBooks.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableBooksMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableBooks);

        jButtonSearch1.setBackground(new java.awt.Color(0, 51, 51));
        jButtonSearch1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonSearch1.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSearch1.setText("Edit");
        jButtonSearch1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonSearch1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSearch1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelSearchBarLayout = new javax.swing.GroupLayout(jPanelSearchBar);
        jPanelSearchBar.setLayout(jPanelSearchBarLayout);
        jPanelSearchBarLayout.setHorizontalGroup(
            jPanelSearchBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSearchBarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelSearchBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelSearchBarLayout.createSequentialGroup()
                        .addComponent(jButtonDelete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonSearch1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldSearch))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 930, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelSearchBarLayout.setVerticalGroup(
            jPanelSearchBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSearchBarLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanelSearchBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSearch1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 477, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelSearchBar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelSearchBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldSearchFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldSearchFocusGained
        if(jTextFieldSearch.getText().trim().equals("Search")){
            jTextFieldSearch.setText("");
            jTextFieldSearch.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_jTextFieldSearchFocusGained

    private void jTextFieldSearchFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldSearchFocusLost
        if(jTextFieldSearch.getText().trim().equals("")||
            jTextFieldSearch.getText().trim().equals("Search")){
            jTextFieldSearch.setText("Search");
            jTextFieldSearch.setForeground(new Color(133,133,133));
        }
    }//GEN-LAST:event_jTextFieldSearchFocusLost

    private void jTextFieldSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldSearchKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldSearchKeyPressed

    private void jTextFieldSearchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldSearchKeyTyped
        DefaultTableModel model = (DefaultTableModel) jTableBooks.getModel();
        sorter = new TableRowSorter<>(model);
        jTableBooks.setRowSorter(sorter);
        char num = evt.getKeyChar();

        if(num == KeyEvent.VK_ENTER) {
            String str = jTextFieldSearch.getText();
            if(str.length() == 0) {
                sorter.setRowFilter(null);
            }else {
                sorter.setRowFilter(RowFilter.regexFilter(str));
            }
        }
    }//GEN-LAST:event_jTextFieldSearchKeyTyped

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
        if(Online.equals("YES")){
            DeleteBookOnline();
        }else{
            DeleteBook();
        }       
    }//GEN-LAST:event_jButtonDeleteActionPerformed

    private void jButtonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSearchActionPerformed
        searchTable();
    }//GEN-LAST:event_jButtonSearchActionPerformed

    private void jTableBooksMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableBooksMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTableBooksMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        if(Online.equals("YES")){
            LoadAllBooks_Online();
        }
        else{
            LoadAllBooks();
        }
    }//GEN-LAST:event_formWindowOpened

    private void jButtonSearch1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSearch1ActionPerformed
        if(Online.equals("YES")){
            changeOnline();
        }
        else{
            change();
        }
    }//GEN-LAST:event_jButtonSearch1ActionPerformed
    
    private void LoadAllBooks(){ 
    try {
            ResultSet rs;
            conn con = new conn();
            String sql ="SELECT * FROM book";
            DefaultTableModel modele = (DefaultTableModel) jTableBooks.getModel();        
            PreparedStatement st = con.c.prepareStatement(sql);
            rs = st.executeQuery();
            while(rs.next()){
            Object o[]= {rs.getString("book_id"), rs.getString("bookName"), rs.getString("publisher")
                    ,rs.getString("price"), rs.getString("Numbers"), rs.getString("location")
                    ,rs.getString("edition")};
            if(jTableBooks.getRowCount()!= Number_Of_Books())    
                modele.addRow(o);                
            }
                st.close();
                con.c.close();
        } catch(SQLException ex) {
              JOptionPane.showMessageDialog(this, "Error Database");
            }
    }  
    private void LoadAllBooks_Online(){ 
    try {
            ResultSet rs;
            conn con = new conn("YES");
            String sql ="SELECT * FROM book";
            DefaultTableModel modele = (DefaultTableModel) jTableBooks.getModel();        
            PreparedStatement st = con.c.prepareStatement(sql);
            rs = st.executeQuery();
            while(rs.next()){
            Object o[]= {rs.getString("book_id"), rs.getString("bookName"), rs.getString("publisher")
                    ,rs.getString("price"), rs.getString("Numbers"), rs.getString("location")
                    ,rs.getString("edition")};
            if(jTableBooks.getRowCount()!= Number_Of_Books_Online())    
                modele.addRow(o);                
            }
                st.close();
                con.c.close();
        } catch(SQLException ex) {
              JOptionPane.showMessageDialog(this, "Error Database");
            }
    }
    
    private int Number_Of_Books() {
        String query = "SELECT COUNT(*) FROM book";
        ResultSet rs;
        int numberRow = 0;
        try {
            conn con = new conn();
            PreparedStatement st = con.c.prepareStatement(query);
            rs = st.executeQuery();
            while(rs.next()){
                    numberRow = rs.getInt("count(*)");
                }
                st.close();
                con.c.close();
            }catch(Exception e){
                JOptionPane.showMessageDialog(this, "Error Database");
            }     
            return numberRow;
    }
    private int Number_Of_Books_Online() {
        String query = "SELECT COUNT(*) FROM book";
        ResultSet rs;
        int numberRow = 0;
        try {
            conn con = new conn("YES");
            PreparedStatement st = con.c.prepareStatement(query);
            rs = st.executeQuery();
            while(rs.next()){
                    numberRow = rs.getInt("count(*)");
                }
                st.close();
                con.c.close();
            }catch(Exception e){
                JOptionPane.showMessageDialog(this, "Error Database");
            }     
            return numberRow;
    }
    
    private void DeleteBook()  {
        DefaultTableModel model = 
            (DefaultTableModel) jTableBooks.getModel();
        if(jTableBooks.getSelectedRow() == -1){
            if(jTableBooks.getRowCount()==0) {
                JOptionPane.showMessageDialog(null, "No Row has been Selected",
                    "Alert!", JOptionPane.OK_OPTION);
            } else
            JOptionPane.showMessageDialog(null, "Select a Row to be Deleted",
                "Student Records System", JOptionPane.OK_OPTION);
        }
        else{
     
            Object[] options = {"Yes", "No"};
            int confirm = JOptionPane.showOptionDialog(this,
            "Are You Sure",
            "Warning",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,     //do not use a custom Icon
            options,  //the titles of buttons
            options[0]); //default button title
                if (confirm == JOptionPane.YES_OPTION) {
                     String id = jTableBooks.getValueAt(jTableBooks.getSelectedRow(), 0).toString();
                    String sql = "DELETE FROM book WHERE(book_id ="+'"'+id+'"'+")";
                    try {
                        conn con = new conn();
                        PreparedStatement st = con.c.prepareStatement(sql);
                        st.executeUpdate();
                        st.close();
                        con.c.close();
                    } catch(Exception e) {
                        JOptionPane.showMessageDialog(null,"Can Not Delete At this Moment! Try Later"+e.getMessage());
                    }
                    model.removeRow(jTableBooks.getSelectedRow());
                    }
            }                
    }
    
    private void DeleteBookOnline()  {
        DefaultTableModel model = 
            (DefaultTableModel) jTableBooks.getModel();
        if(jTableBooks.getSelectedRow() == -1){
            if(jTableBooks.getRowCount()==0) {
                JOptionPane.showMessageDialog(null, "No Row has been Selected",
                    "Alert!", JOptionPane.OK_OPTION);
            } else
            JOptionPane.showMessageDialog(null, "Select a Row to be Deleted",
                "Student Records System", JOptionPane.OK_OPTION);
        }
        else{
     
            Object[] options = {"Yes", "No"};
            int confirm = JOptionPane.showOptionDialog(this,
            "Are You Sure",
            "Warning",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,     //do not use a custom Icon
            options,  //the titles of buttons
            options[0]); //default button title
                if (confirm == JOptionPane.YES_OPTION) {
                     String id = jTableBooks.getValueAt(jTableBooks.getSelectedRow(), 0).toString();
                    String sql = "DELETE FROM book WHERE(book_id ="+'"'+id+'"'+")";
                    try {
                        conn con = new conn("YES");
                        PreparedStatement st = con.c.prepareStatement(sql);
                        st.executeUpdate();
                        st.close();
                        con.c.close();
                    } catch(Exception e) {
                        JOptionPane.showMessageDialog(null,"Can Not Delete At this Moment! Try Later"+e.getMessage());
                    }
                    model.removeRow(jTableBooks.getSelectedRow());
                    }
            }                
    }
    
    
    
    
    private void searchTable()  {
      DefaultTableModel model = (DefaultTableModel) jTableBooks.getModel();
            sorter = new TableRowSorter<>(model);
            jTableBooks.setRowSorter(sorter);
                String str = jTextFieldSearch.getText();
                    if  (str.length() == 0) 
                        sorter.setRowFilter(null);
                    else 
                        sorter.setRowFilter(RowFilter.regexFilter(str));
    }
    
    
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
            java.util.logging.Logger.getLogger(All_Books.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(All_Books.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(All_Books.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(All_Books.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new All_Books().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonSearch;
    private javax.swing.JButton jButtonSearch1;
    private javax.swing.JPanel jPanelSearchBar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableBooks;
    private javax.swing.JTextField jTextFieldSearch;
    // End of variables declaration//GEN-END:variables
}
