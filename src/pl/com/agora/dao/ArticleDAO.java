package pl.com.agora.dao;



import pl.com.agora.dto.Article;
import pl.com.agora.exception.ArticleNotFoundException;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ArticleDAO {

    private static final Article EMPTY_ARTICLE = new Article(0, "", "");

    public List<Article> findAllArticles() {

        try (final Connection connection =

                     DriverManager.getConnection("jdbc:mysql://appcore02.gazeta.pl:7006/mzagrajek", "root","testtest");

             final Statement stmt = connection.createStatement()) {

            try (final ResultSet rs = stmt.executeQuery("select * from article")) {

                final List<Article> result = new ArrayList<>();

                while(rs.next()) {

                    final int id = rs.getInt("id");
                    final String title = rs.getString("title");
                    final String author = rs.getString("author");
                    final Article article = new Article(id, title, author);


                    result.add(article);

                    //System.out.println("Row: id = " + id + ", title = " + title + ", author = " + author);

                }

                return result;

            } catch (final SQLException e) {

                System.out.println(e);

            };

        } catch (final SQLException e) {

            System.out.println(e);

        }

        return new ArrayList<>();

    }

    //SAVE (Create)  - insert

    public Article saveArticle(final Article article) {

        try (final Connection connection =
                     DriverManager.getConnection("jdbc:mysql://appcore02.gazeta.pl:7006/mzagrajek", "root","testtest");
             final PreparedStatement stmt =
                     connection.prepareStatement("insert into article (title, author) values (?,?)", Statement.RETURN_GENERATED_KEYS)) {

            // bindowanie zmiennych

            stmt.setString(1, article.getTitle());
            stmt.setString(2, article.getAuthor());

            int result = stmt.executeUpdate();

            final ResultSet generatedKeys = stmt.getGeneratedKeys();

            if (generatedKeys.next()) {
                final int id = generatedKeys.getInt("GENERATED_KEY");
                System.out.println("Dupa" + generatedKeys.getMetaData().getColumnName(1));

                return new Article(id , article.getTitle(), article.getAuthor());
            }


            //DDL - data definition language - nie wymagaja commit ; np truncate (ale dziala na calej tabeli)
            //DML - data modification language - wymagaja commita; np. delete
            //System.out.println("Row: id = " + id + ", title = " + title + ", author = " + author);

        } catch (final SQLException e) {
            System.out.println(e);

        };

        return EMPTY_ARTICLE;

    }

    // UPDATE  - update

    public Article updateArticle (final Article article) {

        try (final Connection connection =
                     DriverManager.getConnection("jdbc:mysql://appcore02.gazeta.pl:7006/mzagrajek", "root","testtest");
             final PreparedStatement stmt =
                     connection.prepareStatement("update article set title = ?, author= ? where id =?", Statement.RETURN_GENERATED_KEYS)) {

            // bindowanie zmiennych
            // czy powinno być też ID ?
            stmt.setString(1, article.getTitle());
            stmt.setString(2, article.getAuthor());

            int result = stmt.executeUpdate();

            final ResultSet generatedKeys = stmt.getGeneratedKeys();

            if (generatedKeys.next()) {
                final int id = generatedKeys.getInt("GENERATED_KEY");
                System.out.println("Dupa" + generatedKeys.getMetaData().getColumnName(1));

                return new Article(id , article.getTitle(), article.getAuthor());
            }


        } catch (final SQLException e) {
            System.out.println(e);

        };

        return EMPTY_ARTICLE;

    }

    //DELETE  - delete

    public Article deleteArticle (final Article article) {

        try (final Connection connection =
                     DriverManager.getConnection("jdbc:mysql://appcore02.gazeta.pl:7006/mzagrajek", "root","testtest");
             final PreparedStatement stmt =
                     connection.prepareStatement("delete from article (id, title, author) values (?,?,?)", Statement.RETURN_GENERATED_KEYS)) {

            // bindowanie zmiennych

            stmt.setString(1, article.getTitle());
            stmt.setString(2, article.getAuthor());

            int result = stmt.executeUpdate();

            final ResultSet generatedKeys = stmt.getGeneratedKeys();

            if (generatedKeys.next()) {
                final int id = generatedKeys.getInt("GENERATED_KEY");
                System.out.println("Dupa" + generatedKeys.getMetaData().getColumnName(1));

                System.out.println("Artykuł został skasowany");
            }


            //DDL - data definition language - nie wymagaja commit ; np truncate (ale dziala na calej tabeli)
            //DML - data modification language - wymagaja commita; np. delete
            //System.out.println("Row: id = " + id + ", title = " + title + ", author = " + author);

        } catch (final SQLException e) {
            System.out.println(e);

        };

        return EMPTY_ARTICLE;

    }

    // READ - select

    public Article findArticleById(final int id) throws ArticleNotFoundException {



        try (final Connection connection =

                     DriverManager.getConnection("jdbc:mysql://appcore02.gazeta.pl:7006/mzagrajek", "root","testtest");

             final PreparedStatement stmt = connection.prepareStatement("select * from article where id = ?")) {

            // bindowanie zmiennych

            stmt.setInt(1, id);

            try (final ResultSet rs = stmt.executeQuery()) {

                if (rs.next()) {

                    final String title = rs.getString("title");
                    final String author = rs.getString("author");
                    final Article article = new Article(id, title, author);
                    return article;

                    //System.out.println("Row: id = " + id + ", title = " + title + ", author = " + author);

                }

            } catch (final SQLException e) {
                System.out.println(e);
            };

        } catch (final SQLException e) {
            System.out.println(e);

        }
        throw new ArticleNotFoundException();
    }

}


//wyjatki Object -> Throwable -> 1. Exception  (npe, sqlex, runtimeexception)2. Error (np out of memory error);