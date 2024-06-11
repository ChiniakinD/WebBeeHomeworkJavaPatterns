package org.ChiniakinD.patterns.factory;

/**
 * Класс DocumentFactory создает различные типы документов согласно паттерну фабрика.
 * Он является фабрикой для создания объектов, реализующих интерфейс Document.
 * @author ChiniakinD
 */
public final class DocumentFactory {

    private DocumentFactory() {
    }

    /**
     * Создает документ заданного типа.
     * @param documentType - тип документа, который нужно создать.
     * @return Созданный документ.
     * @throws IllegalArgumentException Если documentType null.
     */
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
