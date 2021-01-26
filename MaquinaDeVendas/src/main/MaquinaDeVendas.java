package main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MaquinaDeVendas extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtFantaEstoque;
	private JTextField txtSpriteEstoque;
	private JTextField txtCocaColaEstoque;
	private JTextField txtGuaranaEstoque;
	private JTextField txtPepsiEstoque;
	private JTextField txtChaMatteEstoque;
	private JTextField txtDinheiro;
	private JTextField txtTroco;
	private JRadioButton rdbtnCocaCola = new JRadioButton("Coca-Cola - R$ 3.00");
	private JRadioButton rdbtnSprite = new JRadioButton("Sprite - R$ 2.50");
	private JRadioButton rdbtnFanta = new JRadioButton("Fanta - R$ 2.75");
	private JRadioButton rdbtnChaMatte = new JRadioButton("Chá Matte - R$ 5.00");
	private JRadioButton rdbtnPepsi = new JRadioButton("Pepsi - R$ 2.75");
	private JRadioButton rdbtnGuarana = new JRadioButton("Guaraná - R$ 2.50");
	private JButton btnComprar = new JButton("Comprar");
	private JButton btnSair = new JButton("Sair");
	JButton btnLimpar = new JButton("Limpar");
	/**
	 * Launch the application.
	 */

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MaquinaDeVendas frame = new MaquinaDeVendas();
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
	public MaquinaDeVendas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblMquinaDeBebidas = new JLabel("Máquina de Bebidas");
		lblMquinaDeBebidas.setHorizontalAlignment(SwingConstants.CENTER);
		lblMquinaDeBebidas.setFont(new Font("Manjari", Font.BOLD | Font.ITALIC, 20));
		lblMquinaDeBebidas.setBounds(12, 12, 424, 51);
		contentPane.add(lblMquinaDeBebidas);

		JLabel lblSelecioneUmaBebida = new JLabel("Selecione uma Bebida:");
		lblSelecioneUmaBebida.setBounds(12, 180, 167, 15);
		contentPane.add(lblSelecioneUmaBebida);

		rdbtnCocaCola.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(rdbtnCocaCola.isSelected()) {
					rdbtnFanta.setSelected(false);
					rdbtnChaMatte.setSelected(false);
					rdbtnGuarana.setSelected(false);
					rdbtnPepsi.setSelected(false);
					rdbtnSprite.setSelected(false);
				}
			}
		});
		rdbtnCocaCola.setBounds(43, 257, 167, 23);
		contentPane.add(rdbtnCocaCola);

		rdbtnSprite.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(rdbtnSprite.isSelected()) {
					rdbtnFanta.setSelected(false);
					rdbtnChaMatte.setSelected(false);
					rdbtnGuarana.setSelected(false);
					rdbtnPepsi.setSelected(false);
					rdbtnCocaCola.setSelected(false);
				}
			}
		});
		rdbtnSprite.setBounds(43, 230, 149, 23);
		contentPane.add(rdbtnSprite);

		rdbtnFanta.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(rdbtnFanta.isSelected()) {
					rdbtnCocaCola.setSelected(false);
					rdbtnChaMatte.setSelected(false);
					rdbtnGuarana.setSelected(false);
					rdbtnPepsi.setSelected(false);
					rdbtnSprite.setSelected(false);
				}
			}
		});
		rdbtnFanta.setBounds(43, 203, 149, 23);
		contentPane.add(rdbtnFanta);

		rdbtnChaMatte.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(rdbtnChaMatte.isSelected()) {
					rdbtnFanta.setSelected(false);
					rdbtnSprite.setSelected(false);
					rdbtnGuarana.setSelected(false);
					rdbtnPepsi.setSelected(false);
					rdbtnCocaCola.setSelected(false);
				}
			}
		});
		rdbtnChaMatte.setBounds(273, 257, 167, 23);
		contentPane.add(rdbtnChaMatte);

		rdbtnPepsi.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(rdbtnPepsi.isSelected()) {
					rdbtnFanta.setSelected(false);
					rdbtnSprite.setSelected(false);
					rdbtnGuarana.setSelected(false);
					rdbtnChaMatte.setSelected(false);
					rdbtnCocaCola.setSelected(false);
				}
			}
		});
		rdbtnPepsi.setBounds(273, 230, 132, 23);
		contentPane.add(rdbtnPepsi);

		rdbtnGuarana.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(rdbtnGuarana.isSelected()) {
					rdbtnFanta.setSelected(false);
					rdbtnSprite.setSelected(false);
					rdbtnPepsi.setSelected(false);
					rdbtnChaMatte.setSelected(false);
					rdbtnCocaCola.setSelected(false);
				}
			}
		});
		rdbtnGuarana.setBounds(273, 203, 149, 23);
		contentPane.add(rdbtnGuarana);

		txtFantaEstoque = new JTextField();
		txtFantaEstoque.setEditable(false);
		txtFantaEstoque.setBounds(12, 203, 23, 19);
		contentPane.add(txtFantaEstoque);
		txtFantaEstoque.setColumns(10);
		txtFantaEstoque.setText("5");

		txtSpriteEstoque = new JTextField();
		txtSpriteEstoque.setEditable(false);
		txtSpriteEstoque.setColumns(10);
		txtSpriteEstoque.setBounds(12, 232, 23, 19);
		contentPane.add(txtSpriteEstoque);
		txtSpriteEstoque.setText("5");

		txtCocaColaEstoque = new JTextField();
		txtCocaColaEstoque.setEditable(false);
		txtCocaColaEstoque.setColumns(10);
		txtCocaColaEstoque.setBounds(12, 259, 23, 19);
		contentPane.add(txtCocaColaEstoque);
		txtCocaColaEstoque.setText("5");

		txtGuaranaEstoque = new JTextField();
		txtGuaranaEstoque.setEditable(false);
		txtGuaranaEstoque.setColumns(10);
		txtGuaranaEstoque.setBounds(242, 203, 23, 19);
		contentPane.add(txtGuaranaEstoque);
		txtGuaranaEstoque.setText("5");

		txtPepsiEstoque = new JTextField();
		txtPepsiEstoque.setEditable(false);
		txtPepsiEstoque.setColumns(10);
		txtPepsiEstoque.setBounds(242, 230, 23, 19);
		contentPane.add(txtPepsiEstoque);
		txtPepsiEstoque.setText("5");

		txtChaMatteEstoque = new JTextField();
		txtChaMatteEstoque.setEditable(false);
		txtChaMatteEstoque.setColumns(10);
		txtChaMatteEstoque.setBounds(242, 257, 23, 19);
		contentPane.add(txtChaMatteEstoque);
		txtChaMatteEstoque.setText("5");

		JLabel lblInsiraSeuDinheiro = new JLabel("Insira seu Dinheiro:");
		lblInsiraSeuDinheiro.setBounds(85, 63, 139, 15);
		contentPane.add(lblInsiraSeuDinheiro);

		JLabel lblTroco = new JLabel("Troco:");
		lblTroco.setBounds(180, 90, 44, 15);
		contentPane.add(lblTroco);

		txtDinheiro = new JTextField();
		txtDinheiro.setBounds(236, 63, 114, 19);
		contentPane.add(txtDinheiro);
		txtDinheiro.setColumns(10);

		txtTroco = new JTextField();
		txtTroco.setEditable(false);
		txtTroco.setBounds(236, 88, 114, 19);
		contentPane.add(txtTroco);
		txtTroco.setColumns(10);


		btnComprar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(txtDinheiro.getText().trim().isEmpty()) {
					JOptionPane.showMessageDialog(rootPane, "Por favor insira dinheiro!");
				} else {
					double dinheiro = 0;
					int estoqueChaMatte = Integer.parseInt(txtChaMatteEstoque.getText());
					int estoqueCocaCola = Integer.parseInt(txtCocaColaEstoque.getText());
					int estoqueFanta = Integer.parseInt(txtFantaEstoque.getText());				
					int estoqueGuarana = Integer.parseInt(txtGuaranaEstoque.getText());
					int estoqueSprite = Integer.parseInt(txtSpriteEstoque.getText());
					int estoquePepsi = Integer.parseInt(txtPepsiEstoque.getText());
					dinheiro = Double.parseDouble(txtDinheiro.getText());
					

					if(rdbtnChaMatte.isSelected()) {											
						if(estoqueChaMatte > 0) {
							dinheiro = dinheiro - 5.00;
							estoqueChaMatte = estoqueChaMatte - 1;
							txtChaMatteEstoque.setText(String.valueOf(estoqueChaMatte));
						} else {
							JOptionPane.showMessageDialog(rootPane, "Estoque de Cha Matte esgotado!");
						}

					} else if(rdbtnCocaCola.isSelected()) {
						if(estoqueCocaCola > 0) {
							dinheiro = dinheiro - 3.00;
							estoqueCocaCola = estoqueCocaCola - 1;
							txtCocaColaEstoque.setText(String.valueOf(estoqueCocaCola));
						} else {
							JOptionPane.showMessageDialog(rootPane, "Estoque de Coca-Cola esgotado!");
						}

					} else if(rdbtnFanta.isSelected()) {
						if(estoqueFanta > 0) {
							dinheiro = dinheiro - 2.75;
							estoqueFanta = estoqueFanta - 1;
							txtFantaEstoque.setText(String.valueOf(estoqueFanta));
						} else {
							JOptionPane.showMessageDialog(rootPane, "Estoque de Fanta esgotado!");
						}

					} else if(rdbtnGuarana.isSelected()) {
						if(estoqueGuarana > 0) {
							dinheiro = dinheiro - 2.50;
							estoqueGuarana = estoqueGuarana - 1;
							txtGuaranaEstoque.setText(String.valueOf(estoqueGuarana));
						} else {
							JOptionPane.showMessageDialog(rootPane, "Estoque de Guaraná esgotado!");
						}

					} else if(rdbtnSprite.isSelected()) {
						if(estoqueSprite > 0) {
							dinheiro = dinheiro - 2.50;
							estoqueSprite = estoqueSprite - 1;
							txtSpriteEstoque.setText(String.valueOf(estoqueSprite));	
						} else {
							JOptionPane.showMessageDialog(rootPane, "Estoque de Sprite esgotado!");
						}

					} else if(rdbtnPepsi.isSelected()) {
						if(estoquePepsi > 0) {
							dinheiro = dinheiro - 2.75;
							estoquePepsi = estoquePepsi - 1;
							txtPepsiEstoque.setText(String.valueOf(estoquePepsi));
						} else {
							JOptionPane.showMessageDialog(rootPane, "Estoque de Cha Matte esgotado!");
						}
					}

					if(dinheiro < 0) {
						JOptionPane.showMessageDialog(rootPane, "Desculpe, você não tem o dinheiro suficiente!");
					} else {
						txtTroco.setText(Double.toString(dinheiro));
						txtDinheiro.setText("");
					}
				}

			}
		});
		btnComprar.setBounds(12, 288, 117, 25);
		contentPane.add(btnComprar);

		btnSair.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		btnSair.setBounds(319, 288, 117, 25);
		contentPane.add(btnSair);

		btnLimpar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				limpaTela();
				txtDinheiro.setText("");
				txtTroco.setText("");
			}
		});
		btnLimpar.setBounds(165, 288, 117, 25);
		contentPane.add(btnLimpar);
	}

	private void limpaTela() {
		rdbtnCocaCola.setSelected(false);
		rdbtnChaMatte.setSelected(false);
		rdbtnFanta.setSelected(false);
		rdbtnGuarana.setSelected(false);
		rdbtnPepsi.setSelected(false);
		rdbtnSprite.setSelected(false);
	}
}
