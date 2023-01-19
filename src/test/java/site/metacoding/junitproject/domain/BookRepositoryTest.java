package site.metacoding.junitproject.domain;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest // DB와 관련된 컴포넌트만 메모리에 로딩
public class BookRepositoryTest {

    // @Autowired
    // private BookRepository bookRepository;

    @Test
    public void saveTest() {
        // given(데이터 준비)

        // when(테스트 실행)

        // then(검증))

    }
    // 1. 책 등록

    // 2. 책 목록보기

    // 3. 책 한건보기

    // 4. 책 수정

    // 5. 책 삭제
}
