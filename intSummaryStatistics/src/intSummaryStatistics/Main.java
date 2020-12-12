package intSummaryStatistics;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main( String[] args ) {
        // la classe IntSummaryStatistics class est présente java.util package.
        // C'est utile quand on gère un stream de Integer

        IntSummaryStatistics intSummaryStatistics = new IntSummaryStatistics();

        List<Integer> list = Arrays.asList( 10, 20, 30, 40, 50 );
        // Avec la méthode accept, on va passer (ajouter dans la moulinette)
        // IntSummaryStatistics les integer
        // ce qui permettra de faire des opérations dessus

        Iterator<Integer> iterator = list.iterator();
        while ( iterator.hasNext() ) {
            intSummaryStatistics.accept( iterator.next() );
        }

        // on peut maintenant faire des opération
        // GET COUNT compte le nombre d'integer passé dans IntSummaryStatistics

        System.out.println( intSummaryStatistics.getCount() );
        // 5

        // GET AVERAGE compte la moyenne des integer passés dans
        // IntSummaryStatistics

        System.out.println( intSummaryStatistics.getAverage() );
        // 150/5 = 30

        // GET SUM somme les integer passés dans
        // IntSummaryStatistics

        System.out.println( intSummaryStatistics.getSum() );
        // 150

        // GET MAX donne le MAX les integer passés dans
        // IntSummaryStatistics

        System.out.println( intSummaryStatistics.getMax() );
        // 50

        // GET MIN donne le MIN les integer passés dans
        // IntSummaryStatistics

        System.out.println( intSummaryStatistics.getMin() );
        // 10

        System.out.println( intSummaryStatistics.toString() );
        // IntSummaryStatistics{count=5, sum=150, min=10, average=30,000000,
        // max=50}

    }

}
