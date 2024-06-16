package org.ChiniakinD;

import org.ChiniakinD.patterns.factory.Document;
import org.ChiniakinD.patterns.factory.DocumentFactory;
import org.ChiniakinD.patterns.factory.DocumentType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestFactory {

    @Test
    public void createDocumentPdfShouldReturnPDF() {
        Document document = DocumentFactory.createDocument(DocumentType.PDF);
        assertEquals("Отправлен документ формата pdf", document.send());
    }

    @Test
    public void createDocumentTextShouldReturnText() {
        Document document = DocumentFactory.createDocument(DocumentType.TEXT);
        assertEquals("Отправлен документ формата text", document.send());
    }

    @Test
    public void createDocumentWordShouldReturnWord() {
        Document document = DocumentFactory.createDocument(DocumentType.WORD);
        assertEquals("Отправлен документ формата word", document.send());
    }

    @Test
    public void createDocumentNullShouldReturnIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> DocumentFactory.createDocument(null));
    }


}
