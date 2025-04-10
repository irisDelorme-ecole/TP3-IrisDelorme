package reseau;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


/**
 * La classe {@code ReseauBuilder} fournit des utilitaires pour
 * charger un réseau {@link CivixNet} à partir d'un fichier JSON,
 * ainsi que pour le sérialiser et le désérialiser.
 * <p>
 * Cette classe est utilisée pour initialiser un réseau à partir d'un fichier
 * ou pour en sauvegarder l'état sur disque.
 * </p>
 */
public class ReseauBuilder {
    // Séparateur de fichier pour garantir la compatibilité multiplateforme
    private static final char fSep = File.separatorChar;

    // Chemin d'accès par défaut vers le répertoire des données
    private static final String pathIn = System.getProperty("user.dir") + fSep + "src" + fSep;

    /**
     * Charge un objet {@link CivixNet} à partir d'un fichier JSON.
     * <p>
     * Le fichier doit contenir une structure JSON avec un tableau d'utilisateurs,
     * chacun ayant un nom, un mot de passe, et une liste d'abonnements.
     * </p>
     *
     * Exemple de structure attendue :
     * <pre>
     * {
     *   "utilisateurs": [
     *     {
     *       "username": "alice",
     *       "password": "420-SF2_H25_limoilou",
     *       "abonnements": ["bob", "charlie"]
     *     },
     *     ...
     *   ]
     * }
     * </pre>
     *
     * @param cheminFichier le chemin absolu ou relatif vers le fichier JSON
     * @return un objet {@link CivixNet} reconstruit à partir du fichier
     * @throws Exception si le fichier est introuvable, mal formé ou si une erreur d'E/S survient
     */
    public static CivixNet chargerDepuisJSON(String cheminFichier) throws Exception {
        // TODO: Compléter cette méthode

            ObjectMapper mapper = new ObjectMapper();
            JsonNode racine = mapper.readTree(new File(pathIn + cheminFichier)).get("utilisateurs");

            CivixNet charged = new CivixNet();

            List<String> abonnementsList = new ArrayList<>();


            for (int i = 0; i < racine.size(); i++) {
                charged.ajouterUtilisateur(racine.get(i).get("username").asText(), racine.get(i).get("password").asText());

            }
            for (int i = 0; i < racine.size(); i++) {
                for (int j = 0; j < racine.get(i).get("abonnements").size(); j++) {
                charged.ajouterAbonnement(charged.obtenirUtilisateurAPartirDuUsername(racine.get(i).get("username").asText()), charged.obtenirUtilisateurAPartirDuUsername(racine.get(i).get("abonnements").get(j).asText()));
                }
            }
            return charged;
    }

    /**
     * Sérialise un objet {@link CivixNet} et l'écrit dans un fichier `.ser`.
     *
     * @param reseau  l'objet {@link CivixNet} à sauvegarder
     * @param pathOut le répertoire de sortie (chemin terminé par un slash)
     * @throws IOException si une erreur d'écriture survient
     */
    public static void serialise(CivixNet reseau, String pathOut) throws IOException {
        // TODO: Compléter cette méthode
    }

    /**
     * Désérialise un objet {@link CivixNet} à partir d’un fichier `.ser`.
     *
     * @param inputFile le chemin vers le fichier de sérialisation
     * @return l'objet {@link CivixNet} restauré
     * @throws IOException            si une erreur de lecture survient
     * @throws ClassNotFoundException si la classe {@link CivixNet} n’est pas trouvée
     */
    public static CivixNet deserialise(String inputFile) throws IOException, ClassNotFoundException {
        // TODO: Compléter cette méthode
        return null;
    }
}
