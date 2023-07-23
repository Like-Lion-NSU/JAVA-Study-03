package random.menu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class RandomTestServiceImpl implements RandomTestService {
    @Autowired
    private TestService testService;

    private List<String> textList; // 추출된 텍스트 라인들을 저장할 리스트
    private List<String> selectedTexts; // 이미 선택된 텍스트 라인들을 저장할 리스트

    @Override
    public String TextFromImage(String imageUrl) throws Exception {
        // 이미지에서 텍스트를 추출하는 로직을 구현
        // 현재는 간단한 문자열을 반환
        return TextFromImage(imageUrl);
    }

    @Override
    public String getRandomText(String imageUrl) throws Exception {
        String randomText = TextFromImage(imageUrl);    // TextFromImage 메서드를 호출하여 텍스트를 추출하고, 라인들을 textList에 저장

        // textList가 null인 경우, 처음 getRandomText를 호출하는 것이므로 초기화
        if (textList == null) {
            textList = new ArrayList<>();
            selectedTexts = new ArrayList<>();

            // 추출된 텍스트를 개행 문자로 분할하여 개별 라인들을 textList에 추가
            String[] lines = randomText.split("\\r?\\n");
            for (String line : lines) {
                if (!line.trim().isEmpty()) {
                    textList.add(line.trim());
                }
            }
        }

        // 모든 텍스트 라인이 이미 선택된 경우, selectedTexts 리스트를 비움
        if (selectedTexts.size() >= textList.size()) {
            selectedTexts.clear();
        }

        // textList에서 중복되지 않은 랜덤한 라인을 선택
        Random random = new Random();
        int randomIndex;
        do {
            randomIndex = random.nextInt(textList.size());
        } while (selectedTexts.contains(textList.get(randomIndex)));

        selectedTexts.add(textList.get(randomIndex));   // 선택된 라인을 selectedTexts 리스트에 추가하여 중복 선택을 방지
        return textList.get(randomIndex);
    }
}
