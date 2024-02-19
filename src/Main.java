import java.util.*;

public class Main {
    public static void main(String[] args) {
        CDDatos data = new CDDatos(128, "Fotos", "jpg");
        CDAudio music = new CDAudio(256, "Musica relajante", "Manuel Gómez");
        CDSoftware windows11Pro = new CDSoftware(6000, "Windows 11 Pro", "Windows 11 Pro");
        CDMp3 mimp3 = new CDMp3(1024, "MiMP3", 300);

        //Creamos la lista y añadimos los objetos
        ArrayList<CDs> coleccionCDs = new ArrayList<CDs>();
        coleccionCDs.add(data);
        coleccionCDs.add(music);
        coleccionCDs.add(windows11Pro);
        coleccionCDs.add(mimp3);

        // Mostrar la información de los CDs ordenados
        for (CDs cd : coleccionCDs) {
            System.out.println(cd);
            System.out.println();
        }
    }
}
