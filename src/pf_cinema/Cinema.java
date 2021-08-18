package pf_cinema;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Cinema extends JPanel {
	double comida1, comida2, comida3, comida4, comida5, comida6, comida7, comida8, comida9, comida10, comida11,
	comida12, comida13, comida14;
	private JTabbedPane tpAbas; // COMPONENTE QUE CRIA ABAS NA JANELA
	private JProgressBar pblotacao;
	private JButton filtrar, Verificar,comprar;
	private JCheckBox lanche1, lanche2, lanche3, acompanhamento1, acompanhamento2, bebida1,
	bebida2, bebida3, sobremesa1, sobremesa2;
	private ImageIcon m1, m2, m3, m4, img0, img1, img2, img3, img4, img5, img6, img7, img8, img9, img10, img11, img12,
	img13, img14, img15, img16, img17, img18, img19, img20, img22, img23, img24, img25, img26, img27, img29,
	img30, img31, img32, img33, img34, img35, img36, img37, img38, img39, img40, img41, img42, img43, img44,
	img45, img46, img47, img48, img49, img50, img51, img52, img53, img54, img55, img56, img57, img58, img59,
	img60, img61, img62, img63, img64, img65, img66, img67, img68, img69, img70, img71, img72, img73, img74,
	img75, img76, img77, img78, img79, img80, img81, img82, img83, img84, img85, img86, img87, img88, img89,
	img90, img91, img92, img93, img94, img95, img96, img97, img98, img99, img100, img101, img102, img103,
	img104, img105, img106, img107, img108, img109, img110, img111, img112, img113, img114, img115, img116,
	img117, img118, img119, img120, img121, img122, img123, img124, img125, img126, img127, img128, img129,
	img130, img131, img132, img133, img134, img135, img136, img137, img138, img139, img140, img141, img142,
	img143, img144, img145, img146, img147, img148, img149, img150, img151, img152, img153, img154, img155,
	img156, img157, img158, img159, img160, img161, img162, img163, img164, img165, img166, img167, img168,
	img169, img170, img171, img172, img173, img174, img175, img176, img177, img178, img179, img180, img181,
	img182, img183, img184, img185, img186, img187, img188, img189;
	private JLabel imgback1, imgback2, imgback3, imgback4, imgback5, moldura1, moldura2, moldura3, moldura4, banner1,
	banner2, banner3, banner4, banner5, banner6, banner7, banner8, banner9, banner10, banner11, banner12,
	banner13, banner14, banner15, banner16, food1, food2, food3, food4, food5, food6, food7, food8, food9,
	food10, MRburger, MRdog, pagamento, payment1, payment2, payment3, moldura5, moldura6, moldura7,
	desclanchonete, ticket1, ticket2, ticket3, ticket4, ticket5, ticket6, ticket7, ticket8, ticket9, ticket10,
	ticket11, ticket12, ticket13, ticket14, ticket15, ticket16, ticket17, ticket18, ticket19, ticket20,
	ticket21, ticket22, ticket23, ticket24, ticket25, ticket26, ticket27, ticket28, ticket29, ticket30,
	ticket31, ticket32, ticket33, ticket34, ticket35, ticket36, ticket37, ticket38, ticket39, ticket40,
	ticket41, ticket42, ticket43, ticket44, ticket45, ticket46, ticket47, ticket48, ticket49, ticket50,
	ticket51, ticket52, ticket53, ticket54, ticket55, ticket56, ticket57, ticket58, ticket59, ticket60,
	ticket61, ticket62, ticket63, ticket64, ticket65, ticket66, ticket67, ticket68, ticket69, ticket70,
	ticket71, ticket72, ticket73, ticket74, ticket75, ticket76, ticket77, ticket78, ticket79, ticket80,
	ticket81, ticket82, ticket83, ticket84, ticket85, ticket86, ticket87, ticket88, ticket89, ticket90,
	ticket91, ticket92, ticket93, ticket94, ticket95, ticket96, ticket97, ticket98, ticket99, ticket100,
	ticket101, ticket102, ticket103, ticket104, ticket105, ticket106, ticket107, ticket108, ticket109,
	ticket110, ticket111, ticket112, ticket113, ticket114, ticket115, ticket116, ticket117, ticket118,
	ticket119, ticket120, ticket121, ticket122, ticket123, ticket124, ticket125, ticket126, ticket127,
	ticket128, ticket129, ticket130, ticket131, ticket132, ticket133, ticket134, ticket135, ticket136,
	ticket137, ticket138, ticket139, ticket140, ticket141, ticket142, ticket143, ticket144, ticket145,
	ticket146, ticket147, ticket148, ticket149, ticket150, lotacao;
	private JRadioButton filtro1, filtro2, filtro3, filtro4, cartao, vr, dinheiro;
	private JRadioButton filme1, filme2, filme3, filme4, filme5, filme6, filme7, filme8, filme9, filme10, filme11,
	filme12, filme13, filme14, filme15, filme16, inteira1, inteira2, inteira3, inteira4, inteira5, inteira6,
	inteira7, inteira8, inteira9, inteira10, inteira11, inteira12, inteira13, inteira14, inteira15, inteira16,
	inteira17, inteira18, inteira19, inteira20, inteira21, inteira22, inteira23, inteira24, inteira25,
	inteira26, inteira27, inteira28, inteira29, inteira30, inteira31, inteira32, inteira33, inteira34,
	inteira35, inteira36, inteira37, inteira38, inteira39, inteira40, inteira41, inteira42, inteira43,
	inteira44, inteira45, inteira46, inteira47, inteira48, inteira49, inteira50, meia1, meia2, meia3, meia4,
	meia5, meia6, meia7, meia8, meia9, meia10, meia11, meia12, meia13, meia14, meia15, meia16, meia17, meia18,
	meia19, meia20, meia21, meia22, meia23, meia24, meia25, meia26, meia27, meia28, meia29, meia30, meia31,
	meia32, meia33, meia34, meia35, meia36, meia37, meia38, meia39, meia40, meia41, meia42, meia43, meia44,
	meia45, meia46, meia47, meia48, meia49, meia50;
	private ButtonGroup btGroup1, btGroup2, btGroup3,btGroup4,btGroup5,btGroup6,btGroup7,btGroup8,btGroup9,btGroup10,btGroup11,btGroup12,btGroup13,btGroup14,btGroup15,btGroup16,btGroup17,btGroup18,btGroup19,btGroup20,btGroup21,btGroup22,btGroup23,btGroup24,btGroup25,btGroup26,btGroup27,btGroup28,btGroup29,btGroup30,btGroup31,btGroup32,btGroup33,btGroup34,btGroup35,btGroup36,btGroup37,btGroup38,btGroup39,btGroup40,btGroup41,btGroup42,btGroup43,btGroup44,btGroup45,btGroup46,btGroup47,btGroup48,btGroup49,btGroup50,btGroup51,btGroup52,btGroup53;
	private JPanel panel1, panel2, panel3, panel4;// COMPONENTE INVISIVEL QUE AGRUPA OUTROS COMPONENTES DENTRO DELE
	static ImageIcon icon = new ImageIcon(
			"C:\\Users\\Raio1\\Desktop\\CEAP\\Aulas Java\\pf_cinema\\src\\imagem\\3d.png");

	public Cinema() {
		inicializarComponentes();
		definirEventos();
	}

	private void inicializarComponentes() {
		setLayout(null);

		panel1 = new JPanel(null);
		m1 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\moldura.png");
		m2 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\moldura.png");
		m3 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\moldura.png");
		m4 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\moldura.png");
		img0 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\cinema.png");
		img1 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\vendetta.jpg");
		img2 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\venom.jpg");
		img3 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\fury.jpg");
		img4 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\pikachu.jpg");
		img5 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\avatar.jpg");
		img6 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\hp.jpg");
		img7 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\fantasticbeasts.jpg");
		img8 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\peterpan.jpg");
		img9 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\rl.png");
		img10 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\kfp3.jpg");
		img11 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\ht3.jpg");
		img12 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\dragao3.jpeg");
		img13 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\hush.jpg");
		img14 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\parasita.jpg");
		img15 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\birdbox.jpg");
		img16 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\ulsilencioso.jpg");

		filtro1 = new JRadioButton("AÇÃO");
		filtro2 = new JRadioButton("AVENTURA");
		filtro3 = new JRadioButton("INFANTIL");
		filtro4 = new JRadioButton("SUSPENSE");
		filme1 = new JRadioButton("QUERO ASSISTIR!");
		filme2 = new JRadioButton("QUERO ASSISTIR!");
		filme3 = new JRadioButton("QUERO ASSISTIR!");
		filme4 = new JRadioButton("QUERO ASSISTIR!");
		filme5 = new JRadioButton("QUERO ASSISTIR!");
		filme6 = new JRadioButton("QUERO ASSISTIR!");
		filme7 = new JRadioButton("QUERO ASSISTIR!");
		filme8 = new JRadioButton("QUERO ASSISTIR!");
		filme9 = new JRadioButton("QUERO ASSISTIR!");
		filme10 = new JRadioButton("QUERO ASSISTIR!");
		filme11 = new JRadioButton("QUERO ASSISTIR!");
		filme12 = new JRadioButton("QUERO ASSISTIR!");
		filme13 = new JRadioButton("QUERO ASSISTIR!");
		filme14 = new JRadioButton("QUERO ASSISTIR!");
		filme15 = new JRadioButton("QUERO ASSISTIR!");
		filme16 = new JRadioButton("QUERO ASSISTIR!");
		moldura1 = new JLabel(m1);
		moldura2 = new JLabel(m2);
		moldura3 = new JLabel(m3);
		moldura4 = new JLabel(m4);
		banner1 = new JLabel(img1);
		banner2 = new JLabel(img2);
		banner3 = new JLabel(img3);
		banner4 = new JLabel(img4);
		banner5 = new JLabel(img5);
		banner6 = new JLabel(img6);
		banner7 = new JLabel(img7);
		banner8 = new JLabel(img8);
		banner9 = new JLabel(img9);
		banner10 = new JLabel(img10);
		banner11 = new JLabel(img11);
		banner12 = new JLabel(img12);
		banner13 = new JLabel(img13);
		banner14 = new JLabel(img14);
		banner15 = new JLabel(img15);
		banner16 = new JLabel(img16);
		imgback1 = new JLabel(img0);
		filtrar = new JButton("Filtrar");

		banner1.setBounds(30, 20, 90, 148);
		banner2.setBounds(200, 20, 90, 148);
		banner3.setBounds(30, 230, 90, 148);
		banner4.setBounds(200, 230, 90, 148);
		banner5.setBounds(30, 20, 90, 148);
		banner6.setBounds(200, 20, 90, 148);
		banner7.setBounds(30, 230, 90, 148);
		banner8.setBounds(200, 230, 90, 148);
		banner9.setBounds(30, 20, 90, 148);
		banner10.setBounds(200, 20, 90, 148);
		banner11.setBounds(30, 230, 90, 148);
		banner12.setBounds(200, 230, 90, 148);
		banner13.setBounds(30, 20, 90, 148);
		banner14.setBounds(200, 20, 90, 148);
		banner15.setBounds(30, 230, 90, 148);
		banner16.setBounds(200, 230, 90, 148);
		filme1.setBounds(10, 180, 130, 25);
		filme2.setBounds(10, 390, 130, 25);
		filme3.setBounds(180, 180, 130, 25);
		filme4.setBounds(180, 390, 130, 25);
		filme5.setBounds(10, 180, 130, 25);
		filme6.setBounds(10, 390, 130, 25);
		filme7.setBounds(180, 180, 130, 25);
		filme8.setBounds(180, 390, 130, 25);
		filme9.setBounds(10, 180, 130, 25);
		filme10.setBounds(10, 390, 130, 25);
		filme11.setBounds(180, 180, 130, 25);
		filme12.setBounds(180, 390, 130, 25);
		filme13.setBounds(10, 180, 130, 25);
		filme14.setBounds(10, 390, 130, 25);
		filme15.setBounds(180, 180, 130, 25);
		filme16.setBounds(180, 390, 130, 25);
		filtro1.setBounds(550, 280, 125, 20);
		filtro2.setBounds(550, 300, 125, 20);
		filtro3.setBounds(550, 320, 125, 20);
		filtro4.setBounds(550, 340, 125, 20);
		filtrar.setBounds(550, 410, 100, 20);
		moldura1.setBounds(3, 20, 152, 141);
		moldura2.setBounds(170, 20, 152, 141);
		moldura3.setBounds(3, 230, 152, 141);
		moldura4.setBounds(170, 230, 152, 141);
		imgback1.setBounds(0, 0, 920, 518);

		panel1.add(banner1);
		panel1.add(banner2);
		panel1.add(banner3);
		panel1.add(banner4);
		panel1.add(banner5);
		panel1.add(banner6);
		panel1.add(banner7);
		panel1.add(banner8);
		panel1.add(banner9);
		panel1.add(banner10);
		panel1.add(banner11);
		panel1.add(banner12);
		panel1.add(banner13);
		panel1.add(banner14);
		panel1.add(banner15);
		panel1.add(banner16);
		panel1.add(filtro1);
		panel1.add(filtro2);
		panel1.add(filtro3);
		panel1.add(filtro4);
		panel1.add(filme1);
		panel1.add(filme2);
		panel1.add(filme3);
		panel1.add(filme4);
		panel1.add(filme5);
		panel1.add(filme6);
		panel1.add(filme7);
		panel1.add(filme8);
		panel1.add(filme9);
		panel1.add(filme10);
		panel1.add(filme11);
		panel1.add(filme12);
		panel1.add(filme13);
		panel1.add(filme14);
		panel1.add(filme15);
		panel1.add(filme16);
		panel1.add(filtrar);
		panel1.add(moldura1);
		panel1.add(moldura2);
		panel1.add(moldura3);
		panel1.add(moldura4);
		panel1.add(imgback1);
		btGroup1 = new ButtonGroup();
		btGroup1.add(filme1);
		btGroup1.add(filme2);
		btGroup1.add(filme3);
		btGroup1.add(filme4);
		btGroup1.add(filme5);
		btGroup1.add(filme6);
		btGroup1.add(filme7);
		btGroup1.add(filme8);
		btGroup1.add(filme9);
		btGroup1.add(filme10);
		btGroup1.add(filme11);
		btGroup1.add(filme12);
		btGroup1.add(filme13);
		btGroup1.add(filme14);
		btGroup1.add(filme15);
		btGroup1.add(filme16);
		btGroup2 = new ButtonGroup();
		btGroup2.add(filtro1);
		btGroup2.add(filtro2);
		btGroup2.add(filtro3);
		btGroup2.add(filtro4);

		filme1.setVisible(false);
		filme2.setVisible(false);
		filme3.setVisible(false);
		filme4.setVisible(false);
		filme5.setVisible(false);
		filme6.setVisible(false);
		filme7.setVisible(false);
		filme8.setVisible(false);
		filme9.setVisible(false);
		filme10.setVisible(false);
		filme11.setVisible(false);
		filme12.setVisible(false);
		filme13.setVisible(false);
		filme14.setVisible(false);
		filme15.setVisible(false);
		filme16.setVisible(false);
		banner1.setVisible(false);
		banner2.setVisible(false);
		banner3.setVisible(false);
		banner4.setVisible(false);
		banner5.setVisible(false);
		banner6.setVisible(false);
		banner7.setVisible(false);
		banner8.setVisible(false);
		banner9.setVisible(false);
		banner10.setVisible(false);
		banner11.setVisible(false);
		banner12.setVisible(false);
		banner13.setVisible(false);
		banner14.setVisible(false);
		banner15.setVisible(false);
		banner16.setVisible(false);

		filme1.setFont(new Font("fixed sys", Font.BOLD, 12));
		filme1.setForeground(new Color(255, 255, 255));
		filme1.setOpaque(false);
		filme2.setFont(new Font("fixed sys", Font.BOLD, 12));
		filme2.setForeground(new Color(255, 255, 255));
		filme2.setOpaque(false);
		filme3.setFont(new Font("fixed sys", Font.BOLD, 12));
		filme3.setForeground(new Color(255, 255, 255));
		filme3.setOpaque(false);
		filme4.setFont(new Font("fixed sys", Font.BOLD, 12));
		filme4.setForeground(new Color(255, 255, 255));
		filme4.setOpaque(false);
		filme5.setFont(new Font("fixed sys", Font.BOLD, 12));
		filme5.setForeground(new Color(255, 255, 255));
		filme5.setOpaque(false);
		filme6.setFont(new Font("fixed sys", Font.BOLD, 12));
		filme6.setForeground(new Color(255, 255, 255));
		filme6.setOpaque(false);
		filme7.setFont(new Font("fixed sys", Font.BOLD, 12));
		filme7.setForeground(new Color(255, 255, 255));
		filme7.setOpaque(false);
		filme8.setFont(new Font("fixed sys", Font.BOLD, 12));
		filme8.setForeground(new Color(255, 255, 255));
		filme8.setOpaque(false);
		filme9.setFont(new Font("fixed sys", Font.BOLD, 12));
		filme9.setForeground(new Color(255, 255, 255));
		filme9.setOpaque(false);
		filme10.setFont(new Font("fixed sys", Font.BOLD, 12));
		filme10.setForeground(new Color(255, 255, 255));
		filme10.setOpaque(false);
		filme11.setFont(new Font("fixed sys", Font.BOLD, 12));
		filme11.setForeground(new Color(255, 255, 255));
		filme11.setOpaque(false);
		filme12.setFont(new Font("fixed sys", Font.BOLD, 12));
		filme12.setForeground(new Color(255, 255, 255));
		filme12.setOpaque(false);
		filme13.setFont(new Font("fixed sys", Font.BOLD, 12));
		filme13.setForeground(new Color(255, 255, 255));
		filme13.setOpaque(false);
		filme14.setFont(new Font("fixed sys", Font.BOLD, 12));
		filme14.setForeground(new Color(255, 255, 255));
		filme14.setOpaque(false);
		filme15.setFont(new Font("fixed sys", Font.BOLD, 12));
		filme15.setForeground(new Color(255, 255, 255));
		filme15.setOpaque(false);
		filme16.setFont(new Font("fixed sys", Font.BOLD, 12));
		filme16.setForeground(new Color(255, 255, 255));
		filme16.setOpaque(false);
		filtro1.setFont(new Font("fixed sys", Font.BOLD, 15));
		filtro1.setForeground(new Color(255, 255, 255));
		filtro1.setOpaque(false);
		filtro2.setFont(new Font("fixed sys", Font.BOLD, 15));
		filtro2.setForeground(new Color(255, 255, 255));
		filtro2.setOpaque(false);
		filtro3.setFont(new Font("fixed sys", Font.BOLD, 15));
		filtro3.setForeground(new Color(255, 255, 255));
		filtro3.setOpaque(false);
		filtro4.setFont(new Font("fixed sys", Font.BOLD, 15));
		filtro4.setForeground(new Color(255, 255, 255));
		filtro4.setOpaque(false);

		panel2 = new JPanel(null);

		img40 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\ticketred.png");
		img41 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\ticketred.png");
		img42 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\ticketred.png");
		img43 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\ticketred.png");
		img44 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\ticketred.png");
		img45 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\ticketred.png");
		img46 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\ticketred.png");
		img47 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\ticketred.png");
		img48 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\ticketred.png");
		img49 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\ticketred.png");
		img50 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\ticketred.png");
		img51 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\ticketred.png");
		img52 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\ticketred.png");
		img53 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\ticketred.png");
		img54 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\ticketred.png");
		img55 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\ticketred.png");
		img56 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\ticketred.png");
		img57 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\ticketred.png");
		img58 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\ticketred.png");
		img59 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\ticketred.png");
		img60 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\ticketred.png");
		img61 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\ticketred.png");
		img62 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\ticketred.png");
		img63 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\ticketred.png");
		img64 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\ticketred.png");
		img65 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\ticketred.png");
		img66 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\ticketred.png");
		img67 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\ticketred.png");
		img68 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\ticketred.png");
		img69 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\ticketred.png");
		img70 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\ticketred.png");
		img71 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\ticketred.png");
		img72 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\ticketred.png");
		img73 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\ticketred.png");
		img74 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\ticketred.png");
		img75 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\ticketred.png");
		img76 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\ticketred.png");
		img77 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\ticketred.png");
		img78 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\ticketred.png");
		img79 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\ticketred.png");
		img80 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\ticketred.png");
		img81 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\ticketred.png");
		img82 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\ticketred.png");
		img83 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\ticketred.png");
		img84 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\ticketred.png");
		img85 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\ticketred.png");
		img86 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\ticketred.png");
		img87 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\ticketred.png");
		img88 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\ticketred.png");
		img89 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\ticketred.png");
		img90 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\ticketgreen.png");
		img91 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\ticketgreen.png");
		img92 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\ticketgreen.png");
		img93 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\ticketgreen.png");
		img94 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\ticketgreen.png");
		img95 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\ticketgreen.png");
		img96 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\ticketgreen.png");
		img97 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\ticketgreen.png");
		img98 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\ticketgreen.png");
		img99 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\ticketgreen.png");
		img100 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\ticketgreen.png");
		img101 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\ticketgreen.png");
		img102 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\ticketgreen.png");
		img103 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\ticketgreen.png");
		img104 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\ticketgreen.png");
		img105 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\ticketgreen.png");
		img106 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\ticketgreen.png");
		img107 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\ticketgreen.png");
		img108 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\ticketgreen.png");
		img109 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\ticketgreen.png");
		img110 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\ticketgreen.png");
		img111 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\ticketgreen.png");
		img112 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\ticketgreen.png");
		img113 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\ticketgreen.png");
		img114 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\ticketgreen.png");
		img115 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\ticketgreen.png");
		img116 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\ticketgreen.png");
		img117 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\ticketgreen.png");
		img118 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\ticketgreen.png");
		img119 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\ticketgreen.png");
		img120 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\ticketgreen.png");
		img121 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\ticketgreen.png");
		img122 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\ticketgreen.png");
		img123 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\ticketgreen.png");
		img124 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\ticketgreen.png");
		img125 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\ticketgreen.png");
		img126 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\ticketgreen.png");
		img127 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\ticketgreen.png");
		img128 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\ticketgreen.png");
		img129 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\ticketgreen.png");
		img130 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\ticketgreen.png");
		img131 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\ticketgreen.png");
		img132 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\ticketgreen.png");
		img133 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\ticketgreen.png");
		img134 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\ticketgreen.png");
		img135 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\ticketgreen.png");
		img136 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\ticketgreen.png");
		img137 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\ticketgreen.png");
		img138 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\ticketgreen.png");
		img139 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\ticketgreen.png");
		img140 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\ticketblue.png");
		img141 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\ticketblue.png");
		img142 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\ticketblue.png");
		img143 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\ticketblue.png");
		img144 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\ticketblue.png");
		img145 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\ticketblue.png");
		img146 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\ticketblue.png");
		img147 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\ticketblue.png");
		img148 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\ticketblue.png");
		img149 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\ticketblue.png");
		img150 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\ticketblue.png");
		img151 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\ticketblue.png");
		img152 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\ticketblue.png");
		img153 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\ticketblue.png");
		img154 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\ticketblue.png");
		img155 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\ticketblue.png");
		img156 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\ticketblue.png");
		img157 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\ticketblue.png");
		img158 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\ticketblue.png");
		img159 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\ticketblue.png");
		img160 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\ticketblue.png");
		img161 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\ticketblue.png");
		img162 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\ticketblue.png");
		img163 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\ticketblue.png");
		img164 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\ticketblue.png");
		img165 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\ticketblue.png");
		img166 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\ticketblue.png");
		img167 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\ticketblue.png");
		img168 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\ticketblue.png");
		img169 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\ticketblue.png");
		img170 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\ticketblue.png");
		img171 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\ticketblue.png");
		img172 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\ticketblue.png");
		img173 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\ticketblue.png");
		img174 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\ticketblue.png");
		img175 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\ticketblue.png");
		img176 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\ticketblue.png");
		img177 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\ticketblue.png");
		img178 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\ticketblue.png");
		img179 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\ticketblue.png");
		img180 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\ticketblue.png");
		img181 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\ticketblue.png");
		img182 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\ticketblue.png");
		img183 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\ticketblue.png");
		img184 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\ticketblue.png");
		img185 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\ticketblue.png");
		img186 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\ticketblue.png");
		img187 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\ticketblue.png");
		img188 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\ticketblue.png");
		img189 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\ticketblue.png");
		img18 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\fundoboladao.jpg");

		inteira1 = new JRadioButton("I1");
		inteira2 = new JRadioButton("I2");
		inteira3 = new JRadioButton("I3");
		inteira4 = new JRadioButton("I4");
		inteira5 = new JRadioButton("I5");
		inteira6 = new JRadioButton("I6");
		inteira7 = new JRadioButton("I7");
		inteira8 = new JRadioButton("I8");
		inteira9 = new JRadioButton("I9");
		inteira10 = new JRadioButton("I10");
		inteira11 = new JRadioButton("I11");
		inteira12 = new JRadioButton("I12");
		inteira13 = new JRadioButton("I13");
		inteira14 = new JRadioButton("I14");
		inteira15 = new JRadioButton("I15");
		inteira16 = new JRadioButton("I16");
		inteira17 = new JRadioButton("I17");
		inteira18 = new JRadioButton("I18");
		inteira19 = new JRadioButton("I19");
		inteira20 = new JRadioButton("I20");
		inteira21 = new JRadioButton("I21");
		inteira22 = new JRadioButton("I22");
		inteira23 = new JRadioButton("I23");
		inteira24 = new JRadioButton("I24");
		inteira25 = new JRadioButton("I25");
		inteira26 = new JRadioButton("I26");
		inteira27 = new JRadioButton("I27");
		inteira28 = new JRadioButton("I28");
		inteira29 = new JRadioButton("I29");
		inteira30 = new JRadioButton("I30");
		inteira31 = new JRadioButton("I31");
		inteira32 = new JRadioButton("I32");
		inteira33 = new JRadioButton("I33");
		inteira34 = new JRadioButton("I34");
		inteira35 = new JRadioButton("I35");
		inteira36 = new JRadioButton("I36");
		inteira37 = new JRadioButton("I37");
		inteira38 = new JRadioButton("I38");
		inteira39 = new JRadioButton("I39");
		inteira40 = new JRadioButton("I40");
		inteira41 = new JRadioButton("I41");
		inteira42 = new JRadioButton("I42");
		inteira43 = new JRadioButton("I43");
		inteira44 = new JRadioButton("I44");
		inteira45 = new JRadioButton("I45");
		inteira46 = new JRadioButton("I46");
		inteira47 = new JRadioButton("I47");
		inteira48 = new JRadioButton("I48");
		inteira49 = new JRadioButton("I49");
		inteira50 = new JRadioButton("I50");

		meia1 = new JRadioButton("M1");
		meia2 = new JRadioButton("M2");
		meia3 = new JRadioButton("M3");
		meia4 = new JRadioButton("M4");
		meia5 = new JRadioButton("M5");
		meia6 = new JRadioButton("M6");
		meia7 = new JRadioButton("M7");
		meia8 = new JRadioButton("M8");
		meia9 = new JRadioButton("M9");
		meia10 = new JRadioButton("M10");
		meia11 = new JRadioButton("M11");
		meia12 = new JRadioButton("M12");
		meia13 = new JRadioButton("M13");
		meia14 = new JRadioButton("M14");
		meia15 = new JRadioButton("M15");
		meia16 = new JRadioButton("M16");
		meia17 = new JRadioButton("M17");
		meia18 = new JRadioButton("M18");
		meia19 = new JRadioButton("M19");
		meia20 = new JRadioButton("M20");
		meia21 = new JRadioButton("M21");
		meia22 = new JRadioButton("M22");
		meia23 = new JRadioButton("M23");
		meia24 = new JRadioButton("M24");
		meia25 = new JRadioButton("M25");
		meia26 = new JRadioButton("M26");
		meia27 = new JRadioButton("M27");
		meia28 = new JRadioButton("M28");
		meia29 = new JRadioButton("M29");
		meia30 = new JRadioButton("M30");
		meia31 = new JRadioButton("M31");
		meia32 = new JRadioButton("M32");
		meia33 = new JRadioButton("M33");
		meia34 = new JRadioButton("M34");
		meia35 = new JRadioButton("M35");
		meia36 = new JRadioButton("M36");
		meia37 = new JRadioButton("M37");
		meia38 = new JRadioButton("M38");
		meia39 = new JRadioButton("M39");
		meia40 = new JRadioButton("M40");
		meia41 = new JRadioButton("M41");
		meia42 = new JRadioButton("M42");
		meia43 = new JRadioButton("M43");
		meia44 = new JRadioButton("M44");
		meia45 = new JRadioButton("M45");
		meia46 = new JRadioButton("M46");
		meia47 = new JRadioButton("M47");
		meia48 = new JRadioButton("M48");
		meia49 = new JRadioButton("M49");
		meia50 = new JRadioButton("M50");
		
		pblotacao = new JProgressBar();
		
		btGroup4 = new ButtonGroup();
		btGroup4.add(inteira1);
		btGroup4.add(meia1);
		
		btGroup5 = new ButtonGroup();
		btGroup5.add(inteira2);
		btGroup5.add(meia2);
		
		btGroup6 = new ButtonGroup();
		btGroup6.add(inteira3);
		btGroup6.add(meia3);
		
		btGroup7 = new ButtonGroup();
		btGroup7.add(inteira4);
		btGroup7.add(meia4);
		
		btGroup8 = new ButtonGroup();
		btGroup8.add(inteira5);
		btGroup8.add(meia5);
		
		btGroup9 = new ButtonGroup();
		btGroup9.add(inteira6);
		btGroup9.add(meia6);
		
		btGroup10 = new ButtonGroup();
		btGroup10.add(inteira7);
		btGroup10.add(meia7);
		
		btGroup11 = new ButtonGroup();
		btGroup11.add(inteira8);
		btGroup11.add(meia8);
		
		btGroup12 = new ButtonGroup();
		btGroup12.add(inteira9);
		btGroup12.add(meia9);
		
		btGroup13 = new ButtonGroup();
		btGroup13.add(inteira10);
		btGroup13.add(meia10);
		
		btGroup14 = new ButtonGroup();
		btGroup14.add(inteira11);
		btGroup14.add(meia11);
		
		btGroup15 = new ButtonGroup();
		btGroup15.add(inteira12);
		btGroup15.add(meia12);
		
		btGroup16 = new ButtonGroup();
		btGroup16.add(inteira13);
		btGroup16.add(meia13);
		
		btGroup17 = new ButtonGroup();
		btGroup17.add(inteira14);
		btGroup17.add(meia14);
		
		btGroup18 = new ButtonGroup();
		btGroup18.add(inteira15);
		btGroup18.add(meia15);
		
		btGroup19 = new ButtonGroup();
		btGroup19.add(inteira16);
		btGroup19.add(meia16);
		
		btGroup20 = new ButtonGroup();
		btGroup20.add(inteira17);
		btGroup20.add(meia17);
		
		btGroup21 = new ButtonGroup();
		btGroup21.add(inteira18);
		btGroup21.add(meia18);
		
		btGroup22 = new ButtonGroup();
		btGroup22.add(inteira19);
		btGroup22.add(meia19);
		
		btGroup23 = new ButtonGroup();
		btGroup23.add(inteira20);
		btGroup23.add(meia20);
		
		btGroup24 = new ButtonGroup();
		btGroup24.add(inteira21);
		btGroup24.add(meia21);
		
		btGroup25 = new ButtonGroup();
		btGroup25.add(inteira22);
		btGroup25.add(meia22);
		
		btGroup26 = new ButtonGroup();
		btGroup26.add(inteira23);
		btGroup26.add(meia23);
		
		btGroup27 = new ButtonGroup();
		btGroup27.add(inteira24);
		btGroup27.add(meia24);
		
		btGroup28 = new ButtonGroup();
		btGroup28.add(inteira25);
		btGroup28.add(meia25);
		
		btGroup29 = new ButtonGroup();
		btGroup29.add(inteira26);
		btGroup29.add(meia26);
		
		btGroup30 = new ButtonGroup();
		btGroup30.add(inteira27);
		btGroup30.add(meia27);
		
		btGroup31 = new ButtonGroup();
		btGroup31.add(inteira28);
		btGroup31.add(meia28);
		
		btGroup32 = new ButtonGroup();
		btGroup32.add(inteira29);
		btGroup32.add(meia29);
		
		btGroup33 = new ButtonGroup();
		btGroup33.add(inteira30);
		btGroup33.add(meia30);
		
		btGroup34 = new ButtonGroup();
		btGroup34.add(inteira31);
		btGroup34.add(meia31);
		
		btGroup35 = new ButtonGroup();
		btGroup35.add(inteira32);
		btGroup35.add(meia32);
		
		btGroup36 = new ButtonGroup();
		btGroup36.add(inteira33);
		btGroup36.add(meia33);
		
		btGroup37 = new ButtonGroup();
		btGroup37.add(inteira34);
		btGroup37.add(meia34);
		
		btGroup38 = new ButtonGroup();
		btGroup38.add(inteira35);
		btGroup38.add(meia35);
		
		btGroup39 = new ButtonGroup();
		btGroup39.add(inteira36);
		btGroup39.add(meia36);
		
		btGroup40 = new ButtonGroup();
		btGroup40.add(inteira37);
		btGroup40.add(meia37);
		
		btGroup41 = new ButtonGroup();
		btGroup41.add(inteira38);
		btGroup41.add(meia38);
		
		btGroup42 = new ButtonGroup();
		btGroup42.add(inteira9);
		btGroup42.add(meia39);
		
		btGroup43 = new ButtonGroup();
		btGroup43.add(inteira40);
		btGroup43.add(meia40);
		
		btGroup44 = new ButtonGroup();
		btGroup44.add(inteira41);
		btGroup44.add(meia41);
		
		btGroup45 = new ButtonGroup();
		btGroup45.add(inteira42);
		btGroup45.add(meia42);
		
		btGroup46 = new ButtonGroup();
		btGroup46.add(inteira43);
		btGroup46.add(meia43);
		
		btGroup47 = new ButtonGroup();
		btGroup47.add(inteira44);
		btGroup47.add(meia44);
		
		btGroup48 = new ButtonGroup();
		btGroup48.add(inteira45);
		btGroup48.add(meia45);
		
		btGroup49 = new ButtonGroup();
		btGroup49.add(inteira46);
		btGroup49.add(meia46);
		
		btGroup50 = new ButtonGroup();
		btGroup50.add(inteira47);
		btGroup50.add(meia47);
		
		btGroup51 = new ButtonGroup();
		btGroup51.add(inteira48);
		btGroup51.add(meia48);
		
		btGroup52 = new ButtonGroup();
		btGroup52.add(inteira49);
		btGroup52.add(meia49);
		
		btGroup53 = new ButtonGroup();
		btGroup53.add(inteira50);
		btGroup53.add(meia50);
		
		comprar = new JButton("Comprar");

		ticket1 = new JLabel(img40);
		ticket2 = new JLabel(img41);
		ticket3 = new JLabel(img42);
		ticket4 = new JLabel(img43);
		ticket5 = new JLabel(img44);
		ticket6 = new JLabel(img45);
		ticket7 = new JLabel(img46);
		ticket8 = new JLabel(img47);
		ticket9 = new JLabel(img48);
		ticket10 = new JLabel(img49);
		ticket11 = new JLabel(img50);
		ticket12 = new JLabel(img51);
		ticket13 = new JLabel(img52);
		ticket14 = new JLabel(img53);
		ticket15 = new JLabel(img54);
		ticket16 = new JLabel(img55);
		ticket17 = new JLabel(img56);
		ticket18 = new JLabel(img57);
		ticket19 = new JLabel(img58);
		ticket20 = new JLabel(img59);
		ticket21 = new JLabel(img60);
		ticket22 = new JLabel(img61);
		ticket23 = new JLabel(img62);
		ticket24 = new JLabel(img63);
		ticket25 = new JLabel(img64);
		ticket26 = new JLabel(img65);
		ticket27 = new JLabel(img66);
		ticket28 = new JLabel(img67);
		ticket29 = new JLabel(img68);
		ticket30 = new JLabel(img69);
		ticket31 = new JLabel(img70);
		ticket32 = new JLabel(img71);
		ticket33 = new JLabel(img72);
		ticket34 = new JLabel(img73);
		ticket35 = new JLabel(img74);
		ticket36 = new JLabel(img75);
		ticket37 = new JLabel(img76);
		ticket38 = new JLabel(img77);
		ticket39 = new JLabel(img78);
		ticket40 = new JLabel(img79);
		ticket41 = new JLabel(img80);
		ticket42 = new JLabel(img81);
		ticket43 = new JLabel(img82);
		ticket44 = new JLabel(img83);
		ticket45 = new JLabel(img84);
		ticket46 = new JLabel(img85);
		ticket47 = new JLabel(img86);
		ticket48 = new JLabel(img87);
		ticket49 = new JLabel(img88);
		ticket50 = new JLabel(img89);
		ticket51 = new JLabel(img90);
		ticket52 = new JLabel(img91);
		ticket53 = new JLabel(img92);
		ticket54 = new JLabel(img93);
		ticket55 = new JLabel(img94);
		ticket56 = new JLabel(img95);
		ticket57 = new JLabel(img96);
		ticket58 = new JLabel(img97);
		ticket59 = new JLabel(img98);
		ticket60 = new JLabel(img99);
		ticket61 = new JLabel(img100);
		ticket62 = new JLabel(img101);
		ticket63 = new JLabel(img102);
		ticket64 = new JLabel(img103);
		ticket65 = new JLabel(img104);
		ticket66 = new JLabel(img105);
		ticket67 = new JLabel(img106);
		ticket68 = new JLabel(img107);
		ticket69 = new JLabel(img108);
		ticket70 = new JLabel(img109);
		ticket71 = new JLabel(img110);
		ticket72 = new JLabel(img111);
		ticket73 = new JLabel(img112);
		ticket74 = new JLabel(img113);
		ticket75 = new JLabel(img114);
		ticket76 = new JLabel(img115);
		ticket77 = new JLabel(img116);
		ticket78 = new JLabel(img117);
		ticket79 = new JLabel(img118);
		ticket80 = new JLabel(img119);
		ticket81 = new JLabel(img120);
		ticket82 = new JLabel(img121);
		ticket83 = new JLabel(img122);
		ticket84 = new JLabel(img123);
		ticket85 = new JLabel(img124);
		ticket86 = new JLabel(img125);
		ticket87 = new JLabel(img126);
		ticket88 = new JLabel(img127);
		ticket89 = new JLabel(img128);
		ticket90 = new JLabel(img129);
		ticket91 = new JLabel(img130);
		ticket92 = new JLabel(img131);
		ticket93 = new JLabel(img132);
		ticket94 = new JLabel(img133);
		ticket95 = new JLabel(img134);
		ticket96 = new JLabel(img135);
		ticket97 = new JLabel(img136);
		ticket98 = new JLabel(img137);
		ticket99 = new JLabel(img138);
		ticket100 = new JLabel(img139);
		ticket101 = new JLabel(img140);
		ticket102 = new JLabel(img141);
		ticket103 = new JLabel(img142);
		ticket104 = new JLabel(img143);
		ticket105 = new JLabel(img144);
		ticket106 = new JLabel(img145);
		ticket107 = new JLabel(img146);
		ticket108 = new JLabel(img147);
		ticket109 = new JLabel(img148);
		ticket110 = new JLabel(img149);
		ticket111 = new JLabel(img150);
		ticket112 = new JLabel(img151);
		ticket113 = new JLabel(img152);
		ticket114 = new JLabel(img153);
		ticket115 = new JLabel(img154);
		ticket116 = new JLabel(img155);
		ticket117 = new JLabel(img156);
		ticket118 = new JLabel(img157);
		ticket119 = new JLabel(img158);
		ticket120 = new JLabel(img159);
		ticket121 = new JLabel(img160);
		ticket122 = new JLabel(img161);
		ticket123 = new JLabel(img162);
		ticket124 = new JLabel(img163);
		ticket125 = new JLabel(img164);
		ticket126 = new JLabel(img165);
		ticket127 = new JLabel(img166);
		ticket128 = new JLabel(img167);
		ticket129 = new JLabel(img168);
		ticket130 = new JLabel(img169);
		ticket131 = new JLabel(img170);
		ticket132 = new JLabel(img171);
		ticket133 = new JLabel(img172);
		ticket134 = new JLabel(img173);
		ticket135 = new JLabel(img174);
		ticket136 = new JLabel(img175);
		ticket137 = new JLabel(img176);
		ticket138 = new JLabel(img177);
		ticket139 = new JLabel(img178);
		ticket140 = new JLabel(img179);
		ticket141 = new JLabel(img180);
		ticket142 = new JLabel(img181);
		ticket143 = new JLabel(img182);
		ticket144 = new JLabel(img183);
		ticket145 = new JLabel(img184);
		ticket146 = new JLabel(img185);
		ticket147 = new JLabel(img186);
		ticket148 = new JLabel(img187);
		ticket149 = new JLabel(img188);
		ticket150 = new JLabel(img189);
		
		lotacao = new JLabel("^^ ESSA É A LOTAÇÃO ^^");
		imgback2 = new JLabel(img18);

		inteira1.setBounds(0, 60, 50, 20);
		inteira2.setBounds(50, 60, 50, 20);
		inteira3.setBounds(150, 60, 50, 20);
		inteira4.setBounds(200, 60, 50, 20);
		inteira5.setBounds(250, 60, 50, 20);
		inteira6.setBounds(300, 60, 50, 20);
		inteira7.setBounds(350, 60, 50, 20);
		inteira8.setBounds(400, 60, 50, 20);
		inteira9.setBounds(450, 60, 50, 20);
		inteira10.setBounds(500, 60, 50, 20);
		inteira11.setBounds(600, 60, 50, 20);
		inteira12.setBounds(650, 60, 50, 20);
		inteira13.setBounds(0, 140, 50, 20);
		inteira14.setBounds(50, 140, 50, 20);
		inteira15.setBounds(150, 140, 50, 20);
		inteira16.setBounds(200, 140, 50, 20);
		inteira17.setBounds(250, 140, 50, 20);
		inteira18.setBounds(300, 140, 50, 20);
		inteira19.setBounds(350, 140, 50, 20);
		inteira20.setBounds(400, 140, 50, 20);
		inteira21.setBounds(450, 140, 50, 20);
		inteira22.setBounds(500, 140, 50, 20);
		inteira23.setBounds(600, 140, 50, 20);
		inteira24.setBounds(650, 140, 50, 20);
		inteira25.setBounds(0, 220, 50, 20);
		inteira26.setBounds(50, 220, 50, 20);
		inteira27.setBounds(150, 220, 50, 20);
		inteira28.setBounds(200, 220, 50, 20);
		inteira29.setBounds(250, 220, 50, 20);
		inteira30.setBounds(300, 220, 50, 20);
		inteira31.setBounds(350, 220, 50, 20);
		inteira32.setBounds(400, 220, 50, 20);
		inteira33.setBounds(450, 220, 50, 20);
		inteira34.setBounds(500, 220, 50, 20);
		inteira35.setBounds(600, 220, 50, 20);
		inteira36.setBounds(650, 220, 50, 20);
		inteira37.setBounds(0, 300, 50, 20);
		inteira38.setBounds(50, 300, 50, 20);
		inteira39.setBounds(150, 300, 50, 20);
		inteira40.setBounds(200, 300, 50, 20);
		inteira41.setBounds(250, 300, 50, 20);
		inteira42.setBounds(300, 300, 50, 20);
		inteira43.setBounds(350, 300, 50, 20);
		inteira44.setBounds(400, 300, 50, 20);
		inteira45.setBounds(450, 300, 50, 20);
		inteira46.setBounds(500, 300, 50, 20);
		inteira47.setBounds(600, 300, 50, 20);
		inteira48.setBounds(650, 300, 50, 20);
		inteira49.setBounds(25, 380, 50, 20);
		inteira50.setBounds(625, 380, 50, 20);

		meia1.setBounds(0, 80, 50, 20);
		meia2.setBounds(50, 80, 50, 20);
		meia3.setBounds(150, 80, 50, 20);
		meia4.setBounds(200, 80, 50, 20);
		meia5.setBounds(250, 80, 50, 20);
		meia6.setBounds(300, 80, 50, 20);
		meia7.setBounds(350, 80, 50, 20);
		meia8.setBounds(400, 80, 50, 20);
		meia9.setBounds(450, 80, 50, 20);
		meia10.setBounds(500, 80, 50, 20);
		meia11.setBounds(600, 80, 50, 20);
		meia12.setBounds(650, 80, 50, 20);
		meia13.setBounds(0, 160, 50, 20);
		meia14.setBounds(50, 160, 50, 20);
		meia15.setBounds(150, 160, 50, 20);
		meia16.setBounds(200, 160, 50, 20);
		meia17.setBounds(250, 160, 50, 20);
		meia18.setBounds(300, 160, 50, 20);
		meia19.setBounds(350, 160, 50, 20);
		meia20.setBounds(400, 160, 50, 20);
		meia21.setBounds(450, 160, 50, 20);
		meia22.setBounds(500, 160, 50, 20);
		meia23.setBounds(600, 160, 50, 20);
		meia24.setBounds(650, 160, 50, 20);
		meia25.setBounds(0, 240, 50, 20);
		meia26.setBounds(50, 240, 50, 20);
		meia27.setBounds(150, 240, 50, 20);
		meia28.setBounds(200, 240, 50, 20);
		meia29.setBounds(250, 240, 50, 20);
		meia30.setBounds(300, 240, 50, 20);
		meia31.setBounds(350, 240, 50, 20);
		meia32.setBounds(400, 240, 50, 20);
		meia33.setBounds(450, 240, 50, 20);
		meia34.setBounds(500, 240, 50, 20);
		meia35.setBounds(600, 240, 50, 20);
		meia36.setBounds(650, 240, 50, 20);
		meia37.setBounds(0, 320, 50, 20);
		meia38.setBounds(50, 320, 50, 20);
		meia39.setBounds(150, 320, 50, 20);
		meia40.setBounds(200, 320, 50, 20);
		meia41.setBounds(250, 320, 50, 20);
		meia42.setBounds(300, 320, 50, 20);
		meia43.setBounds(350, 320, 50, 20);
		meia44.setBounds(400, 320, 50, 20);
		meia45.setBounds(450, 320, 50, 20);
		meia46.setBounds(500, 320, 50, 20);
		meia47.setBounds(600, 320, 50, 20);
		meia48.setBounds(650, 320, 50, 20);
		meia49.setBounds(25, 400, 50, 20);
		meia50.setBounds(625, 400, 50, 20);

		comprar.setBounds(300, 410, 100, 20);
		
		ticket1.setBounds(0, 20, 40, 40);
		ticket2.setBounds(50, 20, 40, 40);
		ticket3.setBounds(150, 20, 40, 40);
		ticket4.setBounds(200, 20, 40, 40);
		ticket5.setBounds(250, 20, 40, 40);
		ticket6.setBounds(300, 20, 40, 40);
		ticket7.setBounds(350, 20, 40, 40);
		ticket8.setBounds(400, 20, 40, 40);
		ticket9.setBounds(450, 20, 40, 40);
		ticket10.setBounds(500, 20, 40, 40);
		ticket11.setBounds(600, 20, 40, 40);
		ticket12.setBounds(650, 20, 40, 40);
		ticket13.setBounds(0, 100, 40, 40);
		ticket14.setBounds(50, 100, 40, 40);
		ticket15.setBounds(150, 100, 40, 40);
		ticket16.setBounds(200, 100, 40, 40);
		ticket17.setBounds(250, 100, 40, 40);
		ticket18.setBounds(300, 100, 40, 40);
		ticket19.setBounds(350, 100, 40, 40);
		ticket20.setBounds(400, 100, 40, 40);
		ticket21.setBounds(450, 100, 40, 40);
		ticket22.setBounds(500, 100, 40, 40);
		ticket23.setBounds(600, 100, 40, 40);
		ticket24.setBounds(650, 100, 40, 40);
		ticket25.setBounds(0, 180, 40, 40);
		ticket26.setBounds(50, 180, 40, 40);
		ticket27.setBounds(150, 180, 40, 40);
		ticket28.setBounds(200, 180, 40, 40);
		ticket29.setBounds(250, 180, 40, 40);
		ticket30.setBounds(300, 180, 40, 40);
		ticket31.setBounds(350, 180, 40, 40);
		ticket32.setBounds(400, 180, 40, 40);
		ticket33.setBounds(450, 180, 40, 40);
		ticket34.setBounds(500, 180, 40, 40);
		ticket35.setBounds(600, 180, 40, 40);
		ticket36.setBounds(650, 180, 40, 40);
		ticket37.setBounds(0, 260, 40, 40);
		ticket38.setBounds(50, 260, 40, 40);
		ticket39.setBounds(150, 260, 40, 40);
		ticket40.setBounds(200, 260, 40, 40);
		ticket41.setBounds(250, 260, 40, 40);
		ticket42.setBounds(300, 260, 40, 40);
		ticket43.setBounds(350, 260, 40, 40);
		ticket44.setBounds(400, 260, 40, 40);
		ticket45.setBounds(450, 260, 40, 40);
		ticket46.setBounds(500, 260, 40, 40);
		ticket47.setBounds(600, 260, 40, 40);
		ticket48.setBounds(650, 260, 40, 40);
		ticket49.setBounds(25, 340, 40, 40);
		ticket50.setBounds(625, 340, 40, 40);
		ticket51.setBounds(0, 20, 40, 40);
		ticket52.setBounds(50, 20, 40, 40);
		ticket53.setBounds(150, 20, 40, 40);
		ticket54.setBounds(200, 20, 40, 40);
		ticket55.setBounds(250, 20, 40, 40);
		ticket56.setBounds(300, 20, 40, 40);
		ticket57.setBounds(350, 20, 40, 40);
		ticket58.setBounds(400, 20, 40, 40);
		ticket59.setBounds(450, 20, 40, 40);
		ticket60.setBounds(500, 20, 40, 40);
		ticket61.setBounds(600, 20, 40, 40);
		ticket62.setBounds(650, 20, 40, 40);
		ticket63.setBounds(0, 100, 40, 40);
		ticket64.setBounds(50, 100, 40, 40);
		ticket65.setBounds(150, 100, 40, 40);
		ticket66.setBounds(200, 100, 40, 40);
		ticket67.setBounds(250, 100, 40, 40);
		ticket68.setBounds(300, 100, 40, 40);
		ticket69.setBounds(350, 100, 40, 40);
		ticket70.setBounds(400, 100, 40, 40);
		ticket71.setBounds(450, 100, 40, 40);
		ticket72.setBounds(500, 100, 40, 40);
		ticket73.setBounds(600, 100, 40, 40);
		ticket74.setBounds(650, 100, 40, 40);
		ticket75.setBounds(0, 180, 40, 40);
		ticket76.setBounds(50, 180, 40, 40);
		ticket77.setBounds(150, 180, 40, 40);
		ticket78.setBounds(200, 180, 40, 40);
		ticket79.setBounds(250, 180, 40, 40);
		ticket80.setBounds(300, 180, 40, 40);
		ticket81.setBounds(350, 180, 40, 40);
		ticket82.setBounds(400, 180, 40, 40);
		ticket83.setBounds(450, 180, 40, 40);
		ticket84.setBounds(500, 180, 40, 40);
		ticket85.setBounds(600, 180, 40, 40);
		ticket86.setBounds(650, 180, 40, 40);
		ticket87.setBounds(0, 260, 40, 40);
		ticket88.setBounds(50, 260, 40, 40);
		ticket89.setBounds(150, 260, 40, 40);
		ticket90.setBounds(200, 260, 40, 40);
		ticket91.setBounds(250, 260, 40, 40);
		ticket92.setBounds(300, 260, 40, 40);
		ticket93.setBounds(350, 260, 40, 40);
		ticket94.setBounds(400, 260, 40, 40);
		ticket95.setBounds(450, 260, 40, 40);
		ticket96.setBounds(500, 260, 40, 40);
		ticket97.setBounds(600, 260, 40, 40);
		ticket98.setBounds(650, 260, 40, 40);
		ticket99.setBounds(25, 340, 40, 40);
		ticket100.setBounds(625, 340, 40, 40);
		ticket101.setBounds(0, 20, 40, 40);
		ticket102.setBounds(50, 20, 40, 40);
		ticket103.setBounds(150, 20, 40, 40);
		ticket104.setBounds(200, 20, 40, 40);
		ticket105.setBounds(250, 20, 40, 40);
		ticket106.setBounds(300, 20, 40, 40);
		ticket107.setBounds(350, 20, 40, 40);
		ticket108.setBounds(400, 20, 40, 40);
		ticket109.setBounds(450, 20, 40, 40);
		ticket110.setBounds(500, 20, 40, 40);
		ticket111.setBounds(600, 20, 40, 40);
		ticket112.setBounds(650, 20, 40, 40);
		ticket113.setBounds(0, 100, 40, 40);
		ticket114.setBounds(50, 100, 40, 40);
		ticket115.setBounds(150, 100, 40, 40);
		ticket116.setBounds(200, 100, 40, 40);
		ticket117.setBounds(250, 100, 40, 40);
		ticket118.setBounds(300, 100, 40, 40);
		ticket119.setBounds(350, 100, 40, 40);
		ticket120.setBounds(400, 100, 40, 40);
		ticket121.setBounds(450, 100, 40, 40);
		ticket122.setBounds(500, 100, 40, 40);
		ticket123.setBounds(600, 100, 40, 40);
		ticket124.setBounds(650, 100, 40, 40);
		ticket125.setBounds(0, 180, 40, 40);
		ticket126.setBounds(50, 180, 40, 40);
		ticket127.setBounds(150, 180, 40, 40);
		ticket128.setBounds(200, 180, 40, 40);
		ticket129.setBounds(250, 180, 40, 40);
		ticket130.setBounds(300, 180, 40, 40);
		ticket131.setBounds(350, 180, 40, 40);
		ticket132.setBounds(400, 180, 40, 40);
		ticket133.setBounds(450, 180, 40, 40);
		ticket134.setBounds(500, 180, 40, 40);
		ticket135.setBounds(600, 180, 40, 40);
		ticket136.setBounds(650, 180, 40, 40);
		ticket137.setBounds(0, 260, 40, 40);
		ticket138.setBounds(50, 260, 40, 40);
		ticket139.setBounds(150, 260, 40, 40);
		ticket140.setBounds(200, 260, 40, 40);
		ticket141.setBounds(250, 260, 40, 40);
		ticket142.setBounds(300, 260, 40, 40);
		ticket143.setBounds(350, 260, 40, 40);
		ticket144.setBounds(400, 260, 40, 40);
		ticket145.setBounds(450, 260, 40, 40);
		ticket146.setBounds(500, 260, 40, 40);
		ticket147.setBounds(600, 260, 40, 40);
		ticket148.setBounds(650, 260, 40, 40);
		ticket149.setBounds(25, 340, 40, 40);
		ticket150.setBounds(625, 340, 40, 40);
		imgback2.setBounds(0, 0, 920, 518);
		
		pblotacao.setBounds(245,350,200,20);
		lotacao.setBounds(220, 410, 400, 20);

		inteira1.setForeground(new Color(255, 255, 255));
		inteira1.setOpaque(false);
		inteira2.setForeground(new Color(255, 255, 255));
		inteira2.setOpaque(false);
		inteira3.setForeground(new Color(255, 255, 255));
		inteira3.setOpaque(false);
		inteira4.setForeground(new Color(255, 255, 255));
		inteira4.setOpaque(false);
		inteira5.setForeground(new Color(255, 255, 255));
		inteira5.setOpaque(false);
		inteira6.setForeground(new Color(255, 255, 255));
		inteira6.setOpaque(false);
		inteira7.setForeground(new Color(255, 255, 255));
		inteira7.setOpaque(false);
		inteira8.setForeground(new Color(255, 255, 255));
		inteira8.setOpaque(false);
		inteira9.setForeground(new Color(255, 255, 255));
		inteira9.setOpaque(false);
		inteira10.setForeground(new Color(255, 255, 255));
		inteira10.setOpaque(false);
		inteira11.setForeground(new Color(255, 255, 255));
		inteira11.setOpaque(false);
		inteira12.setForeground(new Color(255, 255, 255));
		inteira12.setOpaque(false);
		inteira13.setForeground(new Color(255, 255, 255));
		inteira13.setOpaque(false);
		inteira14.setForeground(new Color(255, 255, 255));
		inteira14.setOpaque(false);
		inteira15.setForeground(new Color(255, 255, 255));
		inteira15.setOpaque(false);
		inteira16.setForeground(new Color(255, 255, 255));
		inteira16.setOpaque(false);
		inteira17.setForeground(new Color(255, 255, 255));
		inteira17.setOpaque(false);
		inteira18.setForeground(new Color(255, 255, 255));
		inteira18.setOpaque(false);
		inteira19.setForeground(new Color(255, 255, 255));
		inteira19.setOpaque(false);
		inteira20.setForeground(new Color(255, 255, 255));
		inteira20.setOpaque(false);
		inteira21.setForeground(new Color(255, 255, 255));
		inteira21.setOpaque(false);
		inteira22.setForeground(new Color(255, 255, 255));
		inteira22.setOpaque(false);
		inteira23.setForeground(new Color(255, 255, 255));
		inteira23.setOpaque(false);
		inteira24.setForeground(new Color(255, 255, 255));
		inteira24.setOpaque(false);
		inteira25.setForeground(new Color(255, 255, 255));
		inteira25.setOpaque(false);
		inteira26.setForeground(new Color(255, 255, 255));
		inteira26.setOpaque(false);
		inteira27.setForeground(new Color(255, 255, 255));
		inteira27.setOpaque(false);
		inteira28.setForeground(new Color(255, 255, 255));
		inteira28.setOpaque(false);
		inteira29.setForeground(new Color(255, 255, 255));
		inteira29.setOpaque(false);
		inteira30.setForeground(new Color(255, 255, 255));
		inteira30.setOpaque(false);
		inteira31.setForeground(new Color(255, 255, 255));
		inteira31.setOpaque(false);
		inteira32.setForeground(new Color(255, 255, 255));
		inteira32.setOpaque(false);
		inteira33.setForeground(new Color(255, 255, 255));
		inteira33.setOpaque(false);
		inteira34.setForeground(new Color(255, 255, 255));
		inteira34.setOpaque(false);
		inteira35.setForeground(new Color(255, 255, 255));
		inteira35.setOpaque(false);
		inteira36.setForeground(new Color(255, 255, 255));
		inteira36.setOpaque(false);
		inteira37.setForeground(new Color(255, 255, 255));
		inteira37.setOpaque(false);
		inteira38.setForeground(new Color(255, 255, 255));
		inteira38.setOpaque(false);
		inteira39.setForeground(new Color(255, 255, 255));
		inteira39.setOpaque(false);
		inteira40.setForeground(new Color(255, 255, 255));
		inteira40.setOpaque(false);
		inteira41.setForeground(new Color(255, 255, 255));
		inteira41.setOpaque(false);
		inteira42.setForeground(new Color(255, 255, 255));
		inteira42.setOpaque(false);
		inteira43.setForeground(new Color(255, 255, 255));
		inteira43.setOpaque(false);
		inteira44.setForeground(new Color(255, 255, 255));
		inteira44.setOpaque(false);
		inteira45.setForeground(new Color(255, 255, 255));
		inteira45.setOpaque(false);
		inteira46.setForeground(new Color(255, 255, 255));
		inteira46.setOpaque(false);
		inteira47.setForeground(new Color(255, 255, 255));
		inteira47.setOpaque(false);
		inteira48.setForeground(new Color(255, 255, 255));
		inteira48.setOpaque(false);
		inteira49.setForeground(new Color(255, 255, 255));
		inteira49.setOpaque(false);
		inteira50.setForeground(new Color(255, 255, 255));
		inteira50.setOpaque(false);

		meia1.setForeground(new Color(255, 255, 255));
		meia1.setOpaque(false);
		meia2.setForeground(new Color(255, 255, 255));
		meia2.setOpaque(false);
		meia3.setForeground(new Color(255, 255, 255));
		meia3.setOpaque(false);
		meia4.setForeground(new Color(255, 255, 255));
		meia4.setOpaque(false);
		meia5.setForeground(new Color(255, 255, 255));
		meia5.setOpaque(false);
		meia6.setForeground(new Color(255, 255, 255));
		meia6.setOpaque(false);
		meia7.setForeground(new Color(255, 255, 255));
		meia7.setOpaque(false);
		meia8.setForeground(new Color(255, 255, 255));
		meia8.setOpaque(false);
		meia9.setForeground(new Color(255, 255, 255));
		meia9.setOpaque(false);
		meia10.setForeground(new Color(255, 255, 255));
		meia10.setOpaque(false);
		meia11.setForeground(new Color(255, 255, 255));
		meia11.setOpaque(false);
		meia12.setForeground(new Color(255, 255, 255));
		meia12.setOpaque(false);
		meia13.setForeground(new Color(255, 255, 255));
		meia13.setOpaque(false);
		meia14.setForeground(new Color(255, 255, 255));
		meia14.setOpaque(false);
		meia15.setForeground(new Color(255, 255, 255));
		meia15.setOpaque(false);
		meia16.setForeground(new Color(255, 255, 255));
		meia16.setOpaque(false);
		meia17.setForeground(new Color(255, 255, 255));
		meia17.setOpaque(false);
		meia18.setForeground(new Color(255, 255, 255));
		meia18.setOpaque(false);
		meia19.setForeground(new Color(255, 255, 255));
		meia19.setOpaque(false);
		meia20.setForeground(new Color(255, 255, 255));
		meia20.setOpaque(false);
		meia21.setForeground(new Color(255, 255, 255));
		meia21.setOpaque(false);
		meia22.setForeground(new Color(255, 255, 255));
		meia22.setOpaque(false);
		meia23.setForeground(new Color(255, 255, 255));
		meia23.setOpaque(false);
		meia24.setForeground(new Color(255, 255, 255));
		meia24.setOpaque(false);
		meia25.setForeground(new Color(255, 255, 255));
		meia25.setOpaque(false);
		meia26.setForeground(new Color(255, 255, 255));
		meia26.setOpaque(false);
		meia27.setForeground(new Color(255, 255, 255));
		meia27.setOpaque(false);
		meia28.setForeground(new Color(255, 255, 255));
		meia28.setOpaque(false);
		meia29.setForeground(new Color(255, 255, 255));
		meia29.setOpaque(false);
		meia30.setForeground(new Color(255, 255, 255));
		meia30.setOpaque(false);
		meia31.setForeground(new Color(255, 255, 255));
		meia31.setOpaque(false);
		meia32.setForeground(new Color(255, 255, 255));
		meia32.setOpaque(false);
		meia33.setForeground(new Color(255, 255, 255));
		meia33.setOpaque(false);
		meia34.setForeground(new Color(255, 255, 255));
		meia34.setOpaque(false);
		meia35.setForeground(new Color(255, 255, 255));
		meia35.setOpaque(false);
		meia36.setForeground(new Color(255, 255, 255));
		meia36.setOpaque(false);
		meia37.setForeground(new Color(255, 255, 255));
		meia37.setOpaque(false);
		meia38.setForeground(new Color(255, 255, 255));
		meia38.setOpaque(false);
		meia39.setForeground(new Color(255, 255, 255));
		meia39.setOpaque(false);
		meia40.setForeground(new Color(255, 255, 255));
		meia40.setOpaque(false);
		meia41.setForeground(new Color(255, 255, 255));
		meia41.setOpaque(false);
		meia42.setForeground(new Color(255, 255, 255));
		meia42.setOpaque(false);
		meia43.setForeground(new Color(255, 255, 255));
		meia43.setOpaque(false);
		meia44.setForeground(new Color(255, 255, 255));
		meia44.setOpaque(false);
		meia45.setForeground(new Color(255, 255, 255));
		meia45.setOpaque(false);
		meia46.setForeground(new Color(255, 255, 255));
		meia46.setOpaque(false);
		meia47.setForeground(new Color(255, 255, 255));
		meia47.setOpaque(false);
		meia48.setForeground(new Color(255, 255, 255));
		meia48.setOpaque(false);
		meia49.setForeground(new Color(255, 255, 255));
		meia49.setOpaque(false);
		meia50.setForeground(new Color(255, 255, 255));
		meia50.setOpaque(false);

		panel2.add(meia1);
		panel2.add(meia2);
		panel2.add(meia3);
		panel2.add(meia4);
		panel2.add(meia5);
		panel2.add(meia6);
		panel2.add(meia7);
		panel2.add(meia8);
		panel2.add(meia9);
		panel2.add(meia10);
		panel2.add(meia11);
		panel2.add(meia12);
		panel2.add(meia13);
		panel2.add(meia14);
		panel2.add(meia15);
		panel2.add(meia16);
		panel2.add(meia17);
		panel2.add(meia18);
		panel2.add(meia19);
		panel2.add(meia20);
		panel2.add(meia21);
		panel2.add(meia22);
		panel2.add(meia23);
		panel2.add(meia24);
		panel2.add(meia25);
		panel2.add(meia26);
		panel2.add(meia27);
		panel2.add(meia28);
		panel2.add(meia29);
		panel2.add(meia30);
		panel2.add(meia31);
		panel2.add(meia32);
		panel2.add(meia33);
		panel2.add(meia34);
		panel2.add(meia35);
		panel2.add(meia36);
		panel2.add(meia37);
		panel2.add(meia38);
		panel2.add(meia39);
		panel2.add(meia40);
		panel2.add(meia41);
		panel2.add(meia42);
		panel2.add(meia43);
		panel2.add(meia44);
		panel2.add(meia45);
		panel2.add(meia46);
		panel2.add(meia47);
		panel2.add(meia48);
		panel2.add(meia49);
		panel2.add(meia50);

		panel2.add(comprar);
		
		panel2.add(inteira1);
		panel2.add(inteira2);
		panel2.add(inteira3);
		panel2.add(inteira4);
		panel2.add(inteira5);
		panel2.add(inteira6);
		panel2.add(inteira7);
		panel2.add(inteira8);
		panel2.add(inteira9);
		panel2.add(inteira10);
		panel2.add(inteira11);
		panel2.add(inteira12);
		panel2.add(inteira13);
		panel2.add(inteira14);
		panel2.add(inteira15);
		panel2.add(inteira16);
		panel2.add(inteira17);
		panel2.add(inteira18);
		panel2.add(inteira19);
		panel2.add(inteira20);
		panel2.add(inteira21);
		panel2.add(inteira22);
		panel2.add(inteira23);
		panel2.add(inteira24);
		panel2.add(inteira25);
		panel2.add(inteira26);
		panel2.add(inteira27);
		panel2.add(inteira28);
		panel2.add(inteira29);
		panel2.add(inteira30);
		panel2.add(inteira31);
		panel2.add(inteira32);
		panel2.add(inteira33);
		panel2.add(inteira34);
		panel2.add(inteira35);
		panel2.add(inteira36);
		panel2.add(inteira37);
		panel2.add(inteira38);
		panel2.add(inteira39);
		panel2.add(inteira40);
		panel2.add(inteira41);
		panel2.add(inteira42);
		panel2.add(inteira43);
		panel2.add(inteira44);
		panel2.add(inteira45);
		panel2.add(inteira46);
		panel2.add(inteira47);
		panel2.add(inteira48);
		panel2.add(inteira49);
		panel2.add(inteira50);

		panel2.add(ticket1);
		panel2.add(ticket2);
		panel2.add(ticket3);
		panel2.add(ticket4);
		panel2.add(ticket5);
		panel2.add(ticket6);
		panel2.add(ticket7);
		panel2.add(ticket8);
		panel2.add(ticket9);
		panel2.add(ticket10);
		panel2.add(ticket11);
		panel2.add(ticket12);
		panel2.add(ticket13);
		panel2.add(ticket14);
		panel2.add(ticket15);
		panel2.add(ticket16);
		panel2.add(ticket17);
		panel2.add(ticket18);
		panel2.add(ticket19);
		panel2.add(ticket20);
		panel2.add(ticket21);
		panel2.add(ticket22);
		panel2.add(ticket23);
		panel2.add(ticket24);
		panel2.add(ticket25);
		panel2.add(ticket26);
		panel2.add(ticket27);
		panel2.add(ticket28);
		panel2.add(ticket29);
		panel2.add(ticket30);
		panel2.add(ticket31);
		panel2.add(ticket32);
		panel2.add(ticket33);
		panel2.add(ticket34);
		panel2.add(ticket35);
		panel2.add(ticket36);
		panel2.add(ticket37);
		panel2.add(ticket38);
		panel2.add(ticket39);
		panel2.add(ticket40);
		panel2.add(ticket41);
		panel2.add(ticket42);
		panel2.add(ticket43);
		panel2.add(ticket44);
		panel2.add(ticket45);
		panel2.add(ticket46);
		panel2.add(ticket47);
		panel2.add(ticket48);
		panel2.add(ticket49);
		panel2.add(ticket50);
		panel2.add(ticket51);
		panel2.add(ticket52);
		panel2.add(ticket53);
		panel2.add(ticket54);
		panel2.add(ticket55);
		panel2.add(ticket56);
		panel2.add(ticket57);
		panel2.add(ticket58);
		panel2.add(ticket59);
		panel2.add(ticket60);
		panel2.add(ticket61);
		panel2.add(ticket62);
		panel2.add(ticket63);
		panel2.add(ticket64);
		panel2.add(ticket65);
		panel2.add(ticket66);
		panel2.add(ticket67);
		panel2.add(ticket68);
		panel2.add(ticket69);
		panel2.add(ticket70);
		panel2.add(ticket71);
		panel2.add(ticket72);
		panel2.add(ticket73);
		panel2.add(ticket74);
		panel2.add(ticket75);
		panel2.add(ticket76);
		panel2.add(ticket77);
		panel2.add(ticket78);
		panel2.add(ticket79);
		panel2.add(ticket80);
		panel2.add(ticket81);
		panel2.add(ticket82);
		panel2.add(ticket83);
		panel2.add(ticket84);
		panel2.add(ticket85);
		panel2.add(ticket86);
		panel2.add(ticket87);
		panel2.add(ticket88);
		panel2.add(ticket89);
		panel2.add(ticket90);
		panel2.add(ticket91);
		panel2.add(ticket92);
		panel2.add(ticket93);
		panel2.add(ticket94);
		panel2.add(ticket95);
		panel2.add(ticket96);
		panel2.add(ticket97);
		panel2.add(ticket98);
		panel2.add(ticket99);
		panel2.add(ticket100);
		panel2.add(ticket101);
		panel2.add(ticket102);
		panel2.add(ticket103);
		panel2.add(ticket104);
		panel2.add(ticket105);
		panel2.add(ticket106);
		panel2.add(ticket107);
		panel2.add(ticket108);
		panel2.add(ticket109);
		panel2.add(ticket110);
		panel2.add(ticket111);
		panel2.add(ticket112);
		panel2.add(ticket113);
		panel2.add(ticket114);
		panel2.add(ticket115);
		panel2.add(ticket116);
		panel2.add(ticket117);
		panel2.add(ticket118);
		panel2.add(ticket119);
		panel2.add(ticket120);
		panel2.add(ticket130);
		panel2.add(ticket131);
		panel2.add(ticket132);
		panel2.add(ticket133);
		panel2.add(ticket134);
		panel2.add(ticket135);
		panel2.add(ticket136);
		panel2.add(ticket137);
		panel2.add(ticket138);
		panel2.add(ticket139);
		panel2.add(ticket140);
		panel2.add(ticket141);
		panel2.add(ticket142);
		panel2.add(ticket143);
		panel2.add(ticket144);
		panel2.add(ticket145);
		panel2.add(ticket146);
		panel2.add(ticket147);
		panel2.add(ticket148);
		panel2.add(ticket149);
		panel2.add(ticket150);
		
		panel2.add(pblotacao);
		panel2.add(lotacao);

		panel2.add(imgback2);
		lotacao.setVisible(false);

		lotacao.setFont(new Font("fixed sys", Font.BOLD, 20));
		lotacao.setForeground(new Color(255, 255, 255));
		
		
		panel3 = new JPanel(null);

		img17 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\lanchonet.jpg");
		img39 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\MRdogao.png");
		img18 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\lanchonete1.png");
		img19 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\burger.png");
		img20 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\dogao.png");
		img22 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\taco.png");
		img23 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\potato.png");
		img24 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\nachos.png");
		img25 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\pretzel.png");
		img26 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\refri.png");
		img27 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\soda.png");
		img29 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\Suveti.png");
		img30 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\molango.png");
		imgback3 = new JLabel(img17);
		MRburger = new JLabel(img18);
		MRdog = new JLabel(img39);
		food1 = new JLabel(img19);
		food2 = new JLabel(img20);
		food3 = new JLabel(img22);
		food4 = new JLabel(img23);
		food5 = new JLabel(img24);
		food6 = new JLabel(img25);
		food7 = new JLabel(img26);
		food8 = new JLabel(img27);
		food9 = new JLabel(img29);
		food10 = new JLabel(img30);
		desclanchonete = new JLabel("Comida é Vida!");
		lanche1 = new JCheckBox("Xburguer");
		lanche2 = new JCheckBox("Hot-Dog");
		lanche3 = new JCheckBox("Taco");
		acompanhamento1 = new JCheckBox("Batata");
		acompanhamento2 = new JCheckBox("Nachos");
		bebida1 = new JCheckBox("pretzel");
		bebida2 = new JCheckBox("Coca");
		bebida3 = new JCheckBox("Soda");
		sobremesa1 = new JCheckBox("Sorvete");
		sobremesa2 = new JCheckBox("Sensação");

		desclanchonete.setBounds(80, 50, 300, 150);
		food1.setBounds(430, 10, 70, 70);
		food2.setBounds(430, 80, 70, 70);
		food3.setBounds(430, 150, 70, 70);
		food4.setBounds(430, 220, 70, 70);
		food5.setBounds(430, 290, 70, 70);
		food6.setBounds(430, 360, 70, 70);
		food7.setBounds(580, 10, 70, 70);
		food8.setBounds(580, 80, 70, 70);
		food9.setBounds(580, 150, 70, 70);
		food10.setBounds(580, 220, 70, 70);
		lanche1.setBounds(500, 30, 80, 25);
		lanche2.setBounds(500, 110, 80, 25);
		lanche3.setBounds(500, 180, 80, 25);
		acompanhamento1.setBounds(500, 250, 80, 25);
		acompanhamento2.setBounds(500, 310, 80, 25);
		bebida1.setBounds(500, 390, 80, 25);
		bebida2.setBounds(640, 40, 80, 25);
		bebida3.setBounds(640, 110, 80, 25);
		sobremesa1.setBounds(640, 180, 80, 25);
		sobremesa2.setBounds(640, 250, 90, 25);
		MRburger.setBounds(0, 210, 250, 250);
		MRdog.setBounds(200, 210, 250, 250);
		imgback3.setBounds(0, 0, 890, 518);

		desclanchonete.setFont(new Font("fixed sys", Font.BOLD, 30));
		lanche1.setBackground(new Color(255, 140, 0));
		lanche2.setBackground(new Color(255, 140, 0));
		lanche3.setBackground(new Color(255, 140, 0));
		acompanhamento1.setBackground(new Color(255, 140, 0));
		acompanhamento2.setBackground(new Color(255, 140, 0));
		bebida1.setBackground(new Color(255, 140, 0));
		bebida2.setBackground(new Color(255, 140, 0));
		bebida3.setBackground(new Color(255, 140, 0));
		sobremesa1.setBackground(new Color(255, 140, 0));
		sobremesa2.setBackground(new Color(255, 140, 0));

		panel3.add(desclanchonete);
		panel3.add(food1);
		panel3.add(food2);
		panel3.add(food3);
		panel3.add(food4);
		panel3.add(food5);
		panel3.add(food6);
		panel3.add(food7);
		panel3.add(food8);
		panel3.add(food9);
		panel3.add(food10);
		panel3.add(lanche1);
		panel3.add(lanche2);
		panel3.add(lanche3);
		panel3.add(acompanhamento1);
		panel3.add(acompanhamento2);
		panel3.add(bebida1);
		panel3.add(bebida2);
		panel3.add(bebida3);
		panel3.add(sobremesa1);
		panel3.add(sobremesa2);
		panel3.add(MRburger);
		panel3.add(MRdog);
		panel3.add(imgback3);

		panel4 = new JPanel(null);

		img31 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\payment1.jpg");
		img32 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\payment2.jpg");
		img33 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\vr.png");
		img34 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\money.png");
		img35 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\cartao.png");
		img36 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\moldura2.png");
		img37 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\moldura2.png");
		img38 = new ImageIcon("C:\\Users\\lucas\\eclipse-workspace\\pf_cinema\\src\\imagem\\moldura2.png");

		Verificar = new JButton("VERIFICAR!");
		cartao = new JRadioButton("CARTÃO");
		vr = new JRadioButton("VALE REFEIÇÃO");
		dinheiro = new JRadioButton("DINHEIRO");
		pagamento = new JLabel("MÉTODO DE PAGAMENTO!");
		imgback4 = new JLabel(img31);
		imgback5 = new JLabel(img32);
		payment1 = new JLabel(img33);
		payment2 = new JLabel(img34);
		payment3 = new JLabel(img35);
		moldura5 = new JLabel(img36);
		moldura6 = new JLabel(img37);
		moldura7 = new JLabel(img38);

		btGroup3 = new ButtonGroup();
		btGroup3.add(cartao);
		btGroup3.add(dinheiro);
		btGroup3.add(vr);

		Verificar.setBounds(50, 370, 150, 30);
		vr.setBounds(75, 180, 143, 20);
		dinheiro.setBounds(75, 230, 100, 20);
		cartao.setBounds(75, 290, 90, 20);
		pagamento.setBounds(30, 85, 200, 25);
		payment1.setBounds(220, 150, 60, 60);
		payment2.setBounds(180, 210, 60, 60);
		payment3.setBounds(160, 270, 60, 60);
		moldura5.setBounds(10, 150, 69, 64);
		moldura6.setBounds(10, 210, 69, 64);
		moldura7.setBounds(10, 270, 69, 64);
		imgback4.setBounds(235, 0, 920, 517);
		imgback5.setBounds(0, 0, 291, 517);

		cartao.setFont(new Font("fixed sys", Font.BOLD, 15));
		cartao.setForeground(new Color(255, 255, 255));
		cartao.setBackground(new Color(0, 100, 0));
		vr.setFont(new Font("fixed sys", Font.BOLD, 15));
		vr.setForeground(new Color(255, 255, 255));
		vr.setBackground(new Color(0, 100, 0));
		dinheiro.setFont(new Font("fixed sys", Font.BOLD, 15));
		dinheiro.setForeground(new Color(255, 255, 255));
		dinheiro.setBackground(new Color(0, 100, 0));
		pagamento.setFont(new Font("fixed sys", Font.BOLD, 15));
		pagamento.setForeground(new Color(255, 255, 255));
		Verificar.setFont(new Font("fixed sys", Font.BOLD, 15));
		Verificar.setForeground(new Color(255, 255, 255));
		Verificar.setBackground(new Color(107, 142, 35));

		Verificar.setFocusable(false);
		cartao.setFocusable(false);
		vr.setFocusable(false);
		dinheiro.setFocusable(false);

		panel4.add(Verificar);
		panel4.add(vr);
		panel4.add(cartao);
		panel4.add(dinheiro);
		panel4.add(pagamento);
		panel4.add(payment1);
		panel4.add(payment2);
		panel4.add(payment3);
		panel4.add(moldura5);
		panel4.add(moldura6);
		panel4.add(moldura7);
		panel4.add(imgback4);
		panel4.add(imgback5);

		tpAbas = new JTabbedPane();
		tpAbas.addTab("FILMES", panel1);
		tpAbas.addTab("CADEIRAS", panel2);
		tpAbas.addTab("LANCHONETE", panel3);
		tpAbas.addTab("PAGAMENTO", panel4);
		tpAbas.setBounds(0, 0, 765, 480);
		add(tpAbas);
	}

	public void definirEventos() {

		filtrar.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				if (filtro1.isSelected()) {
					banner1.setVisible(true);
					banner2.setVisible(true);
					banner3.setVisible(true);
					banner4.setVisible(true);
					banner5.setVisible(false);
					banner6.setVisible(false);
					banner7.setVisible(false);
					banner8.setVisible(false);
					banner9.setVisible(false);
					banner10.setVisible(false);
					banner11.setVisible(false);
					banner12.setVisible(false);
					banner13.setVisible(false);
					banner14.setVisible(false);
					banner15.setVisible(false);
					banner16.setVisible(false);
					filme1.setVisible(true);
					filme2.setVisible(true);
					filme3.setVisible(true);
					filme4.setVisible(true);
					filme5.setVisible(false);
					filme6.setVisible(false);
					filme7.setVisible(false);
					filme8.setVisible(false);
					filme9.setVisible(false);
					filme10.setVisible(false);
					filme11.setVisible(false);
					filme12.setVisible(false);
					filme13.setVisible(false);
					filme14.setVisible(false);
					filme15.setVisible(false);
					filme16.setVisible(false);
				}
				if (filtro2.isSelected()) {
					banner1.setVisible(false);
					banner2.setVisible(false);
					banner3.setVisible(false);
					banner4.setVisible(false);
					banner5.setVisible(true);
					banner6.setVisible(true);
					banner7.setVisible(true);
					banner8.setVisible(true);
					banner9.setVisible(false);
					banner10.setVisible(false);
					banner11.setVisible(false);
					banner12.setVisible(false);
					banner13.setVisible(false);
					banner14.setVisible(false);
					banner15.setVisible(false);
					banner16.setVisible(false);
					filme1.setVisible(false);
					filme2.setVisible(false);
					filme3.setVisible(false);
					filme4.setVisible(false);
					filme5.setVisible(true);
					filme6.setVisible(true);
					filme7.setVisible(true);
					filme8.setVisible(true);
					filme9.setVisible(false);
					filme10.setVisible(false);
					filme11.setVisible(false);
					filme12.setVisible(false);
					filme13.setVisible(false);
					filme14.setVisible(false);
					filme15.setVisible(false);
					filme16.setVisible(false);
				}
				if (filtro3.isSelected()) {
					banner1.setVisible(false);
					banner2.setVisible(false);
					banner3.setVisible(false);
					banner4.setVisible(false);
					banner5.setVisible(false);
					banner6.setVisible(false);
					banner7.setVisible(false);
					banner8.setVisible(false);
					banner9.setVisible(true);
					banner10.setVisible(true);
					banner11.setVisible(true);
					banner12.setVisible(true);
					banner13.setVisible(false);
					banner14.setVisible(false);
					banner15.setVisible(false);
					banner16.setVisible(false);
					filme1.setVisible(false);
					filme2.setVisible(false);
					filme3.setVisible(false);
					filme4.setVisible(false);
					filme5.setVisible(false);
					filme6.setVisible(false);
					filme7.setVisible(false);
					filme8.setVisible(false);
					filme9.setVisible(true);
					filme10.setVisible(true);
					filme11.setVisible(true);
					filme12.setVisible(true);
					filme13.setVisible(false);
					filme14.setVisible(false);
					filme15.setVisible(false);
					filme16.setVisible(false);
				}
				if (filtro4.isSelected()) {
					banner1.setVisible(false);
					banner2.setVisible(false);
					banner3.setVisible(false);
					banner4.setVisible(false);
					banner5.setVisible(false);
					banner6.setVisible(false);
					banner7.setVisible(false);
					banner8.setVisible(false);
					banner9.setVisible(false);
					banner10.setVisible(false);
					banner11.setVisible(false);
					banner12.setVisible(false);
					banner13.setVisible(true);
					banner14.setVisible(true);
					banner15.setVisible(true);
					banner16.setVisible(true);
					filme1.setVisible(false);
					filme2.setVisible(false);
					filme3.setVisible(false);
					filme4.setVisible(false);
					filme5.setVisible(false);
					filme6.setVisible(false);
					filme7.setVisible(false);
					filme8.setVisible(false);
					filme9.setVisible(false);
					filme10.setVisible(false);
					filme11.setVisible(false);
					filme12.setVisible(false);
					filme13.setVisible(true);
					filme14.setVisible(true);
					filme15.setVisible(true);
					filme16.setVisible(true);
				}

			}
		});
		Verificar.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				comida1 = 5.00;
				comida2 = 4.00;
				comida3 = 3.00;
				comida4 = 7.00;
				comida5 = 4.00;
				comida6 = 10.00;
				comida7 = 7.00;
				comida8 = 7.00;
				comida9 = 8.00;
				comida10 = 6.00;
				comida11 = 2.00;
				comida12 = 9.00;

				String selecao = "Nota Fiscal: "; //nota fiscal
				if (filme1.isSelected()) {
					selecao += "\nFilme: Vendetta!";
				}
				if (filme2.isSelected()) {
					selecao += "\nFilme: Corações de Ferro!";
				}
				if (filme3.isSelected()) {
					selecao += "\nFilme: Venom!";
				}
				if (filme4.isSelected()) {
					selecao += "\nFilme: Detetive Pikachu!";
				}
				if (filme5.isSelected()) {
					selecao += "\nFilme: Avatar!";
				}
				if (filme6.isSelected()) {
					selecao += "\nFilme: Animais Fantasticos!";
				}
				if (filme7.isSelected()) {
					selecao += "\nFilme: Harry Potter!";
				}
				if (filme8.isSelected()) {
					selecao += "\nFilme: Peter Pan!";
				}
				if (filme9.isSelected()) {
					selecao += "\nFilme: Rei Leão!";
				}
				if (filme10.isSelected()) {
					selecao += "\nFilme: Hotel Transilvania 3!";
				}
				if (filme11.isSelected()) {
					selecao += "\nFilme: Kung Fu Panda 2!";
				}
				if (filme12.isSelected()) {
					selecao += "\nFilme: Como Treinar seu Dragão 3!";
				}
				if (filme13.isSelected()) {
					selecao += "\nFilme: Hush!";
				}
				if (filme14.isSelected()) {
					selecao += "\nFilme: Bird Box!";
				}
				if (filme15.isSelected()) {
					selecao += "\nFilme: Parasita!";
				}
				if (filme16.isSelected()) {
					selecao += "\nFilme: Um Lugar Silencioso!";
				}
				if (inteira1.isSelected()) {
					selecao += "\nCadeira1I";
				}
				if (inteira2.isSelected()) {
					selecao += "\nCadeira2I";
				}
				if (inteira3.isSelected()) {
					selecao += "\nCadeira3I";
				}
				if (inteira4.isSelected()) {
					selecao += "\nCadeira4I";
				}
				if (inteira5.isSelected()) {
					selecao += "\nCadeira5I";
				}
				if (inteira6.isSelected()) {
					selecao += "\nCadeira6I";
				}
				if (inteira7.isSelected()) {
					selecao += "\nCadeira7I";
				}
				if (inteira8.isSelected()) {
					selecao += "\nCadeira8I";
				}
				if (inteira9.isSelected()) {
					selecao += "\nCadeira9I";
				}
				if (inteira10.isSelected()) {
					selecao += "\nCadeira10I";
				}
				if (inteira11.isSelected()) {
					selecao += "\nCadeira11I";
				}
				if (inteira12.isSelected()) {
					selecao += "\nCadeira12I";
				}
				if (inteira13.isSelected()) {
					selecao += "\nCadeira13I";
				}
				if (inteira14.isSelected()) {
					selecao += "\nCadeira14I";
				}
				if (inteira15.isSelected()) {
					selecao += "\nCadeira15I";
				}
				if (inteira16.isSelected()) {
					selecao += "\nCadeira16I";
				}
				if (inteira17.isSelected()) {
					selecao += "\nCadeira17I";
				}
				if (inteira18.isSelected()) {
					selecao += "\nCadeira18I";
				}
				if (inteira19.isSelected()) {
					selecao += "\nCadeira19I";
				}
				if (inteira20.isSelected()) {
					selecao += "\nCadeira20I";
				}
				if (inteira21.isSelected()) {
					selecao += "\nCadeira21I";
				}
				if (inteira22.isSelected()) {
					selecao += "\nCadeira22I";
				}
				if (inteira23.isSelected()) {
					selecao += "\nCadeira23I";
				}
				if (inteira24.isSelected()) {
					selecao += "\nCadeira24I";
				}
				if (inteira25.isSelected()) {
					selecao += "\nCadeira25I";
				}
				if (inteira26.isSelected()) {
					selecao += "\nCadeira26I";
				}
				if (inteira27.isSelected()) {
					selecao += "\nCadeira27I";
				}
				if (inteira28.isSelected()) {
					selecao += "\nCadeira28I";
				}
				if (inteira29.isSelected()) {
					selecao += "\nCadeira29I";
				}
				if (inteira30.isSelected()) {
					selecao += "\nCadeira30I";
				}
				if (inteira31.isSelected()) {
					selecao += "\nCadeira31I";
				}
				if (inteira32.isSelected()) {
					selecao += "\nCadeira32I";
				}
				if (inteira33.isSelected()) {
					selecao += "\nCadeira33I";
				}
				if (inteira34.isSelected()) {
					selecao += "\nCadeira34I";
				}
				if (inteira35.isSelected()) {
					selecao += "\nCadeira35I";
				}
				if (inteira36.isSelected()) {
					selecao += "\nCadeira36I";
				}
				if (inteira37.isSelected()) {
					selecao += "\nCadeira37I";
				}
				if (inteira38.isSelected()) {
					selecao += "\nCadeira38I";
				}
				if (inteira39.isSelected()) {
					selecao += "\nCadeira39I";
				}
				if (inteira40.isSelected()) {
					selecao += "\nCadeira40I";
				}
				if (inteira41.isSelected()) {
					selecao += "\nCadeira41I";
				}
				if (inteira42.isSelected()) {
					selecao += "\nCadeira42I";
				}
				if (inteira43.isSelected()) {
					selecao += "\nCadeira43I";
				}
				if (inteira44.isSelected()) {
					selecao += "\nCadeira44I";
				}
				if (inteira45.isSelected()) {
					selecao += "\nCadeira45I";
				}
				if (inteira46.isSelected()) {
					selecao += "\nCadeira46I";
				}
				if (inteira47.isSelected()) {
					selecao += "\nCadeira47I";
				}
				if (inteira48.isSelected()) {
					selecao += "\nCadeira48I";
				}
				if (inteira49.isSelected()) {
					selecao += "\nCadeira49I";
				}
				if (inteira50.isSelected()) {
					selecao += "\nCadeira50I";
				}
				if (meia1.isSelected()) {
					selecao += "\nCadeira1M";
				}
				if (meia2.isSelected()) {
					selecao += "\nCadeira2M";
				}
				if (meia3.isSelected()) {
					selecao += "\nCadeira3M";
				}
				if (meia4.isSelected()) {
					selecao += "\nCadeira4M";
				}
				if (meia5.isSelected()) {
					selecao += "\nCadeira5M";
				}
				if (meia6.isSelected()) {
					selecao += "\nCadeira6M";
				}
				if (meia7.isSelected()) {
					selecao += "\nCadeira7M";
				}
				if (meia8.isSelected()) {
					selecao += "\nCadeira8M";
				}
				if (meia9.isSelected()) {
					selecao += "\nCadeira9M";
				}
				if (meia10.isSelected()) {
					selecao += "\nCadeira10M";
				}
				if (meia11.isSelected()) {
					selecao += "\nCadeira11M";
				}
				if (meia12.isSelected()) {
					selecao += "\nCadeira12M";
				}
				if (meia13.isSelected()) {
					selecao += "\nCadeira13M";
				}
				if (meia14.isSelected()) {
					selecao += "\nCadeira14M";
				}
				if (meia15.isSelected()) {
					selecao += "\nCadeira15M";
				}
				if (meia16.isSelected()) {
					selecao += "\nCadeira16M";
				}
				if (meia17.isSelected()) {
					selecao += "\nCadeira17M";
				}
				if (meia18.isSelected()) {
					selecao += "\nCadeira18M";
				}
				if (meia19.isSelected()) {
					selecao += "\nCadeira19M";
				}
				if (meia20.isSelected()) {
					selecao += "\nCadeira20M";
				}
				if (meia21.isSelected()) {
					selecao += "\nCadeira21M";
				}
				if (meia22.isSelected()) {
					selecao += "\nCadeira22M";
				}
				if (meia23.isSelected()) {
					selecao += "\nCadeira23M";
				}
				if (meia24.isSelected()) {
					selecao += "\nCadeira24M";
				}
				if (meia25.isSelected()) {
					selecao += "\nCadeira25M";
				}
				if (meia26.isSelected()) {
					selecao += "\nCadeira26M";
				}
				if (meia27.isSelected()) {
					selecao += "\nCadeira27M";
				}
				if (meia28.isSelected()) {
					selecao += "\nCadeira28M";
				}
				if (meia29.isSelected()) {
					selecao += "\nCadeira29M";
				}
				if (meia30.isSelected()) {
					selecao += "\nCadeira30M";
				}
				if (meia31.isSelected()) {
					selecao += "\nCadeira31M";
				}
				if (meia32.isSelected()) {
					selecao += "\nCadeira32M";
				}
				if (meia33.isSelected()) {
					selecao += "\nCadeira33M";
				}
				if (meia34.isSelected()) {
					selecao += "\nCadeira34M";
				}
				if (meia35.isSelected()) {
					selecao += "\nCadeira35M";
				}
				if (meia36.isSelected()) {
					selecao += "\nCadeira36M";
				}
				if (meia37.isSelected()) {
					selecao += "\nCadeira37M";
				}
				if (meia38.isSelected()) {
					selecao += "\nCadeira38M";
				}
				if (meia39.isSelected()) {
					selecao += "\nCadeira39M";
				}
				if (meia40.isSelected()) {
					selecao += "\nCadeira40M";
				}
				if (meia41.isSelected()) {
					selecao += "\nCadeira41M";
				}
				if (meia42.isSelected()) {
					selecao += "\nCadeira42M";
				}
				if (meia43.isSelected()) {
					selecao += "\nCadeira43M";
				}
				if (meia44.isSelected()) {
					selecao += "\nCadeira44M";
				}
				if (meia45.isSelected()) {
					selecao += "\nCadeira45M";
				}
				if (meia46.isSelected()) {
					selecao += "\nCadeira46M";
				}
				if (meia47.isSelected()) {
					selecao += "\nCadeira47M";
				}
				if (meia48.isSelected()) {
					selecao += "\nCadeira48M";
				}
				if (meia49.isSelected()) {
					selecao += "\nCadeira49M";
				}
				if (meia50.isSelected()) {
					selecao += "\nCadeira50M";
				}
				if (lanche1.isSelected()) { // verifica quais caixas estão selecionadas.
					selecao += "\nXburguer R$" + comida1;
				}
				if (lanche2.isSelected()) {
					selecao += "\nHot-Dog R$" + comida2;
				}
				if (lanche3.isSelected()) { // verifica quais caixas estão selecionadas.
					selecao += "\nTaco R$" + comida3;
				}
				if (acompanhamento1.isSelected()) { // verifica quais caixas estão selecionadas.
					selecao += "\nBatata-Frita R$" + comida5;
				}
				if (acompanhamento2.isSelected()) {
					selecao += "\nNachos R$" + comida6;
				}
				if (bebida1.isSelected()) {
					selecao += "\nPretzel R$" + comida8;
				}
				if (bebida2.isSelected()) { // verifica quais caixas estão selecionadas.
					selecao += "\nCoca R$" + comida9;
				}
				if (bebida3.isSelected()) {
					selecao += "\nSoda R$" + comida10;
				}
				if (sobremesa1.isSelected()) { // verifica quais caixas estão selecionadas.
					selecao += "\nSorvete R$" + comida11;
				}
				if (sobremesa2.isSelected()) {
					selecao += "\nSensação R$" + comida12;
				}
				if (cartao.isSelected()) {
					selecao += "\nPagamento no Cartão!";
				}
				if (vr.isSelected()) {
					selecao += "\nPagamento com Vale Refeição!";
				}
				if (dinheiro.isSelected()) {
					selecao += "\nPagamento no Dinheiro!";
				}
				

				JOptionPane.showMessageDialog(null, selecao);

			}
		});
		
		comprar.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				
				comprar.setVisible(false);
				lotacao.setVisible(true);
				
				if(inteira1.isSelected()) {
					ticket1.setVisible(false);
					ticket51.setVisible(true);
					ticket101.setVisible(false);
					pblotacao.setValue(pblotacao.getValue() + 2);
				}
				if(meia1.isSelected()) {
					ticket1.setVisible(false);
					ticket51.setVisible(false);
					ticket101.setVisible(true);
					pblotacao.setValue(pblotacao.getValue() + 2);
				}
				if(inteira2.isSelected()) {
					ticket2.setVisible(false);
					ticket52.setVisible(true);
					ticket102.setVisible(false);
					pblotacao.setValue(pblotacao.getValue() + 2);
				}
				if(meia2.isSelected()) {
					ticket2.setVisible(false);
					ticket52.setVisible(false);
					ticket102.setVisible(true);
					pblotacao.setValue(pblotacao.getValue() + 2);
				}
				if(inteira3.isSelected()) {
					ticket3.setVisible(false);
					ticket53.setVisible(true);
					ticket103.setVisible(false);
					pblotacao.setValue(pblotacao.getValue() + 2);
				}
				if(meia3.isSelected()) {
					ticket3.setVisible(false);
					ticket53.setVisible(false);
					ticket103.setVisible(true);
					pblotacao.setValue(pblotacao.getValue() + 2);
				}
				if(inteira4.isSelected()) {
					ticket4.setVisible(false);
					ticket54.setVisible(true);
					ticket104.setVisible(false);
					pblotacao.setValue(pblotacao.getValue() + 2);
				}
				if(meia4.isSelected()) {
					ticket4.setVisible(false);
					ticket54.setVisible(false);
					ticket104.setVisible(true);
					pblotacao.setValue(pblotacao.getValue() + 2);
				}
				if(inteira5.isSelected()) {
					ticket5.setVisible(false);
					ticket55.setVisible(true);
					ticket105.setVisible(false);
					pblotacao.setValue(pblotacao.getValue() + 2);
				}
				if(meia5.isSelected()) {
					ticket5.setVisible(false);
					ticket55.setVisible(false);
					ticket105.setVisible(true);
					pblotacao.setValue(pblotacao.getValue() + 2);
				}
				if(inteira6.isSelected()) {
					ticket6.setVisible(false);
					ticket56.setVisible(true);
					ticket106.setVisible(false);
					pblotacao.setValue(pblotacao.getValue() + 2);
				}
				if(meia6.isSelected()) {
					ticket6.setVisible(false);
					ticket56.setVisible(false);
					ticket106.setVisible(true);
					pblotacao.setValue(pblotacao.getValue() + 2);
				}
				if(inteira7.isSelected()) {
					ticket7.setVisible(false);
					ticket57.setVisible(true);
					ticket107.setVisible(false);
					pblotacao.setValue(pblotacao.getValue() + 2);
				}
				if(meia7.isSelected()) {
					ticket7.setVisible(false);
					ticket57.setVisible(false);
					ticket107.setVisible(true);
					pblotacao.setValue(pblotacao.getValue() + 2);
				}
				if(inteira8.isSelected()) {
					ticket8.setVisible(false);
					ticket58.setVisible(true);
					ticket108.setVisible(false);
					pblotacao.setValue(pblotacao.getValue() + 2);
				}
				if(meia8.isSelected()) {
					ticket8.setVisible(false);
					ticket58.setVisible(false);
					ticket108.setVisible(true);
					pblotacao.setValue(pblotacao.getValue() + 2);
				}
				if(inteira9.isSelected()) {
					ticket9.setVisible(false);
					ticket59.setVisible(true);
					ticket109.setVisible(false);
					pblotacao.setValue(pblotacao.getValue() + 2);
				}
				if(meia9.isSelected()) {
					ticket9.setVisible(false);
					ticket59.setVisible(false);
					ticket109.setVisible(true);
					pblotacao.setValue(pblotacao.getValue() + 2);
				}
				if(inteira10.isSelected()) {
					ticket10.setVisible(false);
					ticket60.setVisible(true);
					ticket110.setVisible(false);
					pblotacao.setValue(pblotacao.getValue() + 2);
				}
				if(meia10.isSelected()) {
					ticket10.setVisible(false);
					ticket60.setVisible(false);
					ticket110.setVisible(true);
					pblotacao.setValue(pblotacao.getValue() + 2);
				}
				if(inteira11.isSelected()) {
					ticket11.setVisible(false);
					ticket61.setVisible(true);
					ticket111.setVisible(false);
					pblotacao.setValue(pblotacao.getValue() + 2);
				}
				if(meia11.isSelected()) {
					ticket11.setVisible(false);
					ticket61.setVisible(false);
					ticket111.setVisible(true);
					pblotacao.setValue(pblotacao.getValue() + 2);
				}
				if(inteira12.isSelected()) {
					ticket12.setVisible(false);
					ticket62.setVisible(true);
					ticket112.setVisible(false);
					pblotacao.setValue(pblotacao.getValue() + 2);
				}
				if(meia12.isSelected()) {
					ticket12.setVisible(false);
					ticket62.setVisible(false);
					ticket112.setVisible(true);
					pblotacao.setValue(pblotacao.getValue() + 2);
				}
				if(inteira13.isSelected()) {
					ticket13.setVisible(false);
					ticket63.setVisible(true);
					ticket113.setVisible(false);
					pblotacao.setValue(pblotacao.getValue() + 2);
				}
				if(meia13.isSelected()) {
					ticket13.setVisible(false);
					ticket63.setVisible(false);
					ticket113.setVisible(true);
					pblotacao.setValue(pblotacao.getValue() + 2);
				}
				if(inteira14.isSelected()) {
					ticket14.setVisible(false);
					ticket64.setVisible(true);
					ticket114.setVisible(false);
					pblotacao.setValue(pblotacao.getValue() + 2);
				}
				if(meia14.isSelected()) {
					ticket14.setVisible(false);
					ticket64.setVisible(false);
					ticket114.setVisible(true);
					pblotacao.setValue(pblotacao.getValue() + 2);
				}
				if(inteira15.isSelected()) {
					ticket15.setVisible(false);
					ticket65.setVisible(true);
					ticket115.setVisible(false);
					pblotacao.setValue(pblotacao.getValue() + 2);
				}
				if(meia15.isSelected()) {
					ticket15.setVisible(false);
					ticket65.setVisible(false);
					ticket115.setVisible(true);
					pblotacao.setValue(pblotacao.getValue() + 2);
				}
				if(inteira16.isSelected()) {
					ticket16.setVisible(false);
					ticket66.setVisible(true);
					ticket116.setVisible(false);
					pblotacao.setValue(pblotacao.getValue() + 2);
				}
				if(meia16.isSelected()) {
					ticket16.setVisible(false);
					ticket66.setVisible(false);
					ticket116.setVisible(true);
					pblotacao.setValue(pblotacao.getValue() + 2);
				}
				if(inteira17.isSelected()) {
					ticket17.setVisible(false);
					ticket67.setVisible(true);
					ticket117.setVisible(false);
					pblotacao.setValue(pblotacao.getValue() + 2);
				}
				if(meia17.isSelected()) {
					ticket17.setVisible(false);
					ticket67.setVisible(false);
					ticket117.setVisible(true);
					pblotacao.setValue(pblotacao.getValue() + 2);
				}
				if(inteira18.isSelected()) {
					ticket18.setVisible(false);
					ticket68.setVisible(true);
					ticket118.setVisible(false);
					pblotacao.setValue(pblotacao.getValue() + 2);
				}
				if(meia18.isSelected()) {
					ticket18.setVisible(false);
					ticket68.setVisible(false);
					ticket118.setVisible(true);
					pblotacao.setValue(pblotacao.getValue() + 2);
				}
				if(inteira19.isSelected()) {
					ticket19.setVisible(false);
					ticket69.setVisible(true);
					ticket119.setVisible(false);
					pblotacao.setValue(pblotacao.getValue() + 2);
				}
				if(meia19.isSelected()) {
					ticket19.setVisible(false);
					ticket69.setVisible(false);
					ticket119.setVisible(true);
					pblotacao.setValue(pblotacao.getValue() + 2);
				}
				if(inteira20.isSelected()) {
					ticket20.setVisible(false);
					ticket70.setVisible(true);
					ticket120.setVisible(false);
					pblotacao.setValue(pblotacao.getValue() + 2);
				}
				if(meia20.isSelected()) {
					ticket20.setVisible(false);
					ticket70.setVisible(false);
					ticket120.setVisible(true);
					pblotacao.setValue(pblotacao.getValue() + 2);
				}
				if(inteira21.isSelected()) {
					ticket21.setVisible(false);
					ticket71.setVisible(true);
					ticket121.setVisible(false);
					pblotacao.setValue(pblotacao.getValue() + 2);
				}
				if(meia21.isSelected()) {
					ticket21.setVisible(false);
					ticket71.setVisible(false);
					ticket121.setVisible(true);
					pblotacao.setValue(pblotacao.getValue() + 2);
				}
				if(inteira22.isSelected()) {
					ticket22.setVisible(false);
					ticket72.setVisible(true);
					ticket122.setVisible(false);
					pblotacao.setValue(pblotacao.getValue() + 2);
				}
				if(meia22.isSelected()) {
					ticket22.setVisible(false);
					ticket72.setVisible(false);
					ticket122.setVisible(true);
					pblotacao.setValue(pblotacao.getValue() + 2);
				}
				if(inteira23.isSelected()) {
					ticket23.setVisible(false);
					ticket73.setVisible(true);
					ticket123.setVisible(false);
					pblotacao.setValue(pblotacao.getValue() + 2);
				}
				if(meia23.isSelected()) {
					ticket23.setVisible(false);
					ticket73.setVisible(false);
					ticket123.setVisible(true);
					pblotacao.setValue(pblotacao.getValue() + 2);
				}
				if(inteira24.isSelected()) {
					ticket24.setVisible(false);
					ticket74.setVisible(true);
					ticket124.setVisible(false);
					pblotacao.setValue(pblotacao.getValue() + 2);
				}
				if(meia24.isSelected()) {
					ticket24.setVisible(false);
					ticket74.setVisible(false);
					ticket124.setVisible(true);
					pblotacao.setValue(pblotacao.getValue() + 2);
				}
				if(inteira25.isSelected()) {
					ticket25.setVisible(false);
					ticket75.setVisible(true);
					ticket125.setVisible(false);
					pblotacao.setValue(pblotacao.getValue() + 2);
				}
				if(meia25.isSelected()) {
					ticket25.setVisible(false);
					ticket75.setVisible(false);
					ticket125.setVisible(true);
					pblotacao.setValue(pblotacao.getValue() + 2);
				}
				if(inteira26.isSelected()) {
					ticket26.setVisible(false);
					ticket76.setVisible(true);
					ticket126.setVisible(false);
					pblotacao.setValue(pblotacao.getValue() + 2);
				}
				if(meia26.isSelected()) {
					ticket26.setVisible(false);
					ticket76.setVisible(false);
					ticket126.setVisible(true);
					pblotacao.setValue(pblotacao.getValue() + 2);
				}
				if(inteira27.isSelected()) {
					ticket27.setVisible(false);
					ticket77.setVisible(true);
					ticket127.setVisible(false);
					pblotacao.setValue(pblotacao.getValue() + 2);
				}
				if(meia27.isSelected()) {
					ticket27.setVisible(false);
					ticket77.setVisible(false);
					ticket127.setVisible(true);
					pblotacao.setValue(pblotacao.getValue() + 2);
				}
				if(inteira28.isSelected()) {
					ticket28.setVisible(false);
					ticket78.setVisible(true);
					ticket128.setVisible(false);
					pblotacao.setValue(pblotacao.getValue() + 2);
				}
				if(meia28.isSelected()) {
					ticket28.setVisible(false);
					ticket78.setVisible(false);
					ticket128.setVisible(true);
					pblotacao.setValue(pblotacao.getValue() + 2);
				}
				if(inteira29.isSelected()) {
					ticket29.setVisible(false);
					ticket79.setVisible(true);
					ticket129.setVisible(false);
					pblotacao.setValue(pblotacao.getValue() + 2);
				}
				if(meia29.isSelected()) {
					ticket29.setVisible(false);
					ticket79.setVisible(false);
					ticket129.setVisible(true);
					pblotacao.setValue(pblotacao.getValue() + 2);
				}
				if(inteira30.isSelected()) {
					ticket30.setVisible(false);
					ticket80.setVisible(true);
					ticket130.setVisible(false);
					pblotacao.setValue(pblotacao.getValue() + 2);
				}
				if(meia30.isSelected()) {
					ticket30.setVisible(false);
					ticket80.setVisible(false);
					ticket130.setVisible(true);
					pblotacao.setValue(pblotacao.getValue() + 2);
				}
				if(inteira31.isSelected()) {
					ticket31.setVisible(false);
					ticket81.setVisible(true);
					ticket131.setVisible(false);
					pblotacao.setValue(pblotacao.getValue() + 2);
				}
				if(meia31.isSelected()) {
					ticket31.setVisible(false);
					ticket81.setVisible(false);
					ticket131.setVisible(true);
					pblotacao.setValue(pblotacao.getValue() + 2);
				}
				if(inteira32.isSelected()) {
					ticket32.setVisible(false);
					ticket82.setVisible(true);
					ticket132.setVisible(false);
					pblotacao.setValue(pblotacao.getValue() + 2);
				}
				if(meia32.isSelected()) {
					ticket32.setVisible(false);
					ticket82.setVisible(false);
					ticket132.setVisible(true);
					pblotacao.setValue(pblotacao.getValue() + 2);
				}
				if(inteira33.isSelected()) {
					ticket33.setVisible(false);
					ticket83.setVisible(true);
					ticket133.setVisible(false);
					pblotacao.setValue(pblotacao.getValue() + 2);
				}
				if(meia33.isSelected()) {
					ticket33.setVisible(false);
					ticket83.setVisible(false);
					ticket133.setVisible(true);
					pblotacao.setValue(pblotacao.getValue() + 2);
				}
				if(inteira34.isSelected()) {
					ticket34.setVisible(false);
					ticket84.setVisible(true);
					ticket134.setVisible(false);
					pblotacao.setValue(pblotacao.getValue() + 2);
				}
				if(meia34.isSelected()) {
					ticket34.setVisible(false);
					ticket84.setVisible(false);
					ticket134.setVisible(true);
					pblotacao.setValue(pblotacao.getValue() + 2);
				}
				if(inteira35.isSelected()) {
					ticket35.setVisible(false);
					ticket85.setVisible(true);
					ticket135.setVisible(false);
					pblotacao.setValue(pblotacao.getValue() + 2);
				}
				if(meia35.isSelected()) {
					ticket35.setVisible(false);
					ticket85.setVisible(false);
					ticket135.setVisible(true);
					pblotacao.setValue(pblotacao.getValue() + 2);
				}
				if(inteira36.isSelected()) {
					ticket36.setVisible(false);
					ticket86.setVisible(true);
					ticket136.setVisible(false);
					pblotacao.setValue(pblotacao.getValue() + 2);
				}
				if(meia36.isSelected()) {
					ticket36.setVisible(false);
					ticket86.setVisible(false);
					ticket136.setVisible(true);
					pblotacao.setValue(pblotacao.getValue() + 2);
				}
				if(inteira37.isSelected()) {
					ticket37.setVisible(false);
					ticket87.setVisible(true);
					ticket137.setVisible(false);
					pblotacao.setValue(pblotacao.getValue() + 2);
				}
				if(meia37.isSelected()) {
					ticket37.setVisible(false);
					ticket87.setVisible(false);
					ticket137.setVisible(true);
					pblotacao.setValue(pblotacao.getValue() + 2);
				}
				if(inteira38.isSelected()) {
					ticket38.setVisible(false);
					ticket88.setVisible(true);
					ticket138.setVisible(false);
					pblotacao.setValue(pblotacao.getValue() + 2);
				}
				if(meia38.isSelected()) {
					ticket38.setVisible(false);
					ticket88.setVisible(true);
					ticket138.setVisible(true);
					pblotacao.setValue(pblotacao.getValue() + 2);
				}
				if(inteira39.isSelected()) {
					ticket39.setVisible(false);
					ticket89.setVisible(true);
					ticket139.setVisible(false);
					pblotacao.setValue(pblotacao.getValue() + 2);
				}
				if(meia39.isSelected()) {
					ticket39.setVisible(false);
					ticket89.setVisible(false);
					ticket139.setVisible(true);
					pblotacao.setValue(pblotacao.getValue() + 2);
				}
				if(inteira40.isSelected()) {
					ticket40.setVisible(false);
					ticket90.setVisible(true);
					ticket140.setVisible(false);
					pblotacao.setValue(pblotacao.getValue() + 2);
				}
				if(meia40.isSelected()) {
					ticket40.setVisible(false);
					ticket90.setVisible(false);
					ticket140.setVisible(true);
					pblotacao.setValue(pblotacao.getValue() + 2);
				}
				if(inteira41.isSelected()) {
					ticket41.setVisible(false);
					ticket91.setVisible(true);
					ticket141.setVisible(false);
					pblotacao.setValue(pblotacao.getValue() + 2);
				}
				if(meia41.isSelected()) {
					ticket41.setVisible(false);
					ticket91.setVisible(false);
					ticket141.setVisible(true);
					pblotacao.setValue(pblotacao.getValue() + 2);
				}
				if(inteira42.isSelected()) {
					ticket42.setVisible(false);
					ticket92.setVisible(true);
					ticket142.setVisible(false);
					pblotacao.setValue(pblotacao.getValue() + 2);
				}
				if(meia42.isSelected()) {
					ticket42.setVisible(false);
					ticket92.setVisible(false);
					ticket142.setVisible(true);
					pblotacao.setValue(pblotacao.getValue() + 2);
				}
				if(inteira43.isSelected()) {
					ticket43.setVisible(false);
					ticket93.setVisible(true);
					ticket143.setVisible(false);
					pblotacao.setValue(pblotacao.getValue() + 2);
				}
				if(meia43.isSelected()) {
					ticket43.setVisible(false);
					ticket93.setVisible(false);
					ticket143.setVisible(true);
					pblotacao.setValue(pblotacao.getValue() + 2);
				}
				if(inteira44.isSelected()) {
					ticket44.setVisible(false);
					ticket94.setVisible(true);
					ticket144.setVisible(false);
					pblotacao.setValue(pblotacao.getValue() + 2);
				}
				if(meia44.isSelected()) {
					ticket44.setVisible(false);
					ticket94.setVisible(false);
					ticket144.setVisible(true);
					pblotacao.setValue(pblotacao.getValue() + 2);
				}
				if(inteira45.isSelected()) {
					ticket45.setVisible(false);
					ticket95.setVisible(true);
					ticket145.setVisible(false);
					pblotacao.setValue(pblotacao.getValue() + 2);
				}
				if(meia45.isSelected()) {
					ticket45.setVisible(false);
					ticket95.setVisible(false);
					ticket145.setVisible(true);
					pblotacao.setValue(pblotacao.getValue() + 2);
				}
				if(inteira46.isSelected()) {
					ticket46.setVisible(false);
					ticket96.setVisible(true);
					ticket146.setVisible(false);
					pblotacao.setValue(pblotacao.getValue() + 2);
				}
				if(meia46.isSelected()) {
					ticket46.setVisible(false);
					ticket96.setVisible(false);
					ticket146.setVisible(true);
					pblotacao.setValue(pblotacao.getValue() + 2);
				}
				if(inteira47.isSelected()) {
					ticket47.setVisible(false);
					ticket97.setVisible(true);
					ticket147.setVisible(false);
					pblotacao.setValue(pblotacao.getValue() + 2);
				}
				if(meia47.isSelected()) {
					ticket47.setVisible(false);
					ticket97.setVisible(false);
					ticket147.setVisible(true);
					pblotacao.setValue(pblotacao.getValue() + 2);
				}
				if(inteira48.isSelected()) {
					ticket48.setVisible(false);
					ticket98.setVisible(true);
					ticket148.setVisible(false);
					pblotacao.setValue(pblotacao.getValue() + 2);
				}
				if(meia48.isSelected()) {
					ticket48.setVisible(false);
					ticket98.setVisible(false);
					ticket148.setVisible(true);
					pblotacao.setValue(pblotacao.getValue() + 2);
				}
				if(inteira49.isSelected()) {
					ticket49.setVisible(false);
					ticket99.setVisible(true);
					ticket149.setVisible(false);
					pblotacao.setValue(pblotacao.getValue() + 2); //NICE :3
				}
				if(meia49.isSelected()) {
					ticket49.setVisible(false);
					ticket99.setVisible(false);
					ticket149.setVisible(true);
					pblotacao.setValue(pblotacao.getValue() + 2);
				}
				if(inteira50.isSelected()) {
					ticket50.setVisible(false);
					ticket100.setVisible(true);
					ticket150.setVisible(false);
					pblotacao.setValue(pblotacao.getValue() + 2);
				}
				if(meia50.isSelected()) {
					ticket50.setVisible(false);
					ticket100.setVisible(false);
					ticket150.setVisible(true);
					pblotacao.setValue(pblotacao.getValue() + 2);
				}
			}

		});
	}
	public static void main(String args[]) {
		JFrame frame = new JFrame("Cinema");
		frame.setIconImage(icon.getImage());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(new Cinema());
		frame.setBounds(50, 50, 785, 518);
		frame.setVisible(true);
	}
}
