package se.iths.martin.observer;

public class StringSubject extends Subject {
    private String field = "";

    public String getField() {
        return field;
    }

    public void setField(String field) {
        if( field != null && !this.field.equals(field) ) {
            this.field = field;
            notifyObservers();
        }
    }
}
