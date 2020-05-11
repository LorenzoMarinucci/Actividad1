package paquete;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.border.TitledBorder;

import excepciones.CargaInvalidaException;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventana extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JPanel panel;
	private JPanel panel_1;
	private JPanel panel_2;
	private JPanel panel_3;
	private JPanel panel_4;
	private JPanel panel_5;
	private JPanel panel_6;
	private JPanel panel_7;
	private JPanel panel_8;
	private JPanel panel_9;
	private JPanel panel_10;
	private JScrollPane scrollPane;
	private JTextArea textArea;
	private JRadioButton rdbtnDiesel;
	private JRadioButton rdbtnSuper;
	private JRadioButton rdbtnPremium;
	private JButton btnCargarSurtidor;
	private JPanel panel_11;
	private JPanel panel_12;
	private JPanel panel_13;
	private JLabel lblCombustible;
	private JTextField textFieldCombustible;
	private JLabel lblCantidad;
	private JTextField textCantidad;
	private JButton btnCargar;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private Surtidor surtidor = new Surtidor();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana frame = new Ventana();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Ventana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 615, 408);
		this.contentPane = new JPanel();
		this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(this.contentPane);
		this.contentPane.setLayout(new GridLayout(3, 0, 0, 0));
		
		this.panel = new JPanel();
		this.panel.setBorder(new TitledBorder(null, "Cargar Combustible", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		this.contentPane.add(this.panel);
		this.panel.setLayout(new GridLayout(3, 2, 0, 0));
		
		this.panel_12 = new JPanel();
		this.panel.add(this.panel_12);
		
		this.lblCombustible = new JLabel("Combustible:");
		this.panel_12.add(this.lblCombustible);
		
		this.textFieldCombustible = new JTextField();
		this.panel_12.add(this.textFieldCombustible);
		this.textFieldCombustible.setColumns(10);
		
		this.panel_11 = new JPanel();
		this.panel.add(this.panel_11);
		
		this.lblCantidad = new JLabel("Cantidad:");
		this.panel_11.add(this.lblCantidad);
		
		this.textCantidad = new JTextField();
		this.panel_11.add(this.textCantidad);
		this.textCantidad.setColumns(10);
		
		this.panel_13 = new JPanel();
		this.panel.add(this.panel_13);
		
		this.btnCargar = new JButton("Cargar");
		this.btnCargar.addActionListener(this);
		this.panel_13.add(this.btnCargar);
		
		this.panel_1 = new JPanel();
		this.panel_1.setBorder(new TitledBorder(null, "Cargar Surtidor", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		this.contentPane.add(this.panel_1);
		this.panel_1.setLayout(new GridLayout(0, 2, 0, 0));
		
		this.panel_3 = new JPanel();
		this.panel_1.add(this.panel_3);
		this.panel_3.setLayout(new GridLayout(3, 0, 0, 0));
		
		this.panel_5 = new JPanel();
		this.panel_3.add(this.panel_5);
		
		this.rdbtnDiesel = new JRadioButton("Diesel");
		buttonGroup.add(this.rdbtnDiesel);
		this.panel_5.add(this.rdbtnDiesel);
		
		this.panel_6 = new JPanel();
		this.panel_3.add(this.panel_6);
		
		this.rdbtnSuper = new JRadioButton("Super");
		buttonGroup.add(this.rdbtnSuper);
		this.panel_6.add(this.rdbtnSuper);
		
		this.panel_7 = new JPanel();
		this.panel_3.add(this.panel_7);
		
		this.rdbtnPremium = new JRadioButton("Premium");
		buttonGroup.add(this.rdbtnPremium);
		this.panel_7.add(this.rdbtnPremium);
		
		this.panel_4 = new JPanel();
		this.panel_1.add(this.panel_4);
		this.panel_4.setLayout(new GridLayout(3, 0, 0, 0));
		
		this.panel_8 = new JPanel();
		this.panel_4.add(this.panel_8);
		
		this.panel_9 = new JPanel();
		this.panel_4.add(this.panel_9);
		
		this.btnCargarSurtidor = new JButton("Cargar Surtidor");
		this.btnCargarSurtidor.addActionListener(this);
		this.panel_9.add(this.btnCargarSurtidor);
		
		this.panel_10 = new JPanel();
		this.panel_4.add(this.panel_10);
		
		this.panel_2 = new JPanel();
		this.panel_2.setBorder(new TitledBorder(null, "Detalles", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		this.contentPane.add(this.panel_2);
		this.panel_2.setLayout(new BorderLayout(0, 0));
		
		this.scrollPane = new JScrollPane();
		this.panel_2.add(this.scrollPane, BorderLayout.CENTER);
		
		this.textArea = new JTextArea();
		this.scrollPane.setViewportView(this.textArea);
	}

	public void actionPerformed(ActionEvent arg0) {
		
		String boton = arg0.getActionCommand();
		
		if (boton.equals("Cargar"))
			this.cargar();
		else
			if (boton.equals("Cargar Surtidor"))
				this.cargarSurtidor();
	}

	private void cargarSurtidor() {

		if (this.rdbtnDiesel.isSelected())
			surtidor.llenarDiesel();
		else
			if (this.rdbtnPremium.isSelected())
				surtidor.llenarPremium();
			else
				if (this.rdbtnSuper.isSelected())
					surtidor.llenarSuper();
		
		this.textArea.append("Se cargo con exito el surtidor seleccionado" + ".\n");
	}

	private void cargar() {
		
		boolean ex = false;
		
		String combustible = this.textFieldCombustible.getText();
		double cantidad = Double.parseDouble(this.textCantidad.getText());
		
		try {
			surtidor.cargarCombustible(combustible,cantidad);
		} 
		catch (CargaInvalidaException e) {
			ex = true;
			JOptionPane.showMessageDialog(this,e.getMessage());
		}
		finally {
			if (!ex) {
				this.textArea.append("Se cargo con exito una cantidad de " + cantidad + " lts de combustible " + combustible + ".\n");
				this.textArea.append("Cantidad Diesel: " + surtidor.getCantidadDiesel() + "\n");
				this.textArea.append("Cantidad Premium: " + surtidor.getCantidadPremium() + "\n");
				this.textArea.append("Cantidad Super: " + surtidor.getCantidadSuper() + "\n");
			}
		}
		
	}
}
