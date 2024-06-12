package Multithreading;

public class Q8 {
//     Develop a Java program that analyzes real-time weather data using reactive programming.
// The program should fetch weather data from a weather API asynchronously and perform analysis
// (e.g., temperature trends, rainfall predictions). Use a reactive approach to handle the asynchronous
// nature of weather data updates. Use reactive operators (e.g., map, filter) to process and analyze the
// weather data stream.

    public static void main(String[] args) {
        final String apiUrl = "https://api.weatherapi.com/v1/current

        Observable<String> observable = Observable.create(emitter -> {
            try {
                URL url = new URL(apiUrl);
                HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                connection.setRequestMethod("GET");
                connection.connect();

                BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String line;
                while ((line = reader.readLine()) != null) {
                    emitter.onNext(line);
                }
                reader.close();
                emitter.onComplete();
            } catch (IOException e) {
                emitter.onError(e);
            }
        });

        observable.subscribeOn(Schedulers.io())
                .observeOn(Schedulers.single())
                .subscribe(System.out::println, Throwable::printStackTrace);

        try {

            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
