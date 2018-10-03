package se.iths.martin.observer;

public class ObserverDemo {

    public static void main(String[] args) {

        StringSubject observableString = new StringSubject();

        Observer observer = new Observer() {
            @Override
            public void listener() {
                System.out.println("StringSubject changed value: "
                        + observableString.getField());
            }
        };

        observableString.registerObserver(observer);
        observableString.registerObserver(() -> System.out.println("Another observer:" + observableString.getField()));

        observableString.setField("Ny Text");
        observableString.setField("Ny Text");
        observableString.setField("Nyare Text");

        observableString.unRegisterObserver(observer);
        observableString.setField("More Text");

    }
}
