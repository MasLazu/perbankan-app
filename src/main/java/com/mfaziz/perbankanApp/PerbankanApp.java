package com.mfaziz.perbankanApp;

import com.mfaziz.perbankanApp.View.LoginView;
import com.formdev.flatlaf.intellijthemes.FlatNordIJTheme;
import com.mfaziz.perbankanApp.View.AdminHomeView;
import com.mfaziz.perbankanApp.View.AmbilView;
import com.mfaziz.perbankanApp.View.HomeView;
import com.mfaziz.perbankanApp.View.RegisterView;
import com.mfaziz.perbankanApp.View.TopUpView;
import com.mfaziz.perbankanApp.View.TransferView;
import com.mfaziz.perbankanApp.entity.Bank;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class PerbankanApp {
    private JFrame app;
    public Bank bank;
    public int CurrentUser;

    public static void main(String[] args) {
         try {
            UIManager.setLookAndFeel(new FlatNordIJTheme()); // Use FlatDarculaLaf as an example
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        SwingUtilities.invokeLater(() -> {
            PerbankanApp app = new PerbankanApp();
            app.bank.tambahNasabah("Yanto", "Kucul");
            app.showLoginView();
        });
    }
    
    public PerbankanApp(){
        this.app = new JFrame("Lazubank");
        this.bank = new Bank();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setSize(350, 470);
        app.setVisible(true);
        app.setResizable(false);
        app.setLocationRelativeTo(null);
    }
    
    public void showAdminHomeView() {
        changeView(new AdminHomeView(this));
        app.setSize(800, 500);
    }
    
    public void showLoginView() {
        changeView(new LoginView(this));
        app.setSize(350, 470);
    }
    
    public void showRegisterView() {
        changeView(new RegisterView(this));
        app.setSize(350, 470);
    }
    
    public void showHomeView() {
        changeView(new HomeView(this));
        app.setSize(350, 350);
    }
    
    public void showTopUpView() {
        changeView(new TopUpView(this));
        app.setSize(350, 350);
    }
    
    public void showAmbilView() {
        changeView(new AmbilView(this));
        app.setSize(350, 350);
    }
    
    public void showTransferView() {
        changeView(new TransferView(this));
        app.setSize(350, 450);
    }
    
    public void changeView(JPanel view) {
        app.getContentPane().removeAll();
        app.getContentPane().add(view);
        app.revalidate();
        app.repaint();
    }
}
