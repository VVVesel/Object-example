import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner  console = new Scanner(System.in);
        String articleData = console.nextLine();
        String[] splitData = articleData.split(", ");
        String title = splitData[0] ;
        String content =  splitData[1];
        String author = splitData[2];

        Article article = new Article(title, content, author);

        int n = Integer.parseInt(console.nextLine());
        for (int i = 0; i < n; i++) {
                String command = console.nextLine();
                    String commandName = command.split(":\\s+ ")[1];
                String commandParameter = command.split(":\\s+ ")[1];

                switch(commandName){
                    case "Edit":
                        article.edit(commandParameter);
                        break;
                        case "ChangeAutor":
                            article.changeAuthor(commandParameter);
                            break;
                    case "Rename":
                        article.rename(commandParameter);
                        break;
                }
        }
        System.out.println(article.toString());

    }
}
