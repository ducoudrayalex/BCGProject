package bcgproject;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
public class BCGProject extends JFrame{
    private JMenuBar menu=new JMenuBar();
    private JMenu fichier=new JMenu("Fichier");
    private JMenu affichage=new JMenu("Affichage");
    private JMenu aide=new JMenu("Aide");
    private JMenuItem raz=new JMenuItem("RAZ");
    private JMenuItem tester=new JMenuItem("Tester");
    private JMenuItem ouvrir=new JMenuItem("Ouvrir");
    private JMenuItem enregistrer=new JMenuItem("Enregistrer");
    private JMenuItem quitter=new JMenuItem("Quitter");
    private JMenuItem agrandirTableur=new JMenuItem("Agrandir tableur");
    private JMenuItem agrandirMatrice=new JMenuItem("Agrandir matrice");
    private JMenuItem presentation=new JMenuItem("Présentation du BCG");
    private JMenuItem apropos=new JMenuItem("?");
    public static void main(String[] args) {
        BCGProject fenetre=new BCGProject();
    }
    public BCGProject(){
        this.setTitle("BCGProject");
        this.setSize(800, 600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        
        this.menu.add(fichier);
        this.menu.add(affichage);
        this.menu.add(aide);
        this.fichier.add(raz);
        this.fichier.add(tester);
        this.fichier.add(ouvrir);
        this.fichier.add(enregistrer);
        this.fichier.add(quitter);
        this.affichage.add(agrandirTableur);
        this.affichage.add(agrandirMatrice);
        this.aide.add(presentation);
        this.aide.add(apropos);
        

        
        this.setJMenuBar(menu);
        this.setVisible(true);
    }
    
}
