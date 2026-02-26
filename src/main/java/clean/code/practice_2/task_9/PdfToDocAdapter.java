package clean.code.practice_2.task_9;

public class PdfToDocAdapter implements Document {
    private PDFGenerator pdfGenerator;

    public PdfToDocAdapter(PDFGenerator pdfGenerator) {
        this.pdfGenerator = pdfGenerator;
    }

    @Override
    public void open() {
        System.out.println("Converting PDF to DOC.....");
        pdfGenerator.openPDFFile();
    }
}
