import java.io.File;
import java.io.IOException;

public class GeneratorDirectorios {

    public void crearEstructuraDirectorios(String pathBase) {
        // Definimos las carpetas principales y las subcarpetas
        String[] carpetasPrincipales = { "carpeta1", "carpeta2" };
        String[] subcarpetas = { "-1", "-2", "-3", "-4" };

        // Creación de la estructura de directorios
        for (String carpeta : carpetasPrincipales) {
            String rutaCarpetaPrincipal = pathBase + "/" + carpeta;
            crearDirectorio(rutaCarpetaPrincipal);

            for (String subcarpeta : subcarpetas) {
                String rutaSubcarpeta = rutaCarpetaPrincipal + "/" + carpeta + subcarpeta;
                crearDirectorio(rutaSubcarpeta);

                // Agregar un archivo .gitkeep en el último nivel
                crearArchivoGitkeep(rutaSubcarpeta);
            }
        }
    }

    private void crearDirectorio(String path) {
        File directorio = new File(path);
        if (!directorio.exists()) {
            if (directorio.mkdirs()) {
                System.out.println("Directorio creado: " + path);
            } else {
                System.out.println("No se pudo crear el directorio: " + path);
            }
        }
    }

    private void crearArchivoGitkeep(String path) {
        File archivoGitkeep = new File(path + "/.gitkeep");
        try {
            if (archivoGitkeep.createNewFile()) {
                System.out.println("Archivo .gitkeep creado en: " + path);
            } else {
                System.out.println("El archivo .gitkeep ya existe en: " + path);
            }
        } catch (IOException e) {
            System.out.println("Error al crear el archivo .gitkeep en: " + path);
            e.printStackTrace();
        }
    }

}