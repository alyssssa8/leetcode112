public class ObserverPatternDemo {

    public static void main(String[] args) {
        System.out.println("Enter Text >");

        // create an event source - reads from stdin
        final ObserverEventSource eventSource = new ObserverEventSource();

        // create first observer
//        final ObserverResponseHandler1 = new ObserverResponseHandler1();

        // subscribe the observer to the event source
//        eventSource.addObserver(ObserverResponseHandler1);


        // create second observer
//        final ObserverResponseHandler2 = new ObserverResponseHandler2();

        // subscribe the observer to the event source
//        eventSource.addObserver(ObserverResponseHandler2);

        // starts the event thread
        Thread thread = new Thread(eventSource);
        thread.start();
    }
}
