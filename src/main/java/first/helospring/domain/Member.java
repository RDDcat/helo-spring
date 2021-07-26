package first.helospring.domain;

public class Member {

    private Long id; // 데이터를 구분하기위해 시스템이 저장하는 id 값 (내부)
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
