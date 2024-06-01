public static void main(String[] args) {


// Création d’un fileReader pour lire le fichier
        FileReader fileReader = new FileReader(“C:/Users/Emmanuel/Documents/mot_cle”);

// Création d’un bufferedReader qui utilise le fileReader
        BufferedReader reader = new BufferedReader (fileReader);


        try {

        // une fonction à essayer pouvant générer une erreur
        line = reader.readLine();

        while(line != null) {

        // affichage de la ligne
        System.out.println(line);

        // lecture de la prochaine ligne
        line = reader.readLine();
        }


        catch (IOException e) {

        e.printStackTrace();


        }

        reader.close();

        }