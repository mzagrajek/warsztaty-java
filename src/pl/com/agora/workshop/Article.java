package pl.com.agora.workshop;

class Article {

    public static void main(String[] args) {
        Article article = new Article(19, null, 4342);
        System.out.println(article);
    }

    private static final int SST_ARTICLE_TYPE_ID = 7; //snake case jak jest static i final, nie mozna jej nadpisac

    private int id; // pole private, nikt nie może ich użyć ani przeczytać
    private int ownerId; //pole w klasie
    private String title;

    {
        this.title="Ala ma kota"; //blok inicjalizujacy
        System.out.println("Blok");
    }


    Article(final int id, final String title, final int ownerId) { //warto jeśli zmienna jest niezmienna
        this.id = id; //referencja do biezacego obiektu
        this.title = title;
        this.ownerId = ownerId;
        System.out.println("Konstruktor 1");

    }

    Article() {
        this(0,null, 0);
        System.out.println("Konstruktor 2");
    }

@Override
public String toString() {
    System.out.println("test");
    return "Id:" + this.id;
}


/*
 class CosTam moze dziedziczyc po jakiejs innej dajac class CosTam extends PoCzymsTam
    Article article = new Article();
    var article2 = new Article();


*/

}