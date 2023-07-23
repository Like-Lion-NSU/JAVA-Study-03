package random.menu.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.UUID;

@Service
public class TestServiceImpl implements TestService {

    private static final Logger logger = LoggerFactory.getLogger(TestServiceImpl.class);

    public String saveFile(MultipartFile file) throws IOException {
        if (file.isEmpty()) {
            throw new IllegalArgumentException("File is empty");
        }

        String originalName = StringUtils.cleanPath(file.getOriginalFilename());
        String uuid = UUID.randomUUID().toString();
        String extension = getFileExtension(originalName);
        String savedName = uuid + extension;    // UUID와 파일 확장자를 사용하여 저장될 파일명을 생성
        String savedPath = "C:/path/to/your/directory/" + savedName;    // 저장될 경로를 디렉토리와 파일명을 합쳐 생성하도록 수정

        try {
            // savedPath를 사용하여 대상 위치를 생성하고 업로드된 파일의 내용을 해당 위치로 복사
            Path targetLocation = Path.of(savedPath);
            Files.copy(file.getInputStream(), targetLocation, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            // 파일을 저장하지 못할 경우 에러를 로그에 기록
            logger.error("파일 저장에 실패했습니다", e);
            throw new IOException("파일 저장에 실패했습니다", e);
        }

        return savedPath;
    }

    // 파일명으로부터 파일 확장자를 추출하는 메서드
    private String getFileExtension(String filename) {
        if (StringUtils.hasLength(filename)) {
            int dotIndex = filename.lastIndexOf(".");
            if (dotIndex > 0 && dotIndex < filename.length() - 1) {
                return filename.substring(dotIndex);
            }
        }
        return "";
    }
}
