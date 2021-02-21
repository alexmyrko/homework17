package cursor.myrko.homework17.util;

import cursor.myrko.homework17.entities.Notebook;
import cursor.myrko.homework17.repositories.NotebookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
@RequiredArgsConstructor
public class NotebookUtil implements CommandLineRunner {
    private final NotebookRepository notebookRepository;

    @Override
    public void run(String... args) throws Exception {
        List<Notebook> notebooks = initNotebookList();

        System.out.println("\nAll notebooks:");
        notebookRepository.saveAll(notebooks);
        notebookRepository.findAll().forEach(System.out::println);

        System.out.println("\nNotebooks sorted by manufacturer in descending order:");
        notebookRepository.findAll(Sort.by(Sort.Direction.DESC, "manufacturer")).forEach(System.out::println);

        System.out.println("\nNotebooks with more than 16 Gb RAM:");
        notebookRepository.findAllByMemoryGreaterThan(16).forEach(System.out::println);

        System.out.println("\nUsed notebooks:");
        notebookRepository.findAllByIsUsedIsTrue().forEach(System.out::println);

        System.out.println();
    }

    public List<Notebook> initNotebookList() {
        return new ArrayList<>(Arrays.asList(
                new Notebook().setModel("Probook 440 G6").setManufacturer("HP").setPocessor("Intel Core I5").setMemory(8)
                        .setUsed(false).setCaseType("metal").setPrice(24500).setLocalDate(LocalDate.of(2019, 10, 12)),
                new Notebook().setModel("Tecra A10").setManufacturer("Toshiba").setPocessor("Intel Core I5").setMemory(8)
                        .setUsed(true).setCaseType("plastic").setPrice(3700).setLocalDate(LocalDate.of(2013, 1, 5)),
                new Notebook().setModel("Tecra A11").setManufacturer("Toshiba").setPocessor("Intel Core I7").setMemory(8)
                        .setUsed(true).setCaseType("plastic").setPrice(4500).setLocalDate(LocalDate.of(2014, 12, 22)),
                new Notebook().setModel("Inspirion 5545").setManufacturer("Dell").setPocessor("Intel Core I3").setMemory(4)
                        .setUsed(true).setCaseType("plastic").setPrice(3500).setLocalDate(LocalDate.of(2010, 5, 3)),
                new Notebook().setModel("Vostro 5779").setManufacturer("Dell").setPocessor("Intel Core I7").setMemory(8)
                        .setUsed(true).setCaseType("plastic").setPrice(6300).setLocalDate(LocalDate.of(2012, 1, 29)),
                new Notebook().setModel("Aspire 5").setManufacturer("Acer").setPocessor("Intel Core I5").setMemory(8)
                        .setUsed(false).setCaseType("metal").setPrice(18999).setLocalDate(LocalDate.of(2018, 4, 16)),
                new Notebook().setModel("V15-ADA").setManufacturer("Lenovo").setPocessor("AMD Athlon 3050").setMemory(4)
                        .setUsed(false).setCaseType("metal").setPrice(9499).setLocalDate(LocalDate.of(2017, 11, 11)),
                new Notebook().setModel("Mac Book Pro 13").setManufacturer("Apple").setPocessor("Apple M1").setMemory(8)
                        .setUsed(false).setCaseType("metal").setPrice(44999).setLocalDate(LocalDate.of(2021, 1, 5)),
                new Notebook().setModel("V14-ADA").setManufacturer("Lenovo").setPocessor("AMD 3020").setMemory(4)
                        .setUsed(false).setCaseType("plastic").setPrice(10289).setLocalDate(LocalDate.of(2015, 3, 14)),
                new Notebook().setModel("Pavilion Gaming").setManufacturer("HP").setPocessor("AMD Ryzen5").setMemory(8)
                        .setUsed(false).setCaseType("plastic").setPrice(21999).setLocalDate(LocalDate.of(2018, 6, 15)),
                new Notebook().setModel("Inspirion G5 5500").setManufacturer("Dell").setPocessor("Intel Core I7").setMemory(16)
                        .setUsed(false).setCaseType("metal").setPrice(42999).setLocalDate(LocalDate.of(2020, 3, 8)),
                new Notebook().setModel("Inspirion").setManufacturer("Dell").setPocessor("Intel Core I5").setMemory(8)
                        .setUsed(true).setCaseType("metal").setPrice(10900).setLocalDate(LocalDate.of(2014, 9, 19)),
                new Notebook().setModel("Zbook Firefly 14 G7").setManufacturer("HP").setPocessor("Intel Core I5").setMemory(16)
                        .setUsed(true).setCaseType("metal").setPrice(27567).setLocalDate(LocalDate.of(2016, 10, 3)),
                new Notebook().setModel("Precision M6700").setManufacturer("Dell").setPocessor("Intel Core I7").setMemory(8)
                        .setUsed(true).setCaseType("plastic").setPrice(15800).setLocalDate(LocalDate.of(2013, 4, 13)),
                new Notebook().setModel("Mac Book Pro 13").setManufacturer("Apple").setPocessor("Intel Core I5").setMemory(8)
                        .setUsed(true).setCaseType("metal").setPrice(15500).setLocalDate(LocalDate.of(2016, 12, 23)),
                new Notebook().setModel("Legion 5").setManufacturer("Lenovo").setPocessor("Intel Core I7").setMemory(32)
                        .setUsed(false).setCaseType("metal").setPrice(40999).setLocalDate(LocalDate.of(2019, 5, 23)),
                new Notebook().setModel("IdeaPad 5").setManufacturer("Lenovo").setPocessor("Intel Core I7").setMemory(8)
                        .setUsed(false).setCaseType("plastic").setPrice(23999).setLocalDate(LocalDate.of(2020, 7, 2)),
                new Notebook().setModel("255 G7").setManufacturer("HP").setPocessor("AMD Ryzen5").setMemory(8)
                        .setUsed(false).setCaseType("plastic").setPrice(23973).setLocalDate(LocalDate.of(2019, 1, 14)),
                new Notebook().setModel("Mate Book X Pr0").setManufacturer("Huawei").setPocessor("Intel Core I7").setMemory(32)
                        .setUsed(false).setCaseType("metal").setPrice(49999).setLocalDate(LocalDate.of(2020, 11, 3)),
                new Notebook().setModel("Rise Grey").setManufacturer("Pixus").setPocessor("Celeron N3350").setMemory(4)
                        .setUsed(false).setCaseType("plastic").setPrice(7999).setLocalDate(LocalDate.of(2012, 10, 26))
        ));
    }
}
