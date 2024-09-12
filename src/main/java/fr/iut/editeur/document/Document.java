package fr.iut.editeur.document;

/*
* Classe contenant le texte courant ainsi que les méthodes permetant d'altérer le texte courant
*/
public class Document {

    /*
    attribut contenant le texte courant
    */
    private String texte;

    public Document() {
        this.texte = "";
    }

    /*
    * méthode permetant d'obtenir le texte courant
    * @return renvoie le contenu de la variable privée texte
    */
    public String getTexte() {
        return texte;
    }

    /*
    * méthode permetant de remplacer le texte courant par un autre
    * @param texte nouveau texte a mettre
    */
    public void setTexte(String texte) {
        this.texte = texte;
    }

    /*
    * méthode permetant d'ajouter du texte à la fin du texte courant
    * @param texte nouveau texte à ajouter
    */
    public void ajouter(String texte) {
        this.texte += texte;
    }

    /*
    * méthode permetant de remplacer une portion de texte du texte courant par un autre
    * @param debut index du début de la portion à remplacer dans le texte courant
    * @param fin index de fin de la portion à remplacer dans le texte courant
    * @param remplacement texte qui va remplacer la portion donnée du texte courant
    */
    public void remplacer (int debut, int fin, String remplacement) {
        String partieGauche = texte.substring(0, debut);
        String partieDroite = texte.substring(fin + 1);
        texte = partieGauche + remplacement + partieDroite;
    }

    /*
     * méthode permetant de mettre en majuscules une portion de texte du texte courant
     * @param debut index du début de la portion à mettre en majuscules dans le texte courant
     * @param fin index de fin de la portion à mettre en majuscules dans le texte courant
     */
    public void majuscules (int debut, int fin) {
        remplacer(debut, fin , texte.substring(debut, fin + 1).toUpperCase());
    }

    /*
     * méthode permetant d'effacer une portion de texte du texte courant
     * @param debut index du début de la portion à effacer dans le texte courant
     * @param fin index de fin de la portion à effacer dans le texte courant
     */
    public void effacer (int debut, int fin) {
        remplacer(debut, fin , "");
    }

    /*
     * méthode permetant d'effacer complètement le texte courant
     */
    public void clear () {
        texte = "";
    }

    /*
    * méthode permetant d'afficher tous les attributs de Document en string dans la sortie standard
    * @return le string final
    */
    @Override
    public String toString() {
        return this.texte;
    }

}
