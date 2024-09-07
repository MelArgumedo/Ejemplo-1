package alumnos;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class frmAlumnos {
    private JTextField txtPaterno;
    private JTextField txtMaterno;
    private JTextField txtCURP;
    private JTextField txtNombre;
    private JComboBox cmbSexo;
    private JTextField txtCorreo;
    private JTextField txtTelefono;
    private JCheckBox chkDiscapacidad;
    private JButton btnAceptar;
    private JButton btnCancelar;

    public frmAlumnos() {
        btnAceptar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        btnCancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
         Borrar();
            }
        });
    }
    private void Borrar()
    {
        txtNombre.setText("");
        txtPaterno.setText("");
        txtMaterno.setText("");
        txtCURP.setText("");
        txtCorreo.setText("");
        txtTelefono.setText("");
        cmbSexo.setSelectedIndex(0);
        chkDiscapacidad.setSelected(false);

    }
    private void poblarComboBox()
    {
        DefaultComboBoxModel <Genero> modelo = (DefaultComboBoxModel<Genero>) cmbSexo.getModel();
        for(Genero genero: Genero.values()){
            comboBoxModel.addElement(genero);

        }
    }
}
