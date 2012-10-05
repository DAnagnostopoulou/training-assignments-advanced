
/*
 * SliderPanel.java
 *
 * Created on 4 août 2012, 00:25:41
 */
package com.jme3.gde.core.util;

import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

/**
 *
 * @author Nehon
 */
public class SliderPanel extends javax.swing.JPanel {

    protected boolean floatValue = false;

    /** Creates new form SliderPanel */
    public SliderPanel() {
        initComponents();
    }

    public void setRangeInt(int min, int max) {
        jSlider1.setMaximum(max);
        jSlider1.setMinimum(min);
        floatValue = false;
    }

    public void setRangeFloat(float min, float max) {
        jSlider1.setMaximum((int) (max * 100f));
        jSlider1.setMinimum((int) (min * 100f));
        floatValue = true;
    }

    public void setFloatValue(float value) {
        jSlider1.setValue((int) (value * 100f));
    }

    public void setIntValue(int value) {
        jSlider1.setValue(value);
    }

    public float getFloatValue() {
        return (float) jSlider1.getValue() / 100f;

    }

    public int getIntValue() {
        return jSlider1.getValue();
    }

    public void setAsText(String s) {
        try {
            if (floatValue) {
                jSlider1.setValue((int) (Float.parseFloat(s) * 100f));               
            } else {
                jSlider1.setValue(Integer.parseInt(s));                               
            }            
        } catch (NumberFormatException e) {
            jSlider1.setValue(0);
        }
    }
    
    public void addActionListener(ActionListener al) {
        jTextField1.addActionListener(al);
    }

    public void removeActionListener(ActionListener al) {
        jTextField1.removeActionListener(al);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSlider1 = new javax.swing.JSlider();
        jTextField1 = new javax.swing.JTextField();

        jSlider1.setValue(0);
        jSlider1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider1StateChanged(evt);
            }
        });

        jTextField1.setText(org.openide.util.NbBundle.getMessage(SliderPanel.class, "SliderPanel.jTextField1.text")); // NOI18N
        jTextField1.setMaximumSize(new java.awt.Dimension(6, 20));
        jTextField1.setPreferredSize(new java.awt.Dimension(6, 20));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jTextField1PropertyChange(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSlider1, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSlider1, 0, 0, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

private void jSlider1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider1StateChanged
    if (floatValue) {
        jTextField1.setText(((float) jSlider1.getValue() / 100f) + "");        
    } else {
        jTextField1.setText(jSlider1.getValue() + "");
    }

}//GEN-LAST:event_jSlider1StateChanged

private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_jTextField1ActionPerformed

private void jTextField1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jTextField1PropertyChange
    setAsText(jTextField1.getText());
}//GEN-LAST:event_jTextField1PropertyChange

private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
    if (evt.getKeyCode() == KeyEvent.VK_ENTER){
        setAsText(jTextField1.getText());
        jTextField1.setActionCommand("success");
    }
}//GEN-LAST:event_jTextField1KeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSlider jSlider1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}