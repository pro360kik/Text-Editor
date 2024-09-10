package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class CommandeInserer extends CommandeDocument
{
    public CommandeInserer(Document document, String[] parameters)
    {
        super(document, parameters);
    }
    @Override
    public void executer()
    {
        if(parameters.length < 3)
        {
            System.err.println("Format attendu : inserer;position;texte");
            return;
        }
        int position = Integer.parseInt(parameters[1]);
        String texte = parameters[2];
        String left = this.document.getTexte().substring(0, position);
        String right = this.document.getTexte().substring(position);
        this.document.remplacer(0, this.document.getTexte().length()-1, left + texte + right);
        super.executer();
    }
}
