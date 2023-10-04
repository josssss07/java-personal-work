package edu;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.security.PublicKey;
 
import javax.swing.event.*;
import javax.swing.tree.*;
 
 
public class TreeDemo implements TreeSelectionListener {
    JPanel p;
    JFrame f;
    JTree tree;
    DefaultMutableTreeNode r, a, a1, a2, a3, b, b1, b2, b3;
    JTextField tf;
    
    TreeDemo(){
        r = new DefaultMutableTreeNode("R");
        a = new DefaultMutableTreeNode("A");
        a1 = new DefaultMutableTreeNode("A1");
        a2 = new DefaultMutableTreeNode("A2");
        a3 = new DefaultMutableTreeNode("A3");
        b = new DefaultMutableTreeNode("B");
        b1 = new DefaultMutableTreeNode("B1");
        b2 = new DefaultMutableTreeNode("B2");
        b3 = new DefaultMutableTreeNode("B3");
        tf = new JTextField();
        a.add(a1);
        a.add(a2);
        a.add(a3);
        b.add(b1);
        b.add(b2);
        b.add(b3);
        r.add(a);
        r.add(b);
        
        tree = new JTree(r);
        tree.addTreeSelectionListener(this);
        
        p = new JPanel();
        p.setLayout(new BorderLayout());
        p.add("Center",tree);
        p.add("South",tf);
        
        f = new JFrame();
        f.add(p);
        f.setSize(200,300);
        f.setVisible(true); 
    }
    
    public void valueChanged(TreeSelectionEvent e) {
        tf.setText(e.getPath().toString());
    }
    public static void main(String[] args) {
        new TreeDemo();
    }
 
}