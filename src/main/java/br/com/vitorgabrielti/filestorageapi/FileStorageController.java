package br.com.vitorgabrielti.filestorageapi;

import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/files")
public class FileStorageController {
    private final Path fileStorageLocation;

    public FileStorageController(FileStorageProperties fileStorageProperties){
        this.fileStorageLocation = Paths.get(fileStorageProperties.getUploadDir())
            .toAbsolutePath().normalize();
    }
}
