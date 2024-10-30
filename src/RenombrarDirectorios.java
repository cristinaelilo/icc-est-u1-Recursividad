import java.io.File;

public class RenombrarDirectorios {
    public void renombrarDirectorios(String path) {
        File directorio = new File(path);
        
        if (!directorio.exists() || !directorio.isDirectory()) {
            System.out.println("La ruta especificada no es un directorio válido.");
            return;
        }
        
        System.out.println("La ruta especificada es válida.");
        renombrarDirectoriosInternos(directorio);
    }

    public void renombrarDirectoriosInternos(File directorio) {
        // Listar todos los archivos y subdirectorios
        File[] directoriosArchivosInternos = directorio.listFiles();
        if (directoriosArchivosInternos == null) {
            return;
        }
        
        for (File directorioArchivo : directoriosArchivosInternos) {
            if (directorioArchivo.isDirectory()) {
                String nombreOriginal = directorioArchivo.getName();
                String nuevoNombre = "Nuevo_" + nombreOriginal;

                File nuevoDirectorio = new File(directorioArchivo.getParent(), nuevoNombre);

                if (directorioArchivo.renameTo(nuevoDirectorio)) {
                    System.out.println("Directorio renombrado: " + nombreOriginal + " -> " + nuevoNombre);

                    // Llamada recursiva para renombrar los subdirectorios
                    renombrarDirectoriosInternos(nuevoDirectorio, nuevoNombre);
                } else {
                    System.out.println("Error al renombrar el directorio: " + nombreOriginal);
                } 
            }
        }
    }
}
