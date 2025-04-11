import org.apache.poi.xwpf.usermodel.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.DayOfWeek;
import java.io.*;

public class MainFunction {

    public void genereazaCerere(
            String nume, String matricol, String functie, String departament,
            String dataInceput, String dataSfarsit, String inlocuitor, String functieInlocuitor,
            String anCurent, int totalCurent, int efectuateCurent,
            String anAnterior, int totalAnterior, int efectuateAnterior,
            String anPostanterior, int totalPostanterior, int efectuatePostanterior) {

        InputStream inputStream = getClass().getClassLoader().getResourceAsStream("Model_cerere_CO_2024_OK.docx");
        /*Old*/
        //String inputFile = "resources/Model_cerere_CO_2024_OK.docx";  // Document model
        //String outputFile = "Cerere_Completata.docx";  // Documentul final

        //MacOS
         String outputFile = System.getProperty("user.home") + "/Desktop/Cerere_Completata.docx";

        //Windows
//        String outputFile = System.getProperty("user.home") + "\\Desktop\\Cerere_Completata.docx";
//        File desktopDir = new File(outputFile);

        try {
            InputStream fis = getClass().getClassLoader().getResourceAsStream("Model_cerere_CO_2024_OK.docx");
            if (inputStream == null) {
                throw new FileNotFoundException("Fișierul model nu a fost găsit în resurse!");
            }
            XWPFDocument document = new XWPFDocument(fis);
            fis.close();

            // Calculare zile rămase
            int zileRamase = totalCurent - efectuateCurent;
            int zileRamaseAnterior = totalAnterior - efectuateAnterior;
            int zileRamasePostanterior = totalPostanterior - efectuatePostanterior;

            LocalDate startData = LocalDate.parse(dataInceput, DateTimeFormatter.ofPattern("dd.MM.yyyy"));
            LocalDate endData = LocalDate.parse(dataSfarsit, DateTimeFormatter.ofPattern("dd.MM.yyyy"));
//          long zileDiferenta = ChronoUnit.DAYS.between(startData, endData);
            long zileDiferenta = calculeazaZileLucratoare(startData, endData);  // Numărăm doar zilele lucrătoare


            for (XWPFParagraph paragraph : document.getParagraphs()) {
                replaceText(paragraph, "idNume", nume);
                replaceText(paragraph, "idMatricol", matricol);
                replaceText(paragraph, "idFunctie", functie);
                replaceText(paragraph, "idCompartiment", departament);
                replaceText(paragraph, "idDataIncepere", dataInceput);
                replaceText(paragraph, "idDataSfarsit", dataSfarsit);
                replaceText(paragraph, "idZile", Long.toString(zileDiferenta));
                replaceText(paragraph, "idInlocuitor", inlocuitor);
                replaceText(paragraph, "idFun", functieInlocuitor);
                replaceText(paragraph, "AnC", anCurent);
                replaceText(paragraph, "TotalC", String.valueOf(totalCurent));
                replaceText(paragraph, "ZileE", String.valueOf(efectuateCurent));
                replaceText(paragraph, "ZileR", String.valueOf(zileRamase));
                replaceText(paragraph, "AnA", anAnterior);
                replaceText(paragraph, "TotalA", String.valueOf(totalAnterior));
                replaceText(paragraph, "ZileA", String.valueOf(efectuateAnterior));
                replaceText(paragraph, "ZileM", String.valueOf(zileRamaseAnterior));
                replaceText(paragraph, "AnP", anPostanterior);
                replaceText(paragraph, "TotalP", String.valueOf(totalPostanterior));
                replaceText(paragraph, "ZileP", String.valueOf(efectuatePostanterior));
                replaceText(paragraph, "ZileD", String.valueOf(zileRamasePostanterior));
            }
            FileOutputStream fos = new FileOutputStream(outputFile);
            document.write(fos);
            fos.close();
            document.close();

            System.out.println("Cererea a fost completată și salvată ca: " + outputFile);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void replaceText(XWPFParagraph paragraph, String findText, String replaceText) {
        for (XWPFRun run : paragraph.getRuns()) {
            String text = run.getText(0);
            if (text != null && text.contains(findText)) {
                text = text.replace(findText, replaceText);
                run.setText(text, 0);
            }
        }
    }
    private static long calculeazaZileLucratoare(LocalDate start, LocalDate end) {
        long zileLucratoare = 0;
        LocalDate dataCurenta = start;

        while (!dataCurenta.isAfter(end)) {
            DayOfWeek ziuaSaptamanii = dataCurenta.getDayOfWeek();
            if (ziuaSaptamanii != DayOfWeek.SATURDAY && ziuaSaptamanii != DayOfWeek.SUNDAY) {
                zileLucratoare++;
            }
            dataCurenta = dataCurenta.plusDays(1);
        }
        return zileLucratoare;
    }
}