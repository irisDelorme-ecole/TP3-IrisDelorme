package reseau;

import java.io.Serializable;
import java.util.*;

/**
 * La classe {@code CivixNet} représente un réseau social simplifié où les utilisateurs
 * peuvent s'abonner à d'autres utilisateurs et interagir avec eux.
 * <p>
 * Chaque utilisateur est représenté par un objet {@link Utilisateur}, et les relations
 * d'abonnement sont gérées dans une carte associant chaque utilisateur à un ensemble
 * d'autres utilisateurs qu'il suit.
 * </p>
 */
public class CivixNet {

    /**
     * La carte représentant les utilisateurs et leurs abonnements.
     * La clé est un utilisateur, et la valeur est l'ensemble des utilisateurs qu'il suit.
     */
    private Map<Utilisateur, Set<Utilisateur>> utilisateurs;

    /**
     * Constructeur par défaut. Initialise un réseau vide.
     */
    public CivixNet() {
        this.utilisateurs = new TreeMap<>();
    }

    /**
     * Retourne la carte des utilisateurs du réseau.
     *
     * @return une map représentant les utilisateurs et leurs abonnements
     */
    public Map<Utilisateur, Set<Utilisateur>> getUtilisateurs() {
        // TODO: Compléter cette méthode
        return null;
    }

    /**
     * Ajoute un nouvel utilisateur au réseau.
     *
     * @param username le nom d'utilisateur
     * @param password le mot de passe associé
     * @throws IllegalArgumentException si le nom ou le mot de passe est invalide
     */
    public void ajouterUtilisateur(String username, String password) {
        // TODO: Compléter cette méthode
    }

    /**
     * Abonne un utilisateur à un autre.
     *
     * @param compte           l'utilisateur qui souhaite suivre
     * @param nouvelAbonnement l'utilisateur à suivre
     */
    public void ajouterAbonnement(Utilisateur compte, Utilisateur nouvelAbonnement) {
        // TODO: Compléter cette méthode
    }

    /**
     * Retire un abonnement pour un utilisateur donné.
     *
     * @param compte             l'utilisateur qui arrête de suivre
     * @param abonnementARetirer l'utilisateur à ne plus suivre
     */
    public void retirerAbonnement(Utilisateur compte, Utilisateur abonnementARetirer) {
        // TODO: Compléter cette méthode
    }

    /**
     * Abonne un utilisateur à une liste d'autres utilisateurs.
     *
     * @param compte              l'utilisateur qui souhaite suivre d'autres comptes
     * @param nouveauxAbonnements la liste des nouveaux abonnements
     */
    public void ajouterAbonnements(Utilisateur compte, List<Utilisateur> nouveauxAbonnements) {
        // TODO: Compléter cette méthode
    }

    /**
     * Retire une liste d'abonnements pour un utilisateur donné.
     *
     * @param compte              l'utilisateur concerné
     * @param abonnementsARetirer la liste des abonnements à supprimer
     */
    public void retirerAbonnements(Utilisateur compte, List<Utilisateur> abonnementsARetirer) {
        // TODO: Compléter cette méthode
    }

    /**
     * Recherche un utilisateur dans le réseau à partir de son nom.
     *
     * @param username le nom d'utilisateur recherché
     * @return l'objet {@link Utilisateur} correspondant
     * @throws RuntimeException si l'utilisateur n'existe pas
     */
    public Utilisateur obtenirUtilisateurAPartirDuUsername(String username) {
        // TODO: Compléter cette méthode
        return null;
    }

    /**
     * Vérifie si deux utilisateurs sont mutuellement abonnés.
     *
     * @param u1 le premier utilisateur
     * @param u2 le second utilisateur
     * @return {@code true} si u1 suit u2, sinon {@code false}
     */
    public boolean abonnementMutuel(Utilisateur u1, Utilisateur u2) {
        // TODO: Compléter cette méthode
        return false;
    }

    /**
     * Retourne la liste des utilisateurs affectés par une fausse information initiée par un utilisateur donné,
     * à l'aide d'une approche récursive. Cette méthode appelle la méthode privée propagerRecursive.
     *
     * La propagation se fait jusqu'à deux niveaux de connexions :
     * - niveau 0 : l'utilisateur initial
     * - niveau 1 : ses abonnés directs
     * - niveau 2 : les abonnés de ses abonnés
     *
     * Les doublons sont éliminés, et le résultat est retourné trié en ordre alphabétique inverse.
     *
     * @param username le nom d'utilisateur de la personne ayant lancé la fausse information
     * @return une liste triée en ordre alphabétique inverse des utilisateurs affectés sans doublons
     */
    public ArrayList<Utilisateur> propagationFausseInformationRecursive(String username) {
        // TODO: Compléter cette méthode
        return null;
    }

    /**
     * Méthode auxiliaire récursive qui propage la fausse information dans le réseau.
     *
     * @param courant   l'utilisateur actuellement traité dans la récursion
     * @param niveau    niveau actuel de la récursion (0 pour l'utilisateur initial)
     * @param maxNiveau niveau maximal de propagation autorisé (ex. : 2)
     * @param affectes  ensemble cumulatif des utilisateurs affectés par la propagation
     */
    private void propagerRecursive(Utilisateur courant, int niveau, int maxNiveau, Set<Utilisateur> affectes) {
        // TODO: Compléter cette méthode
    }


    /**
     * Retourne une représentation textuelle du réseau.
     *
     * @return une chaîne de caractères listant les utilisateurs et leurs abonnements
     */
    @Override
    public String toString() {
        // TODO: Compléter cette méthode
        return null;
    }
}
