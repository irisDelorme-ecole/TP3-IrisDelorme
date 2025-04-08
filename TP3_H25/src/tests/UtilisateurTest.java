package tests;

import org.junit.jupiter.api.Test;
import reseau.Utilisateur;

import static org.junit.jupiter.api.Assertions.*;

class UtilisateurTest {

    @Test
    void constructeurUtilisateur(){
        Utilisateur utilisateur = new Utilisateur("alice", "Alice123secure");
        assertEquals("alice", utilisateur.getUsername());
        assertEquals("Alice123secure", utilisateur.getPassword());
    }

    @Test
    void compareTo() {
        Utilisateur utilisateur = new Utilisateur("alice", "Alice123secure");
        Utilisateur utilisateur2 = new Utilisateur("bob", "Bob123secure");
        Utilisateur utilisateur3 = new Utilisateur("alice", "Alice123secure");
        assertEquals(-1, utilisateur.compareTo(utilisateur2));
        assertEquals(0, utilisateur.compareTo(utilisateur3));
        assertEquals(1, utilisateur2.compareTo(utilisateur3));
    }

    @Test
    void getUsername() {
        Utilisateur utilisateur2 = new Utilisateur("bob", "Bob123secure");
        assertEquals("bob", utilisateur2.getUsername());
    }

    @Test
    void getPassword() {
        Utilisateur utilisateur2 = new Utilisateur("bob", "Bob123secure");
        assertEquals("Bob123secure", utilisateur2.getPassword());
    }

    @Test
    void setUsername() {
        Utilisateur utilisateur2 = new Utilisateur("bob", "Bob123secure");
        utilisateur2.setUsername("alice");
        assertEquals("alice", utilisateur2.getUsername());

        assertThrows(IllegalArgumentException.class, () -> {utilisateur2.setUsername("aaaaaaaaaaaaaaaa");});
        assertThrows(IllegalArgumentException.class, () -> {utilisateur2.setUsername(null);});
    }

    @Test
    void setPassword() {
        Utilisateur utilisateur2 = new Utilisateur("bob", "Bob123secure");
        utilisateur2.setPassword("Bob123secure78");
        assertEquals("Bob123secure78", utilisateur2.getPassword());

        assertThrows(IllegalArgumentException.class, () -> {utilisateur2.setPassword(null);});
        assertThrows(IllegalArgumentException.class, () -> {utilisateur2.setPassword("bob123secure");});
        assertThrows(IllegalArgumentException.class, () -> {utilisateur2.setPassword("BOB123SECURE");});
        assertThrows(IllegalArgumentException.class, () -> {utilisateur2.setPassword("Bobsecure");});
    }

    @Test
    void testToString() {
        Utilisateur utilisateur = new Utilisateur("alice", "Alice123secure");
        Utilisateur utilisateur2 = new Utilisateur("bob", "Bob123secure");

        assertEquals("Username: alice (Mot de passe: Alice123secure)", utilisateur.toString());
        assertEquals("Username: bob (Mot de passe: Bob123secure)", utilisateur2.toString());
    }
}