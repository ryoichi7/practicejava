package ru.mirea.practice24;

import javax.swing.*;

class Editor extends JFrame {

    private DocumentFactory documentFactory = new DocumentFactory();

    IDocument currentDocument;
    JMenuBar menuBar = new JMenuBar();
    JMenu musicMenu = new JMenu("Music");
    JMenu textMenu = new JMenu("Text");
    JMenu imageMenu = new JMenu("Image");
    JMenuItem saveMusicMenu = new JMenuItem("Save");
    JMenuItem saveImageMenu = new JMenuItem("Save");
    JMenuItem saveTextMenu = new JMenuItem("Save");
    JMenuItem openMusicMenu = new JMenuItem("Open");
    JMenuItem openImageMenu = new JMenuItem("Open");
    JMenuItem openTextMenu = new JMenuItem("Open");
    JMenuItem newMusicMenu = new JMenuItem("New");
    JMenuItem newImageMenu = new JMenuItem("New");
    JMenuItem newTextMenu = new JMenuItem("New");
    JMenuItem exitMusicMenu = new JMenuItem("Exit");
    JMenuItem exitImageMenu = new JMenuItem("Exit");
    JMenuItem exitTextMenu = new JMenuItem("Exit");

    JButton jButton = new JButton("Get type of class");
    public Editor(){
        super("Editor");
        setSize(500,300);

        setJMenuBar(menuBar);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        add(jButton);

        menuBar.add(textMenu);
        menuBar.add(imageMenu);
        menuBar.add(musicMenu);

        textMenu.add(newTextMenu);
        textMenu.add(openTextMenu);
        textMenu.add(saveTextMenu);
        textMenu.add(exitTextMenu);

        imageMenu.add(newImageMenu);
        imageMenu.add(openImageMenu);
        imageMenu.add(saveImageMenu);
        imageMenu.add(exitImageMenu);

        musicMenu.add(newMusicMenu);
        musicMenu.add(openMusicMenu);
        musicMenu.add(saveMusicMenu);
        musicMenu.add(exitMusicMenu);

        newTextMenu.addActionListener(e->{
            System.out.println("creating new text file");
            currentDocument = documentFactory.createDocument(new TextDocumentFactory());
        });
        newImageMenu.addActionListener(e->{
            System.out.println("creating new image file");
            currentDocument = documentFactory.createDocument(new ImageDocumentFactory());
        });
        newMusicMenu.addActionListener(e->{
            System.out.println("creating new music file");
            currentDocument = documentFactory.createDocument(new MusicDocumentFactory());
        });

        openTextMenu.addActionListener(e->{
            System.out.println("opening new text file");
            currentDocument = documentFactory.openDocument(new TextDocumentFactory());
        });
        openImageMenu.addActionListener(e->{
            System.out.println("opening new image file");
            currentDocument = documentFactory.openDocument(new ImageDocumentFactory());
        });
        openMusicMenu.addActionListener(e->{
            System.out.println("opening new music file");
            currentDocument = documentFactory.openDocument(new MusicDocumentFactory());
        });

        jButton.addActionListener(e->{
            System.out.printf("Type of document: %1$s\n",currentDocument.getClass());
        });
    }
}

class Main {
    public static void main(String[] args) {
        new Editor().setVisible(true);
    }
}

