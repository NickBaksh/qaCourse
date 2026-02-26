package clean.code.practice_2.task_9;

public class PdfToDocAdapter implements Document {
    private PDF pdf;

    public PdfToDocAdapter(PDF pdf) {
        this.pdf = pdf;
    }

    @Override
    public void open() {
        System.out.println("Converting PDF to DOC.....");
        pdf.openPDFFile();
    }
}
