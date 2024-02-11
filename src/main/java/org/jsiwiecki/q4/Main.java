package org.jsiwiecki.q4;

public class Main
{
    public static void main(String[] args)
    {
        Folder phpDemo1 = new Folder("php_demo1");
        phpDemo1.addFolder(new Folder("Source Files"));

        phpDemo1.getSubFolders().get(0).addFolder(new Folder(".phalcon"));
        phpDemo1.getSubFolders().get(0).addFolder(new Folder("app"));

        phpDemo1.getSubFolders().get(0).getSubFolders().get(1).addFolder(new Folder("config"));
        phpDemo1.getSubFolders().get(0).getSubFolders().get(1).addFolder(new Folder("controllers"));
        phpDemo1.getSubFolders().get(0).getSubFolders().get(1).addFolder(new Folder("library"));
        phpDemo1.getSubFolders().get(0).getSubFolders().get(1).addFolder(new Folder("migrations"));
        phpDemo1.getSubFolders().get(0).getSubFolders().get(1).addFolder(new Folder("models"));
        phpDemo1.getSubFolders().get(0).getSubFolders().get(1).addFolder(new Folder("views"));

        phpDemo1.getSubFolders().get(0).addFolder(new Folder("cache"));
        phpDemo1.getSubFolders().get(0).addFolder(new Folder("public"));

        phpDemo1.getSubFolders().get(0).addFile(new File(".htaccess"));
        phpDemo1.getSubFolders().get(0).addFile(new File(".htrouter.php"));
        phpDemo1.getSubFolders().get(0).addFile(new File("index.html"));

        phpDemo1.addFolder(new Folder("Include Path"));
        phpDemo1.addFolder(new Folder("Remote Path"));

        System.out.println("--- INITIAL PRINT ---");
        phpDemo1.print();

        System.out.println("--- AFTER DELETING APP ---");
        phpDemo1.deleteFolder(phpDemo1.getSubFolders().get(0).getSubFolders().get(1));
        phpDemo1.print();

        System.out.println("--- AFTER DELETING PUBLIC ---");
        phpDemo1.deleteFolder(phpDemo1.getSubFolders().get(0).getSubFolders().get(2));
        phpDemo1.print();
    }
}
