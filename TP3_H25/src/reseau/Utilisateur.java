package reseau;

/**
 * Javadoc de GitHub Copilot
 * <p>
 * Cette classe représente un utilisateur dans le réseau.
 * Elle implémente l'interface Comparable pour permettre des comparaisons entre utilisateurs basées sur leurs noms d'utilisateur.
 */
public class Utilisateur implements Comparable<Utilisateur> {
    /**
     * Construit un nouvel Utilisateur avec le nom d'utilisateur et le mot de passe spécifiés.
     *
     * @param user     le nom d'utilisateur de l'utilisateur
     * @param password le mot de passe de l'utilisateur
     */
    public Utilisateur(String user, String password) {
        setUsername(user);
        setPassword(password);
    }

    /**
     * Le nom d'utilisateur
     */
    private String user;

    /**
     * Le mot de passe
     */
    private String password;

    /**
     * La longueur maximale du nom d'utilisateur
     */
    private final static int MAX_USERNAME_LENGTH = 15;

    /**
     * Compare cet utilisateur à un autre utilisateur basé sur leurs noms d'utilisateur.
     *
     * @param u l'utilisateur à comparer
     * @return un entier négatif, zéro ou un entier positif selon que cet utilisateur est moins, égal ou supérieur à l'utilisateur spécifié
     */
    @Override
    public int compareTo(Utilisateur u) {
        String nomCourantLower = user.toLowerCase();
        String nomEntryLower = u.getUsername().toLowerCase();
        return nomCourantLower.compareTo(nomEntryLower);
    }

    /**
     * Renvoie le nom d'utilisateur de cet utilisateur.
     *
     * @return le nom d'utilisateur de cet utilisateur
     */
    public String getUsername() {
        return user;
    }

    /**
     * Renvoie le mot de passe de cet utilisateur.
     *
     * @return le mot de passe de cet utilisateur
     */
    public String getPassword() {
        return password;
    }

    /**
     * Définit le nom d'utilisateur de cet utilisateur.
     *
     * @param username le nouveau nom d'utilisateur de cet utilisateur
     * @throws IllegalArgumentException si le nom d'utilisateur dépasse 15 caractères
     */
    public void setUsername(String username) throws IllegalArgumentException {
        if (username != null && username.length() <= MAX_USERNAME_LENGTH) {
            user = username;
        } else throw new IllegalArgumentException("Le nom d'utilisateur doit avoir un maximum de 15 charactères.");
    }

    /**
     * Définit le mot de passe de cet utilisateur.
     *
     * @param password le nouveau mot de passe de cet utilisateur
     * @throws IllegalArgumentException si le mot de passe ne respecte pas les critères de validation
     */
    public void setPassword(String password) throws IllegalArgumentException {
        if (validerPassword(password)) {
            this.password = password;
        } else
            throw new IllegalArgumentException("Le mot de passe doit contenir au moins une lettre majuscule, une lettre minuscule et un chiffre.");
    }

    /**
     * Valide le mot de passe donné pour s'assurer qu'il contient au moins une lettre majuscule, une lettre minuscule et un chiffre.
     *
     * @param password le mot de passe à valider
     * @return true si le mot de passe respecte les critères de validation, false sinon
     */
    private boolean validerPassword(String password) {
        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasNumber = false;

        if (password == null)
            return false;

        char[] charsPassword = password.toCharArray();
        for (char c : charsPassword) {
            if (Character.isUpperCase(c)) {
                hasUpper = true;
            }
            if (Character.isLowerCase(c)) {
                hasLower = true;
            }
            if (Character.isDigit(c)) {
                hasNumber = true;
            }
        }
        return hasUpper && hasLower && hasNumber;
    }

    /**
     * Renvoie une représentation sous forme de chaîne de cet utilisateur.
     *
     * @return une représentation sous forme de chaîne de cet utilisateur
     */
    public String toString() {
        return "Username: " + user + " (Mot de passe: " + password + ")";
    }
}
