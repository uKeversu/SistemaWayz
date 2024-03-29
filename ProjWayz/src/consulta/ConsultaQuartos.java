package consulta;

import conecta.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import model.Room;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * @author kelwin_santos
 */
public class ConsultaQuartos extends javax.swing.JInternalFrame {

    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    ArrayList<Room> lista = new ArrayList<>();
    /**
     * Creates new form ConsultaQuartos
     */
    public ConsultaQuartos() {
        initComponents();
        
        conexao = Conexao.conector();

        tabelaQuarto.setRowHeight(30);
        setTable();
        listarquarto();
        
    }
    
     public ArrayList<Room> consultaQuarto() {
        String sql = "select * from tb_quarto";

        try {
            pst = conexao.prepareStatement(sql);
            rs = pst.executeQuery();

            while (rs.next()) {
                Room room = new Room();
                room.setNmr_quarto(rs.getInt("nmr_quarto"));
                room.setTxtValorDiaria(rs.getFloat("txtValorDiaria"));
                room.setTxtAndar(rs.getString("txtAndar"));
                room.setTxtTipoQuarto(rs.getString("txtTipoQuarto"));
                room.setTxtDesc(rs.getString("txtDesc"));
                room.setOcupacao(rs.getString("ocupacao"));
                
                lista.add(room);

            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Consultar Quarto" + erro);
        }

        return lista;

    }

    private void setTable() {

        tabelaQuarto.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
       
    }

    private void listarquarto() {
        try {

             
            DefaultTableModel model = (DefaultTableModel) tabelaQuarto.getModel();
            model.setNumRows(0);
            ArrayList<Room> lista = consultaQuarto();

            for (int num = 0; num < lista.size(); num++) {
                model.addRow(new Object[]{
                    lista.get(num).getNmr_quarto(),
                    lista.get(num).getTxtValorDiaria(),
                    lista.get(num).getTxtAndar(),
                    lista.get(num).getTxtTipoQuarto(),
                    lista.get(num).getTxtDesc(),
                    lista.get(num).getOcupacao()
                    
                });
            }

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Listar Quarto" + erro);

        }
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
        jLabel1 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaQuarto = new javax.swing.JTable();

        setBackground(new java.awt.Color(51, 51, 51));
        setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        setClosable(true);
        setPreferredSize(new java.awt.Dimension(630, 550));

        jPanel1.setBackground(new java.awt.Color(255, 0, 0));
        jPanel1.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(626, 33));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icone_cama.png"))); // NOI18N
        jLabel1.setText("CONSULTA DE QUARTOS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(218, 218, 218)
                .addComponent(jLabel1)
                .addContainerGap(214, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
        );

        jPanel6.setBackground(new java.awt.Color(51, 51, 51));
        jPanel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel6.setForeground(new java.awt.Color(51, 51, 51));

        jScrollPane1.setBackground(new java.awt.Color(51, 51, 51));
        jScrollPane1.setBorder(null);
        jScrollPane1.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N

        tabelaQuarto.setBackground(new java.awt.Color(51, 51, 51));
        tabelaQuarto.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        tabelaQuarto.setForeground(new java.awt.Color(255, 255, 255));
        tabelaQuarto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "N°", "DIÁRIA", "ANDAR", "TIPO", "DESCRIÇÃO", "STATUS"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaQuarto.setGridColor(new java.awt.Color(255, 255, 255));
        tabelaQuarto.setRowHeight(25);
        tabelaQuarto.setSelectionBackground(new java.awt.Color(102, 0, 0));
        tabelaQuarto.setShowGrid(true);
        tabelaQuarto.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tabelaQuarto);
        if (tabelaQuarto.getColumnModel().getColumnCount() > 0) {
            tabelaQuarto.getColumnModel().getColumn(0).setResizable(false);
            tabelaQuarto.getColumnModel().getColumn(0).setPreferredWidth(40);
            tabelaQuarto.getColumnModel().getColumn(1).setResizable(false);
            tabelaQuarto.getColumnModel().getColumn(1).setPreferredWidth(75);
            tabelaQuarto.getColumnModel().getColumn(2).setResizable(false);
            tabelaQuarto.getColumnModel().getColumn(2).setPreferredWidth(75);
            tabelaQuarto.getColumnModel().getColumn(3).setResizable(false);
            tabelaQuarto.getColumnModel().getColumn(3).setPreferredWidth(150);
            tabelaQuarto.getColumnModel().getColumn(4).setResizable(false);
            tabelaQuarto.getColumnModel().getColumn(4).setPreferredWidth(250);
            tabelaQuarto.getColumnModel().getColumn(5).setResizable(false);
            tabelaQuarto.getColumnModel().getColumn(5).setPreferredWidth(70);
        }

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 581, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 449, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(20, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(21, 21, 21)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 489, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(53, 53, 53)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(16, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaQuarto;
    // End of variables declaration//GEN-END:variables
}
