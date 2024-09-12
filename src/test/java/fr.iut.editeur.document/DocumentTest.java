package fr.iut.editeur.document;

import fr.iut.editeur.commande.factory.CommandeFactory;
import fr.iut.editeur.commande.invoker.CommandeInvoker;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

public class DocumentTest {

    @Test
    public void testMethode() {
        Document document = new Document();
        document.ajouter("Saucisse");
        assertEquals("Saucisse", document.getTexte());
    }

}