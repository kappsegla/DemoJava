package se.iths.martin.factory;

public class FileExporterFactory {

    public static FileExporter createAlfaBeta(String val){
       if( val.equals("png"))
            return new PngExporter();
       else
           return new SvgExporter();
    }
}
