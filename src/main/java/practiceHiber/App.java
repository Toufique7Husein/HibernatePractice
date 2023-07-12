package practiceHiber;

import cinfig.Garibaree;

import java.io.File;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Garibaree g = new Garibaree(1, 78);
        System.out.println(g);


        File f = new File("C:\\Users\\Hp ZBooK 15u G5\\IdeaProjects\\HibernatePractice\\src\\main\\java\\cinfig\\config.xml");
        try{
            System.out.println(f.exists());
            f.createNewFile();
        } catch (Exception e) {
            System.out.println("WHaat");
            System.out.println(e);
        }
    }
}
