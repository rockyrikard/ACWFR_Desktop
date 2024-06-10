
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;
import java.io.IOException;
import java.nio.file.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.json.JSONObject;
import java.util.Base64;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import okhttp3.MediaType;
import org.json.JSONArray;





/**
 *
 * @author zafer
 */
public class LogPage extends javax.swing.JFrame {

  String username = "";
    
     public LogPage() {
        initComponents();
        

    }
       
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainframe = new javax.swing.JFrame();
        userlistbutton = new javax.swing.JButton();
        userregisterbutton = new javax.swing.JButton();
        mainextbtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        kkayit = new javax.swing.JFrame();
        geribtn = new javax.swing.JButton();
        imgpanel = new javax.swing.JPanel();
        image = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        dosyayolu = new javax.swing.JTextField();
        gozat = new javax.swing.JButton();
        adfield = new javax.swing.JTextField();
        soyadfield = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        userlist = new javax.swing.JFrame();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        geribtn1 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        kullaniciadi = new javax.swing.JTextField();
        sifrebox = new javax.swing.JPasswordField();
        Giris = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        k_adi = new javax.swing.JLabel();
        sifre = new javax.swing.JLabel();
        backround = new javax.swing.JLabel();

        mainframe.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        mainframe.setTitle("ACWFR-ANA MENU");
        mainframe.setBounds(new java.awt.Rectangle(200, 200, 960, 640));
        mainframe.getContentPane().setLayout(null);

        userlistbutton.setText("Kullanıcı Listesi");
        userlistbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userlistbuttonActionPerformed(evt);
            }
        });
        mainframe.getContentPane().add(userlistbutton);
        userlistbutton.setBounds(370, 120, 240, 60);

        userregisterbutton.setText("Kullanıcı Kayıt");
        userregisterbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userregisterbuttonActionPerformed(evt);
            }
        });
        mainframe.getContentPane().add(userregisterbutton);
        userregisterbutton.setBounds(370, 260, 240, 60);

        mainextbtn.setText("Çıkış");
        mainextbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainextbtnActionPerformed(evt);
            }
        });
        mainframe.getContentPane().add(mainextbtn);
        mainextbtn.setBounds(370, 400, 240, 60);

        jLabel3.setIcon(new javax.swing.ImageIcon("/Users/zafer/Desktop/2.png")); // NOI18N
        jLabel3.setText("jLabel3");
        mainframe.getContentPane().add(jLabel3);
        jLabel3.setBounds(10, -20, 420, 130);

        jLabel1.setIcon(new javax.swing.ImageIcon("/Users/zafer/Downloads/userback.jpeg")); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setPreferredSize(new java.awt.Dimension(962, 633));
        mainframe.getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 962, 640);

        kkayit.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        kkayit.setTitle("ACWFR-KULLANICI KAYIT");
        kkayit.setBounds(new java.awt.Rectangle(200, 200, 1010, 590));
        kkayit.getContentPane().setLayout(null);

        geribtn.setText("Geri");
        geribtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                geribtnActionPerformed(evt);
            }
        });
        kkayit.getContentPane().add(geribtn);
        geribtn.setBounds(10, 10, 60, 23);

        imgpanel.setLayout(null);
        imgpanel.add(image);
        image.setBounds(0, 0, 220, 180);

        kkayit.getContentPane().add(imgpanel);
        imgpanel.setBounds(370, 40, 220, 180);

        jLabel4.setIcon(new javax.swing.ImageIcon("/Users/zafer/Desktop/2.png")); // NOI18N
        jLabel4.setText("jLabel3");
        kkayit.getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 460, 420, 130);
        kkayit.getContentPane().add(dosyayolu);
        dosyayolu.setBounds(370, 230, 220, 23);

        gozat.setText("Dosya Seç");
        gozat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gozatActionPerformed(evt);
            }
        });
        kkayit.getContentPane().add(gozat);
        gozat.setBounds(620, 150, 120, 40);

        adfield.setText("Ad");
        adfield.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adfieldMouseClicked(evt);
            }
        });
        adfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adfieldActionPerformed(evt);
            }
        });
        kkayit.getContentPane().add(adfield);
        adfield.setBounds(370, 280, 220, 50);

        soyadfield.setText("Soyad");
        soyadfield.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                soyadfieldMouseClicked(evt);
            }
        });
        soyadfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                soyadfieldActionPerformed(evt);
            }
        });
        kkayit.getContentPane().add(soyadfield);
        soyadfield.setBounds(370, 360, 220, 50);

        jButton2.setText("Ekle");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        kkayit.getContentPane().add(jButton2);
        jButton2.setBounds(410, 450, 140, 40);

        jLabel5.setIcon(new javax.swing.ImageIcon("/Users/zafer/Downloads/kkayitt.jpeg")); // NOI18N
        jLabel5.setText("jLabel5");
        kkayit.getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 0, 1010, 580);

        userlist.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        userlist.setTitle("ACWFR-KULLANICI LİSTESİ");
        userlist.setBounds(new java.awt.Rectangle(200, 200, 1010, 590));
        userlist.getContentPane().setLayout(null);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Name", "Surname"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        userlist.getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(100, 30, 720, 402);

        geribtn1.setText("Geri");
        geribtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                geribtn1ActionPerformed(evt);
            }
        });
        userlist.getContentPane().add(geribtn1);
        geribtn1.setBounds(10, 10, 60, 23);

        jButton1.setText("SEÇ VE SİL");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        userlist.getContentPane().add(jButton1);
        jButton1.setBounds(850, 170, 140, 60);

        jLabel6.setIcon(new javax.swing.ImageIcon("/Users/zafer/Desktop/2.png")); // NOI18N
        jLabel6.setText("jLabel3");
        userlist.getContentPane().add(jLabel6);
        jLabel6.setBounds(0, 460, 420, 130);

        jLabel7.setIcon(new javax.swing.ImageIcon("/Users/zafer/Downloads/kkayitt.jpeg")); // NOI18N
        jLabel7.setText("jLabel5");
        userlist.getContentPane().add(jLabel7);
        jLabel7.setBounds(0, 0, 1010, 580);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ACWFR-GIRIS");
        setBounds(new java.awt.Rectangle(200, 200, 1000, 570));
        setName("loginf"); // NOI18N
        setPreferredSize(new java.awt.Dimension(1000, 570));
        setSize(new java.awt.Dimension(1000, 570));
        getContentPane().setLayout(null);

        kullaniciadi.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        kullaniciadi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kullaniciadiActionPerformed(evt);
            }
        });
        getContentPane().add(kullaniciadi);
        kullaniciadi.setBounds(622, 188, 327, 50);

        sifrebox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sifreboxActionPerformed(evt);
            }
        });
        getContentPane().add(sifrebox);
        sifrebox.setBounds(622, 280, 327, 50);

        Giris.setText("GIRIS");
        Giris.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GirisActionPerformed(evt);
            }
        });
        getContentPane().add(Giris);
        Giris.setBounds(685, 363, 205, 46);

        jLabel2.setIcon(new javax.swing.ImageIcon("/Users/zafer/Desktop/2.png")); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 160, 420, 180);

        k_adi.setForeground(new java.awt.Color(255, 255, 255));
        k_adi.setText("KULLANICI ADI");
        getContentPane().add(k_adi);
        k_adi.setBounds(630, 160, 130, 17);

        sifre.setForeground(new java.awt.Color(255, 255, 255));
        sifre.setText("ŞİFRE");
        getContentPane().add(sifre);
        sifre.setBounds(630, 250, 45, 17);

        backround.setForeground(new java.awt.Color(255, 255, 255));
        backround.setIcon(new javax.swing.ImageIcon("/Users/zafer/Downloads/logpage.jpg")); // NOI18N
        backround.setText("KULLANICI ADI");
        getContentPane().add(backround);
        backround.setBounds(0, 0, 1000, 570);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kullaniciadiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kullaniciadiActionPerformed
        // TODO add your handling code here:
    
    }//GEN-LAST:event_kullaniciadiActionPerformed

    private void GirisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GirisActionPerformed
       
       username = kullaniciadi.getText(); 
       char[] pass = sifrebox.getPassword(); 
       String password = new String(pass); 

        try {
            OkHttpClient client = new OkHttpClient();

            // URL'yi parametrelerle oluştur
            String url = String.format("https://acwfr-77f6c4a62516.herokuapp.com/Login?username=%s&password=%s", username, password);

            // Request nesnesi oluştur
            Request getRequest = new Request.Builder()
                .url(url)
                .build();

            // İstek gönder ve yanıtı al
            Response getResponse = client.newCall(getRequest).execute();

            // Yanıtı kontrol et ve işle
            if (getResponse.isSuccessful()) {
                String responseBody = getResponse.body().string();
                System.out.println(responseBody);
                
                JSONObject jsonObject = new JSONObject(responseBody);
                boolean status = jsonObject.getBoolean("status");
                
                if(status == true){
                    mainframe.setVisible(true);
                this.setVisible(false);
                }else JOptionPane.showMessageDialog(null, "Hatalı Giriş");
                
                   
                
            } else {
                System.err.println("Request failed: " + getResponse);
            }

            // Yanıt nesnesini kapat
            getResponse.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        
        
        
        
    }//GEN-LAST:event_GirisActionPerformed

    private void sifreboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sifreboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sifreboxActionPerformed

    private void userregisterbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userregisterbuttonActionPerformed
         kkayit.setVisible(true);
        mainframe.setVisible(false);
        
    }//GEN-LAST:event_userregisterbuttonActionPerformed

    private void mainextbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainextbtnActionPerformed
        this.setVisible(true);
        mainframe.setVisible(false);
        
    }//GEN-LAST:event_mainextbtnActionPerformed

    private void gozatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gozatActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File file = chooser.getSelectedFile();
        String path = file.getAbsolutePath();
        
        dosyayolu.setText(path);
        
        // Proje dizinini 
            String projectDir = System.getProperty("user.dir");
            String targetDir = projectDir + File.separator + "util";
            
            String newFileName = "cacheimage.jpg"; 
            String targetPath = targetDir + File.separator + newFileName;

            try {
                // Dosyayı kopyalama işlemi
                Files.copy(Paths.get(path), Paths.get(targetPath), StandardCopyOption.REPLACE_EXISTING);
                System.out.println("Dosya başarıyla kopyalandı: " + targetPath);
            } catch (IOException e) {
                System.err.println("Dosya kopyalanırken bir hata oluştu.");
                e.printStackTrace();
            }
       //Fotograf Ekleme islemleri
       
        Image im = Toolkit.getDefaultToolkit().createImage(path);
        im = im.getScaledInstance(image.getWidth(), image.getHeight(), 
        Image.SCALE_SMOOTH);
        ImageIcon ii = new ImageIcon(im);
        image.setIcon(ii);
                
       
    }//GEN-LAST:event_gozatActionPerformed

    private void soyadfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_soyadfieldActionPerformed
        
    }//GEN-LAST:event_soyadfieldActionPerformed

    private void soyadfieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_soyadfieldMouseClicked
        soyadfield.setText("");
    }//GEN-LAST:event_soyadfieldMouseClicked

    private void adfieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adfieldMouseClicked
        adfield.setText("");
    }//GEN-LAST:event_adfieldMouseClicked

    private void adfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adfieldActionPerformed

    private void geribtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_geribtnActionPerformed
       
        kkayit.dispose();
        mainframe.setVisible(true);
    }//GEN-LAST:event_geribtnActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        String name = adfield.getText();
        String lastname = soyadfield.getText();
        
        //Base64 işlemleri
        String filePath = "/Users/zafer/NetBeansProjects/ACWFR_Desktop/util/cacheimage.jpg"; // Bu yolu değiştirmeyi unutmayın
        String base64EncodedString = null;
        try {
            // Dosyayı okuyun
            File file = new File(filePath);
            FileInputStream fileInputStream = new FileInputStream(file);
            byte[] fileBytes = new byte[(int) file.length()];
            fileInputStream.read(fileBytes);
            fileInputStream.close();

            // Base64 encode işlemi
            base64EncodedString = Base64.getEncoder().encodeToString(fileBytes);
            
             OkHttpClient client = new OkHttpClient();
             
             String json = String.format("{\"username\":\"%s\", \"name\":\"%s\", \"surname\":\"%s\", \"image\":\"%s\"}",
                                         username, name, lastname, base64EncodedString);
            RequestBody requestBody = RequestBody.create(json, MediaType.get("application/json; charset=utf-8"));
        

        // Request nesnesini oluşturun
        Request postRequest = new Request.Builder()
            .url("https://acwfr-77f6c4a62516.herokuapp.com/AddUser")
            .post(requestBody)
            .build();

        // İsteği yürütün
        Response postResponse = client.newCall(postRequest).execute();

        // Yanıt kodunu ve içeriğini yazdırın
        System.out.println("POST Yanıt Kodu: " + postResponse.code());
        System.out.println("POST Yanıt İçeriği: " + postResponse.body().string());
            
            
            //System.out.println("Base64 Encoded String: " + base64EncodedString);
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        //Post işlemi
       
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void geribtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_geribtn1ActionPerformed
        mainframe.setVisible(true);
        userlist.setVisible(false);
    }//GEN-LAST:event_geribtn1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
       int selectedRowIndex = jTable1.getSelectedRow();

    // Eğer hiçbir satır seçilmemişse, uyarı ver ve işlemi sonlandır
    if (selectedRowIndex == -1) {
        JOptionPane.showMessageDialog(this, "Lütfen silinecek bir satır seçin.", "Uyarı", JOptionPane.WARNING_MESSAGE);
        return;
    }

    // Seçili satırın ID'sini al
    String selectedRowId = (String) jTable1.getValueAt(selectedRowIndex, 0);
        System.out.println(selectedRowId);

    // Silinecek satırın ID'sini içeren bir istek gönder
    OkHttpClient client = new OkHttpClient();
    Request deleteRequest = new Request.Builder()
            .url("https://acwfr-77f6c4a62516.herokuapp.com/RemoveUser?id=" + selectedRowId)
            .get()
            .build();
    

    try {
        Response deleteResponse = client.newCall(deleteRequest).execute();
        // İsteğin başarılı olup olmadığını kontrol et
        if (deleteResponse.isSuccessful()) {
            // Başarılıysa, seçili satırı tablodan kaldır
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.removeRow(selectedRowIndex);
            JOptionPane.showMessageDialog(this, "Seçili satır başarıyla silindi.", "Bilgi", JOptionPane.INFORMATION_MESSAGE);
        } else {
            // Başarısızsa, kullanıcıya hata mesajı göster
            JOptionPane.showMessageDialog(this, "Satır silinirken bir hata oluştu.", "Hata", JOptionPane.ERROR_MESSAGE);
        }
    } catch (IOException ex) {
        Logger.getLogger(LogPage.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(this, "İstek gönderilirken bir hata oluştu.", "Hata", JOptionPane.ERROR_MESSAGE);
    }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void userlistbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userlistbuttonActionPerformed
        JSONObject jsonObject;
    JSONArray userAList;

    OkHttpClient client = new OkHttpClient();
    // Nesne oluşumu
    Request getRequest = new Request.Builder()
            .url("https://acwfr-77f6c4a62516.herokuapp.com/GetUserList?company=A Company")
            .build();

    try {
        Response getResponse = client.newCall(getRequest).execute();

        // Get the response body as string
        String responseBody = getResponse.body().string();

        // Convert the response body to JSONObject
        jsonObject = new JSONObject(responseBody);

        // Get the "userlist" array
        userAList = jsonObject.getJSONArray("userlist");

        // Create data array for the table model
        Object[][] data = new Object[userAList.length()][3];
        for (int i = 0; i < userAList.length(); i++) {
            JSONObject user = userAList.getJSONObject(i);
            data[i][0] = user.getString("id");
            data[i][1] = user.getString("name");
            data[i][2] = user.getString("surname");
        }

        // Column names
        String[] columnNames = {"ID", "İsim", "Soyisim"};

        // Get the table model
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        // Clear the existing table data
        model.setRowCount(0);

        // Add new data to the table model
        for (Object[] row : data) {
            model.addRow(row);
        }

        System.out.println("GET Yanıt Kodu: " + getResponse.code());
        System.out.println("GET Yanıt İçeriği: " + responseBody);
        userlist.setVisible(true);
        mainframe.setVisible(false);
    } catch (IOException ex) {
        Logger.getLogger(LogPage.class.getName()).log(Level.SEVERE, null, ex);
    }

        
    }//GEN-LAST:event_userlistbuttonActionPerformed
 
   /* public void GET REQ ORNEK() throws IOException{
        //Get isteği
       /* OkHttpClient client = new OkHttpClient();
        //Nesne oluşumu
        Request getRequest = new Request.Builder()
            .url("https://acwfr-77f6c4a62516.herokuapp.com/Login?username=admin&password=123456")
            .build();
        
        Response getResponse = client.newCall(getRequest).execute();

        // Yanıt kodunu ve içeriğini yazdırın
        System.out.println("GET Yanıt Kodu: " + getResponse.code());
        System.out.println("GET Yanıt İçeriği: " + getResponse.body().string());
        
        
    }
    
    public void POST REQ ORNEK() throws IOException{
        
        OkHttpClient client = new OkHttpClient();
        
        RequestBody requestBody = new FormBody.Builder()
            .add("name", "John")
            .add("age", "30")
            .build();

        // Request nesnesini oluşturun
        Request postRequest = new Request.Builder()
            .url("https://wizard-world-api.herokuapp.com/Elixirs")
            .post(requestBody)
            .build();

        // İsteği yürütün
        Response postResponse = client.newCall(postRequest).execute();

        // Yanıt kodunu ve içeriğini yazdırın
        System.out.println("POST Yanıt Kodu: " + postResponse.code());
        System.out.println("POST Yanıt İçeriği: " + postResponse.body().string());
        
    }*/
    
    
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws IOException {
       
       
       //Giris Kodları
       
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LogPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton Giris;
    private javax.swing.JTextField adfield;
    private javax.swing.JLabel backround;
    private javax.swing.JTextField dosyayolu;
    private javax.swing.JButton geribtn;
    private javax.swing.JButton geribtn1;
    private javax.swing.JButton gozat;
    private javax.swing.JLabel image;
    private javax.swing.JPanel imgpanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel k_adi;
    private javax.swing.JFrame kkayit;
    private javax.swing.JTextField kullaniciadi;
    private javax.swing.JButton mainextbtn;
    private javax.swing.JFrame mainframe;
    private javax.swing.JLabel sifre;
    private javax.swing.JPasswordField sifrebox;
    private javax.swing.JTextField soyadfield;
    private javax.swing.JFrame userlist;
    private javax.swing.JButton userlistbutton;
    private javax.swing.JButton userregisterbutton;
    // End of variables declaration//GEN-END:variables


}
