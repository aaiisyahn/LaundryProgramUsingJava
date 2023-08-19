import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//implementasi Inheritance sebagai kelas turunan dan GUI aplikasi laundry
public class Laundry extends AbstractLaundry {
    //implementasi Enkapsulasi melalui penggunaan access modifier
    private JTextField tfNoTransaksi;
    private JTextField tfNama;
    private JTextField tfNoTelp;
    private JTextField tfTglMasuk;
    private JTextField tfCuciBerat;
    private JTextField tfSetrikaBerat;
    private JTextField tfAlamat;
    private JTextField tfKBJumlah;
    private JTextField tfCRJumlah;
    private JTextField tfJJJumlah;
    private JTextField tfKGJumlah;
    private JTextField tfJumlahTotal;
    private JPanel TransaksiLaundry;
    private JTextField tfSBJumlah;
    private JButton hitungButton;
    private JButton simpanButton;
    private JButton ulangButton;
    private JButton batalButton;
    private JTextArea tfNota;


    public Laundry() {

        hitungButton.addActionListener(new ActionListener() {
            @Override //implementasi Constructor Overriding
            //implementasi polimorfisme
            public void actionPerformed(ActionEvent e) {
                // Aksi yang dijalankan ketika tombol hitungButton diklik
                double cuciBerat = Double.parseDouble(tfCuciBerat.getText());
                double setrikaBerat = Double.parseDouble(tfSetrikaBerat.getText());
                double kbJumlah = Double.parseDouble(tfKBJumlah.getText());
                double crJumlah = Double.parseDouble(tfCRJumlah.getText());
                double jjJumlah = Double.parseDouble(tfJJJumlah.getText());
                double kgJumlah = Double.parseDouble(tfKGJumlah.getText());
                double sbJumlah = Double.parseDouble(tfSBJumlah.getText());


                // Lakukan perhitungan jumlah total
                double TotalCuci = cuciBerat * hargaCuci;
                double TotalSetrika = setrikaBerat * hargaSetrika;
                double TotalKB = kbJumlah * hargaKB;
                double TotalCR = crJumlah * hargaCR;
                double TotalJJ = jjJumlah * hargaJJ;
                double TotalKG = kgJumlah * hargaKG;
                double TotalSB = sbJumlah * hargaSB;

                double jumlahTotal = TotalCuci + TotalSetrika + TotalKB + TotalCR + TotalJJ + TotalKG + TotalSB;


                // Set nilai jumlahTotal ke TextField tfJumlahTotal
                tfJumlahTotal.setText(String.valueOf(Math.round(jumlahTotal)));
            }
        });

        simpanButton.addActionListener(new ActionListener() {
            @Override //implementasi Constructor Overriding
            //implementasi polimorfisme
            public void actionPerformed(ActionEvent e) {
                // Aksi yang dijalankan ketika tombol simpanButton diklik
                String noTransaksi = tfNoTransaksi.getText();
                String nama = tfNama.getText();
                String noTelp = tfNoTelp.getText();
                String tglMasuk = tfTglMasuk.getText();
                String alamat = tfAlamat.getText();
                double cuciBerat = Double.parseDouble(tfCuciBerat.getText());
                double setrikaBerat = Double.parseDouble(tfSetrikaBerat.getText());
                double kbJumlah = Double.parseDouble(tfKBJumlah.getText());
                double crJumlah = Double.parseDouble(tfCRJumlah.getText());
                double jjJumlah = Double.parseDouble(tfJJJumlah.getText());
                double kgJumlah = Double.parseDouble(tfKGJumlah.getText());
                double sbJumlah = Double.parseDouble(tfSBJumlah.getText());
                double jumlahTotal = Double.parseDouble(tfJumlahTotal.getText());


                tfNota.setText(
                        "No. Transaksi : " + noTransaksi + "\n" +
                                "Nama : " + nama + "\n" +
                                "No. Telepon : " + noTelp + "\n" +
                                "Tanggal Masuk : " + tglMasuk + "\n" +
                                "Alamat : " + alamat + "\n" +
                                "Cuci Setrika : " + Math.round(cuciBerat) + "\n" +
                                "Setrika : " + Math.round(setrikaBerat) + "\n" +
                                "Kain/Batik : " + Math.round(kbJumlah) + "\n" +
                                "Celana/Rok : " + Math.round(crJumlah) + "\n" +
                                "Jas/Jaket : " + Math.round(jjJumlah) + "\n" +
                                "Kebaya/Gaun : " + Math.round(kgJumlah) + "\n" +
                                "Selimut/Boneka : " + Math.round(sbJumlah) + "\n" +
                                "Jumlah Total : Rp" + Math.round(jumlahTotal) + "\n"
                );
            }
        });

        ulangButton.addActionListener(new ActionListener() {
            @Override //implementasi Constructor Overriding
            //implementasi polimorfisme
            public void actionPerformed(ActionEvent e) {
                // Aksi yang dijalankan ketika tombol ulangButton diklik
                tfNoTransaksi.setText("");
                tfNama.setText("");
                tfNoTelp.setText("");
                tfTglMasuk.setText("");
                tfAlamat.setText("");
                tfCuciBerat.setText("");
                tfSetrikaBerat.setText("");
                tfKBJumlah.setText("");
                tfCRJumlah.setText("");
                tfJJJumlah.setText("");
                tfKGJumlah.setText("");
                tfSBJumlah.setText("");
                tfJumlahTotal.setText("");
                tfNota.setText("");
            }
        });

        batalButton.addActionListener(new ActionListener() {
            @Override //implementasi Constructor Overriding
            //implementasi polimorfisme
            public void actionPerformed(ActionEvent e) {
                // Aksi yang dijalankan ketika tombol batalButton diklik
                System.exit(0);
            }
        });

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Laundry");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(new Laundry().TransaksiLaundry);
        frame.pack();
        frame.setVisible(true);
    }
}
