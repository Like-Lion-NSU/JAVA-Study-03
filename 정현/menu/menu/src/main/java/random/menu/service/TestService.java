package random.menu.service;

import org.springframework.web.multipart.MultipartFile;

public interface TestService {
    String saveFile(MultipartFile file) throws Exception;
}
