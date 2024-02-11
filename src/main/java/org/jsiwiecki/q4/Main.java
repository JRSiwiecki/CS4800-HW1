package org.jsiwiecki.q4;

public class Main
{
    public static void main(String[] args)
    {
        Folder phpDemo1 = new Folder("php_demo1");
        Folder sourceFiles = new Folder("Source Files");
        phpDemo1.addFolder(sourceFiles);

        Folder phalcon = new Folder(".phalcon");
        Folder app = new Folder("app");
        sourceFiles.addFolder(phalcon);
        sourceFiles.addFolder(app);

        Folder config = new Folder("config");
        Folder controllers = new Folder("controllers");
        Folder library = new Folder("library");
        Folder migrations = new Folder("migrations");
        Folder models = new Folder("models");
        Folder views = new Folder("views");

        app.addFolder(config);
        app.addFolder(controllers);
        app.addFolder(library);
        app.addFolder(migrations);
        app.addFolder(models);
        app.addFolder(views);

        Folder cache = new Folder("cache");
        Folder publicFolder = new Folder("public");
        sourceFiles.addFolder(cache);
        sourceFiles.addFolder(publicFolder);

        File htaccess = new File(".htaccess");
        File htrouter = new File(".htrouter.php");
        File index = new File("index.html");
        sourceFiles.addFile(htaccess);
        sourceFiles.addFile(htrouter);
        sourceFiles.addFile(index);

        Folder path = new Folder("Include Path");
        Folder remote = new Folder("Remote Path");

        phpDemo1.addFolder(path);
        phpDemo1.addFolder(remote);

        System.out.println("--- INITIAL PRINT ---");
        phpDemo1.print();

        System.out.println("--- AFTER DELETING APP ---");
        phpDemo1.deleteFolder(app);
        phpDemo1.print();

        System.out.println("--- AFTER DELETING PUBLIC ---");
        phpDemo1.deleteFolder(publicFolder);
        phpDemo1.print();
    }
}
