package pl.com.agora.main;

import pl.com.agora.dao.ArticleDAO;
import pl.com.agora.dto.Article;
import pl.com.agora.exception.ArticleNotFoundException;

import java.util.List;


public class Main {

    public static void main(String[] args) {

        final ArticleDAO articleDAO = new ArticleDAO();

        Article art = new Article("Thinking in Java", "Bruce Eckel");
        Article savedArt = articleDAO.saveArticle(art);
        Article updateArt = articleDAO.updateArticle(art);
        Article deleteArt = articleDAO.deleteArticle(art);

        System.out.println("Wstawiłem " + savedArt);
        System.out.println("Zaktualizowałem " + updateArt);
        System.out.println("Skasowałem " + deleteArt);

        final List<Article> articles = articleDAO.findAllArticles();

        for (Article article : articles) {
            System.out.println("Article id = " + article.getId() + ", title = " + article.getTitle()
                    + ", author = " + article.getAuthor());
        }


        System.out.println("-- Single article --");

        try {

            Article article = articleDAO.findArticleById(2);
            System.out.println("Article id = " + article.getId() + ", title = " + article.getTitle()
                    + ", author = " + article.getAuthor());
        } catch (final ArticleNotFoundException e) {
            System.out.println("Nie udało nam się pobrać artykułu ");
        } catch (final NullPointerException e) {

        } catch (final Throwable e) {

        }


    }
}





