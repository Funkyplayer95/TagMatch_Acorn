package FinalProject.TagMatch.Reference;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Role {

    LOCAL_USER("LOCAL_USER", "일반 사용자"),
    USER("ROLE_USER", "사용자"),
    ADMIN("ADMIN", "관리자");

    private final String key;
    private final String title;
}
