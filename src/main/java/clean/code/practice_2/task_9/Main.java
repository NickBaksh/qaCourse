package clean.code.practice_2.task_9;

public class Main {
    public static void main(String[] args) {
        PDF pdf = new PDF();
        PdfToDocAdapter pdfToDocAdapter = new PdfToDocAdapter(pdf);
        DocsReader docsReader = new DocsReader();


        WordDocument wordDocument = new WordDocument();
        docsReader.processDocs(wordDocument);

        docsReader.processDocs(pdfToDocAdapter);
    }
}
