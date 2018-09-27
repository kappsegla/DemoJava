module se.iths.martin {
//    requires jdk.incubator.httpclient;
    requires gson;
    requires java.sql;
    opens se.iths.martin.json;  //Only in jdk 11
}