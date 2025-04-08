package reseau;
//TODO générer javadoc
public class Utilisateur implements Comparable<Utilisateur> {

    public Utilisateur(String user, String password) {
        setUsername(user);
        setPassword(password);
    }

    private String user;
    private String password;

    private final static int MAX_USERNAME_LENGTH = 15;

    @Override
    public int compareTo(Utilisateur u) {
        String nomCourantLower = user.toLowerCase();
        String nomEntryLower = u.getUsername().toLowerCase();
        return nomCourantLower.compareTo(nomEntryLower);
    }

    public String getUsername() {
        return user;
    }

    public String getPassword() {
        return password;
    }

    public void setUsername(String username) throws IllegalArgumentException {
        if (username.length() <= MAX_USERNAME_LENGTH) {
            user = username;
        } else throw new IllegalArgumentException("Le nom d'utilisateur doit avoir un maximum de 15 charactères.");
    }

    public void setPassword(String password) throws IllegalArgumentException {
        if (validerPassword(password)) {
            this.password = password;
        }else throw new IllegalArgumentException("Le mot de passe doit contenir au moins une lettre majuscule, une lettre minuscule et un chiffre.");
    }

    private boolean validerPassword(String password) {
        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasNumber = false;

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

    public String toString(){
        return "Username : " + user + " (Mot de passe: " + password + ")";
    }
}
