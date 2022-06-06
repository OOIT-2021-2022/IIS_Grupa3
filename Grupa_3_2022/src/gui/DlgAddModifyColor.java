package gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DlgAddModifyColor extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtFieldRed;
	private JTextField txtFieldGreen;
	private JTextField txtFieldBlue;
	private boolean ok = false;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DlgAddModifyColor dialog = new DlgAddModifyColor();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DlgAddModifyColor() {
		setModal(true);
		setTitle("Dodaj boju");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		GridBagLayout gbl_contentPanel = new GridBagLayout();
		gbl_contentPanel.columnWidths = new int[]{0, 0, 0};
		gbl_contentPanel.rowHeights = new int[]{30, 26, 28, 0};
		gbl_contentPanel.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_contentPanel.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPanel.setLayout(gbl_contentPanel);
		{
			JLabel lblRedColor = new JLabel("Crvena boja");
			GridBagConstraints gbc_lblRedColor = new GridBagConstraints();
			gbc_lblRedColor.insets = new Insets(0, 0, 5, 5);
			gbc_lblRedColor.anchor = GridBagConstraints.EAST;
			gbc_lblRedColor.gridx = 0;
			gbc_lblRedColor.gridy = 0;
			contentPanel.add(lblRedColor, gbc_lblRedColor);
		}
		{
			txtFieldRed = new JTextField();
			GridBagConstraints gbc_txtFieldRed = new GridBagConstraints();
			gbc_txtFieldRed.insets = new Insets(0, 0, 5, 0);
			gbc_txtFieldRed.fill = GridBagConstraints.HORIZONTAL;
			gbc_txtFieldRed.gridx = 1;
			gbc_txtFieldRed.gridy = 0;
			contentPanel.add(txtFieldRed, gbc_txtFieldRed);
			txtFieldRed.setColumns(10);
		}
		{
			JLabel lblGreenColor = new JLabel("Zelena boja");
			GridBagConstraints gbc_lblGreenColor = new GridBagConstraints();
			gbc_lblGreenColor.anchor = GridBagConstraints.EAST;
			gbc_lblGreenColor.insets = new Insets(0, 0, 5, 5);
			gbc_lblGreenColor.gridx = 0;
			gbc_lblGreenColor.gridy = 1;
			contentPanel.add(lblGreenColor, gbc_lblGreenColor);
		}
		{
			txtFieldGreen = new JTextField();
			GridBagConstraints gbc_txtFieldGreen = new GridBagConstraints();
			gbc_txtFieldGreen.insets = new Insets(0, 0, 5, 0);
			gbc_txtFieldGreen.fill = GridBagConstraints.HORIZONTAL;
			gbc_txtFieldGreen.gridx = 1;
			gbc_txtFieldGreen.gridy = 1;
			contentPanel.add(txtFieldGreen, gbc_txtFieldGreen);
			txtFieldGreen.setColumns(10);
		}
		{
			JLabel lblBlueColor = new JLabel("Plava boja");
			GridBagConstraints gbc_lblBlueColor = new GridBagConstraints();
			gbc_lblBlueColor.insets = new Insets(0, 0, 0, 5);
			gbc_lblBlueColor.anchor = GridBagConstraints.EAST;
			gbc_lblBlueColor.gridx = 0;
			gbc_lblBlueColor.gridy = 2;
			contentPanel.add(lblBlueColor, gbc_lblBlueColor);
		}
		{
			txtFieldBlue = new JTextField();
			GridBagConstraints gbc_txtFieldBlue = new GridBagConstraints();
			gbc_txtFieldBlue.fill = GridBagConstraints.HORIZONTAL;
			gbc_txtFieldBlue.gridx = 1;
			gbc_txtFieldBlue.gridy = 2;
			contentPanel.add(txtFieldBlue, gbc_txtFieldBlue);
			txtFieldBlue.setColumns(10);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						if(txtFieldRed.getText().equals("")) {
							JOptionPane.showMessageDialog(null, "Popunite polja",
									"Poruka korisniku", JOptionPane.ERROR_MESSAGE);
						}else {
							ok=true;
							setVisible(false);
						}
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						setVisible(false);
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

	public JTextField getTxtFieldRed() {
		return txtFieldRed;
	}

	public void setTxtFieldRed(JTextField txtFieldRed) {
		this.txtFieldRed = txtFieldRed;
	}

	public JTextField getTxtFieldGreen() {
		return txtFieldGreen;
	}

	public void setTxtFieldGreen(JTextField txtFieldGreen) {
		this.txtFieldGreen = txtFieldGreen;
	}

	public JTextField getTxtFieldBlue() {
		return txtFieldBlue;
	}

	public void setTxtFieldBlue(JTextField txtFieldBlue) {
		this.txtFieldBlue = txtFieldBlue;
	}

	public boolean isOk() {
		return ok;
	}
	
	
	
	

}
