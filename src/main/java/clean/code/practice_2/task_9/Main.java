package clean.code.practice_2.task_9;

public class Main {
    public static void main(String[] args) {
        PDFGenerator pdfGenerator = new PDFGenerator();
        PdfToDocAdapter pdfToDocAdapter = new PdfToDocAdapter(pdfGenerator);
        DocsReader docsReader = new DocsReader();


        WordDocument wordDocument = new WordDocument();
        docsReader.processDocs(wordDocument);

        docsReader.processDocs(pdfToDocAdapter);
    }
}
