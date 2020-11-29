import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.border.LineBorder;
import javax.swing.JSplitPane;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.JScrollBar;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import java.awt.Font;

public class Home extends JFrame {

	private JPanel contentPane;
	JPanel[] rowPanelb = new JPanel[100];
	JPanel[] rowPanelw = new JPanel[100];
	JLabel[] rowPanell = new JLabel[100];
    int count = 0;
    
    JPanel[] colPanel = new JPanel[100];
    JLabel[] colLabel = new JLabel[100];
    int count1 =0;
    int count2 =0;
    
    JPanel[] crPanel = new JPanel[5000];
    private JTextField[] crtextField= new JTextField[5000];
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
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
	public Home() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1090,800);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(46, 139, 87));
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(192, 192, 192));
		panel_1.setBounds(0, 100, 1080, 769);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setEnabled(false);
		scrollPane.setViewportBorder(new LineBorder(new Color(0, 0, 0), 2));
		scrollPane.setBounds(0, 0, 1070, 650);
		panel_1.add(scrollPane);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		
		JPanel panel = new JPanel();
		panel.setBounds(0,0,600,600);
		panel.setPreferredSize(new Dimension(1050, 1000));
		scrollPane.setViewportView(panel);
		panel.setLayout(null);
		
		JPanel columnNumPanel = new JPanel();
		columnNumPanel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		columnNumPanel.setBackground(new Color(211, 211, 211));
		columnNumPanel.setBounds(0, 0, 1050, 50);
		panel.add(columnNumPanel);
		columnNumPanel.setLayout(null);
		
		count = 48;
		for(int a = 0; a < 10;a++) {
		   
			rowPanelb[a] = new JPanel();
			rowPanelb[a].setBackground(new Color(0, 0, 0));
			rowPanelb[a].setBorder(new LineBorder(new Color(0, 0, 0), 2));
			rowPanelb[a].setBounds(count, 15, 100, 33);
			columnNumPanel.add(rowPanelb[a]);
			rowPanelb[a].setLayout(null);
			
			rowPanelw[a] = new JPanel();
			rowPanelw[a].setBackground(new Color(169, 169, 169));
			rowPanelw[a].setBounds(2, 0, 98, 33);
			rowPanelb[a].add(rowPanelw[a]);
			rowPanelw[a].setLayout(null);
			
			rowPanell[a] = new JLabel(""+(a+1));
			rowPanell[a].setHorizontalAlignment(SwingConstants.CENTER);
			rowPanell[a].setBounds(0, 0, 96, 32);
			rowPanelw[a].add(rowPanell[a]);
			count += 100;
		}
		JPanel rowNumpanel = new JPanel();
		rowNumpanel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		rowNumpanel.setBackground(new Color(211, 211, 211));
		rowNumpanel.setBounds(0, 49, 50, 1000);
		panel.add(rowNumpanel);
		rowNumpanel.setLayout(null);
		
		JPanel graphPanel = new JPanel();
		graphPanel.setBackground(new Color(46, 139, 87));
		graphPanel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		graphPanel.setBounds(53, 13, 92, 74);
		contentPane.add(graphPanel);
		graphPanel.setLayout(null);
		
		JLabel graphLabel = new JLabel("");
		graphLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				graphPanel.setBorder(new LineBorder(Color.WHITE, 2));	
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				graphPanel.setBorder(new LineBorder(new Color(0, 0, 0), 2));	
			}
			@Override
			public void mouseClicked(MouseEvent e) {
 
				
				 JFrame lineGraph = new JFrame();
			     lineGraph.setBounds(150, 150, 1000,800);
			     lineGraph.setVisible(true);
			     lineGraph.getContentPane().add(new lineGraph());
			     lineGraph.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			     
			        
					
					
					
			}
		});
		graphLabel.setIcon(new ImageIcon(Home.class.getResource("/images/icons8-graph-64.png")));
		graphLabel.setBounds(7, 7, 81, 60);
		graphPanel.add(graphLabel);
		
		JPanel pieChartPanel = new JPanel();
		pieChartPanel.setLayout(null);
		pieChartPanel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		pieChartPanel.setBackground(new Color(46, 139, 87));
		pieChartPanel.setBounds(157, 13, 92, 74);
		contentPane.add(pieChartPanel);
		
		JLabel piechartLabel = new JLabel("");
		 piechartLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				pieChartPanel.setBorder(new LineBorder(Color.WHITE, 2));	
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				pieChartPanel.setBorder(new LineBorder(new Color(0, 0, 0), 2));	
			}
		 	@Override
		 	public void mouseClicked(MouseEvent e) {
		 		JFrame pieChart = new JFrame();
			     pieChart.setBounds(150, 150, 1000,800);
			     pieChart.setVisible(true);
			     pieChart.getContentPane().add(new PieChart());
			     pieChart.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			     
			     
		 		
		 	}
		});
		piechartLabel.setIcon(new ImageIcon(Home.class.getResource("/images/pie-chart.png")));
		piechartLabel.setBounds(12, 7, 73, 63);
		pieChartPanel.add(piechartLabel);
		
		JPanel barGraphPanel = new JPanel();
		barGraphPanel.setLayout(null);
		barGraphPanel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		barGraphPanel.setBackground(new Color(46, 139, 87));
		barGraphPanel.setBounds(261, 13, 92, 74);
		contentPane.add(barGraphPanel);
		
		JLabel barChartLabel = new JLabel("");
		barChartLabel.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseEntered(MouseEvent e) {
					barGraphPanel.setBorder(new LineBorder(Color.WHITE, 2));	
					
				}
				@Override
				public void mouseExited(MouseEvent e) {
					barGraphPanel.setBorder(new LineBorder(new Color(0, 0, 0), 2));	
				}
			@Override
			public void mouseClicked(MouseEvent e) {
				 JFrame barChart = new JFrame();
			     barChart.setBounds(150, 150, 1000,800);
			     barChart.setVisible(true);
			     barChart.getContentPane().add(new barChart());
			     barChart.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			}
			});
		barChartLabel.setIcon(new ImageIcon(Home.class.getResource("/images/bargraph.png")));
		barChartLabel.setBounds(10, 7, 73, 60);
		barGraphPanel.add(barChartLabel);
		
		JPanel HistogramPanel = new JPanel();
		HistogramPanel.setLayout(null);
		HistogramPanel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		HistogramPanel.setBackground(new Color(46, 139, 87));
		HistogramPanel.setBounds(379, 13, 92, 74);
		contentPane.add(HistogramPanel);
		
		JLabel HistogramLabel = new JLabel("");
		HistogramLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				 HistogramPanel.setBorder(new LineBorder(Color.WHITE, 2));	
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				 HistogramPanel.setBorder(new LineBorder(new Color(0, 0, 0), 2));	
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				 JFrame histogram = new JFrame();
			     histogram.setBounds(150, 150, 1000,800);
			     histogram.setVisible(true);
			     histogram.getContentPane().add(new histoGram());
			     histogram.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			}
		});
		HistogramLabel.setIcon(new ImageIcon(Home.class.getResource("/images/database.png")));
		HistogramLabel.setBounds(12, 7, 76, 60);
		HistogramPanel.add(HistogramLabel);
		
		count = 0;
		for(int a = 0; a < 32;a++) {
			colPanel[a] = new JPanel();
			colPanel[a].setBackground(new Color(169, 169, 169));
			colPanel[a].setBorder(new LineBorder(new Color(0, 0, 0), 1));
			colPanel[a].setBounds(1, count, 48, 30);
			rowNumpanel.add(colPanel[a]);
			colPanel[a].setLayout(null);
			
			colLabel[a] = new JLabel(""+(a+1));
			colLabel[a].setHorizontalAlignment(SwingConstants.CENTER);
			colLabel[a].setBounds(0, 0, 48, 30);
			colPanel[a].add(colLabel[a]);
			count += 30;
		}
		 count = 0;
		 count2 = 50;
		for(int a = 0; a < 32; a++) {
			count1 = 50;
			for(int b = 0; b< 10; b++) {
				crPanel[count+11] = new JPanel();
				crPanel[count+11].setBorder(new LineBorder(new Color(0, 0, 0)));
				crPanel[count+11].setBackground(new Color(0, 0, 255));
				crPanel[count+11].setBounds(count1, count2, 100, 30);
				panel.add(crPanel[count+11]);
				crPanel[count+11].setLayout(null);
				
				crtextField[count+11] = new JTextField();
				crtextField[count+11].setBounds(0, 0, 100, 30);
				crPanel[count+11].add(crtextField[count+11]);
				crtextField[count+11].setColumns(10);
				count1 += 100;
				count++;
			}
			count2 += 30;
		
		}
		
		
		
		
		
		
		
	}
}
