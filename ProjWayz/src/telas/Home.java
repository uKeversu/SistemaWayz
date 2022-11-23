/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import conecta.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import consulta.ConsultaFuncionario;
import consulta.ConsultaProduto;
import consulta.ConsultaQuartos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import static java.time.OffsetTime.now;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.Timer;
import model.User;
import reservas.Hospedar;
import relatorio.RelatorioHospede;
import reservas.Consultar;
import reservas.Finalizar;

/**
 * @author Acer
 */
public class Home extends javax.swing.JFrame {

    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
     ArrayList<User> lista = new ArrayList<>();

    /**
     * Creates new form Home
     */
    //=============== PERMITE MAXIMIZAR A JANELA =================
    public Home() {
        initComponents();

        setExtendedState(MAXIMIZED_BOTH);

        conexao = Conexao.conector();

        nome_usuario.setText(TelaLogin.nm_user);
        
        Timer timer = new Timer(1000, new hora());
        timer.start();
        
    }

    void funcionariologado() {

        String sql = "select login from funcionario as f/n"
                + "inner join log as l on f.idfuncionario = l.idfuncionario"
                + "where l.idlog = (select MAX (idlog) AS idlog from log)";

      ;

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        LogoWayz = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        nome_usuario = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        nome_usuario1 = new javax.swing.JLabel();
        lblHora = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        nome_usuario3 = new javax.swing.JLabel();
        jCalendar1 = new com.toedter.calendar.JCalendar();
        Desktop = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuCad = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        menuFunCad = new javax.swing.JMenuItem();
        menuFunCon = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        menuQuartCad = new javax.swing.JMenuItem();
        menuQuartCon = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        menuProdCad = new javax.swing.JMenuItem();
        menuProdCon = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menuResAdd = new javax.swing.JMenuItem();
        menuResCon = new javax.swing.JMenuItem();
        menuResFin = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        menuVendProd = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        menuRelHosp = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        menuOpFund = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Wayz - Home");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 0, 0, new java.awt.Color(0, 0, 0)));

        LogoWayz.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/LogoWayzSemNome (2).png"))); // NOI18N
        LogoWayz.setPreferredSize(new java.awt.Dimension(450, 450));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/account_avatar_face_man_people_profile_user_icon_123197 (1).png"))); // NOI18N

        nome_usuario.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        nome_usuario.setForeground(new java.awt.Color(0, 0, 0));
        nome_usuario.setText("Usuário");

        btnLogout.setBackground(new java.awt.Color(255, 255, 255));
        btnLogout.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(0, 0, 0));
        btnLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/LogoutIcon.png"))); // NOI18N
        btnLogout.setText("Logout ");
        btnLogout.setBorder(null);
        btnLogout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        nome_usuario1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        nome_usuario1.setForeground(new java.awt.Color(0, 0, 0));
        nome_usuario1.setText("Horário de Brasília");

        lblHora.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        lblHora.setForeground(new java.awt.Color(0, 0, 0));
        lblHora.setText("00:00");

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));

        nome_usuario3.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        nome_usuario3.setForeground(new java.awt.Color(0, 0, 0));
        nome_usuario3.setText("Calendário");

        jCalendar1.setBackground(new java.awt.Color(255, 255, 255));
        jCalendar1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jCalendar1.setForeground(new java.awt.Color(0, 0, 0));
        jCalendar1.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jCalendar1.setWeekOfYearVisible(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2)
            .addComponent(jSeparator1)
            .addComponent(jSeparator3)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jCalendar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 14, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(nome_usuario1)
                        .addGap(126, 126, 126))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(lblHora)
                        .addGap(178, 178, 178))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(LogoWayz, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(161, 161, 161))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(nome_usuario3)
                        .addGap(162, 162, 162))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btnLogout)
                        .addGap(162, 162, 162))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(145, 145, 145))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(nome_usuario)
                        .addGap(178, 178, 178))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nome_usuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLogout)
                .addGap(12, 12, 12)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nome_usuario1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblHora)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nome_usuario3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCalendar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LogoWayz, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Desktop.setLayout(new javax.swing.BoxLayout(Desktop, javax.swing.BoxLayout.LINE_AXIS));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(Desktop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 457, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(201, 201, 201)
                .addComponent(Desktop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenuBar1.setBackground(new java.awt.Color(0, 0, 0));
        jMenuBar1.setBorder(new javax.swing.border.MatteBorder(null));
        jMenuBar1.setForeground(new java.awt.Color(0, 0, 0));
        jMenuBar1.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jMenuBar1.setMargin(new java.awt.Insets(0, 0, 2, 0));
        jMenuBar1.setName(""); // NOI18N
        jMenuBar1.setOpaque(false);

        menuCad.setBackground(new java.awt.Color(255, 0, 0));
        menuCad.setBorder(null);
        menuCad.setForeground(new java.awt.Color(0, 0, 0));
        menuCad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Cadastrar_25x25.png"))); // NOI18N
        menuCad.setText("Cadastros   |");
        menuCad.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuCad.setFocusable(false);
        menuCad.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N

        jMenu5.setBackground(new java.awt.Color(255, 255, 255));
        jMenu5.setForeground(new java.awt.Color(0, 0, 0));
        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Funcionarios_20x20.png"))); // NOI18N
        jMenu5.setText("Funcionários");
        jMenu5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu5.setFocusable(false);
        jMenu5.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jMenu5.setOpaque(true);
        jMenu5.setRequestFocusEnabled(false);

        menuFunCad.setBackground(new java.awt.Color(255, 255, 255));
        menuFunCad.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        menuFunCad.setForeground(new java.awt.Color(0, 0, 0));
        menuFunCad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/BonecoPlus_20x20.png"))); // NOI18N
        menuFunCad.setText("Cadastrar");
        menuFunCad.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuFunCad.setOpaque(true);
        menuFunCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuFunCadActionPerformed(evt);
            }
        });
        jMenu5.add(menuFunCad);

        menuFunCon.setBackground(new java.awt.Color(255, 255, 255));
        menuFunCon.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        menuFunCon.setForeground(new java.awt.Color(0, 0, 0));
        menuFunCon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lupa_20x20.png"))); // NOI18N
        menuFunCon.setText("Consultar");
        menuFunCon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuFunCon.setOpaque(true);
        menuFunCon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuFunConActionPerformed(evt);
            }
        });
        jMenu5.add(menuFunCon);

        menuCad.add(jMenu5);

        jMenu7.setBackground(new java.awt.Color(255, 255, 255));
        jMenu7.setForeground(new java.awt.Color(0, 0, 0));
        jMenu7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Casa_20x20.png"))); // NOI18N
        jMenu7.setText("Quartos");
        jMenu7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu7.setFocusable(false);
        jMenu7.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jMenu7.setOpaque(true);

        menuQuartCad.setBackground(new java.awt.Color(255, 255, 255));
        menuQuartCad.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        menuQuartCad.setForeground(new java.awt.Color(0, 0, 0));
        menuQuartCad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/home_plus_outline_icon_139461_20x20.png"))); // NOI18N
        menuQuartCad.setText("Cadastrar");
        menuQuartCad.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuQuartCad.setOpaque(true);
        menuQuartCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuQuartCadActionPerformed(evt);
            }
        });
        jMenu7.add(menuQuartCad);

        menuQuartCon.setBackground(new java.awt.Color(255, 255, 255));
        menuQuartCon.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        menuQuartCon.setForeground(new java.awt.Color(0, 0, 0));
        menuQuartCon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lupa_20x20.png"))); // NOI18N
        menuQuartCon.setText("Consultar");
        menuQuartCon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuQuartCon.setOpaque(true);
        menuQuartCon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuQuartConActionPerformed(evt);
            }
        });
        jMenu7.add(menuQuartCon);

        menuCad.add(jMenu7);

        jMenu6.setBackground(new java.awt.Color(255, 255, 255));
        jMenu6.setForeground(new java.awt.Color(0, 0, 0));
        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ComprasICon_1_20x20.png"))); // NOI18N
        jMenu6.setText("Produtos");
        jMenu6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu6.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jMenu6.setOpaque(true);

        menuProdCad.setBackground(new java.awt.Color(255, 255, 255));
        menuProdCad.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        menuProdCad.setForeground(new java.awt.Color(0, 0, 0));
        menuProdCad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/AdicionarCarrinho_20x20.png"))); // NOI18N
        menuProdCad.setText("Cadastrar");
        menuProdCad.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuProdCad.setOpaque(true);
        menuProdCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuProdCadActionPerformed(evt);
            }
        });
        jMenu6.add(menuProdCad);

        menuProdCon.setBackground(new java.awt.Color(255, 255, 255));
        menuProdCon.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        menuProdCon.setForeground(new java.awt.Color(0, 0, 0));
        menuProdCon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lupa_20x20.png"))); // NOI18N
        menuProdCon.setText("Consultar");
        menuProdCon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuProdCon.setOpaque(true);
        menuProdCon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuProdConActionPerformed(evt);
            }
        });
        jMenu6.add(menuProdCon);

        menuCad.add(jMenu6);

        jMenuBar1.add(menuCad);

        jMenu2.setBackground(new java.awt.Color(255, 0, 0));
        jMenu2.setBorder(null);
        jMenu2.setForeground(new java.awt.Color(0, 0, 0));
        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Reserva_25x25.png"))); // NOI18N
        jMenu2.setText("Reservas   |");
        jMenu2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu2.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N

        menuResAdd.setBackground(new java.awt.Color(255, 255, 255));
        menuResAdd.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        menuResAdd.setForeground(new java.awt.Color(0, 0, 0));
        menuResAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/AdicionarReserva_20x20.png"))); // NOI18N
        menuResAdd.setText("Hospedar");
        menuResAdd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuResAdd.setOpaque(true);
        menuResAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuResAddActionPerformed(evt);
            }
        });
        jMenu2.add(menuResAdd);

        menuResCon.setBackground(new java.awt.Color(255, 255, 255));
        menuResCon.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        menuResCon.setForeground(new java.awt.Color(0, 0, 0));
        menuResCon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ConsultarReserva_20x20.png"))); // NOI18N
        menuResCon.setText("Consultar");
        menuResCon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuResCon.setOpaque(true);
        menuResCon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuResConActionPerformed(evt);
            }
        });
        jMenu2.add(menuResCon);

        menuResFin.setBackground(new java.awt.Color(255, 255, 255));
        menuResFin.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        menuResFin.setForeground(new java.awt.Color(0, 0, 0));
        menuResFin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/FinalizarReserva_20x20.png"))); // NOI18N
        menuResFin.setText("Finalizar");
        menuResFin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuResFin.setOpaque(true);
        menuResFin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuResFinActionPerformed(evt);
            }
        });
        jMenu2.add(menuResFin);

        jMenuBar1.add(jMenu2);

        jMenu1.setBackground(new java.awt.Color(255, 0, 0));
        jMenu1.setForeground(new java.awt.Color(0, 0, 0));
        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Carrinho_25x25.png"))); // NOI18N
        jMenu1.setText("Vendas   |");
        jMenu1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu1.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N

        menuVendProd.setBackground(new java.awt.Color(255, 255, 255));
        menuVendProd.setForeground(new java.awt.Color(0, 0, 0));
        menuVendProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cesta_produtos_20x20.png"))); // NOI18N
        menuVendProd.setText("Produtos");
        menuVendProd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuVendProd.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        menuVendProd.setOpaque(true);

        jMenuItem5.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItem5.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jMenuItem5.setForeground(new java.awt.Color(0, 0, 0));
        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Caixa_20x20.png"))); // NOI18N
        jMenuItem5.setText("Estoque");
        jMenuItem5.setOpaque(true);
        menuVendProd.add(jMenuItem5);

        jMenu1.add(menuVendProd);

        jMenuBar1.add(jMenu1);

        jMenu3.setBackground(new java.awt.Color(255, 0, 0));
        jMenu3.setForeground(new java.awt.Color(0, 0, 0));
        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/relatório_25x25.png"))); // NOI18N
        jMenu3.setText("Relatórios   |");
        jMenu3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu3.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N

        menuRelHosp.setBackground(new java.awt.Color(255, 255, 255));
        menuRelHosp.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        menuRelHosp.setForeground(new java.awt.Color(0, 0, 0));
        menuRelHosp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/DoisBoneco_20x20.png"))); // NOI18N
        menuRelHosp.setText("Hóspedes");
        menuRelHosp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuRelHosp.setOpaque(true);
        menuRelHosp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRelHospActionPerformed(evt);
            }
        });
        jMenu3.add(menuRelHosp);

        jMenuItem2.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItem2.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jMenuItem2.setForeground(new java.awt.Color(0, 0, 0));
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Reserva_20x20.png"))); // NOI18N
        jMenuItem2.setText("Reservas");
        jMenuItem2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItem2.setOpaque(true);
        jMenu3.add(jMenuItem2);

        jMenuItem3.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItem3.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jMenuItem3.setForeground(new java.awt.Color(0, 0, 0));
        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/CarrinhoComprado_20x20.png"))); // NOI18N
        jMenuItem3.setText("Vendas");
        jMenuItem3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItem3.setOpaque(true);
        jMenu3.add(jMenuItem3);

        jMenuItem4.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItem4.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jMenuItem4.setForeground(new java.awt.Color(0, 0, 0));
        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Moeda_20x20.png"))); // NOI18N
        jMenuItem4.setText("Financeiro");
        jMenuItem4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItem4.setOpaque(true);
        jMenu3.add(jMenuItem4);

        jMenuBar1.add(jMenu3);

        jMenu4.setBackground(new java.awt.Color(255, 0, 0));
        jMenu4.setForeground(new java.awt.Color(0, 0, 0));
        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/SettingsICon_25x25_1_20x20.png"))); // NOI18N
        jMenu4.setText("Configurações");
        jMenu4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu4.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N

        menuOpFund.setBackground(new java.awt.Color(255, 255, 255));
        menuOpFund.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        menuOpFund.setForeground(new java.awt.Color(0, 0, 0));
        menuOpFund.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/PlanoDeFundo_20x20.png"))); // NOI18N
        menuOpFund.setText("Plano de fundo");
        menuOpFund.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuOpFund.setOpaque(true);
        jMenu4.add(menuOpFund);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

       public ArrayList<User> consultaUsuario() {
        String sql = "select * from tb_usuario";
        
        try {
            pst = conexao.prepareStatement(sql);
            rs = pst.executeQuery();

            while (rs.next()) {
                User user = new User();
                user.setId_user(rs.getInt("id_user"));
                user.setTxtNome(rs.getString("txtNome"));
                user.setNm_user(rs.getString("nm_user"));
                user.setTxtCpf(rs.getString("txtCpf"));
                user.setTxtFone(rs.getString("txtFone"));
                user.setCargo(rs.getString("Cargo"));
                user.setGrauDeAcesso(rs.getInt("grauDeAcesso"));

                lista.add(user);

            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Consultar Usuário" + erro);
        }

        return lista;

    }
    
    private void menuFunCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuFunCadActionPerformed
 
        
        
        CadastroFuncionario cadastro = new CadastroFuncionario();

        cadastro.setVisible(true);

        Desktop.add(cadastro);

    }//GEN-LAST:event_menuFunCadActionPerformed

    private void menuQuartCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuQuartCadActionPerformed

        CadastroQuartos cad_quarto = new CadastroQuartos();
        
        cad_quarto.setVisible(true);
        
        Desktop.add(cad_quarto);
        
    }//GEN-LAST:event_menuQuartCadActionPerformed

    private void menuQuartConActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuQuartConActionPerformed
        
        ConsultaQuartos consulta_quarto = new ConsultaQuartos();
       
       consulta_quarto.setVisible(true);
       
       Desktop.add(consulta_quarto);
        
    }//GEN-LAST:event_menuQuartConActionPerformed

    private void menuResConActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuResConActionPerformed
       
        Consultar consulta_reservas = new Consultar();
        
        consulta_reservas.setVisible(true);
        
        Desktop.add(consulta_reservas);
        
    }//GEN-LAST:event_menuResConActionPerformed

    private void menuResAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuResAddActionPerformed
       
        Hospedar hospedagem = new Hospedar();
       
       hospedagem.setVisible(true);
       
       Desktop.add(hospedagem);
        
        
    }//GEN-LAST:event_menuResAddActionPerformed

    private void menuFunConActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuFunConActionPerformed

       ConsultaFuncionario consulta_fun = new ConsultaFuncionario();
       
       consulta_fun.setVisible(true);
       
       Desktop.add(consulta_fun);

    }//GEN-LAST:event_menuFunConActionPerformed

    private void menuProdCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuProdCadActionPerformed

       CadastroProduto cad_produto = new CadastroProduto();
       
       cad_produto.setVisible(true);
       
       Desktop.add(cad_produto);
        
    }//GEN-LAST:event_menuProdCadActionPerformed

    private void menuProdConActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuProdConActionPerformed
       
        ConsultaProduto consulta_produto = new ConsultaProduto();
        
        consulta_produto.setVisible(true);
        
        Desktop.add(consulta_produto);
    }//GEN-LAST:event_menuProdConActionPerformed

    private void menuRelHospActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRelHospActionPerformed
        
        RelatorioHospede relatorioHospede = new RelatorioHospede();
        
        relatorioHospede.setVisible(true);
        
        Desktop.add(relatorioHospede);
        
    }//GEN-LAST:event_menuRelHospActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed

        int logout = JOptionPane.showConfirmDialog(null, "Voltar a tela de login?", "Confirmação", JOptionPane.YES_NO_OPTION);

        int saida = 1;

        if (logout == JOptionPane.YES_OPTION) {

            if (saida > 0) {

                this.dispose();

                TelaLogin login = new TelaLogin();

                login.setVisible(true);
            }
        } else {
            saida = 0;
        }
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void menuResFinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuResFinActionPerformed
      
        Finalizar finalizar_reserva = new Finalizar();
       
       finalizar_reserva.setVisible(true);
       
       Desktop.add(finalizar_reserva);
       
    }//GEN-LAST:event_menuResFinActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane Desktop;
    private javax.swing.JLabel LogoWayz;
    private javax.swing.JButton btnLogout;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lblHora;
    private javax.swing.JMenu menuCad;
    public static javax.swing.JMenuItem menuFunCad;
    private javax.swing.JMenuItem menuFunCon;
    private javax.swing.JMenuItem menuOpFund;
    private javax.swing.JMenuItem menuProdCad;
    private javax.swing.JMenuItem menuProdCon;
    private javax.swing.JMenuItem menuQuartCad;
    private javax.swing.JMenuItem menuQuartCon;
    private javax.swing.JMenuItem menuRelHosp;
    private javax.swing.JMenuItem menuResAdd;
    private javax.swing.JMenuItem menuResCon;
    private javax.swing.JMenuItem menuResFin;
    private javax.swing.JMenu menuVendProd;
    private javax.swing.JLabel nome_usuario;
    private javax.swing.JLabel nome_usuario1;
    private javax.swing.JLabel nome_usuario3;
    // End of variables declaration//GEN-END:variables

class hora implements ActionListener{
    
    public void actionPerformed(ActionEvent e){
        Calendar now = Calendar.getInstance();
        lblHora.setText(String.format("%1$tH:%1$tM", now));
    }
    
}

}
