package jaudioplayer_pk;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JProgressBar;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class FrontPlayer extends JFrame {

	private JPanel contentPane;
	private InputFile inputAnalyzer = new InputFile();
	private BackPlayer back = new BackPlayer();
	private boolean check = true;

	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {

			public void run() {

				try {

					FrontPlayer frame = new FrontPlayer();
					frame.setVisible(true);

				} catch (Exception e) {

					e.printStackTrace();

				}

			}

		});

	}

	public FrontPlayer() {

		setResizable(false);
		setTitle("jAudioPlayer");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 420, 160);
		setLocationRelativeTo(null);

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lbTime = new JLabel("00:00");
		lbTime.setVerticalAlignment(SwingConstants.BOTTOM);
		lbTime.setHorizontalAlignment(SwingConstants.CENTER);
		lbTime.setFont(new Font("Consolas", Font.PLAIN, 37));
		lbTime.setBounds(10, 11, 130, 50);
		contentPane.add(lbTime);

		JLabel lbNameFile = new JLabel("--:--");
		lbNameFile.setFont(new Font("Consolas", Font.BOLD, 15));
		lbNameFile.setBounds(142, 98, 230, 14);
		contentPane.add(lbNameFile);

		JProgressBar progressBar = new JProgressBar();
		progressBar.setBounds(20, 72, 381, 14);
		contentPane.add(progressBar);

		JButton btnPrevious = new JButton("|<");
		btnPrevious.setFont(new Font("Consolas", Font.BOLD, 15));
		btnPrevious.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnPrevious.setBounds(148, 11, 55, 55);
		contentPane.add(btnPrevious);

		JButton btnPlayPause = new JButton("|>");
		btnPlayPause.setFont(new Font("Consolas", Font.BOLD, 15));
		btnPlayPause.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (check == true) {

					back.playAudio();
					btnPlayPause.setText("||");
					check = false;

				} else {

					back.pauseAudio();
					btnPlayPause.setText("|>");
					check = true;

				}

			}
		});
		btnPlayPause.setBounds(214, 11, 55, 55);
		contentPane.add(btnPlayPause);

		JButton btnStop = new JButton("[]");
		btnStop.setFont(new Font("Consolas", Font.BOLD, 15));
		btnStop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				back.stopAudio();
				btnPlayPause.setText("|>");
				check = true;

			}
		});
		btnStop.setBounds(280, 11, 55, 55);
		contentPane.add(btnStop);

		JButton btnNext = new JButton(">|");
		btnNext.setFont(new Font("Consolas", Font.BOLD, 15));
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNext.setBounds(346, 11, 55, 55);
		contentPane.add(btnNext);

		JButton btnNewFile = new JButton("+");
		btnNewFile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String input = JOptionPane.showInputDialog("Insira o caminho:");
				back.load(inputAnalyzer.createFile(input));
				lbNameFile.setText(inputAnalyzer.getName());

			}
		});
		btnNewFile.setFont(new Font("Consolas", Font.BOLD, 15));
		btnNewFile.setBounds(20, 95, 50, 20);
		contentPane.add(btnNewFile);

		JButton btnLoop = new JButton("o");
		btnLoop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		btnLoop.setFont(new Font("Consolas", Font.BOLD, 15));
		btnLoop.setBounds(81, 95, 50, 20);
		contentPane.add(btnLoop);

	}

}
