package org.ChiniakinD.patterns.factory;

/**
 * Класс DocumentFactory создает различные типы документов согласно паттерна factory.
 * @author ChiniakinD
 */
public final class DocumentFactory {

    private DocumentFactory() {
    }

    public static Document createDocument(DocumentType documentType) {

        if (documentType == null) {
            throw new IllegalArgumentException("Тип документа не может быть null");
        }

        switch (documentType) {
            case PDF -> {
                return new PDF();
            }
            case TEXT -> {
                return new Text();
            }
            case WORD -> {
                return new Word();
            }
            default -> throw new IllegalArgumentException("Unsupported DocumentType: "
                    + documentType);

        }
    }

}
