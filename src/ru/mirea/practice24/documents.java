package ru.mirea.practice24;

interface IDocument {
}

class ImageDocument implements IDocument{
    @Override
    public String toString() {
        return "Image document";
    }
}

class MusicDocument implements IDocument{
    @Override
    public String toString() {
        return "Music document";
    }
}

class TextDocument implements IDocument{
    @Override
    public String toString() {
        return "Text Document";
    }
}

interface AbstractDocumentFactory {
    public IDocument createDocument();
    public IDocument openDocument();
}

class DocumentFactory {
    public IDocument createDocument(AbstractDocumentFactory abstractDocumentFactory){
        System.out.println("creating document");
        return abstractDocumentFactory.createDocument();
    }
    public IDocument openDocument(AbstractDocumentFactory abstractDocumentFactory){
        System.out.println("opening document");
        return abstractDocumentFactory.openDocument();
    }
}

class ImageDocumentFactory implements AbstractDocumentFactory{
    @Override
    public IDocument createDocument() {
        return new ImageDocument();
    }

    @Override
    public IDocument openDocument() {
        return new ImageDocument();
    }
}

class MusicDocumentFactory implements AbstractDocumentFactory{
    @Override
    public IDocument createDocument() {
        return new MusicDocument();
    }

    @Override
    public IDocument openDocument() {
        return new MusicDocument();
    }
}

class TextDocumentFactory implements AbstractDocumentFactory{
    @Override
    public IDocument createDocument() {
        return new TextDocument();
    }

    @Override
    public IDocument openDocument() {
        return new TextDocument();
    }
}


